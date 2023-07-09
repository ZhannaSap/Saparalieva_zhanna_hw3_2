public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        double[] numbers = {3.8, 5.9, -6.4, 8.5, -9.7, 6.5, 5.5, -2.5, -2.5, 3.5, -5.5, -6.5, 6.5, 8.5, -9.5};
        double num =0;
        int anotherNum =0;
        boolean check = false;
        for (double current : numbers) {

            if (current<0){
                check=true;
            } else if (check && current>0) {
                num+=current;
                anotherNum++;
                System.out.println(current);
            }
        }
        System.out.println("Ответ:" + num/anotherNum);
    }
}

