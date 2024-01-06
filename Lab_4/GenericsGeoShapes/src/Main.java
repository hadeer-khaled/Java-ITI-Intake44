//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> myList = new ArrayList<>();
        myList.add(new Circle());
        myList.add(new Circle());
        myList.add(new Circle());
        myList.add(new Square());
        myList.add(new Square());

        testShape(myList);
//        testShape(new ArrayList<Integer>());

    }
    public static void testShape(ArrayList <? extends Shape>  arr){
        for(Shape sh :arr ){
            sh.draw();
        }

    }
}