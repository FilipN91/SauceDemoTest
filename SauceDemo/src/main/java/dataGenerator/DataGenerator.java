package dataGenerator;

import com.github.javafaker.Faker;

public class DataGenerator {

    public static String username(){
        return new Faker().name().username();
    }

    public static String password(){
        return new Faker().internet().password(4,16,true,false);
    }

    public static String firstName(){
        return new Faker().name().firstName();
    }

    public static String lastName(){
        return new Faker().name().lastName();
    }

    public static String zipcode(){
        return new Faker().number().digits(5);
    }
}
