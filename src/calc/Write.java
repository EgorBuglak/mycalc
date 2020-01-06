package calc;

import java.util.Scanner;

public class Write implements Writer {
    @Override
    public void write(double a) {
        System.out.println(a);
    }
}
