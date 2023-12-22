package lab4;

import com.sun.security.jgss.GSSUtil;
import lab4.package1.Color;
import lab4.package1.ColorEnum;
import lab4.package3.Class2;
import lab4.package4.Class3;
import lab4.package5.Class4;
import lab4.package6.A;
import lab4.package6.B;
import lab4.package6.U;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Color color = null;
        System.out.println("Вывод цветов через интерфейс");
        System.out.println(Color.RED);
        System.out.println(Color.PINK);
        System.out.println(Color.PURPLE);
        System.out.println(Color.WHITE);
        System.out.println(Color.BLACK);
        System.out.println(Color.BLUE);
        System.out.println("interface null");
        System.out.println(color.RED);
        System.out.println();

        System.out.println("Вывод цветов через ENUM");
        System.out.println(ColorEnum.BLACK);
        System.out.println(ColorEnum.RED);
        System.out.println(ColorEnum.PINK);
        System.out.println(ColorEnum.BLACK);
        System.out.println(ColorEnum.BLUE);

        Class2 class2 = new Class2();
        Color inner = class2.getInnerClass2();
        inner.printColor("RED");
        System.out.println(inner.RED);
        System.out.println();

        Color methodClass = class2.getInnerProtectedClass();
        methodClass.printColor("BLACK");
        System.out.println(methodClass.RED);
        System.out.println();

        Class3 class3 = new Class3();
        class3.test();

        Map<Integer,Integer> map = new HashMap<>();






        List<A> listA = new ArrayList<>();
        listA.add(new A());
        listA.add(new A());
        listA.add(new A());
        listA.add(new A());

        B b = new B(4);
        for(A a :listA){
            b.add(a.getU());
        }
        b.callAll();
        b.remove(0);
        b.remove(1);

        System.out.println("alter removing");
        b.callAll();
//
//        int [] arr1 = {1,2,3};
//        int [] arr2 = {2,3,4};
//        int [] arr3 = new int[arr1.length + arr2.length];
//        for(int i = 0,j=0;i<arr3.length;i++){
//            arr3[j] = arr1[i];
//        }

    }
}


