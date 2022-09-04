import java.util.*;


public class Main {
    public static void main(String[] args) {
        printOddNumbers();
        printOnlyUniquiOddNumbers();
        printWords();
    }

    public static void printOddNumbers() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.print(nums.get(i));
            }
        }
        System.out.println();
    }

    public static void printOnlyUniquiOddNumbers(){
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<nums.size();i++){
        if(nums.get(i) % 2 == 0){
            set.add(i);
    }
}
        System.out.print(set);
        System.out.println();
}

    public static void printWords(){
    Map<String, String> map = new HashMap<>();
    Set<String> set = new HashSet<>();
    String text = "делаю домашку делаю домашнее задание делаю ДЗ";

    var arr  = text.split(" ");
    for (int i = 0; i < arr.length; i++){
    set.add(arr[i]);
}
    System.out.println(set);


    }
}