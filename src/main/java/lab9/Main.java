package lab9;

import java.io.*;

public class Main {
        public static void main(String[] args) {
            System.out.println(args.length);
            if(args.length < 1){
                System.out.println("Вызов программы: java Main <имя файла>") ;
                System.exit(-1);
            }
            Student student = new Student("Sarinzhan","Kazbekov",20,"sarinzhankazbekov@gmail.com");
            System.out.println("До сериализации: \n" + student);
            writeObject(student,args[0]);
            Student newStudent = readObject("student.ser");
            System.out.println("Десериализованный: \n" + newStudent);
        }
        public static void writeObject(Student student,String path){
            try(FileOutputStream outputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
                objectOutputStream.writeObject(student);
            }catch (IOException e){}
        }
        public  static Student readObject(String path){
            Student student = null;
            try(FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);){
                student = (Student) ois.readObject();
            }catch (IOException e){} catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            return  student;
        }
}
