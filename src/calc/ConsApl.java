package calc;

public interface ConsApl {
    void run();
    class Calculate {

        double calc(double a, double b, String op) {
            switch (op){
                case "sum":
                    return sum(a, b);
                case "sub":
                    return sub(a, b);
                case "mul":
                    return mul(a, b);
                case "div":
                    return div(a, b);
                default:
                    return 0;

            }
        }

        private double div(double a, double b) {
            return a / b;
        }

        private double mul(double a, double b) {
            return a * b;
        }

        private double sub(double a, double b) {
            return a - b;
        }

        private double sum(double a, double b) {
            return a + b;
        }


    }

}
