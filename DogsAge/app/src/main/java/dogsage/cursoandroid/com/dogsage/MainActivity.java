package dogsage.cursoandroid.com.dogsage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = (EditText) findViewById(R.id.idadeId);
        btnCalcular = (Button) findViewById(R.id.btnCalcularId);
        resultado = (TextView) findViewById(R.id.resultadoIdadeId);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(idade.getText().toString().isEmpty()){
                    //mensagem de erro
                    resultado.setText("Nenhum número digitado");
                }else{

                    int valorDigitado = Integer.parseInt(idade.getText().toString());

                    resultado.setText("The age of the dog in human years is " + valorDigitado*7 +"!");
                }
            }
        });

    }
}
