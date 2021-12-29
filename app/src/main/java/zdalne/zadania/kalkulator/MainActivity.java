package zdalne.zadania.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private ArrayList<String> history = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        display.setShowSoftInputOnFocus(false);
    }
    private String formatString(String strToFormat){
        String strToReturn = strToFormat;
        if(strToFormat.charAt(0) == '0' && Character.isDigit(strToFormat.charAt(1))){
            strToReturn = strToFormat.substring(1);
            return strToReturn;
        }
        return strToReturn;
    }

    public void zero(View view) {
        String checkString = display.getText().toString();
        int textLen = checkString.length();

        if(textLen == 0){
            display.append("0");
        }
        else if (checkString.charAt(0) != '0'){
            display.append("0");
        }
        else{
            display.append("0");
        }
        //System.out.println(textLen);
//        if (textLen > 0) {
//            while (Character.isDigit(checkString.charAt(textLen-1)) && textLen > 0) {
//                textLen--;
//            }
//            if (checkString.charAt(textLen) == '.' && textLen > 0) {
//                display.append("0");
//            }
//        } else {
//            display.append("0");
//        }
    }

    public void one(View view) {
        display.append("1");
    }

    public void two(View view) {
        display.append("2");
    }

    public void three(View view) {
        display.append("3");
    }

    public void four(View view) {
        display.append("4");
    }

    public void five(View view) {
        display.append("5");
    }

    public void six(View view) {
        display.append("6");
    }

    public void seven(View view) {
        display.append("7");
    }

    public void eight(View view) {
        display.append("8");
    }

    public void nine(View view) {
        display.append("9");
    }

    public void add(View view) {
        display.append("+");
    }

    public void sub(View view) {
        display.append("-");
    }

    public void mul(View view) {
        display.append("*");
    }

    public void div(View view) {
        display.append("/");
    }

    public void result(View view) {
        String userExp = display.getText().toString();

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        history.add(result);
        display.setSelection(result.length());
    }

    public void allClear(View view) {

        history.clear();
        display.setText("");
    }

    public void clearEntry(View view) {
        boolean singleTap = true;
        if (singleTap) {
            int cursor = display.getSelectionStart();
            int textLen = display.getText().length();

            if (cursor != 0 && textLen != 0) {
                SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                selection.replace(cursor - 1, cursor, "");
                display.setText(selection);
                display.setSelection(cursor - 1);

            }
        } else {

        }
    }


    public void plusMinus(View view) {

        int cursor;
        int textLen = display.getText().length();


    }

    public void dot(View view) {
        display.append(".");

    }

    public void advanced(View view) {

    }
}