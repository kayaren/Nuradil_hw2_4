import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        System.out.println(" напишите 5 строк  для списка А  ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println(" список А " + listA);





        ArrayList<String > listB = new ArrayList<>();
        System.out.println(" напишите еще 5 строк для списка  ");
        for (int i = 0; i < 5; i++) {
           listB.add(scanner.nextLine());
        }
        System.out.println(" список Б " + listB);



        
        ArrayList<String > listC = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(listB.size() - i - 1 ));

        }

        System.out.println(" список С " + listC);


        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список С: " + listC);


    }

}