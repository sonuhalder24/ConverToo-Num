package com.example.convertoonum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.transition.Transition;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button btnAc,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnA,btnB,btnC,btnD,btnE,btnF,btnDel,btnDot;
    TextView tvEnter,textView;
    Spinner spinner1,spinner2;
    SharedPreferences LastSelect;
    SharedPreferences.Editor editor;
    String val="";
    int count=-1;
    int kp=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LastSelect=getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();

        final int LastClickSpinner1=LastSelect.getInt("LastClickSpinner1",0);
        final int LastClickSpinner2=LastSelect.getInt("LastClickSpinner2",0);


        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        tvEnter=findViewById(R.id.tvEnter);
        textView=findViewById(R.id.textView);
        LinearLayout layout=findViewById(R.id.key);


        btnAc=findViewById(R.id.button_ac);
        btn0=findViewById(R.id.button_0);
        btn1=findViewById(R.id.button_1);
        btn2=findViewById(R.id.button_2);
        btn3=findViewById(R.id.button_3);
        btn4=findViewById(R.id.button_4);
        btn5=findViewById(R.id.button_5);
        btn6=findViewById(R.id.button_6);
        btn7=findViewById(R.id.button_7);
        btn8=findViewById(R.id.button_8);
        btn9=findViewById(R.id.button_9);
        btnA=findViewById(R.id.button_A);
        btnB=findViewById(R.id.button_B);
        btnC=findViewById(R.id.button_C);
        btnD=findViewById(R.id.button_D);
        btnE=findViewById(R.id.button_E);
        btnF=findViewById(R.id.button_F);
        btnDot=findViewById(R.id.button_dot);
        btnDel=findViewById(R.id.button_delete);


        ArrayAdapter adapterSpinner1=ArrayAdapter.createFromResource(this,R.array.number_sys,android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapterSpinner1);
        spinner1.setSelection(LastClickSpinner1);
        spinner1.setOnItemSelectedListener(this);

        ArrayAdapter adapterSpinner2=ArrayAdapter.createFromResource(this,R.array.number_sys1,android.R.layout.simple_spinner_item);
        spinner2.setAdapter(adapterSpinner2);
        spinner2.setSelection(LastClickSpinner2);
        spinner2.setOnItemSelectedListener(this);

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipboardManager clipboardManager= (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("EditText",textView.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(MainActivity.this, "Copied", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = "";
                tvEnter.setText(val);
                textView.setText(val);

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"0";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"1";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"2";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"3";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"4";
                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"5";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"6";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"7";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"8";
                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"9";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"A";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"B";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"C";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"D";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"E";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val+"F";

                if(val.length()<=15) {
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter a value which is lesser than 16 characters",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!val.contains(".")) {
                    if(val.equals("")){
                        val=val+"0.";
                    }
                    else {
                        val = val + ".";
                    }
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }

                else {
                    Toast.makeText(MainActivity.this, "More than 1 dot is not allowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    val = tvEnter.getText().toString().substring(0, tvEnter.getText().toString().length() - 1);
                    tvEnter.setText(val);
                    convertMethod(val,count,kp);
                }catch (Exception e){

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.learn:
//                Toast.makeText(this, "Learn clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,MainActivity2.class));
                break;
            case R.id.about:
//                Toast.makeText(this, "About clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,AboutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(parent.getId()==R.id.spinner1) {
            if (position == 0) {

                val="";
                textView.setText(val);
                tvEnter.setText(val);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                count=0;


            } else if (position == 1) {
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                count=1;
            } else if (position == 2) {
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btnA.setEnabled(false);
                btnB.setEnabled(false);
                btnC.setEnabled(false);
                btnD.setEnabled(false);
                btnE.setEnabled(false);
                btnF.setEnabled(false);
                count=2;
            }
            else if(position==3){
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnA.setEnabled(true);
                btnB.setEnabled(true);
                btnC.setEnabled(true);
                btnD.setEnabled(true);
                btnE.setEnabled(true);
                btnF.setEnabled(true);
                count=3;
            }
            editor.putInt("LastClickSpinner1",count).commit();

        }
        else if(parent.getId()== R.id.spinner2) {
            if(position==0){
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                kp=0;
            }
            else if(position==1){
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                kp=1;
            }
            else if(position==2){
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                kp=2;
            }
            else if(position==3){
                val="";
                textView.setText(val);
                tvEnter.setText(val);
                kp=3;
            }
            editor.putInt("LastClickSpinner2",kp).commit();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    //for long values
    String DecToBin(String val){
        String ans = Long.toBinaryString(Long.parseLong(val));
        return ans;
    }
    String DecToOct(String val){
        String ans=Long.toOctalString(Long.parseLong(val));
        return ans;
    }
    String DecToHex(String val){
        String ans=Long.toHexString(Long.parseLong(val));
        return ans;
    }
    int BinToDec(String val){
        int ans=Integer.parseInt(val,2);
        return ans;
    }
    long OctToDec(String val){
        long ans=Long.parseLong(val,8);
        return ans;
    }
    long HexToDec(String val){
        long ans=Long.parseLong(val,16);
        return ans;
    }
    String BinToOct(String val){
        String ans=Long.toOctalString(BinToDec(val));
        return ans;
    }
    String HexToOct(String val){
        String ans=Long.toOctalString(HexToDec(val));
        return ans;
    }
    String BinToHex(String val){
        String ans=Long.toHexString(BinToDec(val));
        return ans;
    }
    String OctToHex(String val){
        String ans=Long.toHexString(OctToDec(val));
        return ans;
    }
    String OctToBin(String val){
        String ans=Long.toBinaryString(OctToDec(val));
        return ans;
    }
    String HexToBin(String val){
        String ans=Long.toBinaryString(HexToDec(val));
        return ans;
    }
    //for double values
    String DecimaltoBinary(double d) {
        long wholePart = (long) d;
        return Long.toBinaryString(wholePart) + '.' + fractionalToBinary(d - wholePart, 34);
    }
    String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }
    String BinarytoOctal(String s){
        String val="";
        String dipa="";
        String wholePart=s.substring(0, s.indexOf('.'));
        String factPart= s.substring(s.indexOf('.')+1);
        for(int i=wholePart.length()-1;i>=0;i=i-3) {
            if(i-2>=0) {
                String k=wholePart.substring(i-2,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }else if(i-1>=0) {
                String k=wholePart.substring(i-1,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }
            else {
                String k=wholePart.substring(i,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }

        }
        StringBuilder val1 = new StringBuilder();
        val1.append(val);
        val1.reverse();
        for(int i=0;i<factPart.length();i=i+3) {
            if(i+2<=factPart.length()-1) {
                String k=factPart.substring(i,i+3);
                int m=Integer.parseInt(k,2);
                dipa=dipa+m;
            }else if(i+1<=factPart.length()-1) {
                String k=factPart.substring(i,i+2);
                k=k+"0";
                int m=Integer.parseInt(k,2);
                dipa=dipa+m;
            }
            else {
                String k=factPart.substring(i,i+1);
                k=k+"00";
                int m=Integer.parseInt(k,2);
                dipa=dipa+m;
            }

        }
        return(val1+"."+dipa);
    }
    String DecimaltoOctal(Double d){
        String s1=DecimaltoBinary(d);
        String ans=BinarytoOctal(s1);
        return ans;
    }
    String BinarytoHexadecimal(String s){
        String val="";
        String dipa="";
        String wholePart=s.substring(0, s.indexOf('.'));
        String factPart= s.substring(s.indexOf('.')+1);

        for(int i=wholePart.length()-1;i>=0;i=i-4) {
            if(i-3>=0) {
                String k=wholePart.substring(i-3,i+1);
                int m=Integer.parseInt(k,2);
                if(m==10) {
                    val=val+'A';
                }
                else if(m==11) {
                    val=val+'B';
                }
                else if(m==12) {
                    val=val+'C';
                }
                else if(m==13) {
                    val=val+'D';
                }
                else if(m==14) {
                    val=val+'E';
                }
                else if(m==15) {
                    val=val+'F';
                }
                else {
                    val=val+m;
                }
            }else if(i-2>=0) {
                String k=wholePart.substring(i-2,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }
            else if(i-1>=0) {
                String k=wholePart.substring(i-1,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }
            else {
                String k=wholePart.substring(i,i+1);
                int m=Integer.parseInt(k,2);
                val=val+m;
            }

        }
        StringBuilder val1 = new StringBuilder();
        val1.append(val);
        val1.reverse();

        for(int i=0;i<factPart.length();i=i+4) {
            if(i+3<=factPart.length()-1) {
                String k=factPart.substring(i,i+4);
                int m=Integer.parseInt(k,2);
                if(m==10) {
                    dipa=dipa+'A';
                }
                else if(m==11) {
                    dipa=dipa+'B';
                }
                else if(m==12) {
                    dipa=dipa+'C';
                }
                else if(m==13) {
                    dipa=dipa+'D';
                }
                else if(m==14) {
                    dipa=dipa+'E';
                }
                else if(m==15) {
                    dipa=dipa+'F';
                }
                else {
                    dipa=dipa+m;
                }
            }else if(i+2<=factPart.length()-1) {
                String k=factPart.substring(i,i+3);
                k=k+"0";
                int m=Integer.parseInt(k,2);
                if(m==10) {
                    dipa=dipa+'A';
                }
                else if(m==11) {
                    dipa=dipa+'B';
                }
                else if(m==12) {
                    dipa=dipa+'C';
                }
                else if(m==13) {
                    dipa=dipa+'D';
                }
                else if(m==14) {
                    dipa=dipa+'E';
                }
                else if(m==15) {
                    dipa=dipa+'F';
                }
                else {
                    dipa=dipa+m;
                }
            }
            else if(i+1<=factPart.length()-1){
                String k=factPart.substring(i,i+2);
                k=k+"00";
                int m=Integer.parseInt(k,2);
                if(m==10) {
                    dipa=dipa+'A';
                }
                else if(m==11) {
                    dipa=dipa+'B';
                }
                else if(m==12) {
                    dipa=dipa+'C';
                }
                else if(m==13) {
                    dipa=dipa+'D';
                }
                else if(m==14) {
                    dipa=dipa+'E';
                }
                else if(m==15) {
                    dipa=dipa+'F';
                }
                else {
                    dipa=dipa+m;
                }
            }
            else{
                String k=factPart.substring(i,i+1);
                k=k+"000";
                int m=Integer.parseInt(k,2);
                if(m==10) {
                    dipa=dipa+'A';
                }
                else if(m==11) {
                    dipa=dipa+'B';
                }
                else if(m==12) {
                    dipa=dipa+'C';
                }
                else if(m==13) {
                    dipa=dipa+'D';
                }
                else if(m==14) {
                    dipa=dipa+'E';
                }
                else if(m==15) {
                    dipa=dipa+'F';
                }
                else {
                    dipa=dipa+m;
                }
            }

        }
        return(val1+"."+dipa);
    }
    String DecimaltoHexadecimal(Double d){
        String s1=DecimaltoBinary(d);
        String ans=BinarytoHexadecimal(s1);
        return ans;
    }

    String OctaltoBinary(String s){
        String val="";
        String dipa="";
        String wholePart=s.substring(0, s.indexOf('.'));
        String factPart= s.substring(s.indexOf('.')+1);
        for(long i=0;i<wholePart.length();i++){
            String k=Integer.toBinaryString(Integer.parseInt(String.valueOf(wholePart.charAt((int) i))));
            if(k.length()==2) {
                k="0"+k;
            }
            else if(k.length()==1) {
                k="00"+k;
            }
            else if(k.length()==0) {
                k="000"+k;
            }
            val=val+k;
        }
        for(long i=0;i<factPart.length();i++){
            String k=Integer.toBinaryString(Integer.parseInt(String.valueOf(factPart.charAt((int) i))));
            if(k.length()==2) {
                k="0"+k;
            }
            else if(k.length()==1) {
                k="00"+k;
            }
            else if(k.length()==0) {
                k="000"+k;
            }
            dipa=dipa+k;
        }
        return(val+"."+dipa);
    }
    String OctaltoHexadecimal(String s){
        String value=OctaltoBinary(s);
        String ans=BinarytoHexadecimal(value);
        return ans;
    }
    String HexadecimaltoBinary(String s){
        String val="";
        String dipa="";
        String wholePart=s.substring(0, s.indexOf('.'));
        String factPart= s.substring(s.indexOf('.')+1);

        for(long i=0;i<wholePart.length();i++){
            String m=String.valueOf(wholePart.charAt((int) i));
            String k="";
            if(m.equals("A")) {
                k=Integer.toBinaryString(10);
            }
            else if(m.equals("B")) {
                k=Integer.toBinaryString(11);
            }
            else if(m.equals("C")) {
                k=Integer.toBinaryString(12);
            }
            else if(m.equals("D")) {
                k=Integer.toBinaryString(13);
            }
            else if(m.equals("E")) {
                k=Integer.toBinaryString(14);
            }
            else if(m.equals("F")) {
                k=Integer.toBinaryString(15);
            }
            else {
                k=Integer.toBinaryString(Integer.parseInt(m));
                if(k.length()==3) {
                    k="0"+k;
                }
                else if(k.length()==2) {
                    k="00"+k;
                }
                else if(k.length()==1) {
                    k="000"+k;
                }
                else if(k.length()==0) {
                    k="0000"+k;
                }

            }
            val=val+k;
        }
        for(long i=0;i<factPart.length();i++){
            String m=String.valueOf(factPart.charAt((int) i));
            String k="";
            if(m.equals("A")) {
                k=Integer.toBinaryString(10);
            }
            else if(m.equals("B")) {
                k=Integer.toBinaryString(11);
            }
            else if(m.equals("C")) {
                k=Integer.toBinaryString(12);
            }
            else if(m.equals("D")) {
                k=Integer.toBinaryString(13);
            }
            else if(m.equals("E")) {
                k=Integer.toBinaryString(14);
            }
            else if(m.equals("F")) {
                k=Integer.toBinaryString(15);
            }
            else {
                k=Integer.toBinaryString(Integer.parseInt(m));
                if(k.length()==3) {
                    k="0"+k;
                }
                else if(k.length()==2) {
                    k="00"+k;
                }
                else if(k.length()==1) {
                    k="000"+k;
                }
                else if(k.length()==0) {
                    k="0000"+k;
                }

            }
            dipa=dipa+k;
        }
        return(val+"."+dipa);
    }
    String HexadecimaltoOctal(String s){
        String k=HexadecimaltoBinary(s);
        String ans=BinarytoOctal(k);
        return ans;
    }
    String BinarytoDecimal(String s){
        String val="";
        String wholePart=s.substring(0, s.indexOf('.'));
        String factPart= s.substring(s.indexOf('.')+1);

        val=String.valueOf(Long.parseLong(wholePart,2)) ;

        float f=0;
        for(long i=0;i<factPart.length();i++) {
            int t=Integer.parseInt(String.valueOf(factPart.charAt((int) i)));
            float m=(float) ((double)t*Math.pow(2, (-(i+1))));
            f=f+m;
        }
        String ans=String.valueOf(Float.parseFloat(val)+f);
        return ans;
    }
    String OctaltoDecimal(String s){
        String k=OctaltoBinary(s);
        String ans=BinarytoDecimal(k);
        return ans;
    }
    String HexadecimaltoDecimal(String s){
        String k=HexadecimaltoBinary(s);
        String ans=BinarytoDecimal(k);
        return ans;
    }
    //convert Method..
    void convertMethod(String val,int count,int kp){
        if (count == 0) {
            if (kp == 0) {//Decimal to Binary conversion
                if(!val.contains(".")) {
                    textView.setText(DecToBin(val));
                }
                else{
                    textView.setText(DecimaltoBinary(Double.parseDouble(val)));
                }
            }
            else if (kp == 1) {//Decimal to Octal conversion
                if(!val.contains(".")) {
                    textView.setText(DecToOct(val));
                }
                else{
                    textView.setText(DecimaltoOctal(Double.parseDouble(val)));
                }
            }
            else if (kp == 2) {//Decimal to Hexadecimal conversion
                if(!val.contains(".")) {
                    textView.setText(DecToHex(val).toUpperCase());
                }
                else{
                    textView.setText(DecimaltoHexadecimal(Double.parseDouble(val)));
                }

            }
            else if (kp == 3) {//Decimal to Decimal conversion
                textView.setText(val);
            }
        } else if (count == 1) {
            if (kp == 0) {//Binary to Binary
                textView.setText(val);
            }
            else if (kp == 1) {//Binary to Octal conversion
                if(!val.contains(".")) {
                    textView.setText(BinToOct(val));
                }
                else{
                    textView.setText(BinarytoOctal(val));
                }
            }
            else if (kp == 2) {//Binary to Hexadecimal conversion
                if(!val.contains(".")) {
                    textView.setText(BinToHex(val).toUpperCase());
                }
                else{
                    textView.setText(BinarytoHexadecimal(val));
                }
            }
            else if (kp == 3) {//Binary to Decimal conversion

                if(!val.contains(".")) {

                    textView.setText(String.valueOf( BinToDec(val)));
                }
                else{
                    textView.setText(String.valueOf(BinarytoDecimal(val)));
                }

            }
        } else if (count == 2) {
            if (kp == 0) {//Octal to Binary conversion
                if(!val.contains(".")) {
                    textView.setText(OctToBin(val));
                }
                else{
                    textView.setText(OctaltoBinary(val));
                }
            }
            else if (kp == 1) {//Octal to Octal conversion
                textView.setText(val);
            }
            else if (kp == 2) {//Octal to Hexadecimal conversion
                if(!val.contains(".")) {
                    textView.setText(OctToHex(val).toUpperCase());
                }
                else{
                    textView.setText(OctaltoHexadecimal(val));
                }
            }
            else if (kp == 3) {//Octal to Decimal conversion
                if(!val.contains(".")) {
                    textView.setText(String.valueOf(OctToDec(val)));
                }
                else{
                    textView.setText(String.valueOf(OctaltoDecimal(val)));
                }
            }
        } else if (count == 3) {
            if (kp == 0) {//Hexadecimal to Binary conversion
                if(!val.contains(".")) {
                    textView.setText(HexToBin(val));
                }
                else{
                    textView.setText(HexadecimaltoBinary(val));
                }
            }
            else if (kp == 1) {//Hexadecimal to Octal conversion
                if(!val.contains(".")) {
                    textView.setText(HexToOct(val));
                }
                else{
                    textView.setText(HexadecimaltoOctal(val));
                }
            }
            else if (kp == 2) {//Hexadecimal to Hexadecimal conversion
                textView.setText(val);
            }
            else if (kp == 3) {//Hexadecimal to Decimal conversion
                if(!val.contains(".")) {
                    textView.setText(String.valueOf(HexToDec(val)));
                }
                else{
                    textView.setText(String.valueOf(HexadecimaltoDecimal(val)));
                }
            }
        }
    }
}