import java.util.*;

class CollectionArrayListQ1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Elements are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}