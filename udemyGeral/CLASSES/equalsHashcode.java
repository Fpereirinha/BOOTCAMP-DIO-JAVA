package udemyGeral.CLASSES;

import java.util.Date;

public class equalsHashcode {
    public static void main(String[] args) {
        User u1 = new User("joao", "pedrodoidoo");
        User u2 = new User("joao", "pedrodoido");
        System.out.println(u1.equals(new Date()));

    }
}
