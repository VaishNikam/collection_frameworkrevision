import java.util.*;

class CollectionArrayListQ5 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add  2.Search  3.Delete  4.Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter element:");
                    list.add(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter element to search:");
                    int s = sc.nextInt();

                    if (list.contains(s))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    System.out.println("Enter element to delete:");
                    int d = sc.nextInt();

                    list.remove(Integer.valueOf(d));
                    System.out.println("Deleted");
                    break;
            }

        } while (choice != 4);
    }
}