package com.aula88888.aula88888.controller;

import com.aula88888.aula88888.entidade.Venda;
import com.aula88888.aula88888.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/venda")
    public Venda addVenda(@RequestBody Venda venda) {
        return vendaService.add(venda);
    }

    @GetMapping("/venda/{id}")
    public Venda getVenda(@PathVariable(value = "id") long id) {
        return vendaService.get(id);
    }

    @PutMapping("/venda/{id}")
    public Venda updateVenda(@RequestBody Venda venda, @PathVariable(value = "id") long id) {
        Optional<Venda> compra = vendaService.findById(id);
        if(compra.isPresent()){
            venda.setID(compra.get().getID());
            return vendaService.update(venda);
        }
        return null;
    }
}