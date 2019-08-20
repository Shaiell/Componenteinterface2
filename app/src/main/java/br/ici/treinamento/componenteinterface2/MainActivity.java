package br.ici.treinamento.componenteinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkEstado;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleEstado = findViewById(R.id.toggleButtonEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkEstado = findViewById(R.id.checkBoxEstado);
        resultado = findViewById(R.id.textResultado);

    }

    public void enviar(View view){
        String stToggle;
        String stSwitch;
        String stCheck;

        if(toggleEstado.isChecked()){
            stToggle = ("Ligado");
        }else{
            stToggle = ("Desligado");

        }if(switchEstado.isChecked()){
            stSwitch = ("Ligado");
        }else{
            stSwitch = ("Desligado");
        }

        if(checkEstado.isChecked()){
            stCheck = ("Ligado");
        }else{
            stCheck = ("Desligado");
        }



        resultado.setText("ToggleButton: "+stToggle+"\nSwitch: "+stSwitch+"\nCheckBox: "+stCheck);

    }

}


