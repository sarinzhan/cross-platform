package lab5;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Список из нашего класса
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("BMW",10));
        listCar.add(new Car("Honda",5));
        listCar.add(new Car("Volvo",15));

        //2 Два множества
        Set<Integer> seta = new HashSet<>();
        seta.add(5);
        seta.add(2);
        seta.add(8);

        Set<Integer> setb= new HashSet<>();
        setb.add(3);
        setb.add(4);
        setb.add(5);

        Set<Integer> unionSet = SetOperations.createUnion(seta,setb);
        Set<Integer> intersectionSet = SetOperations.createIntersection(seta,setb);
        Set<Integer> diffrenceAB = SetOperations.createDifference(seta,setb);
        Set<Integer> diffrenceBA = SetOperations.createDifference(setb,seta);

        System.out.println("A: " + seta);
        System.out.println("B: " + setb);

        System.out.println("Объединение A и B: " + unionSet);
        System.out.println("Пересечение A и B: " + intersectionSet);
        System.out.println("Разность A и B: " + diffrenceAB);
        System.out.println("Разность B и A: " +  diffrenceBA);
        System.out.println("Является ли A подмножеством B: " + SetOperations.isSubset(seta, setb));
        System.out.println("Является ли B подмножеством A: " + SetOperations.isSubset(setb, seta));

        //3 - cортированное множество и сортированный ассоциативный массив
        Set<Car> setCar = new TreeSet<>(listCar);
        System.out.println("\nSorted Set: ");
        setCar.forEach(System.out::println);

        Map<Car,String> mapCar = new TreeMap<>(Comparator.comparing(Car::getCapacity));
        for(Car car :listCar){
            mapCar.put(car,car.getName());
        }
        System.out.println("\nSorted Map:");
        mapCar.forEach((key,value) -> System.out.println(key));

        //4 метод который использует итератор для перебора
        System.out.println("\n");
        //демонстрация на списке машин
        printCollection(listCar);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sarinzhan",20));
        studentList.add(new Student("Asel",22));
        studentList.add(new Student("Adilhan",19));
        System.out.println("\n");
        //демонстрация на другом списке у которого нету Comparabel и Comparator
        printCollection(studentList);

        //5 Создать и заполнить два контейнера List<Integer> одного размера
        System.out.println("\n");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        //использовать ListIterator для чтения элементов...
        ListIterator<Integer> iterator = list1.listIterator();
        while(iterator.hasNext()){
            Integer el = iterator.next();
            list2.add(el);
        }
        System.out.println(list2);
    }

    public static void printCollection(Collection<?>collection){
        Iterator<?>iterator = collection.iterator();
        while(iterator.hasNext()){
            Object el = iterator.next();
            System.out.println(el.toString());
        }
    }
}
