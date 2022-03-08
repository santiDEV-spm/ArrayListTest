package com.santidev.arraylisttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaracion
        ArrayList<Integer> myList;
        //inicializacion
        myList = new ArrayList<>();

        myList.add(Integer.parseInt("5"));
        myList.add(-8);
        myList.add(Integer.parseInt("23"));
        myList.add(1,10);

        ArrayList<String> names = new ArrayList<>();
        names.add("Donald Trump");
        names.add("Ryan Gosling");
        names.add("Sansa Stark");
        names.add(2, "Tiron Lanister");

        //array esta vacio
        if (names.isEmpty()){

        }else{

        }
        //elementos del array
        int numItems = names.size();
        int position = names.indexOf("Ryan Gosling"); //posicion donde insertamos a Ryan Gosling

        for (String name: names) {
            Log.i("Personaje", name);
        }

        int [] anArray = {1,2,3,4,5};
        for (int element: anArray) {
            Log.i("Enteros", ""+element);
        }

        //polimorfismo
        Dog dog = new Dog();
        Lion lion = new Lion();
        Cat cat = new Cat();

        Animal [] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = lion;
        animals[2] = cat;

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(dog);
        animalsList.add(lion);
        animalsList.add(cat);

    }
}