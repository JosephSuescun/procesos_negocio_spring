package com.procesos.negocio.joseph.controllers;


import com.procesos.negocio.joseph.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UsuarioController {

    @GetMapping(value = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Joseph");
        usuario.setApellidos("Suescun");
        usuario.setDocumento("1193219417");
        usuario.setDireccion("centro");
        usuario.setFechaNacimiento(new Date(2020, 12, 01));
        usuario.setTelefono("3156417758");
        return usuario;
    }
}
