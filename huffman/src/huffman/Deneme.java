package huffman;

public class Deneme {

//bu bölüm kaç harf olduğunu bulan fonksiyonların olduğu kısım
    public int asayi(String metin) {
        
        char karakter = 'a';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
        return tane;
    }
    public int bsayi(String metin) {
        
        char karakter = 'b';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
       
        return tane;
    }
    
    
    public int csayi(String metin) {
        
        char karakter = 'c';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
        return tane;
    }
    public int dsayi(String metin) {
        
        char karakter = 'd';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
        return tane;
    }
}    




//Barış Çaylı 
//02210201038