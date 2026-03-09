package Synergech;
import java.util.*;

public class LinkedUsers {

    public static List<String> uniqueReverse(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        List<String> result = new ArrayList<>(set);
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<String> users = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add  2.Remove  3.Display  4.Sort  5.Unique Reverse  6.Exit");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    users.add(s.nextLine());
                    break;

                case 2:
                    users.remove(s.nextLine());
                    break;

                case 3:
                    System.out.println(users);
                    break;

                case 4:
                    Collections.sort(users);
                    System.out.println(users);
                    break;

                case 5:
                    System.out.println(uniqueReverse(users));
                    break;

                case 6:
                    break;
            }

        } while (choice != 6);

        s.close();
    }
}
