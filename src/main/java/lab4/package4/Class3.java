package lab4.package4;

import lab4.package2.Class1;

public class Class3 {
    private int age;
    private void privateMethod(){
        System.out.println("Private method was called from Class3");
    }
    public void ss(){
        //во втором метод внешнего класса, создайте обхект внутреннего класса и вывовите.......
        InnerClass innerClass = new InnerClass();
        System.out.println("Вызываем внешний протектед метод из внутреннего класса");
        innerClass.callPrivateMethod();
        System.out.println("Вызываем внешний протектед поле из внутреннего класса и меняем значение на 10");
        innerClass.changePrivateAge(10);
    }
    public void test(){
        InnerClass inner = new InnerClass();
    }


    public class InnerClass {
        public void changePrivateAge(int val){
            age = val;
        }
        public void callPrivateMethod(){
            privateMethod();
        }
    }
}

