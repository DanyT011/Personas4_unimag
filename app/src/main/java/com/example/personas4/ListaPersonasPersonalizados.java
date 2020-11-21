package com.example.personas4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaPersonasPersonalizados extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Persona> personas;
    private AdaptadorPersona adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personas_personalizados);

        lista = findViewById(R.id.lstListaPersonasPersonalizado);
        personas = Datos.obtener();
        adapter = new AdaptadorPersona(this, personas);
        lista.setAdapter(adapter);

    }
}