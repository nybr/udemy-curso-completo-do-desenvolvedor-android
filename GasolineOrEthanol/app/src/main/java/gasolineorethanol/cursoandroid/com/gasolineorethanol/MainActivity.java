package gasolineorethanol.cursoandroid.com.gasolineorethanol;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText gasolineInput;
    private EditText ethanolInput;
    private TextView result;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gasolineInput = (EditText) findViewById(R.id.etGasolineId);
        ethanolInput = (EditText) findViewById(R.id.etEthanolId);
        btnCalc = (Button) findViewById(R.id.btnCalculate);
        result = (TextView) findViewById(R.id.resultadoId);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ethanolInput.getText().toString().isEmpty()){
                    result.setText("Input the ethanol price!");
                }else if (gasolineInput.getText().toString().isEmpty()){
                    result.setText("Input the gasoline price!");
                }else {

                    Double gas = Double.parseDouble(gasolineInput.getText().toString());
                    Double eth = Double.parseDouble(ethanolInput.getText().toString());

                    if(eth/gas>0.7){
                        result.setText("Gasoline is better!");
                    }
                    else {
                        result.setText("Ethanol is better!");
                    }

                }
            }
        });
    }


}
