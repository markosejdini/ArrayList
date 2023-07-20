import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        boolean flag = true;

        while (flag){
            printMesage();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(grocery);
                case 2 -> removeItems(grocery);
                default -> flag= false;
            }
            grocery.sort(Comparator.naturalOrder());
            System.out.println(grocery);
        }



    }

    private static void addItems (ArrayList<String> grocery) {
        System.out.println("For every item added pleas separate with comma");
        String [] items = scanner.nextLine().split(",");

        for( String el : items) {
            String trimed = el.trim();
            if(grocery.indexOf(trimed)<0) {
                grocery.add(trimed);
            }
        }

    }
    private static void removeItems (ArrayList<String> grocery) {
        System.out.println("For every item you want to remove pleas separate with comma");
        String [] items = scanner.nextLine().split(",");

        for( String el : items) {
            String trimed = el.trim();
                grocery.remove(trimed);
        }

    }


    private static void printMesage () {
        String stringBox;

        stringBox = """
                press : 0 to exit;
                press : 1 to add values;
                press : 2 to remove value;
                """;
        System.out.println(stringBox+" ");
    }


}
