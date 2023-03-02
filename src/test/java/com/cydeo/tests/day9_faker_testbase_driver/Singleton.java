package com.cydeo.tests.day9_faker_testbase_driver;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if(word==null){
            System.out.println("First time call. Word object is null. " +
                    "Assigning value to it now!");
            word="something";
        }else{
            System.out.println("Word has already has value");
        }
        return word;
    }
}
