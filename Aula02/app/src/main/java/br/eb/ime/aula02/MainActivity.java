package br.eb.ime.aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acaoBotao(View V){
        EditText editN = findViewById(R.id.editN);
        int n = Integer.parseInt(editN.getText().toString());
        int f = (new Fibonacci().calculo(n));
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText(String.valueOf(f));

    }
}