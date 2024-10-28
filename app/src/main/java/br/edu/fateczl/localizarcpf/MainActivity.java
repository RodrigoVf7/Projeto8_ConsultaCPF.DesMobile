package br.edu.fateczl.localizarcpf;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */

public class MainActivity extends AppCompatActivity {
    private EditText editCpf, editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCpf = findViewById(R.id.editCpf);
        editNome = findViewById(R.id.editNome);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cpf = editCpf.getText().toString();
                String nome = editNome.getText().toString();
                Pessoa pessoa = new Pessoa(cpf, nome);

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("pessoa", pessoa); // Você precisará de Parcelable ou Serializable
                startActivity(intent);
            }
        });
    }
}
