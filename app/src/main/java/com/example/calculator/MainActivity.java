package com.example.calculator;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // instanciar las variables que relacionan el mundo visual con la logica
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        ImageButton add = findViewById(R.id.add);
        ImageButton subtract = findViewById(R.id.subtract);
        ImageButton multiply = findViewById(R.id.multiply);
        ImageButton divide = findViewById(R.id.divide);

        // Creamos la animación de vibración
        Animation vibrate = AnimationUtils.loadAnimation(this, R.anim.vibrate_anim);

        // poner a escuchar los botones
        // boton de suma
        add.setOnClickListener(v -> {
            // verificar que el usuario haya ingresado numeros
            if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                // capturar lo que el usuario escribe y lo convertimos a numero
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                // sumar los numeros
                float res = num1 + num2;
                // indicarle al usuario que se realizó la operación
                Toast.makeText(this, "¡Suma hecha!", Toast.LENGTH_SHORT).show();
                // mostrar el resultado
                result.setText("Resultado: " + res);
                // vibracion
                result.startAnimation(vibrate);
            } else {
                Toast.makeText(this, "Por favor, ingrese ambos números", Toast.LENGTH_SHORT).show();
            }
        });

        // boton de resta
        subtract.setOnClickListener(v -> {
            if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                // capturar lo que el usuario escribe y lo convertimos a numero
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                // restar los numeros
                float res = num1 - num2;
                // indicarle al usuario que se realizó la operación
                Toast.makeText(this, "¡Resta hecha!", Toast.LENGTH_SHORT).show();
                // mostrar el resultado
                result.setText("Resultado: " + res);
                // vibracion
                result.startAnimation(vibrate);
            } else {
                Toast.makeText(this, "Por favor, ingrese ambos números", Toast.LENGTH_SHORT).show();
            }
        });

        // boton de multiplicación
        multiply.setOnClickListener(v -> {
            if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                // capturar lo que el usuario escribe y lo convertimos a numero
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                // multiplicar los numeros
                float res = num1 * num2;
                // indicarle al usuario que se realizó la operación
                Toast.makeText(this, "¡Multiplicación hecha!", Toast.LENGTH_SHORT).show();
                // mostrar el resultado
                result.setText("Resultado: " + res);
                // vibracion
                result.startAnimation(vibrate);
            } else {
                Toast.makeText(this, "Por favor, ingrese ambos números", Toast.LENGTH_SHORT).show();
            }
        });

        // boton de división
        divide.setOnClickListener(v -> {
            if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                // capturar lo que el usuario escribe y lo convertimos a numero
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                // dividir los numeros
                float res = num1 / num2;
                // indicarle al usuario que se realizó la operación
                Toast.makeText(this, "¡División hecha!", Toast.LENGTH_SHORT).show();
                // mostrar el resultado
                result.setText("Resultado: " + res);
                // vibracion
                result.startAnimation(vibrate);
            } else {
                Toast.makeText(this, "Por favor, ingrese ambos números", Toast.LENGTH_SHORT).show();
            }
        });

    }
}