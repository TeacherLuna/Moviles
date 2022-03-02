//Ejemplo para el clic de un boton
package com.example.practica1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void entrar(View v){
        Context context = getApplicationContext();
        CharSequence text = "Otra vez Boton presionado!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
//Para consultar sobre la instruccion Toas, ver el siguiente link
//https://developer.android.com/guide/topics/ui/notifiers/toasts?hl=es-419#java