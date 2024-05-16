import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        food.add("pizza");
        food.add("hamburgur");
        food.add("hotdog");

        food.set(0,"sushi");
        food.remove(2);
//        food.clear();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
        for(int i=1;i<=10;i++){
            numbers.add(i);
        }

        numbers.add(20);
        System.out.println("number's size : " + numbers.size());
        System.out.println("number's first number : " + numbers.get(0));



        for(int i = 0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        for(int i = 1; i<=10;i++){
            System.out.println(numbers.get(i));
        }




    }
}