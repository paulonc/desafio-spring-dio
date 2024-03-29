package com.dio.projeto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dio.projeto.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
@Service
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
