package com.example.dict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int chance = 0;

    //взимане на референция за необходимите бутони
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset,reg,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //слагане на всеки бутон ID от layout (R - папка res)
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        reset = (Button) findViewById(R.id.reset);
        reg = (Button) findViewById(R.id.mainregbut);
        login = (Button) findViewById(R.id.mainlogbut);

//onclicklistener - като се цъкне бутона влизаме долу в switch case
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);
        //при настискане на регистер бутона отиваме в регистер активити чрез intent
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
        //при настискане на логин бутона отиваме в логин активити чрез intent
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onClick(View view) {
//switch case логика за 0 и Х
        switch (view.getId()) {
            case R.id.btn1://за бутон 1
                if (btn1.getText().toString().equals("")) { //ако е празен
                    if (chance == 0) {//и ако реда е на 0
                        chance = 1;//слагаме редна на Х
                        btn1.setText("O");//слагаме 0 на цъкнатото поле
                        result();
                    } else {
                        chance = 0;//иначе реда е на 0
                        btn1.setText("X");//и слагаме Х
                        result();
                    }
                }
                break;

            case R.id.btn2://за бутон 2 същото
                if (btn2.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn2.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn2.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn3://за бутон 3 същото
                if (btn3.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn3.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn3.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn4://за бутон 4 същото
                if (btn4.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn4.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn4.setText("X");
                        result();
                    }
                }
                break;


            case R.id.btn5://за бутон 5 същото

                if (btn5.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn5.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn5.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn6://за бутон 6 същото
                if (btn6.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn6.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn6.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn7:////за бутон 7 същото
                if (btn7.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn7.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn7.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn8://за бутон 8 същото
                if (btn8.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn8.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn8.setText("X");
                        result();
                    }
                }
                break;

            case R.id.btn9://за бутон 9 същото
                if (btn9.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn9.setText("O");
                        result();
                    } else {
                        chance = 0;
                        btn9.setText("X");
                        result();
                    }
                }
                break;

            case R.id.reset://ресет за ресетване на бутона
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
        }
    }


    public void result() {

        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();

        } else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        }
    }
}