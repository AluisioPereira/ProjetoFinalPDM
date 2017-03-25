package pdm.ifpb.edu.br.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConfiguracoesDoControle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes_do_controle);
    }
    public void gravarPorUmMinuto(View view){
        Intent gravacao = new Intent(this, Gravacao.class);
        startActivity(gravacao);
    }
    public void verGravacoes(View view){
        Intent gravacoes = new Intent(this, Gravacoes.class);
        startActivity(gravacoes);
    }
    public void assistirAoVivo(View view){
        Intent aovivo = new Intent(this, AoVivo.class);
        startActivity(aovivo);
    }

}
