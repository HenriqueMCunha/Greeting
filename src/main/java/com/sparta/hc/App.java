package com.sparta.hc;

import static com.sparta.hc.FilmClassifications.availableClassifications;

//public
//private
//protected
//package private (default) - everybody in the folder can see what I'm doing; everyone within this file can see it too.
public class App {
    public static void main( String[] args ) { // Methods should do one thing one
        
            /**Strongly typed language - if I wnt to declare a variable, I must declare a type;
             * Statically typed language - when our program is going to run, our program will check if our code is correct;
             * If the virtual machine thinks the code is unsafe to run, it will not run it
             * Refactoring code is changing the code without changing what it does
             * */
        int timeOfDay = 21;
        System.out.println(getGreeting(21));
        System.out.println(availableClassifications(-1));
    }
    //code should be easy to read
    //code should be easy to maintain
    //code should be easy to test

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12)
        {
            greeting = "Good Morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good Afternoon!";
        } else {
            greeting = "Good Evening!";
        }
        return greeting;
    }
}

