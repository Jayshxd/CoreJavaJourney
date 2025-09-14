package com.javajourney.Exceptions;

public class Main {
    public static void main(String[] args) throws MyCustom {
        try{
            System.out.println(3/0);
        }catch(RuntimeException e){
            /*Agar tu custom exception throw karna hi chahta hai, to usko catch bhi karna padega.”
            Matlab program ko kahin na kahin bataana hoga ki MyCustom aane par kya karna hai*/
            try {
                throw new MyCustom("Error Bhai 0 se Divide ????!!!!");
            }catch (MyCustom ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("hi from outside try catch");
    }
}
