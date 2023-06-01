package task.one;

import java.util.*;
import java.util.function.Predicate;


       import java.util.ArrayList;
import java.util.List;

        public class Task1 {
            public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("input the word");

                List<String> input = new ArrayList<>();

                input.add(scanner.nextLine());
                input.add(scanner.nextLine());
                input.add(scanner.nextLine());
                input.add(scanner.nextLine());
                input.add(scanner.nextLine());

                List<String> output = filterStrings(input);
                System.out.println(output);
            }

            public static List<String> filterStrings(List<String> input) {
                List<String> output = new ArrayList<>();

                input.stream()
                        .filter(str -> str.length() <=3)
                        .forEach(output::add);

                return output;
            }
        }



