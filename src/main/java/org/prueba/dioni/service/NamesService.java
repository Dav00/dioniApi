package org.prueba.dioni.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NamesService {
    List<String> nombres = new ArrayList<>();

    public NamesService() {
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luisa");
    }

    public List<String> obtenerNombres() {
        return nombres;
    }

}
