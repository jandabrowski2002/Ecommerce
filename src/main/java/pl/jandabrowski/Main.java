package pl.jandabrowski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jakub", "Michal", "Agnieszka", "Ola", "Kasia");
        names.add("Jasiek");

        Greeter greeter = new Greeter();
        greeter.greet("Jakub"); // -> Hello Jakub

        // Greet only females
        List<String> females = new ArrayList<String>();
        for (String name : names){
            if (name.endsWith("a")){
                females.add(name);

            }
        }
        for (String ladyName : females){
            greeter.greet(ladyName);
        }

        //names.stream()
                //.filter(name -> name.endsWith("a"))
                //.forEach(ladyName -> greeter::greet);





    }
}
