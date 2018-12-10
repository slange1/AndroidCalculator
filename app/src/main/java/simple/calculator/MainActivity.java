package simple.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView result, fin;
    Button add, substract, divide, multiply;
    int resul, num1 = 0;
    String act = "", re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);
        substract = findViewById(R.id.substract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        fin = findViewById(R.id.fin);

        findViewById(R.id.einz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "1";
                result.setText(re);
            }
        });

        findViewById(R.id.zwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "2";
                result.setText(re);
            }
        });

        findViewById(R.id.drei).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "3";
                result.setText(re);
            }
        });

        findViewById(R.id.vier).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "4";
                result.setText(re);
            }
        });

        findViewById(R.id.funf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "5";
                result.setText(re);
            }
        });

        findViewById(R.id.sechs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "6";
                result.setText(re);
            }
        });

        findViewById(R.id.sieben).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "7";
                result.setText(re);
            }
        });

        findViewById(R.id.acht).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "8";
                result.setText(re);
            }
        });

        findViewById(R.id.neun).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                re = String.valueOf(resul) + "9";
                result.setText(re);
            }
        });

        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = Integer.parseInt(result.getText().toString());
                if (resul != 0){
                    re = String.valueOf(resul) + "0";
                    result.setText(re);
                }
            }
        });

        findViewById(R.id.clc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul = 0;
                num1 = 0;
                result.setText(String.valueOf(resul));
                fin.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(result.getText().toString());
                act = "add";
                result.setText(String.valueOf('0'));
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(result.getText().toString());
                act = "sub";
                result.setText(String.valueOf('0'));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(result.getText().toString());
                act = "mul";
                result.setText(String.valueOf('0'));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(result.getText().toString());
                act = "div";
                result.setText(String.valueOf('0'));
            }
        });
        findViewById(R.id.eq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float res = Float.parseFloat(String.valueOf(result.getText()));

                switch (act){
                    case "add":
                        res = res+num1;
                        break;
                    case "sub":
                        res = num1-res;
                        break;
                    case "mul":
                        res = num1*res;
                        break;
                    case "div":
                        if (res==0){
                            res = 1;
                        }
                        res = num1/res;
                        break;
                    default:
                        res = 0;
                        break;
                }

                fin.setText(String.valueOf(res));
                result.setText(String.valueOf("0"));

            }
        });
    }
}
