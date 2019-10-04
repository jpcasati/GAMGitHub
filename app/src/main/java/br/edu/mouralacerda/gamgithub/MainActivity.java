package br.edu.mouralacerda.gamgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    ImageButton trem;
    ImageButton carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trem = findViewById(R.id.btnTrem);
        carro = findViewById(R.id.btnCarro);

        trem.setOnClickListener(this);
        carro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String mensagem = "ERRO";

        if(v.getId() == R.id.btnTrem) {
            mensagem = "Piuííííí...";
        } else if(v.getId() == R.id.btnCarro) {
            mensagem = "Vruuummm...";
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}
