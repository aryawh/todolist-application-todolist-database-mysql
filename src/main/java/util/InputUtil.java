package util;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);
    public static String Input(String info){
        System.out.print( info + ": ");
        var data = scanner.nextLine();
        return data;
    }
}
