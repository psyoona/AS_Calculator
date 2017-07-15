package com.example.seyoon.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    double left;
    double right;
    double result;
    char lastChar;
    ArrayList<String> doubleList;
    ArrayList<String> operationList;
    boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left = 0;
        right = 0;
        result = 0;

        doubleList = new ArrayList<String>();
        operationList = new ArrayList<String>();
        check = true;

        addButton();
    }

    public void addButton(){
        textView = (TextView) findViewById(R.id.textView);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button0).setOnClickListener(this);
        findViewById(R.id.buttonClear).setOnClickListener(this);
        findViewById(R.id.buttonBackSpace).setOnClickListener(this);
        findViewById(R.id.buttonPlus).setOnClickListener(this);
        findViewById(R.id.buttonMinus).setOnClickListener(this);
        findViewById(R.id.buttonMulti).setOnClickListener(this);
        findViewById(R.id.buttonDivision).setOnClickListener(this);
        findViewById(R.id.buttonDecimalPoint).setOnClickListener(this);
        findViewById(R.id.buttonEqual).setOnClickListener(this);
    }

    public boolean isNumber(String string){
        // 문자열을 소수점으로 변경할 수 있는지 확인하는 Method
        try{
            Double.valueOf(string);
            return true;
        }catch (NumberFormatException ne){
            return false;
        }
    }

    @Override
    public void onClick(View view) {
        String temp;
        switch(view.getId()){
            case R.id.buttonClear:
                textView.setText(Constants.Number0);
                left = right = result = 0;

                break;

            case R.id.button1:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number1);
                }else{
                    temp += Constants.Number1;
                    textView.setText(temp);
                }
                break;

            case R.id.button2:
                //Toast.makeText(MainActivity.this, "2 선택됨", Toast.LENGTH_SHORT).show();
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number2);
                }else{
                    temp += Constants.Number2;
                    textView.setText(temp);
                }
                break;

            case R.id.button3:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number3);
                }else{
                    temp += Constants.Number3;
                    textView.setText(temp);
                }
                break;

            case R.id.button4:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number4);
                }else{
                    temp += Constants.Number4;
                    textView.setText(temp);
                }
                break;

            case R.id.button5:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number5);
                }else{
                    temp += Constants.Number5;
                    textView.setText(temp);
                }
                break;

            case R.id.button6:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number6);
                }else{
                    temp += Constants.Number6;
                    textView.setText(temp);
                }
                break;

            case R.id.button7:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number7);
                }else{
                    temp += Constants.Number7;
                    textView.setText(temp);
                }
                break;

            case R.id.button8:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number8);
                }else{
                    temp += Constants.Number8;
                    textView.setText(temp);
                }
                break;

            case R.id.button9:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number9);
                }else{
                    temp += Constants.Number9;
                    textView.setText(temp);
                }
                break;

            case R.id.button0:
                temp = textView.getText().toString();
                if(temp.equals(Constants.Number0) || temp.equals(Constants.Double0)){
                    textView.setText(Constants.Number0);
                }else{
                    temp += Constants.Number0;
                    textView.setText(temp);
                }
                break;

            case R.id.buttonPlus:
                temp = textView.getText().toString();
                temp += Constants.PLUS;
                textView.setText(temp);

                break;

            case R.id.buttonMinus:
                temp = textView.getText().toString();
                temp += Constants.MINUS;
                textView.setText(temp);
                break;

            case R.id.buttonMulti:
                temp = textView.getText().toString();
                temp += Constants.MULTI;
                textView.setText(temp);
                break;

            case R.id.buttonDivision:
                temp = textView.getText().toString();
                temp += Constants.DIVISION;

                textView.setText(temp);
                break;

            case R.id.buttonBackSpace:
                temp = textView.getText().toString();
                temp = temp.substring(0, temp.length()-1);
                textView.setText(temp);
                break;

            case R.id.buttonDecimalPoint:
                temp = textView.getText().toString();
                temp += Constants.D_POINT;
                textView.setText(temp);
                break;

            case R.id.buttonEqual:
                double tempLeft=0;
                double tempRight=0;
                double res=0;
                temp = textView.getText().toString();
                lastChar = temp.charAt(temp.length()-1);
                if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '.'){
                    Toast.makeText(MainActivity.this, "숫자 입력 후 = 을 누르세요", Toast.LENGTH_SHORT).show();
                }else{
                    char[] chr = temp.toCharArray();
                    int j=0;
                    String tempDouble;
                    String tempString;
                    for(int i=0; i<chr.length; i++){
                        if(chr[i] == '+' || chr[i] == '-' || chr[i] == '*' || chr[i] == '/'){
                            operationList.add(Character.toString(chr[i]));
                            doubleList.add("0");
                            j++;
                        }else{
                            if(doubleList.size() == 0){
                                doubleList.add(Character.toString(chr[i]));
                            }else{
                                if(doubleList.get(doubleList.size()-1).equals("0")){
                                    doubleList.remove(doubleList.size()-1);
                                    doubleList.add(Character.toString(chr[i]));
                                }else{
                                    tempDouble = doubleList.get(doubleList.size()-1);
                                    tempDouble+=chr[i];
                                    doubleList.remove(doubleList.size()-1);
                                    doubleList.add(tempDouble);
                                }
                            }
                        }
                    }// end of for

                    // 우선순위에 따라 곱하기 나눗셈 먼저 처리

                    // *, / 처리 for문
                    for(int i=0; i < operationList.size(); i++){
                        if(operationList.get(i).equals("*")){
                            tempLeft = Double.valueOf(doubleList.get(i));
                            tempRight = Double.valueOf(doubleList.get(i+1));
                            res = tempLeft * tempRight;
                            doubleList.remove(i+1);
                            doubleList.set(i, String.valueOf(res));
                            operationList.remove(i);
                            i--;
                        }else if(operationList.get(i).equals("/")){
                            tempLeft = Double.valueOf(doubleList.get(i));
                            tempRight = Double.valueOf(doubleList.get(i+1));
                            res = tempLeft / tempRight;
                            doubleList.remove(i+1);
                            doubleList.set(i, String.valueOf(res));
                            operationList.remove(i);
                            i--;
                        }
                    } // *, / 처리 for문

                    // +, - 처리 for문
                    for(int i=0; i<operationList.size(); i++){

                        if(operationList.get(i).equals("+")){
                            tempLeft = Double.valueOf(doubleList.get(i));
                            tempRight = Double.valueOf(doubleList.get(i+1));
                            res = tempLeft + tempRight;
                            doubleList.remove(i+1);
                            doubleList.set(i, String.valueOf(res));
                            operationList.remove(i);
                            i--;
                        }else if(operationList.get(i).equals("-")){

                            tempLeft = Double.valueOf(doubleList.get(i));
                            tempRight = Double.valueOf(doubleList.get(i+1));
                            res = tempLeft - tempRight;
                            doubleList.remove(i+1);
                            doubleList.set(i, String.valueOf(res));
                            operationList.remove(i);
                            i--;
                        }
                    }// +, - 처리 for문
                }

                textView.setText(String.valueOf(res));
                doubleList = new ArrayList<String>();
                operationList = new ArrayList<String>();
                break;
        }// end of switch
    }// end of onClick
}
