package com.example.neekion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;
    public Intent bitki;
    public int ıdIndex,ppty,glnck,akzmbk,sklmn,bgny,ksmpt,fslgn,adcy,alvr,zrdcl,brgmt,gknr,akcagc;
    public Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            database = this.openOrCreateDatabase("Neekion",MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS Bitki (" +
                    "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "save INT,"+
                    "htrltc INT,"+
                    "name VARCHAR,"+
                    "toprakturu VARCHAR,"+
                    "sumiktari VARCHAR, " +
                    "sulamasklg VARCHAR, " +
                    "info VARCHAR)");
            System.out.println("DataBase Online");



        }catch (Exception e){
            e.printStackTrace();
        }



    }

    private void getData(){
        Cursor cursor = database.rawQuery("SELECT * FROM Bitki  WHERE save = 1",null);

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




    public void DBupdate(int hs){
        try {
            database.execSQL("UPDATE Player SET hs ='"+hs+"'WHERE ID=1 ");
            getData();
            //Toast.makeText(getApplicationContext(), "VERİ GÜNCELLENDİ",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void DBadd(int ID,String name,String tprk, String su,String zmn,String bilgi){
        try {
            database.execSQL("INSERT INTO Bitki (ID,save,htrltc,name,toprakturu,sumiktari,sulamasklg,info) VALUES('"+ID+"',0,0,'"+name+"','"+tprk+"','"+su+"','"+zmn+"','"+bilgi+"')");
            getData();
            Toast.makeText(getApplicationContext(), "VERİ EKLENDİ",Toast.LENGTH_SHORT).show();
            System.out.println("DBADD");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void KSB(View view) {
        switch (view.getId()){
            case R.id.papatya:
                ppty();
                System.out.println("PPTY----------"+ppty);
                if (ppty !=1) {
                    DBadd(1, "Papatya", "Killi", "0.75Lt", "Günde 1 defa", "Papatya, papatyagiller familyasında sınıflandırılan Anthemis, Matricaria, Bellis, \n" +
                            "Leucanthemum ve Tripleurospermum gibi farklı cinslerden bitki türlerine verilen ortak ad.\n");
                    Toast.makeText(getApplicationContext(), "1ADD", Toast.LENGTH_SHORT).show();
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",1);
                startActivity(bitki);
                break;

            case R.id.akzambak:
                akzmbk();
                System.out.println("AKZMBK----------"+akzmbk);
                if (akzmbk !=2) {
                    DBadd(2, "Akzambak", "Kumlu Balçık", "0.75Lt", "2 haftada 3 kez", "Ekim-temmuz aylarında yapraklı,60-150 (180)cm’ye kadar boylanan, kar beyazı çiçekleri temmuz-ağustos aylarında 2-3 hafta süreyle görülen soğanlı bir bitkidir.Çok güçlü hoş kokusu mayıstan itibaren çiçeklenmeye para");

                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",2);
                startActivity(bitki);
                break;

            case R.id.gelincik:
                glnck();
                System.out.println("GLNCK----------"+glnck);
                if (glnck !=3) {
                    DBadd(3, "Gelincik", "Hepsi", "0.25Lt", "Haftada 2 kez", "Bir yıllık,15-100cm’ye kadar boylanan,kırmızı çiçekli otsu bir bitkidir.Dikine büyüyen ve\n" +
                            "yukarıya doğru çatallaşan gövdetüylüdür.Parlak yeşilalt yapraklar kısa saplı, üst yapraklar gövdeye oturmuş halde olup parçalı ve kenarları dişlidir.\n");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",3);
                startActivity(bitki);
                break;
            case R.id.siklamen:
                sklmn();
                System.out.println("SKLMN----------"+sklmn);
                if (sklmn !=4) {
                    DBadd(4, "Siklamen", "Killi", "0.25Lt", "Haftada 1 kez", "Halk arasında tavşan kulağı olarak da bilinen siklamen (Cyclamen), Primulaceae familyasından gelen çok yıllık bir bitkidir. Siklamen çiçeği anlamı ise aşktır. Aşkın haber verilmesidir. Bu nedenle birçok kültürde sevginin en doğal haliyle gösterilmesi için hediye edilmektedir.");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",4);
                startActivity(bitki);
                break;
            case R.id.begonya:
                bgny();
                System.out.println("BGNY----------"+bgny);
                if (bgny !=5) {
                    DBadd(5, "Begonya", "Lifli", "1.15Lt", "2 günde 1 kez", "Cinsin adı, Fransız botanikçi Charles Plumier tarafından eski Fransız kolonisi Haiti nin valisi Michel Begon a yapılan atıf dolayısıyladır. Bu isimlendirme Linnaeus tarafından kabul \n" +
                            "\n" +
                            "edilmiştir. Begonya çiçeği ilk kez İngiltere de keşfedilmiştir. Anavatanı Güney Amerika, Güney Afrika ve Asya dır.\n");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",5);
                startActivity(bitki);
                break;
            case R.id.kasimpati:
                ksmnpt();
                System.out.println("KSMPT----------"+ksmpt);
                if (ksmpt !=6) {
                    DBadd(6, "Kasımpatı", "Lifli", "2.5Lt", "Günde 2 kez", "Sonbahar aylarını renklendiren kasımpatı, bazı kültürlerde cenaze çiçeği olarak görülse de ölümsüz aşk ya da platonik sevdayla özdeşleştirilir. Kat kat kadife görünümlü taç yapraklara sahip olan çiçek, papatyagiller familyasının sevilen türleri arasında yer alır.");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",6);
                startActivity(bitki);
                break;
        }
    }

    public void OSB(View view) {
        switch (view.getId()){
            case R.id.feslegen:
                fslgn();
                System.out.println("FSLGN----------"+fslgn);
                if (fslgn !=7) {
                    DBadd(7, "Fesleğen", "Killi", "1Lt", "Haftada 1 kere ", "Fesleğeni evinizin mutfağında konumlandırabilirsiniz. Böylece mutfağınız hep ferah ve iyi kokar. Ancak burada dikkat etmeniz gereken şey fesleğenin bulunduğu ortamın güneş almasıdır. Fesleğen güneşe \n" +
                            "\n" +
                            "ve sıcak havaya oldukça fazla ihtiyaç duyar. Yeterli güneş almadığında gelişemeyebilir.\n" +
                            "\n");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",7);
                startActivity(bitki);
                break;
            case R.id.adacayi:
                adacayi();
                System.out.println("ADCY----------"+adcy);
                if (adcy !=8) {
                    DBadd(8, "Adaçayı", "Bahçe Toprağı", "0,50Lt", "2 haftada 1 kez ", "Zararlı toksinlerin vücuttan atılmasını sağlayan ve idrar yolu enfeksiyonu, bronşit, depresyon gibi birçok rahatsızlığın tedavisinde kullanılan adaçayı da evde yetiştirilmesi kolay olan bitkilerdendir ");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",8);
                startActivity(bitki);
                break;
            case R.id.aloevera:
                alvr();
                System.out.println("ALVR----------"+alvr);
                if (alvr !=9) {
                    DBadd(9, "Aloe vera", "Killi ", "2Lt", "Günde 3 kez", "Eski çağlardan beri yetiştirilen ve birçok medeniyette hem tıp hem de güzellik alanında kullanılan aleo vera günümüzde de popülerliğini koruyor. ");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",9);
                startActivity(bitki);
                break;
            case R.id.zerdacal:
                zrdcl();
                System.out.println("ZRDCL----------"+zrdcl);
                if (zrdcl !=10) {
                    DBadd(10, "Zerdeçal", "Bahçe toprağı", "0,50Lt", "Ayda 4 kez", "Diğer isimleri zerdeçöp, safran kökü, sarıboya, zerdeçav, hint safranıdır. Başta Pakistan, Hindistan, Çin ve Bangladeş olmak üzere Asya’nın tropik bölgelerinde yetişir. Bitkinin toprak altındaki ana kökleri yumurta veya armut seklindedir. Yan kökleri ise parmak şeklindedir. Rizomların üst yüzü sarımsı, iç yüzü ise sarı renklidir. Acımsı bir tadı vardır.");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",10);
                startActivity(bitki);
                break;

        }
    }

    public void agc(View view) {
        switch (view.getId()){
            case R.id.bergamot:
                brgmt();
                System.out.println("BRGMT----------"+brgmt);
                if (brgmt !=11) {
                    DBadd(11, "Bergamot", "Bahçe toprağı", "3Lt", "3 günde 1 kez", "Bergamot, genellikle aroma olarak bilinse de tek başına bir besindir. Ekşi bir tada sahip olan bergamot eski çağlardan beri alternatif tıpta kullanılmaktadır.");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",11);
                startActivity(bitki);
                break;
            case R.id.goknar:
                gknr();
                System.out.println("BRGMT----------"+gknr);
                if (gknr !=12) {
                    DBadd(12, "Göknar", "Kumlu", "1.82Lt", "3 günde 1 kez", "Yaz-kış yeşil, boylu orman ağaçlarıdır. \n" +
                            "\n" +
                            "Piramidal veya dar konik bir şekilde gelişme gösterir. Gövde genel olarak çatallanma göstermez, dallar gövdeye çevrel olarak dizilmiştir. Kozalakları yukarıya doğru dik olarak durur. Bu özelliği ile kozalakları aşağıya bakan ladinlerde ayrılır. Kökleri kuvvetli ve kazık köktür.\n");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",12);
                startActivity(bitki);
                break;
            case R.id.akcagac:
                akcagc();
                System.out.println("AKCAGC----------"+akcagc);
                if (akcagc !=13) {
                    DBadd(13, "Akça Ağaç", "Killi", "1.25Lt", "Günde 2 defa", "Cinsin tip türü, Avrupa daki en yaygın akçaağaç türü olan Acer pseudoplatanus, çınar yapraklı akçaağacıdır. Akçaağaçların genellikle kolayca tanınabilir avuç içi yaprakları ve ayırt edici kanatlı meyve leri vardır. Akçaağaçların en yakın akrabaları at kestanesi dir. Akçaağaç şurubu bazı akçaağaç türlerinin özsuyundan yapılır.");
                }
                bitki = new Intent(MainActivity.this,bitki.class);
                bitki.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                bitki.putExtra("btk",13);
                startActivity(bitki);
                break;
        }
    }


    private void ppty(){
        Cursor pp = database.rawQuery("SELECT * FROM Bitki  WHERE ID =1 ",null);
        int ıdIndex = pp.getColumnIndex("ID");
        while (pp.moveToNext()) {
            ppty =pp.getInt(ıdIndex);
            System.out.println("PPTY----------"+ppty);

        }
        pp.close();


    }
    private void akzmbk(){
        Cursor akzmbkk = database.rawQuery("SELECT * FROM Bitki  WHERE ID =2  ",null);
        int ıdIndex = akzmbkk.getColumnIndex("ID");
        while (akzmbkk.moveToNext()) {
            akzmbk = akzmbkk.getInt(ıdIndex);
            System.out.println("AKZMBK----------"+akzmbk);
        }
        akzmbkk.close();


    }
    private void glnck(){
        Cursor glnckk = database.rawQuery("SELECT * FROM Bitki  WHERE ID =3 ",null);
        int ıdIndex = glnckk.getColumnIndex("ID");
        while (glnckk.moveToNext()) {
            glnck = glnckk.getInt(ıdIndex);
            System.out.println("GLNCK----------"+glnck);
        }
        glnckk.close();

    }
    private void sklmn(){
        Cursor sklmnn = database.rawQuery("SELECT * FROM Bitki  WHERE ID =4 ",null);
        int ıdIndex = sklmnn.getColumnIndex("ID");
        while (sklmnn.moveToNext()) {
            sklmn = sklmnn.getInt(ıdIndex);
            System.out.println("SKLMN----------"+sklmn);
        }
        sklmnn.close();

    }
    private void bgny(){
        Cursor bgnyy = database.rawQuery("SELECT * FROM Bitki  WHERE ID =5 ",null);
        int ıdIndex = bgnyy.getColumnIndex("ID");
        while (bgnyy.moveToNext()) {
            bgny = bgnyy.getInt(ıdIndex);
            System.out.println("SKLMN----------"+bgny);
        }
        bgnyy.close();

    }
    private void ksmnpt(){
        Cursor ksmnptt = database.rawQuery("SELECT * FROM Bitki  WHERE ID =6 ",null);
        int ıdIndex = ksmnptt.getColumnIndex("ID");
        while (ksmnptt.moveToNext()) {
            ksmpt = ksmnptt.getInt(ıdIndex);
            System.out.println("KSMPT----------"+ksmpt);
        }
        ksmnptt.close();

    }


    private void fslgn(){
        Cursor fslgnn = database.rawQuery("SELECT * FROM Bitki  WHERE ID =7 ",null);
        int ıdIndex = fslgnn.getColumnIndex("ID");
        while (fslgnn.moveToNext()) {
            fslgn = fslgnn.getInt(ıdIndex);
            System.out.println("FSLGN----------"+fslgn);
        }
        fslgnn.close();

    }
    private void adacayi(){
        Cursor adacayii = database.rawQuery("SELECT * FROM Bitki  WHERE ID =8 ",null);
        int ıdIndex = adacayii.getColumnIndex("ID");
        while (adacayii.moveToNext()) {
            adcy = adacayii.getInt(ıdIndex);
            System.out.println("ADCY----------"+adcy);
        }
        adacayii.close();

    }
    private void alvr(){
        Cursor alvrr = database.rawQuery("SELECT * FROM Bitki  WHERE ID =9 ",null);
        int ıdIndex = alvrr.getColumnIndex("ID");
        while (alvrr.moveToNext()) {
            alvr = alvrr.getInt(ıdIndex);
            System.out.println("ALVR----------"+alvr);
        }
        alvrr.close();

    }
    private void zrdcl(){
        Cursor zrdcll = database.rawQuery("SELECT * FROM Bitki  WHERE ID =10",null);
        int ıdIndex = zrdcll.getColumnIndex("ID");
        while (zrdcll.moveToNext()) {
            zrdcl = zrdcll.getInt(ıdIndex);
            System.out.println("ZRDCL----------"+zrdcl);
        }
        zrdcll.close();

    }

    private void brgmt(){
        Cursor brgmtt = database.rawQuery("SELECT * FROM Bitki  WHERE ID =11",null);
        int ıdIndex = brgmtt.getColumnIndex("ID");
        while (brgmtt.moveToNext()) {
            brgmt = brgmtt.getInt(ıdIndex);
            System.out.println("BRGMT----------"+brgmt);
        }
        brgmtt.close();

    }
    private void gknr(){
        Cursor gknrr = database.rawQuery("SELECT * FROM Bitki  WHERE ID =12",null);
        int ıdIndex = gknrr.getColumnIndex("ID");
        while (gknrr.moveToNext()) {
            gknr = gknrr.getInt(ıdIndex);
            System.out.println("GKNR----------"+gknr);
        }
        gknrr.close();

    }
    private void akcagc(){
        Cursor akcagcc = database.rawQuery("SELECT * FROM Bitki  WHERE ID =13",null);
        int ıdIndex = akcagcc.getColumnIndex("ID");
        while (akcagcc.moveToNext()) {
            akcagc = akcagcc.getInt(ıdIndex);
            System.out.println("AKCAGC----------"+akcagc);
        }
        akcagcc.close();

    }




}