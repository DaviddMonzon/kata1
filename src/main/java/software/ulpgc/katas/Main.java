package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person david = new Person("David", LocalDate.of(2004, 10, 23));
        System.out.println(david);
    }
}
