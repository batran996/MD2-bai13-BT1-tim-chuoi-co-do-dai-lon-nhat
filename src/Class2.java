import java.util.LinkedList;
import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi sap xep");
        String chuoi1 = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < chuoi1.length(); i++) {
            max.add(chuoi1.charAt(i));
        }
        LinkedList<Character>list2 = new LinkedList<>();
        for (int i = 0; i < chuoi1.length(); i++) {
            list2.add(chuoi1.charAt(i));
            for (int j = i+1; j <chuoi1.length(); j++) {
                if (chuoi1.charAt(i) > list2.getLast()){
                    list2.add(chuoi1.charAt(i));
                }
            }
            if (list2.size() > max.size()){
                max.clear();
                max.addAll(list2);
            }
            list2.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
