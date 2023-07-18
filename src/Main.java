
public class Main {

    public static int powerWithModules(int number,int power, int moduloValue){
        int value = 1;
        for (int iterator = 0; iterator < power ; iterator++){
            value = number % moduloValue;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(powerWithModules(5,2,4));
    }
}