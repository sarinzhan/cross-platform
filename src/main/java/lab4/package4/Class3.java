package lab4.package4;

import lab4.package2.Class1;

public class Class3 {
    private int age;
    private void privateMethod(){
        System.out.println("Private method was called from Class3");
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

