import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMOPRSTUWZYX1234567890-".toCharArray();
        String[] ends = new String[] {".cs", ".py", ".js", ".txt", ".bat", ".aac", ".accdb", ".bin", ".cda", ".doc", ".gif", ".jpg", ".mp3", ".mp4", ".png", ".zip"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<CharSequence> files = new ArrayList<CharSequence>();
        files.add(".");
        while (true){
            System.out.println("How much files do you want to create?\n" +
                    "Write 'end' to end creating files");
            String amountOfFiles = scanner.next();
            if (amountOfFiles.equals("end")){
                return;
            }
            int amount = Integer.parseInt(amountOfFiles);
            // Creating a random word
            for (int i = 0; i < amount; i++) {
                StringBuilder word = new StringBuilder();
                int length = random.nextInt(4, 16);
                for (int j = 0; j < length; j++) {
                    int position = random.nextInt(0, 60);
                    word.append(alphabet[position]);
                }
                // Choosing ends
                int cos = random.nextInt(0, 15);

                File newFile = new File("files/" + word + ends[cos]);
                newFile.createNewFile();
                System.out.print(word + " ");

                // Loading system
                int amountOfLines = random.nextInt(1, 5);
                for (int k = 0; k < amountOfLines; k++) {
                    int miliseconds = random.nextInt(300,600);
                    System.out.print("-");
                    TimeUnit.MILLISECONDS.sleep(miliseconds);
                }

                // Checks if the element is already in arraylist
                for (var element : files) {
                    if (word == element){
                        System.out.println(" false");
                        System.out.println("If you want to continue press enter");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                files.add(word);

                System.out.println(" ok");
                TimeUnit.MILLISECONDS.sleep(500);
            }
        }
    }
}