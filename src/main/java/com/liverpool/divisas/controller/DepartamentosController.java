package com.liverpool.divisas.controller;

import com.liverpool.divisas.Department;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class DepartamentosController {

    @GetMapping("/departments")
    public ResponseEntity devuelveDepartamentos(){

        return new ResponseEntity<>(new Department(Arrays.asList("Recursos humanos","Ventas","Sistemas", "Diseño","Recursos humanos", "Marketing", "Finanzas")), HttpStatus.OK);
    }
}
