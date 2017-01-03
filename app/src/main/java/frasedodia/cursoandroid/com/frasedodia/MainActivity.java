package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Faça ou não faça. A tentativa não existe.",
            "Grandes líderes inspiram a grandeza em outras pessoas.",
            "Sua falta de fé é perturbadora.",
            "Um plano só é bom nas mãos de quem pode executá-lo.",
            "Quem é mais tolo? O tolo, ou o tolo que o segue?",
            "O medo leva à raiva, a raiva leva ao ódio e o ódio leva ao sofrimento.",
            "Tamanho importa não. Olhe para mim, você me julga pelo tamanho?",
            "A Força é forte em minha família. Meu pai tem. Eu tenho. Minha irmã tem. Você tem esse poder, também.",
            "Você tem medo de nunca ser tão forte quanto Darth Vader"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numAleatorio]);
            }
        });

    }
}
