package lab8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "text.txt";
        String text = "Hello world. Привет";

        write(path,text);
        String res = read(path);
        System.out.println("Байтовый:\t" + res);

        String res2 = readCharacter(path);
        System.out.println("Символьный:\t" + res2);

        //у меня по варианту было вывести слова начинающиеся и заканчивающиеся на гласную букву
        readAndPrintVowelWords(res2);
    }
    public static void write(String path,String text){
        byte[] bytes = text.getBytes();
        try(FileOutputStream fos = new FileOutputStream(path)){
            fos.write(bytes);
        }catch(Exception e){}
    }
    public static String read(String path){//байтовый
        StringBuilder builder = new StringBuilder();
        try(FileInputStream fis = new FileInputStream(path)){
            int a = 0;
            while((a=fis.read()) != -1){
                builder.append((char)a);
            }

        }catch(Exception e){}
        return builder.toString();
    }
    public static String readCharacter(String path){//символьный
        StringBuilder builder = new StringBuilder();
        try(FileReader fr = new FileReader(path)){
            int a = 0;
            while((a = fr.read()) != -1){
                builder.append((char)a);
            }
        }catch (Exception e){}
        return  builder.toString();
    }
    public static void readAndPrintVowelWords(String text) {
        try {
            String[] words = text.split("\\s+");

            for (String word : words) {
                if (word.matches("^[aeiouAEIOU].*[aeiouAEIOU]$")) {
                    System.out.println(word);
                }
            }
        } catch (Exception e) {}
    }

}