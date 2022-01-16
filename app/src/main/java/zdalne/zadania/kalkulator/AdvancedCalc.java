package zdalne.zadania.kalkulator;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

public class AdvancedCalc extends AppCompatActivity {

    private EditText display;
    private TextView historyDisplay;
    private ArrayList<String> history = new ArrayList<>();
    private int operatorIndex = 0;

    private static final long DOUBLE_CLICK_TIME_DELTA = 300;

    long lastClickTime = 0;

    private int leftDot = 0;
    private int rightDot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calc);
        display = findViewById(R.id.display);

        historyDisplay = findViewById(R.id.history);
        display.setShowSoftInputOnFocus(false);
        display.append("0");
        getSupportActionBar().hide();

    }

    private void updateHistory(String resultToAdd) {
        history.add(resultToAdd);
        historyDisplay.append(history.get(history.size() - 1) + ' ');
    }

    private void calculate() {
        String userExp = display.getText().toString();
        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        if(result.equals("NaN")){
            showToast();
            display.setText("0");
            display.setSelection(1);
        }
        else{
            display.setText(result);
            updateHistory(result);
            display.setSelection(result.length());

        }
    }

    public void zero(View view) {
        String checkString = display.getText().toString();
        int cursor = display.getSelectionStart();
        int textLen = checkString.length();


        if (checkString.charAt(0) != '0' && textLen == 1) {
            display.append("0");
        } else if (cursor >= 2 && (checkString.charAt(cursor - 2) != '+'
                && checkString.charAt(cursor - 2) != '-'
                && checkString.charAt(cursor - 2) != '*'
                && checkString.charAt(cursor - 2) != '/'
                && checkString.charAt(cursor - 2) != '^')) {
            display.append("0");
        }

        display.setSelection(display.getText().length());

    }

    public void one(View view) {

        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("1");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "1");
            display.setText(selection);
        } else {
            display.append("1");
        }
        display.setSelection(display.getText().length());

    }

    public void two(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("2");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "2");
            display.setText(selection);
        } else {
            display.append("2");
        }
        display.setSelection(display.getText().length());
    }

    public void three(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("3");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "3");
            display.setText(selection);
        } else {
            display.append("3");
        }
        display.setSelection(display.getText().length());
    }

    public void four(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("4");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "4");
            display.setText(selection);
        } else {
            display.append("4");
        }
        display.setSelection(display.getText().length());
    }

    public void five(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("5");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "5");
            display.setText(selection);
        } else {
            display.append("5");
        }
        display.setSelection(display.getText().length());
    }

    public void six(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("6");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "6");
            display.setText(selection);
        } else {
            display.append("6");
        }
        display.setSelection(display.getText().length());
    }

    public void seven(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("7");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "7");
            display.setText(selection);
        } else {
            display.append("7");
        }
        display.setSelection(display.getText().length());
    }

    public void eight(View view) {
        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("8");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "8");
            display.setText(selection);
        } else {
            display.append("8");
        }
        display.setSelection(display.getText().length());
    }

    public void nine(View view) {

        int cursor = display.getSelectionStart();
        if (display.getText().length() == 1 && display.getText().toString().equals("0")) {
            display.setText("9");
        } else if (cursor > 1 && display.getText().toString().charAt(cursor - 1) == '0'
                && (display.getText().toString().charAt(cursor - 2) == '+'
                || display.getText().toString().charAt(cursor - 2) == '-'
                || display.getText().toString().charAt(cursor - 2) == '*'
                || display.getText().toString().charAt(cursor - 2) == '/'
                || display.getText().toString().charAt(cursor - 2) == '^')) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursor - 1, cursor, "9");
            display.setText(selection);
        } else {
            display.append("9");
        }
        display.setSelection(display.getText().length());
    }

    public void add(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("+");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("+");
//        operatorCount++;
    }

    public void sub(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("-");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("-");
//        operatorCount++;
    }

    public void mul(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("*");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("*");
//        operatorCount++;
    }

    public void div(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("/");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("/");
//      operatorCount++;
    }


    public void result(View view) {
        calculate();
        leftDot = 1;
        rightDot = 0;
        operatorIndex = 0;
    }

    public void allClear(View view) {

        history.clear();
        display.setText("0");
        historyDisplay.setText("");
        operatorIndex = 0;
        leftDot = 0;
        rightDot = 0;
        display.setSelection(display.getText().length());
    }



    public void clearEntry(View view) {
        long clickTime = System.currentTimeMillis();
        if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
            display.setText("0");
            operatorIndex = 0;
            leftDot = 0;
            rightDot = 0;
            display.setSelection(display.getText().length());
            lastClickTime = 0;
        }
        else {
            int cursor = display.getSelectionStart();
            int textLen = display.getText().length();

            if (cursor != 0 && textLen != 0) {
                SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                if (cursor - 1 == 0) {
                    display.setText("0");
                    display.setSelection(display.getText().length());
                } else {
                    if (display.getText().charAt(cursor - 1) == '+'
                            || display.getText().charAt(cursor - 1) == '-'
                            || display.getText().charAt(cursor - 1) == '*'
                            || display.getText().charAt(cursor - 1) == '/'
                            || display.getText().charAt(cursor - 1) == '^') {
                        operatorIndex = 0;
                    }
                    if (operatorIndex > 0 && display.getText().charAt(cursor - 1) == '.') {
                        rightDot = 0;

                    } else if (operatorIndex < 1 && display.getText().charAt(cursor - 1) == '.') {
                        leftDot = 0;
                    }
                    selection.replace(cursor - 1, cursor, "");
                    display.setText(selection);
                    display.setSelection(cursor - 1);
                }

            }

        }
        lastClickTime = clickTime;
    }


    public void plusMinus(View view) {
        String operatedString = display.getText().toString();
        String resultString;
        String leftString;
        String rightString;


        int textLen = display.getText().length();
        boolean digit = Character.isDigit(operatedString.charAt(textLen - 1));
        if (operatorIndex > 0 && digit) {
            if (operatedString.charAt(operatorIndex) == '+') {
                leftString = operatedString.substring(0, operatorIndex);
                rightString = operatedString.substring(operatorIndex + 1, textLen);
                resultString = leftString + '-' + rightString;
            } else if (operatedString.charAt(operatorIndex) == '-') {
                leftString = operatedString.substring(0, operatorIndex);
                rightString = operatedString.substring(operatorIndex + 1, textLen);
                resultString = leftString + '+' + rightString;
            } else if (operatedString.charAt(operatorIndex + 1) == '-') {
                leftString = operatedString.substring(0, operatorIndex + 1);
                rightString = operatedString.substring(operatorIndex + 2, textLen);
                resultString = leftString + rightString;
            } else {
                leftString = operatedString.substring(0, operatorIndex + 1);
                rightString = operatedString.substring(operatorIndex + 1, textLen);
                resultString = leftString + '-' + rightString;
            }
            display.setText(resultString);
        } else if (operatorIndex < 1 && digit) {

            if (operatedString.charAt(0) != '0' && operatedString.charAt(0) != '-') {
                resultString = '-' + operatedString;
                display.setText(resultString);
            } else if (operatedString.charAt(0) == '-') {
                resultString = operatedString.substring(1);
                display.setText(resultString);
            }
        }
        display.setSelection(display.getText().length());
    }

    public void dot(View view) {
        if (operatorIndex < 1 && leftDot < 1) {
            leftDot++;
            display.append(".");

        } else if (operatorIndex > 0 && rightDot < 1) {
            rightDot++;
            display.append(".");
        }
        display.setSelection(display.getText().length());

    }

    private String calculateAdv(String expression, String operation) {

        Expression exp;
        String result;
        switch (operation) {
            case "sin":
                exp = new Expression("sin(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "cos":
                exp = new Expression("cos(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "tan":
                exp = new Expression("tan(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "ln":
                exp = new Expression("ln(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "log":
                exp = new Expression("log10(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "sqrt":
                exp = new Expression("sqrt(" + expression + ")");
                result = String.valueOf(exp.calculate());
                break;
            case "%":
                exp = new Expression(expression + "/100");
                result = String.valueOf(exp.calculate());
                break;
            default:
                result = "0";
        }

        return result;
    }

    private void showToast() {

        Context context = getApplicationContext();
        CharSequence text = "Wrong input";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void sin(View view) {

        String result = calculateAdv(display.getText().toString(), "sin");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);

            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;


            updateHistory(result);
            display.setSelection(result.length());
        }
    }

    public void cos(View view) {
        String result = calculateAdv(display.getText().toString(), "cos");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);

            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;


            updateHistory(result);
            display.setSelection(result.length());
        }
    }

    public void tan(View view) {

        String result = calculateAdv(display.getText().toString(), "tan");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
            updateHistory(result);
            display.setSelection(result.length());
        }

    }

    public void ln(View view) {
        String result = calculateAdv(display.getText().toString(), "ln");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);

            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;

            updateHistory(result);
            display.setSelection(result.length());
        }
    }

    public void log(View view) {
        String result = calculateAdv(display.getText().toString(), "log");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;

        }


        updateHistory(result);
        display.setSelection(result.length());
    }

    public void percent(View view) {

        String result = calculateAdv(display.getText().toString(), "%");
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
            updateHistory(result);
            display.setSelection(result.length());
        }
    }

    public void squareRoot(View view) {
        String result = calculateAdv(display.getText().toString(), "sqrt");
        System.out.println(result);
        if (result.equals("NaN")) {
            showToast();
            leftDot = 0;
            rightDot = 0;
            operatorIndex = 0;
            display.setText("0");
            display.setSelection(1);
        } else {
            int checkIfDot = 0;
            display.setText(result);
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
            updateHistory(result);
            display.setSelection(result.length());
        }


    }

    public void powerOfTwo(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("^2");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("^");
    }

    public void power(View view) {
        int checkIfDot = 0;
        if (operatorIndex >= 1) {
            calculate();
            checkIfDot = display.getText().toString().indexOf('.');
            if (checkIfDot == -1) {
                leftDot = 0;
            }
            rightDot = 0;
            operatorIndex = 0;
        }
        display.append("^");
        display.setSelection(display.getText().length());
        operatorIndex = display.getText().toString().indexOf("^");

    }

    public void simple(View view) {
        Intent intent = new Intent(AdvancedCalc.this, SimpleCalc.class);
        startActivity(intent);
    }
}