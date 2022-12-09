package huffman;

import java.util.HashMap;

public class Islemler {
    Deneme d= new Deneme();
    
    public void iste(String metin){
        HashMap<String, String> deger = new HashMap<String, String>();

        String[] harfler= new String[8];
        int[] sayilar= new int[8];
        
//4 harfimizden kaç tane olduğunu buluyoruz
        harfler[0]="a";
        sayilar[0]=d.asayi(metin);
        harfler[1]="b";
        sayilar[1]=d.bsayi(metin);
        harfler[2]="c";
        sayilar[2]=d.csayi(metin);
        harfler[3]="d";
        sayilar[3]=d.dsayi(metin);
        
        int uzunluk=sayilar.length;
        

//buble sort ile önce hangi harften kaç tane varsa onları sonra harfleri sıraladık
        for(int i=0;i<uzunluk;i++){
            for(int j=0;j<uzunluk-1;j++){
                if(sayilar[j]<sayilar[j+1]){
                    int degis=sayilar[j];
                    sayilar[j]=sayilar[j+1];
                    sayilar[j+1]=degis;
                    String degisken=harfler[j];
                    harfler[j]=harfler[j+1];
                    harfler[j+1]=degisken;
                }
                
            }
        }
//sıraladığımız harflerimize baştan başlayarak değer veriyoruz
        deger.put(harfler[0], "00");
        deger.put(harfler[1], "01");
        deger.put(harfler[2], "10");
        deger.put(harfler[3], "11");
      
        
//yazdırma kısmımız :)
      for(int i=0;i<metin.length();i++){
          System.out.print(metin.subSequence(i, i+1)+"  ");
          
      }
        System.out.println("" );
      for(int i=0;i<metin.length();i++){
          System.out.print(deger.get(metin.subSequence(i,i+1))+" ");
          
      }  
        
        
        
        
    
    }
}

//Barış Çaylı 
//02210201038