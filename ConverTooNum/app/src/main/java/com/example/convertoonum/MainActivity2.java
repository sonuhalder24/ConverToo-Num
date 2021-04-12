package com.example.convertoonum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity2 extends AppCompatActivity {
    ImageView img1,like1,share1,img2,like2,share2,img3,like3,share3,img4,like4,share4,img5,like5,share5,
            img6,like6,share6,img7,like7,share7,img8,like8,share8,img9,like9,share9,
            img10,like10,share10,img11,like11,share11,img12,like12,share12;
    long count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img1=findViewById(R.id.imageView1);
        like1=findViewById(R.id.like_btn1);
        share1=findViewById(R.id.share_btn1);
        img2=findViewById(R.id.imageView2);
        like2=findViewById(R.id.like_btn2);
        share2=findViewById(R.id.share_btn2);
        img3=findViewById(R.id.imageView3);
        like3=findViewById(R.id.like_btn3);
        share3=findViewById(R.id.share_btn3);
        img4=findViewById(R.id.imageView4);
        like4=findViewById(R.id.like_btn4);
        share4=findViewById(R.id.share_btn4);
        img5=findViewById(R.id.imageView5);
        like5=findViewById(R.id.like_btn5);
        share5=findViewById(R.id.share_btn5);
        img6=findViewById(R.id.imageView6);
        like6=findViewById(R.id.like_btn6);
        share6=findViewById(R.id.share_btn6);
        img7=findViewById(R.id.imageView7);
        like7=findViewById(R.id.like_btn7);
        share7=findViewById(R.id.share_btn7);
        img8=findViewById(R.id.imageView8);
        like8=findViewById(R.id.like_btn8);
        share8=findViewById(R.id.share_btn8);
        img9=findViewById(R.id.imageView9);
        like9=findViewById(R.id.like_btn9);
        share9=findViewById(R.id.share_btn9);
        img10=findViewById(R.id.imageView10);
        like10=findViewById(R.id.like_btn10);
        share10=findViewById(R.id.share_btn10);
        img11=findViewById(R.id.imageView11);
        like11=findViewById(R.id.like_btn11);
        share11=findViewById(R.id.share_btn11);
        img12=findViewById(R.id.imageView12);
        like12=findViewById(R.id.like_btn12);
        share12=findViewById(R.id.share_btn12);
        SharedPreferences preferences=getSharedPreferences("LIKE",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=preferences.edit();
        long click1=preferences.getInt("COUNT1",-1);
        long click2=preferences.getInt("COUNT2",-1);
        long click3=preferences.getInt("COUNT3",-1);
        long click4=preferences.getInt("COUNT4",-1);
        long click5=preferences.getInt("COUNT5",-1);
        long click6=preferences.getInt("COUNT6",-1);
        long click7=preferences.getInt("COUNT7",-1);
        long click8=preferences.getInt("COUNT8",-1);
        long click9=preferences.getInt("COUNT9",-1);
        long click10=preferences.getInt("COUNT10",-1);
        long click11=preferences.getInt("COUNT11",-1);
        long click12=preferences.getInt("COUNT12",-1);
        if(click1%2==0){
            like1.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else {
            like1.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click2%2==0){
            like2.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else {
            like2.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click3%2==0){
            like3.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like3.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click4%2==0){
            like4.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like4.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click5%2==0){
            like5.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like5.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click6%2==0){
            like6.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like6.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click7%2==0){
            like7.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like7.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click8%2==0){
            like8.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like8.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click9%2==0){
            like9.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like9.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click10%2==0){
            like10.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like10.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click11%2==0){
            like11.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like11.setImageResource(R.drawable.ic_thumbs_up);
        }
        if(click12%2==0){
            like12.setImageResource(R.drawable.ic_thumbs_up_blue);
        }
        else{
            like12.setImageResource(R.drawable.ic_thumbs_up);
        }

        like1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT1", (int) count1).apply();
                if(count1%2==0) {
                    like1.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like1.setImageResource(R.drawable.ic_thumbs_up);
                }
                count1++;
            }
        });
        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img1);
            }
        });
        like2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT2", (int) count2).apply();
                if(count2%2==0) {
                    like2.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like2.setImageResource(R.drawable.ic_thumbs_up);
                }
                count2++;
            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img2);
            }
        });
        like3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT3", (int) count3).apply();
                if(count3%2==0) {
                    like3.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like3.setImageResource(R.drawable.ic_thumbs_up);
                }
                count3++;
            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img3);
            }
        });
        like4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT4", (int) count4).apply();
                if(count4%2==0) {
                    like4.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like4.setImageResource(R.drawable.ic_thumbs_up);
                }
                count4++;
            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img4);
            }
        });
        like5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT5", (int) count5).apply();
                if(count5%2==0) {
                    like5.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like5.setImageResource(R.drawable.ic_thumbs_up);
                }
                count5++;
            }
        });
        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img5);
            }
        });
        like6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT6", (int) count6).apply();
                if(count6%2==0) {
                    like6.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like6.setImageResource(R.drawable.ic_thumbs_up);
                }
                count6++;
            }
        });
        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img6);
            }
        });
        like7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT7", (int) count7).apply();
                if(count7%2==0) {
                    like7.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like7.setImageResource(R.drawable.ic_thumbs_up);
                }
                count7++;
            }
        });
        share7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img7);
            }
        });
        like8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT8", (int) count8).apply();
                if(count8%2==0) {
                    like8.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like8.setImageResource(R.drawable.ic_thumbs_up);
                }
                count8++;
            }
        });
        share8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img8);
            }
        });
        like9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT9", (int) count9).apply();
                if(count9%2==0) {
                    like9.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like9.setImageResource(R.drawable.ic_thumbs_up);
                }
                count9++;
            }
        });
        share9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img9);
            }
        });
        like10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT10", (int) count10).apply();
                if(count10%2==0) {
                    like10.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like10.setImageResource(R.drawable.ic_thumbs_up);
                }
                count10++;
            }
        });
        share10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img10);
            }
        });
        like11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT11", (int) count11).apply();
                if(count11%2==0) {
                    like11.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like11.setImageResource(R.drawable.ic_thumbs_up);
                }
                count11++;
            }
        });
        share11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img11);
            }
        });
        like12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("COUNT12", (int) count12).apply();
                if(count12%2==0) {
                    like12.setImageResource(R.drawable.ic_thumbs_up_blue);
                }
                else{
                    like12.setImageResource(R.drawable.ic_thumbs_up);
                }
                count12++;
            }
        });
        share12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image(img12);
            }
        });
    }
    private void image(ImageView img){
        StrictMode.VmPolicy.Builder builder=new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
        Bitmap bitmap=drawable.getBitmap();
        File f=new File(getExternalCacheDir()+"/"+getResources().getString(R.string.app_name) +".png");
        Intent intent = null;

        try {
            FileOutputStream outputStream=new FileOutputStream(f);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);

            outputStream.flush();
            outputStream.close();
            intent=new Intent(Intent.ACTION_SEND);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        }catch (Exception e){

        }
        startActivity(Intent.createChooser(intent,"share image"));
    }
}