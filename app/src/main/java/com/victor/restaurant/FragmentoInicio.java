package com.victor.restaurant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentoInicio extends Fragment {

    View view;
    Button botonInicioReservar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_inicio, container, false);
        botonInicioReservar = (Button) view.findViewById(R.id.btnReservarInicio);
        botonInicioReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Reservando una Mesa...", Toast.LENGTH_LONG).show();
            }
        });
        return view;

    }
}
