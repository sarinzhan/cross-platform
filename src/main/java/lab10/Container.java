package lab10;

import lab9.Student;

import java.util.ArrayList;
import java.util.List;

public class Container <T>{
    private ArrayList<T> list;
    private Class<?> type;

    public Container(Class<?> type) {
        list = new ArrayList<>();
        this.type = type;
        System.out.println(">>>Данный контейнер для типов: " + type.getTypeName());
    }
    public void put (T obj){
        System.out.println("\n >>>Попытка добавить тип " + obj.getClass().getName() );
        if(type.getName() == obj.getClass().getName()) {
            list.add(obj);
            System.out.println("Объект добавлен");
        }else{
            System.out.println("Ошибка: Ваш объект другого типа");
        }
    }

}