package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person Person1 = new Person("Tommy", 25, 190.5);
        System.out.println(Person1.getName());
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
    }
}
//// Define class
//String person1 = new Person("John, 27");
//height = 152