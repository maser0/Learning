import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int yourAge(int currentYear, int yearOfBirth) {
        int age = currentYear - yearOfBirth;

        return age;
    }

    private static List<Integer> calc (int numberOne, int numberTwo){
        int sum = numberOne+numberTwo;
        int subtract = numberOne-numberTwo;
        int divide =numberOne/numberTwo;
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(sum);
        numbers.add(subtract);
        numbers.add(divide);
        return numbers;
    }

    private static boolean divide (int number){
        if(number%3==0 && number%5==0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(yourAge(2023, 1990));
        System.out.println(calc(10, 5));
        System.out.println(divide(18));

        Human person = new Human (32,87,187,"Andrzej","men");
        System.out.println(person.getAge());
        System.out.println(person.getHeight());

        Rectangle figure = new Rectangle(5,2);
//        System.out.println(figure.circuit(figure.getWidth(), figure.getLength()));
        System.out.println(figure.circuit(figure));
        System.out.println(figure.area(figure));

        MyNumber number = new MyNumber(4);
        System.out.println(number.isOdd());
        System.out.println(number.isEven());
        System.out.println(number.sqrt());
        System.out.println(number.pow(2));
        System.out.println(number.add(5));
        System.out.println(number.subtract(2));

    }




}