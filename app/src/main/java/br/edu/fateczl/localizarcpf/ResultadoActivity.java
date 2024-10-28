package br.edu.fateczl.localizarcpf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */

public class ResultadoActivity extends AppCompatActivity {
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txtResultado);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");
        String regiao = pessoa.getRegiao();
        txtResultado.setText("Nome: " + pessoa.getNome() + "\nRegião: " + regiao);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Voltar para a Activity anterior
            }
        });
    }
}

