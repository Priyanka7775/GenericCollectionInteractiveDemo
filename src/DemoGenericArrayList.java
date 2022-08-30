import java.util.ArrayList;
import java.util.List;

public class DemoGenericArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        ArrayList<String> nameList=new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);

        nameList.add("Priyanka");
        nameList.add("Ramesh");
        nameList.add("Suresh");
        nameList.add("Ravi");
        nameList.add("Rashmi");


        //Processing first list
        int sum=0;
        for (Integer element: integerList) {
            sum=sum+element;
        }
        System.out.println("sum = " + sum);

        //Processing secound list
        for (String element:nameList){
            System.out.println(element.toUpperCase());
        }

    }
}
