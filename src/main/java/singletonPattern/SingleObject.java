package singletonPattern;

public class SingleObject {
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        if(instance == null) {
             instance = new SingleObject();
        }
        //rteutn the same object from memory -> create object only ONE
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
