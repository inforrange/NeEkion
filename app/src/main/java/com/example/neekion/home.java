package com.example.neekion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    public int blm1ID,blm2ID,blm3ID,blm4ID,blm5ID,blm6ID,blm7ID,blm8ID,blm9ID,blm10ID,blm11ID,blm12ID,blm13ID;
    public ImageView htrltc,blm1Img,blm2Img,blm3Img,blm4Img,blm5Img,blm6Img,blm7Img,blm8Img,blm9Img,blm10Img,blm11Img,blm12Img,blm13Img;
    public TextView blm1Name,blm1Text,blm1Tprk,blm1Su,blm1Zmn,
                    blm2Name,blm2Text,blm2Tprk,blm2Su,blm2Zmn,
                    blm3Name,blm3Text,blm3Tprk,blm3Su,blm3Zmn,
                    blm4Name,blm4Text,blm4Tprk,blm4Su,blm4Zmn,
                    blm5Name,blm5Text,blm5Tprk,blm5Su,blm5Zmn,
                    blm6Name,blm6Text,blm6Tprk,blm6Su,blm6Zmn,
                    blm7Name,blm7Text,blm7Tprk,blm7Su,blm7Zmn,
                    blm8Name,blm8Text,blm8Tprk,blm8Su,blm8Zmn,
                    blm9Name,blm9Text,blm9Tprk,blm9Su,blm9Zmn,
                    blm10Name,blm10Text,blm10Tprk,blm10Su,blm10Zmn,
                    blm11Name,blm11Text,blm11Tprk,blm11Su,blm11Zmn,
                    blm12Name,blm12Text,blm12Tprk,blm12Su,blm12Zmn,
                    blm13Name,blm13Text,blm13Tprk,blm13Su,blm13Zmn;
    public int dgs = 0,bas1,bas2,bas3,var;
    private SQLiteDatabase database,test;
    private LinearLayout blm1,blm2,blm3,blm4,blm5,blm6,blm7,blm8,blm9,blm10,blm11,blm12,blm13;
    public Intent bitki;

    public String btkname,tprk,su,zmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        blm1Img = (ImageView)findViewById(R.id.blm1Img);
        blm2Img = (ImageView)findViewById(R.id.blm2Img);
        blm3Img = (ImageView)findViewById(R.id.blm3Img);
        blm4Img = (ImageView)findViewById(R.id.blm4Img);
        blm5Img = (ImageView)findViewById(R.id.blm5Img);
        blm6Img = (ImageView)findViewById(R.id.blm6Img);
        blm7Img = (ImageView)findViewById(R.id.blm7Img);
        blm8Img = (ImageView)findViewById(R.id.blm8Img);
        blm9Img = (ImageView)findViewById(R.id.blm9Img);
        blm10Img = (ImageView)findViewById(R.id.blm10Img);
        blm11Img = (ImageView)findViewById(R.id.blm11Img);
        blm12Img = (ImageView)findViewById(R.id.blm12Img);
        blm13Img = (ImageView)findViewById(R.id.blm13Img);


        blm1Name = (TextView)findViewById(R.id.blm1Name);
        blm1Text = (TextView)findViewById(R.id.blm1Text);
        blm1Tprk = (TextView)findViewById(R.id.blm1Tprk);
        blm1Su = (TextView)findViewById(R.id.blm1Su);
        blm1Zmn = (TextView)findViewById(R.id.blm1Zmn);

        blm2Name = (TextView)findViewById(R.id.blm2Name);
        blm2Text = (TextView)findViewById(R.id.blm2Text);
        blm2Tprk = (TextView)findViewById(R.id.blm2Tprk);
        blm2Su = (TextView)findViewById(R.id.blm2Su);
        blm2Zmn = (TextView)findViewById(R.id.blm2Zmn);

        blm3Name = (TextView)findViewById(R.id.blm3Name);
        blm3Text = (TextView)findViewById(R.id.blm3Text);
        blm3Tprk = (TextView)findViewById(R.id.blm3Tprk);
        blm3Su = (TextView)findViewById(R.id.blm3Su);
        blm3Zmn = (TextView)findViewById(R.id.blm3Zmn);

        blm4Name = (TextView)findViewById(R.id.blm4Name);
        blm4Text = (TextView)findViewById(R.id.blm4Text);
        blm4Tprk = (TextView)findViewById(R.id.blm4Tprk);
        blm4Su = (TextView)findViewById(R.id.blm4Su);
        blm4Zmn = (TextView)findViewById(R.id.blm4Zmn);

        blm5Name = (TextView)findViewById(R.id.blm5Name);
        blm5Text = (TextView)findViewById(R.id.blm5Text);
        blm5Tprk = (TextView)findViewById(R.id.blm5Tprk);
        blm5Su = (TextView)findViewById(R.id.blm5Su);
        blm5Zmn = (TextView)findViewById(R.id.blm5Zmn);

        blm6Name = (TextView)findViewById(R.id.blm6Name);
        blm6Text = (TextView)findViewById(R.id.blm6Text);
        blm6Tprk = (TextView)findViewById(R.id.blm6Tprk);
        blm6Su = (TextView)findViewById(R.id.blm6Su);
        blm6Zmn = (TextView)findViewById(R.id.blm6Zmn);

        blm7Name = (TextView)findViewById(R.id.blm7Name);
        blm7Text = (TextView)findViewById(R.id.blm7Text);
        blm7Tprk = (TextView)findViewById(R.id.blm7Tprk);
        blm7Su = (TextView)findViewById(R.id.blm7Su);
        blm7Zmn = (TextView)findViewById(R.id.blm7Zmn);

        blm8Name = (TextView)findViewById(R.id.blm8Name);
        blm8Text = (TextView)findViewById(R.id.blm8Text);
        blm8Tprk = (TextView)findViewById(R.id.blm8Tprk);
        blm8Su = (TextView)findViewById(R.id.blm8Su);
        blm8Zmn = (TextView)findViewById(R.id.blm8Zmn);

        blm9Name = (TextView)findViewById(R.id.blm9Name);
        blm9Text = (TextView)findViewById(R.id.blm9Text);
        blm9Tprk = (TextView)findViewById(R.id.blm9Tprk);
        blm9Su = (TextView)findViewById(R.id.blm9Su);
        blm9Zmn = (TextView)findViewById(R.id.blm9Zmn);

        blm10Name = (TextView)findViewById(R.id.blm10Name);
        blm10Text = (TextView)findViewById(R.id.blm10Text);
        blm10Tprk = (TextView)findViewById(R.id.blm10Tprk);
        blm10Su = (TextView)findViewById(R.id.blm10Su);
        blm10Zmn = (TextView)findViewById(R.id.blm10Zmn);

        blm11Name = (TextView)findViewById(R.id.blm11Name);
        blm11Text = (TextView)findViewById(R.id.blm11Text);
        blm11Tprk = (TextView)findViewById(R.id.blm11Tprk);
        blm11Su = (TextView)findViewById(R.id.blm11Su);
        blm11Zmn = (TextView)findViewById(R.id.blm11Zmn);

        blm12Name = (TextView)findViewById(R.id.blm12Name);
        blm12Text = (TextView)findViewById(R.id.blm12Text);
        blm12Tprk = (TextView)findViewById(R.id.blm12Tprk);
        blm12Su = (TextView)findViewById(R.id.blm12Su);
        blm12Zmn = (TextView)findViewById(R.id.blm12Zmn);

        blm13Name = (TextView)findViewById(R.id.blm13Name);
        blm13Text = (TextView)findViewById(R.id.blm13Text);
        blm13Tprk = (TextView)findViewById(R.id.blm13Tprk);
        blm13Su = (TextView)findViewById(R.id.blm13Su);
        blm13Zmn = (TextView)findViewById(R.id.blm13Zmn);




        blm1 = (LinearLayout) findViewById(R.id.blm1);
        blm2 = (LinearLayout) findViewById(R.id.blm2);
        blm3 = (LinearLayout) findViewById(R.id.blm3);
        blm4 = (LinearLayout) findViewById(R.id.blm4);
        blm5 = (LinearLayout) findViewById(R.id.blm5);
        blm6 = (LinearLayout) findViewById(R.id.blm6);
        blm7 = (LinearLayout) findViewById(R.id.blm7);
        blm8 = (LinearLayout) findViewById(R.id.blm8);
        blm9 = (LinearLayout) findViewById(R.id.blm9);
        blm10 = (LinearLayout) findViewById(R.id.blm10);
        blm11 = (LinearLayout) findViewById(R.id.blm11);
        blm12 = (LinearLayout) findViewById(R.id.blm12);
        blm13 = (LinearLayout) findViewById(R.id.blm13);










        try {
            database = this.openOrCreateDatabase("Neekion",MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS Bitki (" +
                    "ID INTEGER," +
                    "save INT,"+
                    "htrltc INT,"+
                    "name VARCHAR,"+
                    "toprakturu VARCHAR,"+
                    "sumiktari VARCHAR, " +
                    "sulamasklg VARCHAR, " +
                    "info VARCHAR)");
            System.out.println("DataBase Online");
            getData();
            testKntrl();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            test = this.openOrCreateDatabase("test",MODE_PRIVATE,null);
            test.execSQL("CREATE TABLE IF NOT EXISTS veri (" + "ID INTEGER," +
                    "blm1 INTEGER,blm2 INTEGER,blm3 INTEGER,blm4 INTEGER,blm5 INTEGER," +
                    "blm6 INTEGER,blm7 INTEGER,blm8 INTEGER,blm9 INTEGER,blm10 INTEGER," +
                    "blm11 INTEGER,blm12 INTEGER,blm13 INTEGER)");
            System.out.println("test ONLİNE");
            testKntrl();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
    private void testAdd(){
        try {
            test.execSQL("INSERT INTO veri (ID,blm1,blm2,blm3,blm4,blm5,blm6,blm7,blm8,blm9,blm10,blm11,blm12,blm13) VALUES(1,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            testKntrl();
            System.out.println("testADD");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void testKntrl(){
        Cursor kntrl = test.rawQuery("SELECT * FROM veri WHERE ID=1 ",null);
        int IDIndex = kntrl.getColumnIndex("ID");
        int blm1Index = kntrl.getColumnIndex("blm1");
        int blm2Index = kntrl.getColumnIndex("blm2");
        int blm3Index = kntrl.getColumnIndex("blm3");
        int blm4Index = kntrl.getColumnIndex("blm4");
        int blm5Index = kntrl.getColumnIndex("blm5");
        int blm6Index = kntrl.getColumnIndex("blm6");
        int blm7Index = kntrl.getColumnIndex("blm7");
        int blm8Index = kntrl.getColumnIndex("blm8");
        int blm9Index = kntrl.getColumnIndex("blm9");
        int blm10Index = kntrl.getColumnIndex("blm10");
        int blm11Index = kntrl.getColumnIndex("blm11");
        int blm12Index = kntrl.getColumnIndex("blm12");
        int blm13Index = kntrl.getColumnIndex("blm13");

        while (kntrl.moveToNext()){
            System.out.println("ID:"+kntrl.getInt(IDIndex)+" blm1: "+kntrl.getInt(blm1Index)+
                    " blm2: "+kntrl.getInt(blm2Index)+ " blm3: "+kntrl.getInt(blm3Index)+ " blm4: "+kntrl.getInt(blm2Index)+
                    " blm5: "+kntrl.getInt(blm2Index)+" blm6: "+kntrl.getInt(blm2Index)+" blm7: "+kntrl.getInt(blm2Index)+
                    " blm8: "+kntrl.getInt(blm2Index)+" blm9: "+kntrl.getInt(blm2Index)+" blm10: "+kntrl.getInt(blm2Index)+
                    " blm11: "+kntrl.getInt(blm2Index)+" blm12: "+kntrl.getInt(blm2Index)+" blm13: "+kntrl.getInt(blm3Index));
            var =kntrl.getInt(IDIndex);
            if(kntrl.getInt(blm1Index)!=0){
                blm1.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm1Index));
                blm1Name.setText(btkname);
                blm1Tprk.setText(tprk);
                blm1Su.setText(su);
                blm1Zmn.setText(zmn);
                blm1Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm1ID = kntrl.getInt(blm1Index);
                switch (kntrl.getInt(blm1Index)){
                    case 1:
                        blm1Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm1Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm1Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm1Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm1Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm1Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm1Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm1Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm1Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm1Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm1Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm1Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm1Img.setImageResource(R.drawable.akcagac);
                        break;
                }
            }
            if(kntrl.getInt(blm2Index)!=0){
                blm2.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm2Index));
                blm2Name.setText(btkname);
                blm2Tprk.setText(tprk);
                blm2Su.setText(su);
                blm2Zmn.setText(zmn);
                blm2Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm2ID = kntrl.getInt(blm2Index);
                switch (kntrl.getInt(blm2Index)){
                    case 1:
                        blm2Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm2Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm2Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm2Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm2Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm2Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm2Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm2Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm2Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm2Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm2Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm2Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm2Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm3Index)!=0){
                blm3.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm3Index));
                blm3Name.setText(btkname);
                blm3Tprk.setText(tprk);
                blm3Su.setText(su);
                blm3Zmn.setText(zmn);
                blm3Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm3ID = kntrl.getInt(blm3Index);
                switch (kntrl.getInt(blm3Index)){
                    case 1:
                        blm3Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm3Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm3Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm3Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm3Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm3Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm3Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm3Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm3Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm3Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm3Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm3Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm3Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm4Index)!=0){
                blm4.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm4Index));
                blm4Name.setText(btkname);
                blm4Tprk.setText(tprk);
                blm4Su.setText(su);
                blm4Zmn.setText(zmn);
                blm4Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm4ID = kntrl.getInt(blm4Index);
                switch (kntrl.getInt(blm4Index)){
                    case 1:
                        blm4Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm4Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm4Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm4Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm4Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm4Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm4Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm4Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm4Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm4Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm4Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm4Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm4Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm5Index)!=0){
                blm5.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm5Index));
                blm5Name.setText(btkname);
                blm5Tprk.setText(tprk);
                blm5Su.setText(su);
                blm5Zmn.setText(zmn);
                blm5Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm5ID = kntrl.getInt(blm5Index);
                switch (kntrl.getInt(blm5Index)){
                    case 1:
                        blm5Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm5Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm5Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm5Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm5Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm5Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm5Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm5Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm5Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm5Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm5Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm5Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm5Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm6Index)!=0){
                blm6.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm6Index));
                blm6Name.setText(btkname);
                blm6Tprk.setText(tprk);
                blm6Su.setText(su);
                blm6Zmn.setText(zmn);
                blm6Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm6ID = kntrl.getInt(blm6Index);
                switch (kntrl.getInt(blm6Index)){
                    case 1:
                        blm6Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm6Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm6Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm6Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm6Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm6Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm6Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm6Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm6Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm6Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm6Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm6Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm6Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm7Index)!=0){
                blm7.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm7Index));
                blm7Name.setText(btkname);
                blm7Tprk.setText(tprk);
                blm7Su.setText(su);
                blm7Zmn.setText(zmn);
                blm7Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm7ID = kntrl.getInt(blm7Index);
                switch (kntrl.getInt(blm7Index)){
                    case 1:
                        blm7Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm7Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm7Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm7Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm7Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm7Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm7Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm7Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm7Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm7Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm7Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm7Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm7Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm8Index)!=0){
                blm8.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm8Index));
                blm8Name.setText(btkname);
                blm8Tprk.setText(tprk);
                blm8Su.setText(su);
                blm8Zmn.setText(zmn);
                blm8Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm8ID = kntrl.getInt(blm8Index);
                switch (kntrl.getInt(blm8Index)){
                    case 1:
                        blm8Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm8Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm8Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm8Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm8Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm8Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm8Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm8Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm8Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm8Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm8Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm8Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm8Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm9Index)!=0){
                blm9.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm9Index));
                blm9Name.setText(btkname);
                blm9Tprk.setText(tprk);
                blm9Su.setText(su);
                blm9Zmn.setText(zmn);
                blm9Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm9ID = kntrl.getInt(blm9Index);
                switch (kntrl.getInt(blm9Index)){
                    case 1:
                        blm9Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm9Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm9Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm9Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm9Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm9Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm9Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm9Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm9Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm9Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm9Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm9Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm9Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm10Index)!=0){
                blm10.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm10Index));
                blm10Name.setText(btkname);
                blm10Tprk.setText(tprk);
                blm10Su.setText(su);
                blm10Zmn.setText(zmn);
                blm10Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm10ID = kntrl.getInt(blm10Index);
                switch (kntrl.getInt(blm10Index)){
                    case 1:
                        blm10Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm10Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm10Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm10Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm10Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm10Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm10Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm10Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm10Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm10Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm10Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm10Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm10Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm11Index)!=0){
                blm11.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm11Index));
                blm11Name.setText(btkname);
                blm11Tprk.setText(tprk);
                blm11Su.setText(su);
                blm11Zmn.setText(zmn);
                blm11Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm11ID = kntrl.getInt(blm11Index);
                switch (kntrl.getInt(blm11Index)){
                    case 1:
                        blm11Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm11Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm11Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm11Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm11Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm11Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm11Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm11Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm11Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm11Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm11Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm11Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm11Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm12Index)!=0){
                blm12.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm12Index));
                blm12Name.setText(btkname);
                blm12Tprk.setText(tprk);
                blm12Su.setText(su);
                blm12Zmn.setText(zmn);
                blm12Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm12ID = kntrl.getInt(blm12Index);
                switch (kntrl.getInt(blm12Index)){
                    case 1:
                        blm12Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm12Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm12Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm12Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm12Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm12Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm12Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm12Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm12Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm12Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm12Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm12Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm12Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }
            if(kntrl.getInt(blm13Index)!=0){
                blm13.setVisibility(View.VISIBLE);
                veriKntrl(kntrl.getInt(blm13Index));
                blm13Name.setText(btkname);
                blm13Tprk.setText(tprk);
                blm13Su.setText(su);
                blm13Zmn.setText(zmn);
                blm13Text.setText(btkname+" hakkında detaylı bilgi için tıkla.");
                blm13ID = kntrl.getInt(blm13Index);
                switch (kntrl.getInt(blm13Index)){
                    case 1:
                        blm13Img.setImageResource(R.drawable.pptya);
                        break;
                    case 2:
                        blm13Img.setImageResource(R.drawable.zambak);
                        break;
                    case 3:
                        blm13Img.setImageResource(R.drawable.gelincik);
                        break;
                    case 4:
                        blm13Img.setImageResource(R.drawable.siklamen);
                        break;
                    case 5:
                        blm13Img.setImageResource(R.drawable.begonya);
                        break;
                    case 6:
                        blm13Img.setImageResource(R.drawable.kasmpat);
                        break;
                    case 7:
                        blm13Img.setImageResource(R.drawable.feslegen);
                        break;
                    case 8:
                        blm13Img.setImageResource(R.drawable.adacayi);
                        break;
                    case 9:
                        blm13Img.setImageResource(R.drawable.aloevera);
                        break;
                    case 10:
                        blm13Img.setImageResource(R.drawable.zerdacalpng);
                        break;
                    case 11:
                        blm13Img.setImageResource(R.drawable.bergamot);
                        break;
                    case 12:
                        blm13Img.setImageResource(R.drawable.goknar);
                        break;
                    case 13:
                        blm13Img.setImageResource(R.drawable.akcagac);
                        break;
                }

            }



        }

    }



    public void DBadd(){
        try {
            database.execSQL("INSERT INTO Bitki (ID,save,htrltc,name,toprakturu,sumiktari,sulamasklg,info) VALUES(1,0,0,'Papatya','Killi Toprak','0.75Lt','Günde 1 defa','Papatya, papatyagiller familyasında sınıflandırılan Anthemis, Matricaria, Bellis,Leucanthemum ve Tripleurospermum gibi farklı cinslerden bitki türlerine verilen ortak ad.')");
            getData();
            Toast.makeText(getApplicationContext(), "VERİ EKLENDİ",Toast.LENGTH_SHORT).show();
            System.out.println("DBADD");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void veriKntrl(int id){
        Cursor vr = database.rawQuery("SELECT * FROM Bitki WHERE ID='"+id+"' ",null);

        int ıdIndex = vr.getColumnIndex("ID");
        int nameIndex = vr.getColumnIndex("name");
        int toprakturuIndex = vr.getColumnIndex("toprakturu");
        int sumiktariIndex = vr.getColumnIndex("sumiktari");
        int sulamasklgIndex = vr.getColumnIndex("sulamasklg");


        while (vr.moveToNext()){
            System.out.println(
                    "ID: "+vr.getInt(ıdIndex)+
                            " Adı: "+vr.getString(nameIndex)+
                            " ToprakTürü: "+vr.getString(toprakturuIndex)+
                            " SuMiktarı: "+vr.getString(sumiktariIndex)+
                            " SulamaSıklığı: "+vr.getString(sulamasklgIndex));
            btkname = vr.getString(nameIndex);
            tprk= vr.getString(toprakturuIndex);
            su = vr.getString(sumiktariIndex);
            zmn =vr.getString(sulamasklgIndex);
        }

        vr.close();
    }


    private void getData(){
        Cursor cursor = database.rawQuery("SELECT * FROM Bitki WHERE save=1 ",null);

        int ıdIndex = cursor.getColumnIndex("ID");
        int saveIndex =cursor.getColumnIndex("save");
        int htrltcIndex = cursor.getColumnIndex("htrltc");
        int nameIndex = cursor.getColumnIndex("name");
        int toprakturuIndex = cursor.getColumnIndex("toprakturu");
        int sumiktariIndex = cursor.getColumnIndex("sumiktari");
        int sulamasklgIndex = cursor.getColumnIndex("sulamasklg");
        int infoIndex = cursor.getColumnIndex("info");


        while (cursor.moveToNext()){
            System.out.println(
                    "ID: "+cursor.getInt(ıdIndex)+
                            "Save: "+cursor.getInt(saveIndex)+
                            "Hatırlatıcı: "+cursor.getInt(htrltcIndex)+
                            " Adı: "+cursor.getString(nameIndex)+
                            " ToprakTürü: "+cursor.getString(toprakturuIndex)+
                            " SuMiktarı: "+cursor.getString(sumiktariIndex)+
                            " SulamaSıklığı: "+cursor.getString(sulamasklgIndex)+
                            " İnfo: "+cursor.getString(infoIndex));



        }


        cursor.close();
    }


    public void productADD(View view) {
        if(var !=1){
            testAdd();
        }
        Intent main = new Intent(home.this,MainActivity.class);
        main.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(main);


    }


    public void nested(View view) {

    }


    public void blm1(View view) {

        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm1ID);
        startActivity(bitki);
        System.out.println("BLM1 ON");
    }
    public void blm2(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm2ID);
        startActivity(bitki);
        System.out.println("BLM2 ON");
    }
    public void blm3(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm3ID);
        startActivity(bitki);
        System.out.println("BLM3 ON");
    }
    public void blm4(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm4ID);
        startActivity(bitki);
        System.out.println("BLM4 ON");
    }
    public void blm5(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm5ID);
        startActivity(bitki);
        System.out.println("BLM5 ON");
    }
    public void blm6(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm6ID);
        startActivity(bitki);
        System.out.println("BLM6 ON");
    }
    public void blm7(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm7ID);
        startActivity(bitki);
        System.out.println("BLM7 ON");
    }
    public void blm8(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm8ID);
        startActivity(bitki);
        System.out.println("BLM8 ON");
    }
    public void blm9(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm9ID);
        startActivity(bitki);
        System.out.println("BLM9 ON");
    }
    public void blm10(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm10ID);
        startActivity(bitki);
        System.out.println("BLM10 ON");
    }
    public void blm11(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm11ID);
        startActivity(bitki);
        System.out.println("BLM11 ON");
    }
    public void blm12(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm12ID);
        startActivity(bitki);
        System.out.println("BLM12 ON");
    }
    public void blm13(View view) {
        bitki = new Intent(home.this,bitki.class);
        bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        bitki.putExtra("btk",blm13ID);
        startActivity(bitki);
        System.out.println("BLM13 ON");
    }
}