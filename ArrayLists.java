import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3= new ArrayList<Boolean>();
        
        // add element
        list.add(0);
        list.add(10);
        list.add(5);
        list.add(8);
         System.out.println(list);

        //to get any perticular element.
         int element = list.get(3);
         System.out.println(element);

         //add element in between two elements.
         list.add(1,1);
         System.out.println(list);

         //to repalce an element with exiestent element.
         list.set(0,10);
         System.out.println(list);

         //delete  element 
         list.remove(3);
         System.out.println(list);

         //  //loops
         for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
         }
         System.out.println();

         Collections.sort(list);
         System.out.println(list);
    }
}