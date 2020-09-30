import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;


public class MtdBufferedReader {
 
   public static void main(String[] args) throws IOException{
       int alas = 0;
       int tinggi = 0;
       double luas;
       boolean isTrue = false;
       
       BufferedReader data = new 
       BufferedReader(new InputStreamReader(System.in));
       System.out.println("Luas Segitiga");
       System.out.println("Masukkan Alas: ");
       alas = Integer.parseInt(data.readLine());
       System.out.println("Masukkan Tinggi: ");
       tinggi = Integer.parseInt(data.readLine());
       
       luas = 0.5*alas*tinggi;
       
       System.out.println("Luas segitiga adalah: "+luas);
       
             }
    
        }
