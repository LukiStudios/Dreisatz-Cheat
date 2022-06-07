package com.example.dreisatz_cheat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);

        prozentsatz.setChecked(true);
        prozentwert.setChecked(true);
        endProzent.setVisibility(View.INVISIBLE);
    }

    public void button_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);

        if (prozentwert.isChecked() && prozentsatz.isChecked()) {
            w_p();
        }
        if (prozentwert.isChecked() && grundwert2.isChecked()) {
            w_g();
        }
        if (grundwert1.isChecked() && prozentsatz.isChecked()) {
            g_p();
        }
    }

    public void reset_click(View view) {
        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);
        TextView textView3 = findViewById(R.id.textView4);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);

        textView.setText("");
        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        input1.setText("");
        input2.setText("");
        endProzent.setText("");
    }

    public void erweitert_click(View view) {
        CheckBox erweitert = findViewById(R.id.checkBox);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);

        if (erweitert.isChecked()) {
            endProzent.setVisibility(View.VISIBLE);
        } else {
            endProzent.setVisibility(View.INVISIBLE);
            endProzent.setText("");
        }
    }

    public void zinsen_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox zinsen = findViewById(R.id.checkBox6);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);

        if (zinsen.isChecked()) {
            grundwert1.setText("Kapital");
            prozentwert.setText("Zinsen");
            grundwert2.setText("Kapital");
            prozentsatz.setText("Zinssatz");
            if (prozentwert.isChecked() && prozentsatz.isChecked()) {
                input1.setHint("Zinsen");
                input2.setHint("Zinssatz");
            }
            if (prozentwert.isChecked() && grundwert2.isChecked()) {
                input1.setHint("Zinsen");
                input2.setHint("Kapital");
            }
            if (grundwert1.isChecked() && prozentsatz.isChecked()) {
                input1.setHint("Kapital");
                input2.setHint("Zinssatz");
            }
        } else {
            grundwert1.setText("Grundwert");
            prozentwert.setText("Prozentwert");
            grundwert2.setText("Grundwert");
            prozentsatz.setText("Prozentsatz");
            if (prozentwert.isChecked() && prozentsatz.isChecked()) {
                input1.setHint("Prozentwert");
                input2.setHint("Prozentsatz");
            }
            if (prozentwert.isChecked() && grundwert2.isChecked()) {
                input1.setHint("Prozentwert");
                input2.setHint("Grundwert");
            }
            if (grundwert1.isChecked() && prozentsatz.isChecked()) {
                input1.setHint("Grundwert");
                input2.setHint("Prozentsatz");
            }
        }
    }

    public void grundwert1_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox zinsen = findViewById(R.id.checkBox6);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);

        if (grundwert1.isChecked()) {
            prozentwert.setChecked(false);
            prozentsatz.setChecked(true);
            grundwert2.setChecked(false);

            if (zinsen.isChecked()) {
                input1.setHint("Kapital");
                input2.setHint("Zinssatz");
            } else {
                input1.setHint("Grundwert");
                input2.setHint("Prozentsatz");
            }
        } else {
            prozentwert.setChecked(true);

            if (zinsen.isChecked()) {
                input1.setHint("Zinsen");
            } else {
                input1.setHint("Prozentwert");
            }
        }
    }

    public void prozentwert_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox zinsen = findViewById(R.id.checkBox6);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);

        if (prozentwert.isChecked()) {
            grundwert1.setChecked(false);

            if (zinsen.isChecked())  {
                input1.setHint("Zinsen");
            } else {
                input1.setHint("Prozentwert");
            }
        } else {
            grundwert1.setChecked(true);
            grundwert2.setChecked(false);
            prozentsatz.setChecked(true);
            input1.setHint("Grundwert");
            input2.setHint("Prozentsatz");

            if (zinsen.isChecked())  {
                input1.setHint("Kapital");
                input2.setHint("Zinssatz");
            } else {
                input1.setHint("Grundwert");
                input2.setHint("Prozentsatz");
            }
        }
    }

    public void grundwert2_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox zinsen = findViewById(R.id.checkBox6);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);

        if (grundwert2.isChecked()) {
            grundwert1.setChecked(false);
            prozentwert.setChecked(true);
            prozentsatz.setChecked(false);

            if (zinsen.isChecked())  {
                input1.setHint("Zinsen");
                input2.setHint("Kapital");
            } else {
                input1.setHint("Prozentwert");
                input2.setHint("Grundwert");
            }
        } else {
            prozentsatz.setChecked(true);

            if (zinsen.isChecked())  {
                input2.setHint("Zinssatz");
            } else {
                input2.setHint("Prozentsatz");
            }
        }
    }

    public void prozentsatz_click(View view) {
        CheckBox grundwert1 = findViewById(R.id.checkBox5);
        CheckBox prozentwert = findViewById(R.id.checkBox4);
        CheckBox grundwert2 = findViewById(R.id.checkBox3);
        CheckBox prozentsatz = findViewById(R.id.checkBox2);
        CheckBox zinsen = findViewById(R.id.checkBox6);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);

        if (prozentsatz.isChecked()) {
            grundwert2.setChecked(false);

            if (zinsen.isChecked())  {
                input2.setHint("Zinssatz");
            } else {
                input2.setHint("Prozentsatz");
            }
        } else {
            grundwert1.setChecked(false);
            prozentwert.setChecked(true);
            grundwert2.setChecked(true);

            if (zinsen.isChecked())  {
                input1.setHint("Zinsen");
                input2.setHint("Kapital");
            } else {
                input1.setHint("Prozentwert");
                input2.setHint("Grundwert");
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void w_p() {
        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);
        TextView textView3 = findViewById(R.id.textView4);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);

        double prozentwert = 0;
        double prozentsatz = 0;
        double prozent = 100;
        double result;

        try {
            prozentwert = Double.parseDouble(input1.getText().toString());
            prozentsatz = Double.parseDouble(input2.getText().toString());
            prozent = Double.parseDouble(endProzent.getText().toString());
        } catch (Exception ignored) {}

        result = prozentwert / prozentsatz;
        String einProzent = Double.toString(result);
        textView.setText("  " + einProzent);
        textView1.setText("  1.0%");
        result = result * prozent;

        String resultInString = Double.toString(result);
        textView2.setText("  " + resultInString);
        String prozentInString = Double.toString(prozent);
        textView3.setText("  " + prozentInString + "%");
    }

    @SuppressLint("SetTextI18n")
    public void w_g() {
        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);
        TextView textView3 = findViewById(R.id.textView4);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);
        CheckBox erweitert = findViewById(R.id.checkBox);

        double prozentwert = 0;
        double grundwert = 0;
        double prozent = 0;
        double ein_prozent;
        double result;

        try {
            prozentwert = Double.parseDouble(input1.getText().toString());
            grundwert = Double.parseDouble(input2.getText().toString());
            prozent = Double.parseDouble(endProzent.getText().toString());
        } catch (Exception ignored) {}

        result = grundwert / 100;
        ein_prozent = result;
        String einProzent = Double.toString(result);
        textView.setText("  " + einProzent);
        textView1.setText("  1.0%");
        result = prozentwert / result;

        String resultInString = Double.toString(result);
        String prozentwertInString = Double.toString(prozentwert);
        textView2.setText("  " + prozentwertInString);
        textView3.setText("  " + resultInString + "%");

        if (erweitert.isChecked() && prozent != 0) {
            result = ein_prozent * prozent;

            resultInString = Double.toString(result);
            String prozentInString = Double.toString(prozent);
            textView2.setText("  " + resultInString);
            textView3.setText("  " + prozentInString + "%");
        }
    }

    @SuppressLint("SetTextI18n")
    public void g_p() {
        TextView textView = findViewById(R.id.textView);
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);
        TextView textView3 = findViewById(R.id.textView4);
        EditText input1 = findViewById(R.id.editTextNumberDecimal);
        EditText input2 = findViewById(R.id.editTextNumberDecimal2);
        EditText endProzent = findViewById(R.id.editTextNumberDecimal3);
        CheckBox erweitert = findViewById(R.id.checkBox);

        double grundwert = 0;
        double prozentsatz = 0;
        double prozent = 0;
        double ein_prozent;
        double result;

        try {
            grundwert = Double.parseDouble(input1.getText().toString());
            prozentsatz = Double.parseDouble(input2.getText().toString());
            prozent = Double.parseDouble(endProzent.getText().toString());
        } catch (Exception ignored) {}

        result = grundwert / 100;
        ein_prozent = result;
        String einProzent = Double.toString(result);
        textView.setText("  " + einProzent);
        textView1.setText("  1.0%");
        result = result * prozentsatz;

        String resultInString = Double.toString(result);
        String prozentsatzInString = Double.toString(prozentsatz);
        textView2.setText("  " + resultInString);
        textView3.setText("  " + prozentsatzInString + "%");

        if (erweitert.isChecked() && prozent != 0) {
            result = ein_prozent * prozent;

            resultInString = Double.toString(result);
            String prozentInString = Double.toString(prozent);
            textView2.setText("  " + resultInString);
            textView3.setText("  " + prozentInString + "%");
        }
    }
}