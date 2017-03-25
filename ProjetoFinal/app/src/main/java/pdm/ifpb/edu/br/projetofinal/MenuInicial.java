package pdm.ifpb.edu.br.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
    }
    public void iniciarComCam(View view){
        Intent webcam = new Intent(this, WebCam.class);
        startActivity(webcam);
    }
    public void iniciarComoControle(View view){
        Intent configuracoes = new Intent(this, ConfiguracoesDoControle.class);
        startActivity(configuracoes);
    }
}
