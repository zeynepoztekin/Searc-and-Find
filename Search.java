import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(", ");
        String path = str[0];
        String word = str[1];
        s.close();
        try {
            find(path,word);
        } catch (FileNotFoundException e) {
            s.close();
            e.printStackTrace();
        }
    }

    public static void find(String path, String word) throws FileNotFoundException {
        Scanner fs = new Scanner(new File(path));
        for (int linenum = 1; fs.hasNextLine(); linenum++) {
            String[] line = fs.nextLine().split(" ");
            String[] temp = Arrays.copyOf(line, line.length);
            for (int i = 0; i < line.length; i++) {
                while (temp[i].contains(word)) {
                    temp[i] = temp[i].replaceFirst(word, "");
                    System.out.printf("%d: %s%s%s%n",linenum, i == 0 ? "" : line[i-1] + " ", line[i], i == line.length - 1 ? "" : " " + line[i+1]);
                }
            }
        }
    }
}
