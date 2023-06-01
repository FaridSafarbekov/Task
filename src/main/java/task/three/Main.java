package task.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter artist name, title and duration");
        Song song=new Song();
        song.setArtist(scanner.nextLine());
        song.setTitle(scanner.nextLine());
        song.setDuration(scanner.nextInt());
        String duration = song.durationInMinutesAndSeconds();
        System.out.println("Duration: " + duration);

    }
}
