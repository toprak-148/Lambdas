public class denemek {

    public static void main(String[] args) {

        Math adder = (double arg1,double arg2)->{return arg1+arg2;};
        doMath(adder,4,5);
        Math multiplier = ( double arg1 , double arg2) ->{return arg1 * arg2;};
        doMath(multiplier,6,5);
        Hello hello = (String sentence)->{return sentence;};
        show(hello,"Hello world");







    }
    public static void doMath(Math math, double arg1, double arg2){
        double outcome = math.calculate(arg1, arg2);
        System.out.println(outcome);
    }

    public static void show(Hello hello,String sentence){
        String hlgf = hello.salute(sentence);
        System.out.println(hlgf);
    }
}


interface Math{
    double calculate(double arg1,double arg2);
}


interface Hello{
    String salute(String sentence);
}
