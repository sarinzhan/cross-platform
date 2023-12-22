package lab4.package6;

public class A {
    public U getU(){
        return new Inner();
    }
    protected class Inner implements  U{
        @Override
        public void method1() {
            System.out.println(this.toString() + "class A method1");
        }

        @Override
        public void method2() {
            System.out.println(this.toString() + "class A method2");
        }

        @Override
        public void method3() {
            System.out.println(this.toString() + "class A method3");
        }
    }
}
