package lab10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Student student = new Student("Sarinzhan","Kazbekov",20,"sarinzhankazbekov@gmail.com");
        //Class - это класс который хранит всю информацию о нашем классе, создается во время первого обращения к классу
        Container <Student> container = new Container(Student.class);
        container.put(student);
        Inherit in = new Inherit("Vova","Vladimir",20,"vova.vlad@gmail.com");
       // container.put(in); intelij не дает вставить потому что это другой тип, хотя он наследуется от студента и по идее должен вставляться

        //получаем конструктор нашего класса хотя он и private :)
        Constructor<Defended> declaredConstructor = Defended.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true); // это фигня говорит что теперь мы можем его брать, типа теперь позволяет, хоть он и private
        Defended defended = declaredConstructor.newInstance("Название");
        //тут берем метод который private
        Method method = defended.getClass().getDeclaredMethod("getName");
        method.setAccessible(true);
        System.out.println(method.invoke(defended));

        Field field = defended.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(defended));


    }
}