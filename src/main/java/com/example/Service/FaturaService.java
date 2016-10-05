package com.example.Service;

import com.example.Model.Fatura;


public interface FaturaService {
    Fatura getFatura(Long id);
    void init();
}
