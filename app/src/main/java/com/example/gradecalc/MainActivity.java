package com.example.gradecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView ;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner oneonecredit1, oneonecredit2, oneonecredit3, oneonecredit4, oneonecredit5, oneonecredit6, oneonecredit7, oneonecredit8, oneonecredit9, oneonecredit10;
    private Spinner oneonegrade1, oneonegrade2, oneonegrade3, oneonegrade4, oneonegrade5, oneonegrade6, oneonegrade7, oneonegrade8, oneonegrade9, oneonegrade10;
    EditText oneonesubject1,oneonesubject2,oneonesubject3,oneonesubject4,oneonesubject5,oneonesubject6,oneonesubject7,oneonesubject8,oneonesubject9,oneonesubject10;
    private Button btn; //버튼 누르면 학점 계산
    CheckBox[] oneonecheck = new CheckBox[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        oneonecredit1 = (Spinner) findViewById(R.id.oneonecredit1);
        oneonecredit2 = (Spinner) findViewById(R.id.oneonecredit2);
        oneonecredit3 = (Spinner) findViewById(R.id.oneonecredit3);
        oneonecredit4 = (Spinner) findViewById(R.id.oneonecredit4);
        oneonecredit5 = (Spinner) findViewById(R.id.oneonecredit5);
        oneonecredit6 = (Spinner) findViewById(R.id.oneonecredit6);
        oneonecredit7 = (Spinner) findViewById(R.id.oneonecredit7);
        oneonecredit8 = (Spinner) findViewById(R.id.oneonecredit8);
        oneonecredit9 = (Spinner) findViewById(R.id.oneonecredit9);
        oneonecredit10 = (Spinner) findViewById(R.id.oneonecredit10);

        oneonegrade1 = (Spinner) findViewById(R.id.oneonegrade1);
        oneonegrade2 = (Spinner) findViewById(R.id.oneonegrade2);
        oneonegrade3 = (Spinner) findViewById(R.id.oneonegrade3);
        oneonegrade4 = (Spinner) findViewById(R.id.oneonegrade4);
        oneonegrade5 = (Spinner) findViewById(R.id.oneonegrade5);
        oneonegrade6 = (Spinner) findViewById(R.id.oneonegrade6);
        oneonegrade7 = (Spinner) findViewById(R.id.oneonegrade7);
        oneonegrade8 = (Spinner) findViewById(R.id.oneonegrade8);
        oneonegrade9 = (Spinner) findViewById(R.id.oneonegrade9);
        oneonegrade10 = (Spinner) findViewById(R.id.oneonegrade10);


        oneonesubject1 = (EditText) findViewById(R.id.oneonesubject1);
        oneonesubject2 = (EditText) findViewById(R.id.oneonesubject2);
        oneonesubject3 = (EditText) findViewById(R.id.oneonesubject3);
        oneonesubject4 = (EditText) findViewById(R.id.oneonesubject4);
        oneonesubject5 = (EditText) findViewById(R.id.oneonesubject5);
        oneonesubject6 = (EditText) findViewById(R.id.oneonesubject6);
        oneonesubject7 = (EditText) findViewById(R.id.oneonesubject7);
        oneonesubject8 = (EditText) findViewById(R.id.oneonesubject8);
        oneonesubject9 = (EditText) findViewById(R.id.oneonesubject9);
        oneonesubject10 = (EditText) findViewById(R.id.oneonesubject10);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_dropdown_item);
        oneonecredit1.setAdapter(adapter);
        oneonecredit2.setAdapter(adapter);
        oneonecredit3.setAdapter(adapter);
        oneonecredit4.setAdapter(adapter);
        oneonecredit5.setAdapter(adapter);
        oneonecredit6.setAdapter(adapter);
        oneonecredit7.setAdapter(adapter);
        oneonecredit8.setAdapter(adapter);
        oneonecredit9.setAdapter(adapter);
        oneonecredit10.setAdapter(adapter);


        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_dropdown_item);
        oneonegrade1.setAdapter(adapter1);
        oneonegrade2.setAdapter(adapter1);
        oneonegrade3.setAdapter(adapter1);
        oneonegrade4.setAdapter(adapter1);
        oneonegrade5.setAdapter(adapter1);
        oneonegrade6.setAdapter(adapter1);
        oneonegrade7.setAdapter(adapter1);
        oneonegrade8.setAdapter(adapter1);
        oneonegrade9.setAdapter(adapter1);
        oneonegrade10.setAdapter(adapter1);

        btn = findViewById(R.id.calc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        final String[] oneonesubject = new String[10];
        oneonesubject[0] = oneonesubject1.getText().toString();
        oneonesubject[1] = oneonesubject2.getText().toString();
        oneonesubject[2] = oneonesubject3.getText().toString();
        oneonesubject[3] = oneonesubject4.getText().toString();
        oneonesubject[4] = oneonesubject5.getText().toString();
        oneonesubject[5] = oneonesubject6.getText().toString();
        oneonesubject[6] = oneonesubject7.getText().toString();
        oneonesubject[7] = oneonesubject8.getText().toString();
        oneonesubject[8] = oneonesubject9.getText().toString();
        oneonesubject[9] = oneonesubject10.getText().toString();


        final double[] oneonecredit = new double[10];
        oneonecredit[0] = Double.parseDouble(oneonecredit1.getSelectedItem().toString());
        oneonecredit[1] = Double.parseDouble(oneonecredit2.getSelectedItem().toString());
        oneonecredit[2] = Double.parseDouble(oneonecredit3.getSelectedItem().toString());
        oneonecredit[3] = Double.parseDouble(oneonecredit4.getSelectedItem().toString());
        oneonecredit[4] = Double.parseDouble(oneonecredit5.getSelectedItem().toString());
        oneonecredit[5] = Double.parseDouble(oneonecredit6.getSelectedItem().toString());
        oneonecredit[6] = Double.parseDouble(oneonecredit7.getSelectedItem().toString());
        oneonecredit[7] = Double.parseDouble(oneonecredit8.getSelectedItem().toString());
        oneonecredit[8] = Double.parseDouble(oneonecredit9.getSelectedItem().toString());
        oneonecredit[9] = Double.parseDouble(oneonecredit10.getSelectedItem().toString());

        final String[] oneonegrade = new String[10];
        oneonegrade[0] = String.format(oneonegrade1.getSelectedItem().toString());
        oneonegrade[1] = String.format(oneonegrade2.getSelectedItem().toString());
        oneonegrade[2] = String.format(oneonegrade3.getSelectedItem().toString());
        oneonegrade[3] = String.format(oneonegrade4.getSelectedItem().toString());
        oneonegrade[4] = String.format(oneonegrade5.getSelectedItem().toString());
        oneonegrade[5] = String.format(oneonegrade6.getSelectedItem().toString());
        oneonegrade[6] = String.format(oneonegrade7.getSelectedItem().toString());
        oneonegrade[7] = String.format(oneonegrade8.getSelectedItem().toString());
        oneonegrade[8] = String.format(oneonegrade9.getSelectedItem().toString());
        oneonegrade[9] = String.format(oneonegrade10.getSelectedItem().toString());

                oneonecheck[0] = findViewById(R.id.oneonecheck1);
                oneonecheck[1] = findViewById(R.id.oneonecheck2);
                oneonecheck[2] = findViewById(R.id.oneonecheck3);
                oneonecheck[3] = findViewById(R.id.oneonecheck4);
                oneonecheck[4] = findViewById(R.id.oneonecheck5);
                oneonecheck[5] = findViewById(R.id.oneonecheck6);
                oneonecheck[6] = findViewById(R.id.oneonecheck7);
                oneonecheck[7] = findViewById(R.id.oneonecheck8);
                oneonecheck[8] = findViewById(R.id.oneonecheck9);
                oneonecheck[9] = findViewById(R.id.oneonecheck10);







                double[] oneonegradeKor = new double[10];
                double[] oneonegradeEng = new double[10];
                double[] oneonecreditnum = new double[10];

                for (int i = 0; i < 10; i++) {
                    if (oneonesubject[i].getBytes().length > 0) //과목에 입력되어 있을 때만 실행
                    {
                        if (oneonecredit[i] == 3) {
                            oneonecreditnum[i] = 3;
                        }
                    if (oneonecredit[i] == 2) {
                        oneonecreditnum[i] = 2;
                    }
                    if (oneonecredit[i] == 1) {
                        oneonecreditnum[i] = 1;
                    }
                    if (oneonecredit[i] == 0) {
                        oneonecreditnum[i] = 0;
                    }


                    //credit을 문자열에서 숫자로 전환
                    if (oneonegrade[i].equals("A+")) {
                        oneonegradeKor[i] = 4.5;
                        oneonegradeEng[i] = 4;
                    }
                    if (oneonegrade[i].equals("A0")) {
                        oneonegradeKor[i] = 4;
                        oneonegradeEng[i] = 4;
                    }
                    if (oneonegrade[i].equals("B+")) {
                        oneonegradeKor[i] = 3.5;
                        oneonegradeEng[i] = 3;
                    }
                    if (oneonegrade[i].equals("B0")) {
                        oneonegradeKor[i] = 3;
                        oneonegradeEng[i] = 3;
                    }
                    if (oneonegrade[i].equals("C+")) {
                        oneonegradeKor[i] = 2.5;
                        oneonegradeEng[i] = 2;
                    }
                    if (oneonegrade[i].equals("C0")) {
                        oneonegradeKor[i] = 2;
                        oneonegradeEng[i] = 2;
                    }
                    if (oneonegrade[i].equals("D+")) {
                        oneonegradeKor[i] = 1.5;
                        oneonegradeEng[i] = 1;
                    }
                    if (oneonegrade[i].equals("D0")) {
                        oneonegradeKor[i] = 1;
                        oneonegradeEng[i] = 1;
                    }
                    if (oneonegrade[i].equals("F")) {
                        oneonegradeKor[i] = 0;
                        oneonegradeEng[i] = 0;
                    }
                    if (oneonegrade[i].equals("P") || oneonegrade[i].equals("NP")) {
                        oneonegradeKor[i] = 0;
                        oneonegradeEng[i] = 0;
                    } //grade를 문자열에서 숫자로 전환 ex)A->4.0


                    }
                }

                double totalKorgrade = 0;
                double totalEnggrade = 0;
                double totalcredit = 0;
                double totalKorgradesum = 0;
                double totalEnggradesum = 0;

                double totalKorgradeM = 0;
                double totalEnggradeM = 0;
                double totalcreditM = 0;
                double totalKorgradesumM = 0;
                double totalEnggradesumM = 0; //전공용
                double Major = 0;

                for (int j = 0; j < 10; j++) {

                        totalcredit += oneonecreditnum[j]; //총 이수학점 계산
                        totalKorgradesum += oneonegradeKor[j] * oneonecreditnum[j] ;
                        totalEnggradesum += Double.valueOf(oneonegradeEng[j]) * Double.valueOf(oneonecreditnum[j]) ;

                    }

                for (int j = 0; j < 10; j++) {
                     if(oneonecheck[j].isChecked()) {
                         totalcreditM += oneonecreditnum[j]; //총 이수학점 계산
                         totalKorgradesumM += oneonegradeKor[j] * oneonecreditnum[j];
                         totalEnggradesumM += Double.valueOf(oneonegradeEng[j]) * Double.valueOf(oneonecreditnum[j]);
                     }
                }
                    totalKorgrade = totalKorgradesum/totalcredit; //4.5 만점 평점
                    totalEnggrade = totalEnggradesum/totalcredit; //4.0 만점 평점
                    Major = totalKorgradesumM/totalcreditM;



                TextView creditview1 = findViewById(R.id.creditview1);
                TextView Korgradeview1 = findViewById(R.id.Korgradeview1);
                TextView Enggradeview1 = findViewById(R.id.Enggradeview1);
                TextView Majorgradeview1 = findViewById(R.id.Majorgradeview1);

                creditview1.setText(String.format(Locale.getDefault(),"%.0f",totalcredit));
                Korgradeview1.setText(String.format(Locale.getDefault(),"%.3f",totalKorgrade));
                Enggradeview1.setText(String.format(Locale.getDefault(),"%.3f",totalEnggrade));
                Majorgradeview1.setText(String.format(Locale.getDefault(),"%.3f",Major));



            }
        });



    }}
