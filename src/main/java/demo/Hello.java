package demo;

interface MyInterface {
    default void hello() {
        System.out.println("Hello from default method of MyInterface");
    }
}

class MyClass implements MyInterface {

}

public class Hello {

    public static void main(String[] args) {
        MyInterface my = new MyClass();
        my.hello();
    }

}
