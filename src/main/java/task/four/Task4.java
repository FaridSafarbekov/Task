package task.four;


import java.util.*;
public class Task4 {



        public static void main(String[] args) {
            List<Integer> number = new ArrayList<>();
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter number");
            number.add(scanner.nextInt());
            number.add(scanner.nextInt());
            number.add(scanner.nextInt());
            number.add(scanner.nextInt());
            number.add(scanner.nextInt());
            number.add(scanner.nextInt());

            Collection<Integer> uniqueNumbers = getUniqueElements(number);
            System.out.println(uniqueNumbers);
        }
    public static <T> Collection<T> getUniqueElements(Collection<T> collection) {
        Set<T> uniqueElements = new HashSet<>(collection);
        return uniqueElements;
    }
}


