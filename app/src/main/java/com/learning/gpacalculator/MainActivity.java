package com.learning.gpacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView calculus, website, computerGraphics, mobile, dataStructure,
            computer, sc, scResult, sg, sgTotal, cc, ccTotal, cg, cgTotal,

    calculus2, website2, computerGraphics2, mobile2, dataStructure2, computer2, sc1,
            scResult2, sg2, sgTotal2, cc2, ccTotal2, cg2, cgTotal2;

    Spinner cal1, cal2, web1, web2, cg1, cgSpinner2, daa1, daa2, mobile1, mobileSpinner, hci1, hci2,
            cal3, cal4, web3, web4, cg3, cgSpinner4, daa3, daa4, mobile3, mobileSpinner4, hci3, hci4;

    float gradesValue;

    int spinner1Value, spinner2Value, spinner3Value, spinner4Value, spinner5Value, spinner6Value,
            spinner11Value, spinner22Value, spinner33Value, spinner44Value, spinner55Value, spinner66Value;

    int creditsTotal, creditsTotal2, culmulativeCredits;

    float totalGradePoint1, totalGradePoint2, totalGradePoint3, totalGradePoint4, totalGradePoint5, totalGradePoint6,
            totalGradePoint11, totalGradePoint22, totalGradePoint33, totalGradePoint44, totalGradePoint55, totalGradePoint66,
            culmulativeGpa, gpaTotal, gpaResult, gpaTotal2, gpaResult2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*view Find*/
        calculus = findViewById(R.id.textView1);
        cal1 = findViewById(R.id.spinner1);
        cal2 = findViewById(R.id.spinner11);

        calculus2 = findViewById(R.id.textAI);
        cal3 = findViewById(R.id.spinnerAI1);
        cal4 = findViewById(R.id.spinnerAI2);


        website = findViewById(R.id.textView2);
        web1 = findViewById(R.id.spinner2);
        web2 = findViewById(R.id.spinner12);

        website2 = findViewById(R.id.textViewNET);
        web3 = findViewById(R.id.spinnerNET1);
        web4 = findViewById(R.id.spinnerNet2);

        computerGraphics = findViewById(R.id.textView3);
        cg1 = findViewById(R.id.spinner3);
        cgSpinner2 = findViewById(R.id.spinner13);

        computerGraphics2 = findViewById(R.id.textViewEng);
        cg3 = findViewById(R.id.spinnereng1);
        cgSpinner4 = findViewById(R.id.spinnereng2);

        mobile = findViewById(R.id.textView4);
        mobile1 = findViewById(R.id.spinner4);
        mobileSpinner = findViewById(R.id.spinner14);

        mobile2 = findViewById(R.id.textViewPak);
        mobile3 = findViewById(R.id.spinnerPak1);
        mobileSpinner4 = findViewById(R.id.spinnerPak2);


        dataStructure = findViewById(R.id.textView5);
        daa1 = findViewById(R.id.spinner5);
        daa2 = findViewById(R.id.spinner15);


        dataStructure2 = findViewById(R.id.textViewDbms);
        daa3 = findViewById(R.id.spinnerdbms1);
        daa4 = findViewById(R.id.spinnerdbms2);


        computer = findViewById(R.id.textView6);
        hci1 = findViewById(R.id.spinner6);
        hci2 = findViewById(R.id.spinner16);

        computer2 = findViewById(R.id.textViewDld);
        hci3 = findViewById(R.id.spinnerDld1);
        hci4 = findViewById(R.id.spinnerDld2);


        sc = findViewById(R.id.textView111);
        scResult = findViewById(R.id.textView1111);

        sg = findViewById(R.id.textView222);
        sgTotal = findViewById(R.id.textView2222);


        cc = findViewById(R.id.textView333);
        ccTotal = findViewById(R.id.textView3333);

        cg = findViewById(R.id.textView444);
        cgTotal = findViewById(R.id.textView4444);
        /*2*/

        sc1 = findViewById(R.id.textViewSc1);
        scResult2 = findViewById(R.id.textViewSc2);

        sg2 = findViewById(R.id.textViewSg1);
        sgTotal2 = findViewById(R.id.textViewSg2);


        cc2 = findViewById(R.id.textViewCc1);
        ccTotal2 = findViewById(R.id.textViewCc2);

        cg2 = findViewById(R.id.textViewCg1);
        cgTotal2 = findViewById(R.id.textViewCg2);


        /*values spinner*/
        Integer[] values = {1, 2, 3, 4, 5, 6};
        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, values);
        cal1.setAdapter(adapter1);
        web1.setAdapter(adapter1);
        cg1.setAdapter(adapter1);
        mobile1.setAdapter(adapter1);
        daa1.setAdapter(adapter1);
        hci1.setAdapter(adapter1);

        /*grade spinner*/
        ArrayList<String> grades = new ArrayList<>();

        grades.add(0, "choose");
        grades.add("A");
        grades.add("A-");
        grades.add("B");
        grades.add("B+");
        grades.add("B-");
        grades.add("C");
        grades.add("C+");
        grades.add("D");
        grades.add("F");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, grades);
        cal2.setAdapter(adapter2);
        web2.setAdapter(adapter2);
        cgSpinner2.setAdapter(adapter2);
        mobileSpinner.setAdapter(adapter2);
        daa2.setAdapter(adapter2);
        hci2.setAdapter(adapter2);

        hci1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {

                spinner1Value = Integer.parseInt(cal1.getItemAtPosition(position).toString());
                spinner2Value = Integer.parseInt(web1.getItemAtPosition(position).toString());
                spinner3Value = Integer.parseInt(cg1.getItemAtPosition(position).toString());
                spinner4Value = Integer.parseInt(mobile1.getItemAtPosition(position).toString());
                spinner5Value = Integer.parseInt(daa1.getItemAtPosition(position).toString());
                spinner6Value = Integer.parseInt(hci1.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });

        cal2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint1 = gradesValue * spinner1Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        web2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint2 = gradesValue * spinner2Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        cgSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint3 = gradesValue * spinner3Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mobileSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint4 = gradesValue * spinner4Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        daa2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint5 = gradesValue * spinner5Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        hci2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }

                totalGradePoint6 = gradesValue * spinner6Value;

                creditsTotal = spinner1Value + spinner2Value + spinner3Value + spinner4Value + spinner5Value + spinner6Value;
                scResult.setText(String.valueOf(creditsTotal));

                gpaTotal = totalGradePoint1 + totalGradePoint2 + totalGradePoint3 + totalGradePoint4 + totalGradePoint5 + totalGradePoint6;
                gpaResult = gpaTotal / creditsTotal;
                sgTotal.setText(String.format(" %.3f", gpaResult));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });






        /*             2 semester                 */

        /*values spinner*/
        Integer[] values2 = {1, 2, 3, 4, 5, 6};
        ArrayAdapter<Integer> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, values2);
        cal3.setAdapter(adapter11);
        web3.setAdapter(adapter11);
        cg3.setAdapter(adapter11);
        mobile3.setAdapter(adapter11);
        daa3.setAdapter(adapter11);
        hci3.setAdapter(adapter11);

        /*grade spinner*/
        ArrayList<String> grades2 = new ArrayList<>();

        grades2.add(0, "choose");
        grades2.add("A");
        grades2.add("A-");
        grades2.add("B");
        grades2.add("B+");
        grades2.add("B-");
        grades2.add("C");
        grades2.add("C+");
        grades2.add("D");
        grades2.add("F");

        ArrayAdapter<String> adapter22 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, grades2);
        cal4.setAdapter(adapter22);
        web4.setAdapter(adapter22);
        cgSpinner4.setAdapter(adapter22);
        mobileSpinner4.setAdapter(adapter22);
        daa4.setAdapter(adapter22);
        hci4.setAdapter(adapter22);

        hci3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {

                spinner11Value = Integer.parseInt(cal3.getItemAtPosition(position).toString());
                spinner22Value = Integer.parseInt(web3.getItemAtPosition(position).toString());
                spinner33Value = Integer.parseInt(cg3.getItemAtPosition(position).toString());
                spinner44Value = Integer.parseInt(mobile3.getItemAtPosition(position).toString());
                spinner55Value = Integer.parseInt(daa3.getItemAtPosition(position).toString());
                spinner66Value = Integer.parseInt(hci3.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });

        cal4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint11 = gradesValue * spinner11Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        web4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint22 = gradesValue * spinner22Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        cgSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint33 = gradesValue * spinner33Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mobileSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint44 = gradesValue * spinner44Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        daa4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }
                totalGradePoint55 = gradesValue * spinner55Value;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        hci4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A")) {
                    gradesValue = (float) 4.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("A-")) {
                    gradesValue = (float) 3.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B")) {
                    gradesValue = (float) 3.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B-")) {
                    gradesValue = (float) 2.67;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("D")) {
                    gradesValue = (float) 1.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("F")) {
                    gradesValue = (float) 0.00;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("B+")) {
                    gradesValue = (float) 3.30;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C+")) {
                    gradesValue = (float) 3.33;
                } else if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("C")) {
                    gradesValue = (float) 2.00;
                }

                totalGradePoint66 = gradesValue * spinner66Value;

                creditsTotal2 = spinner11Value + spinner22Value + spinner33Value + spinner44Value + spinner55Value + spinner66Value;
                scResult2.setText(String.valueOf(creditsTotal2));

                gpaTotal2 = totalGradePoint11 + totalGradePoint22 + totalGradePoint33 + totalGradePoint44 + totalGradePoint55 + totalGradePoint66;
                gpaResult2 = gpaTotal2 / creditsTotal2;
                sgTotal2.setText(String.format(" %.3f", gpaResult2));


                culmulativeCredits = creditsTotal + creditsTotal2;
                ccTotal2.setText(String.valueOf(culmulativeCredits));

                culmulativeGpa = gpaResult + gpaResult2;
                float culRes = culmulativeGpa / culmulativeCredits;
                cgTotal2.setText(String.format("%.3f",culRes));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


    }
}