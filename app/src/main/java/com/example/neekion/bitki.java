package com.example.neekion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class bitki extends AppCompatActivity {

    private SQLiteDatabase database,test;
    public ImageView htrltcON,htrltcOFF,bitki;
    public TextView toprakTuru,suMiktari,sulamaSklg,info,name;
    public Bundle bundle;
    public int btk,ID,blm1,blm2,blm3,blm4,blm5,blm6,blm7,blm8,blm9,blm10,blm11,blm12,blm13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitki);

        htrltcOFF = (ImageView)findViewById(R.id.htrltcOFF);
        htrltcON = (ImageView)findViewById(R.id.htrltcON);
        bitki = (ImageView)findViewById(R.id.bitki);

        name = (TextView)findViewById(R.id.bitkibilgi);
        toprakTuru = (TextView) findViewById(R.id.toprak);
        suMiktari = (TextView) findViewById(R.id.su);
        sulamaSklg = (TextView) findViewById(R.id.zaman);
        info = (TextView) findViewById(R.id.blgi);

        bundle = getIntent().getExtras();

        btk = bundle.getInt("btk");

        switch (btk){
            case 1:
                bitki.setImageResource(R.drawable.pptya);
                break;
            case 2:
                bitki.setImageResource(R.drawable.zambak);
                break;
            case 3:
                bitki.setImageResource(R.drawable.gelincik);
                break;
            case 4:
                bitki.setImageResource(R.drawable.siklamen);
                break;
            case 5:
                bitki.setImageResource(R.drawable.begonya);
                break;
            case 6:
                bitki.setImageResource(R.drawable.kasmpat);
                break;
            case 7:
                bitki.setImageResource(R.drawable.feslegen);
                break;
            case 8:
                bitki.setImageResource(R.drawable.adacayi);
                break;
            case 9:
                bitki.setImageResource(R.drawable.aloevera);
                break;
            case 10:
                bitki.setImageResource(R.drawable.zerdacalpng);
                break;
            case 11:
                bitki.setImageResource(R.drawable.bergamot);
                break;
            case 12:
                bitki.setImageResource(R.drawable.goknar);
                break;
            case 13:
                bitki.setImageResource(R.drawable.akcagac);
                break;

        }


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
                    " blm2: "+kntrl.getInt(blm2Index)+ " blm3: "+kntrl.getInt(blm3Index)+ " blm4: "+kntrl.getInt(blm4Index)+
                    " blm5: "+kntrl.getInt(blm5Index)+" blm6: "+kntrl.getInt(blm6Index)+" blm7: "+kntrl.getInt(blm7Index)+
                    " blm8: "+kntrl.getInt(blm8Index)+" blm9: "+kntrl.getInt(blm9Index)+" blm10: "+kntrl.getInt(blm10Index)+
                    " blm11: "+kntrl.getInt(blm11Index)+" blm12: "+kntrl.getInt(blm12Index)+" blm13: "+kntrl.getInt(blm13Index));
            blm1=kntrl.getInt(blm1Index);
            blm2=kntrl.getInt(blm2Index);
            blm3=kntrl.getInt(blm3Index);
            blm4=kntrl.getInt(blm4Index);
            blm5=kntrl.getInt(blm5Index);
            blm6=kntrl.getInt(blm6Index);
            blm7=kntrl.getInt(blm7Index);
            blm8=kntrl.getInt(blm8Index);
            blm9=kntrl.getInt(blm9Index);
            blm10=kntrl.getInt(blm10Index);
            blm11=kntrl.getInt(blm11Index);
            blm12=kntrl.getInt(blm12Index);
            blm13=kntrl.getInt(blm13Index);

        }

    }

    private void testUpdate(String blm,int ver){
        try {
            test.execSQL("UPDATE veri SET '"+blm+"' ='"+ver+"' WHERE ID=1");
            testKntrl();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    private void getData(){
        Cursor cursor = database.rawQuery("SELECT * FROM Bitki WHERE ID='"+btk+"' ",null);

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


            name.setText(cursor.getString(nameIndex));
            toprakTuru.setText(cursor.getString(toprakturuIndex));
            suMiktari.setText(cursor.getString(sumiktariIndex));
            sulamaSklg.setText(cursor.getString(sulamasklgIndex));
            info.setText(cursor.getString(infoIndex));
            ID=cursor.getInt(ıdIndex);
            System.out.println("ID------"+ID);
            switch (cursor.getInt(saveIndex)){
                case 1:
                    htrltcON.setVisibility(View.INVISIBLE);
                    htrltcOFF.setVisibility(View.VISIBLE);
                    System.out.println("KAPALI");

                    break;
                case 0:
                    htrltcON.setVisibility(View.VISIBLE);
                    htrltcOFF.setVisibility(View.INVISIBLE);
                    System.out.println("AÇIK");
                    break;
            }



        }


        cursor.close();
    }

    public void DBupdate(int hs){
        try {
            database.execSQL("UPDATE Bitki SET save ='"+hs+"'WHERE ID='"+btk+"'");
            getData();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void hatirlatici(View view) {
        switch (view.getId()){
            case R.id.htrltcON:
                htrltcON.setVisibility(View.INVISIBLE);
                htrltcOFF.setVisibility(View.VISIBLE);
                 DBupdate(1);
                if(blm1==0){
                    testUpdate("blm1",ID);
                }else if(blm2==0){
                    testUpdate("blm2",ID);
                }else if(blm3==0){
                    testUpdate("blm3",ID);
                }else if(blm4==0){
                    testUpdate("blm4",ID);
                }else if(blm5==0){
                    testUpdate("blm5",ID);
                }else if(blm6==0){
                    testUpdate("blm6",ID);
                }else if(blm7==0){
                    testUpdate("blm7",ID);
                }else if(blm8==0){
                    testUpdate("blm8",ID);
                }else if(blm9==0){
                    testUpdate("blm9",ID);
                }else if(blm10==0){
                    testUpdate("blm10",ID);
                }else if(blm11==0){
                    testUpdate("blm11",ID);
                }else if(blm12==0){
                    testUpdate("blm12",ID);
                }else if(blm13==0){
                    testUpdate("blm13",ID);
                }else {
                    System.out.println("YANDIK");
                }

                break;
            case R.id.htrltcOFF:
                htrltcON.setVisibility(View.VISIBLE);
                htrltcOFF.setVisibility(View.INVISIBLE);
                DBupdate(0);

                if(ID==blm1){
                    testUpdate("blm1",blm2);
                    testUpdate("blm2",blm3);
                    testUpdate("blm3",blm4);
                    testUpdate("blm4",blm5);
                    testUpdate("blm5",blm6);
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);

                }else if(ID==blm2){
                    testUpdate("blm2",blm3);
                    testUpdate("blm3",blm4);
                    testUpdate("blm4",blm5);
                    testUpdate("blm5",blm6);
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm3){
                    testUpdate("blm3",blm4);
                    testUpdate("blm4",blm5);
                    testUpdate("blm5",blm6);
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm4){
                    testUpdate("blm4",blm5);
                    testUpdate("blm5",blm6);
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm5){
                    testUpdate("blm5",blm6);
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm6){
                    testUpdate("blm6",blm7);
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm7){
                    testUpdate("blm7",blm8);
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm8){
                    testUpdate("blm8",blm9);
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm9){
                    testUpdate("blm9",blm10);
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm10){
                    testUpdate("blm10",blm11);
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm11){
                    testUpdate("blm11",blm12);
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm12){
                    testUpdate("blm12",blm13);
                    testUpdate("blm13",0);
                }else if(ID==blm13){
                    testUpdate("blm13",0);
                }else {
                    System.out.println("SIÇTIK");
                }

                break;
        }
    }

    public void home(View view) {
        Intent home = new Intent(bitki.this,home.class);
        home.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(home);
        this.finish();
    }
}