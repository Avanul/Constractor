/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author windows
 */
public class Main {
       
    public static void main (String[] args){
  Constructor data=new Constructor();
  //CONSTRACTOR
  System.out.println("===== CONTRUKTOR=====");
  System.out.print("NIM : "+data.nim+
                  "\nNAMA : "+data.nama+
                  "\nALAMAT : "+data.alamat+
                  "\nJURUSAN : "+data.jurusan+
                  "\nANGKATAN : "+data.angkatan+"\n");
  
  //CONSTRACTOR PARAMETER
  Constructor_Parameter dataParameter=new Constructor_Parameter(208169040017L,"AVANUL ABDUL FATAH","GONDANG WETAN","TEKNIK INFORMATIKA",2018);
  System.out.println("===============================");
  System.out.println("===== CONTRUKTOR PARAMETER=====");
  System.out.print(
          "NIM : "+dataParameter.nim+
          "\nNAMA : "+dataParameter.nama+
          "\nALAMAT : "+dataParameter.alamat+
          "\nJURUSAN : "+dataParameter.jurusan+
          "\nANGKATAN : "+dataParameter.angkatan+"\n");
    }
}
