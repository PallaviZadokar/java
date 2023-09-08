package com.java.lab2Java1;


class Animal {
 
 public void makeSound() {
     System.out.println("The animal makes a generic sound.");
 }
}


class Cat extends Animal {
 
 
 public void makeSound() {
     System.out.println("The cat barks.");
 }
}

public class Main {
 public static void main(String[] args) {
     Animal genericAnimal = new Animal();
     Cat myCat = new Cat();
     
     System.out.print("Generic Animal: ");
     genericAnimal.makeSound();
     
     System.out.print("My Cat: ");
     myCat.makeSound();
 }
}

