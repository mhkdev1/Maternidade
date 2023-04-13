package com.example.maternidade.medico;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.maternidade.R;
import com.example.maternidade.medico.AdicionarFragment;
import com.example.maternidade.medico.ListarFragment;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.medico_fragment_main, container, false);
        if (savedInstanceState == null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMedico, new
                    com.example.maternidade.medico.ListarFragment()).commit();
        }
        Button btnListar = v.findViewById(R.id.buttonListar);
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMedico, new
                        ListarFragment()).commit();
            }
        });

        if (savedInstanceState == null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMedico, new
                    com.example.maternidade.medico.AdicionarFragment()).commit();
        }
        Button btnAdicionar = v.findViewById(R.id.buttonAdicionar);
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMedico, new
                        AdicionarFragment()).commit();
            }
        });

        return v;
    }
}