package qualserie.cursoandroid.com.qualserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private ImageView imagem;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = (ImageView)findViewById(R.id.imagemId);
        seekBar = (SeekBar) findViewById(R.id.seekBarId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                switch (progress){
                    case 0:
                        imagem.setImageResource(R.drawable.pouco);
                        break;
                    case 1:
                        imagem.setImageResource(R.drawable.medio);
                        break;
                    case 2:
                        imagem.setImageResource(R.drawable.muito);
                        break;
                    case 3:
                        imagem.setImageResource(R.drawable.susto);
                        break;
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
