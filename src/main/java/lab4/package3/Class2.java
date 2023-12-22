package lab4.package3;

import lab4.package1.Color;
import lab4.package2.Class1;

public class Class2 extends Class1 {
    //метод возвращающий protected объект внутреннего класса
    public Color getInnerClass2(){
        return super.getInnerClass();
    }
    public  Color getInnerProtectedClass(){
        class ClassInsideMethod implements Color{
            @Override
            public void printColor(String color) {
            }

        }
        return new ClassInsideMethod();
    }
}
