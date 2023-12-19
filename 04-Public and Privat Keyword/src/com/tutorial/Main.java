package com.tutorial;

class Player {
    // Data Member
    String name; // default, bisa di akses oleh class lain
    public int exp; // public, bisa di akses oleh class lain
    private int health; //private, tidak bisa di akses oleh class lain

    Player( String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }


 void Display () {
     System.out.println("Nama player : " + this.name);

     System.out.println("Player EXP : " + this.exp);

     System.out.println("Player Health : " + this.health);
    
}

 }
public class Main {

    public static void main(String[] args) {
        // instansiasi atau membuat objek baru
        Player hero_1 = new Player( "Canva", 20, 100);
        hero_1.Display();
    }      
}