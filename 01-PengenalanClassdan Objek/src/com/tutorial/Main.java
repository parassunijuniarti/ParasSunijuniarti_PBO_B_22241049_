package com.tutorial;

class Mahasiswa {
   String nama;
   String nim;
   String prodi;
}


public class Main {
   public static void main(String[] args) {
      // instasiasi objek dari class Mahasiswa
      Mahasiswa msh1 = new Mahasiswa();// proses intansiasi

      // memberi atribut pada objek msh1
      msh1.nama = "Paras Suni Juniarti";
      msh1.nim = "22241049";
      msh1.prodi = "PTI";

      System.out.println("Nama : " + msh1.nama);
      System.out.println("NIM : " + msh1.nim);
      System.out.println("Prodi : " + msh1.prodi);

      }

}
