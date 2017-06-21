package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.imagemMoedaId);
        btnVoltar = (ImageView) findViewById(R.id.botaoVoltarId);

        Bundle extra = getIntent().getExtras();

        if(extra != null){

            int valor = extra.getInt("opcao");

            if (valor == 0){
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else if (valor == 1){
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }else {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.logo));
            }

        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
