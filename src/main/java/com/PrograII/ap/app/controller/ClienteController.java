package com.PrograII.ap.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sistema.ap.app.entity.ApiResponse;
import com.sistema.ap.app.entity.Cliente;
import com.sistema.ap.app.services.IClientes;

import jakarta.validation.Valid;

public class ClienteController {

	protected IClientes clientesService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Cliente>>> getAllClientes() {
        return ResponseEntity.ok(new ApiResponse<>(clientesService.findAll(), "Lista de clientes", true));
    }

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Cliente>> save(@Valid @RequestBody Cliente cliente) {
        Cliente savedCliente = clientesService.save(cliente);
        return ResponseEntity.ok(new ApiResponse<>(savedCliente, "Cliente guardado exitosamente", true));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse<Cliente>> update(@PathVariable("id") Integer id, @Valid @RequestBody Cliente cliente) {
        Cliente updatedCliente = clientesService.update(id, cliente);
        if (updatedCliente != null) {
            return ResponseEntity.ok(new ApiResponse<>(updatedCliente, "Cliente actualizado exitosamente", true));
        } else {
            return ResponseEntity.status(404).body(new ApiResponse<>(null, "Cliente no encontrado", false));
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable("id") Integer id) {
        Integer response = clientesService.deleteById(id);
        if (response == 204) {
            return ResponseEntity.ok(new ApiResponse<>(null, "Cliente eliminado exitosamente", true));
        } else {
            return ResponseEntity.status(404).body(new ApiResponse<>(null, "Cliente no encontrado", false));
        }
    }

}
