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
public class Constructor_Parameter {
     long nim;
    String jurusan, nama, alamat;
    int angkatan;
    public  Constructor_Parameter(long NIM,String NAMA, String ALAMAT,String JUR,int ANGKATAN){
    nim=NIM;
    nama=NAMA;
    alamat=ALAMAT;
    jurusan=JUR;
    angkatan=ANGKATAN;
}
 /*   public static void main (String[] args){
  Constuctor data=new Constuctor();
   //CONSTRACTOR PARAMETER
  Constructor_Parameter dataParameter=new Constructor_Parameter(208169040017L,"AVANUL ABDUL FATAH","GONDANG WETAN","TEKNIK INFORMATIKA",2018);
  System.out.println("===============================");
  System.out.println("===== CONTRUKTOR PARAMETER=====");
  System.out.print(
          "NIM : "+dataParameter.nim+
          "\nNAMA : "+dataParameter.nama+
          "\nALAMAT : "+dataParameter.alamat+
          "\nJURUSAN : "+dataParameter.jurusan+
          "\nANGKATAN : "+dataParameter.angkatan+"\n");}
*/
}
