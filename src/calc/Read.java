package calc;

import java.util.Scanner;

public class Read implements Reader {

    @Override
    public int readNum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    @Override
    public String readStr() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        return next;
    }

}
