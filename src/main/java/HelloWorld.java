import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.reverse;

public class HelloWorld {
    public static void sayHello(){
        System.out.println("Hello!");

    }

    public class StringUtils{

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       String input = sc.nextLine();
        System.out.println(reverse(input));
        sayHello();
        String testStr = "does this work";
        System.out.println(capitalize(testStr));

    }

}
