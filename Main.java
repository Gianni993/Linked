//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add( new Fruit("banana"));
        fruits.add( new Fruit("pera"));
        fruits.add( new Fruit("mango"));
        fruits.add( new Fruit("mandarino"));

        System.out.println(fruits);

        fruits.addFirst(new Fruit("licis"));
        fruits.addLast(new Fruit("dragonfruit"));

        System.out.println(fruits);
    }
}