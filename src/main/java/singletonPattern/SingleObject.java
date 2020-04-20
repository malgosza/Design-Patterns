package singletonPattern;

public class SingleObject {
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){
        // example -> connection with DB, only ONCE
    }

    //Get the only object available
    public static SingleObject getInstance(){
        if(instance == null) {
             instance = new SingleObject();
        }
        //returns the same object from memory -> create object only ONCE

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
