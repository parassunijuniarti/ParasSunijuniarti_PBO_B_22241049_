package com.tutorial;

class Hero{
   String nama;

   void display(){
      System.out.println("Nama Hero_1 : " + nama);
      System.out.println("Health : " + 40 ) ;
   }
}

class HeroTank extends Hero{
   float health;

   void display(){
      System.out.println("Nama Hero_1 : " + nama);
      System.out.println("Health : " + 40 ) ;
   }

}

public class Main {
   public static void main(String[] args) {
      Hero hero_1 = new Hero();
      hero_1.nama = "Nana";
      hero_1.display();

      HeroTank hero_2 = new HeroTank();
      hero_2.nama = "Esmeralda";
      hero_2.display();
   }
}