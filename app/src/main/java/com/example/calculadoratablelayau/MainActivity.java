package com.example.calculadoratablelayau;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt7, bt8, bt9, btSuma, btIgual, btMult, bt1, bt2, bt3, bt4, bt5, bt6, bt0, btResta, btDiv;
    private TextView tv1, tvValor1, tvValor2, tvSigno;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btSuma = (Button) findViewById(R.id.btSuma);
        btIgual = (Button) findViewById(R.id.btIgual);
        btResta = (Button) findViewById(R.id.btResta);
        btMult = (Button) findViewById(R.id.btMult);
        btDiv = (Button) findViewById(R.id.btDiv);
        tvValor1 = (TextView) findViewById(R.id.tvValor1);
        tvValor2 = (TextView) findViewById(R.id.tvValor2);
        tvSigno = (TextView) findViewById(R.id.tvSigno);
        tv1 = (TextView) findViewById(R.id.tv1);


    }

    //Metodo botones numeros
    public void Numeros(View view) {
        String resultado = tv1.getText().toString();
        String campo2 = tvValor2.getText().toString();

        if (resultado.equals("0")) {
            resultado = "";
        }
        switch (view.getId()) {
            case R.id.bt7:
                tv1.setText(resultado + "7");

                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "7");
                } else {
                    tvValor2.setText(campo2 + "7");
                }
                break;
            case R.id.bt8:
                tv1.setText(resultado + "8");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "8");
                } else {
                    tvValor2.setText(campo2 + "8");
                }
                break;
            case R.id.bt9:
                tv1.setText(resultado + "9");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "9");
                } else {
                    tvValor2.setText(campo2 + "9");
                }
                break;
            case R.id.bt1:
                tv1.setText(resultado + "1");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "1");
                } else {
                    tvValor2.setText(campo2 + "1");
                }
                break;
            case R.id.bt2:
                tv1.setText(resultado + "2");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "2");
                } else {
                    tvValor2.setText(campo2 + "2");
                }
                break;
            case R.id.bt3:
                tv1.setText(resultado + "3");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "3");
                } else {
                    tvValor2.setText(campo2 + "3");
                }
                break;
            case R.id.bt4:
                tv1.setText(resultado + "4");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "4");
                } else {
                    tvValor2.setText(campo2 + "4");
                }
                break;
            case R.id.bt5:
                tv1.setText(resultado + "5");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "5");
                } else {
                    tvValor2.setText(campo2 + "5");
                }
                break;
            case R.id.bt6:
                tv1.setText(resultado + "6");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "6");
                } else {
                    tvValor2.setText(campo2 + "6");
                }
                break;
            case R.id.bt0:
                tv1.setText(resultado + "0");
                if (tvSigno.getText().equals("vacio")) {
                    tvValor1.setText(resultado + "0");
                } else {
                    tvValor2.setText(campo2 + "0");
                }
                break;
            case R.id.btSuma:
                tv1.setText(resultado + "+");
                tvSigno.setText("+");
                break;
            case R.id.btResta:
                tv1.setText(resultado + "-");
                tvSigno.setText("-");
                break;
            case R.id.btMult:
                tv1.setText(resultado + "x");
                tvSigno.setText("x");
                break;
            case R.id.btDiv:
                tv1.setText(resultado + "%");
                tvSigno.setText("%");
                break;

        }
    }

    public void Resultado(View view) {

        if (tvSigno.getText().equals("+")) {
            String valor1_String = tvValor1.getText().toString();
            String valor2_String = tvValor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int + valor2_int;
            btIgual.setText("= " + resultado_int);


            }
        if (tvSigno.getText().equals("-")) {
            String valor1_String = tvValor1.getText().toString();
            String valor2_String = tvValor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int - valor2_int;
            btIgual.setText("= " + resultado_int);


        }
        if (tvSigno.getText().equals("x")) {
            String valor1_String = tvValor1.getText().toString();
            String valor2_String = tvValor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int * valor2_int;
            btIgual.setText("= " + resultado_int);


        }
        if (tvSigno.getText().equals("%")) {
            String valor1_String = tvValor1.getText().toString();
            String valor2_String = tvValor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int / valor2_int;
            btIgual.setText("= " + resultado_int);


        }
        }

        public void Restaurar (View view){
            tv1.setText("0");
            tvValor1.setText("");
            tvValor2.setText("");
            tvSigno.setText("vacio");
        }
    }
