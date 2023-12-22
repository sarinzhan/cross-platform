package lab4.package2;

import lab4.package1.Color;

public class Class1 {
    protected Inner getInnerClass(){
        return new Inner();
    }
    protected  class Inner implements  Color{
        @Override
        public void printColor(String color) {
            System.out.println(color);
        }

        public Color asInterface(){
            return this;
        }

    }
}
