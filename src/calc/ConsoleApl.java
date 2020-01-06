package calc;

public class ConsoleApl implements ConsApl, Reader, Writer {



    public static void main(String[] args) {
        Reader read = new Read();
        Calculate calculate = new Calculate();
        Writer write = new Write();
        int a = read.readNum();
        int b = read.readNum();
        String op = read.readStr();
        System.out.println(calculate.calc(a, b, op));
    }

    @Override
    public void run() {

    }


    @Override
    public void write(double c) {

    }

    @Override
    public int readNum() {
        return 0;
    }

    @Override
    public String readStr() {
        return null;
    }
}
