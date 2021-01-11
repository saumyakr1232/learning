public class A {

    A() {

        System.out.println("A Class Constructor ");

    }

}

public class B extends A {

    B() {

        System.out.println("B Class Constructor ");

    }

    public static void main(String[] args) {

        B ob = new B();

    }

}