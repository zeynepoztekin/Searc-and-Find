import java.io.*;
import java.util.Scanner;

public class Compress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        String encryptedFile = encrypt(fileName);
        System.out.print(readFile(fileName));
        System.out.print(readFile(encryptedFile));
        System.out.print(decrypt(encryptedFile));
    }

    public static String encrypt(String fileName){
        //a: 1, b: 000, c: 001, d: 010, e: 0110, f: 0111
        String fileContent = readFile(fileName);
        fileContent = fileContent.replaceAll("a", "1");
        fileContent = fileContent.replaceAll("b", "000");
        fileContent = fileContent.replaceAll("c", "001");
        fileContent = fileContent.replaceAll("d", "010");
        fileContent = fileContent.replaceAll("e", "0110");
        fileContent = fileContent.replaceAll("f", "0111");
        String newFileName = fileName.substring(0, fileName.indexOf(".")) + "_coded" + fileName.substring(fileName.indexOf("."));
        writeFile(newFileName, fileContent);
        return newFileName;
    }
    private static String readFile(String fileName){
        String s = "";
        try {
            Scanner reader = new Scanner(new FileReader(fileName));
            while (reader.hasNextLine()){
                s += String.format(reader.nextLine() + "%n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return s;
    }
    private static void writeFile(String fileName, String fileContent){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(fileContent);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String decrypt(String fileName){
        String fileContent = readFile(fileName);
        String originalContent = "";
        //a: 1, b: 000, c: 001, d: 010, e: 0110, f: 0111
        String s = "";
        for (String line : fileContent.split("\\r?\\n")) {
            for (int i = 0; !line.isEmpty() ; i++) {
                char c = contains(s);
                if ( c != '$'){
                    line = line.replaceFirst(s, "");
                    originalContent += c;
                    s = "";
                    i = 0;
                }
                if (i != line.length())
                    s+=line.charAt(i);
            }
            originalContent = String.format(originalContent + "%n");
        }
        return originalContent;
    }
    private static char contains(String s){
        String[] codes = {"1", "000", "001", "010", "0110", "0111"};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(s)){
                return letters[i];
            }
        }
        return '$';
    }
}

