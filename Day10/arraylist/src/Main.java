import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(5);
        list1.add("İstanbul");
        list1.add('a');
        list1.add(3.2);
        list1.remove(2);

        for(Object obj : list1){
            System.out.println(obj);
        }

        System.out.println("---------");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.remove(2);

        for(int n : list2){
            System.out.println(n);
        }

        System.out.println(list2.indexOf(8));
    }
}
