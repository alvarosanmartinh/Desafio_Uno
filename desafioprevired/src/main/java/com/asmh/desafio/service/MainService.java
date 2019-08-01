package com.asmh.desafio.service;

import com.asmh.desafio.model.DesafioResponse;
import org.springframework.http.ResponseEntity;

public interface MainService {

    public ResponseEntity<DesafioResponse> getResponseFromGdd();

}
