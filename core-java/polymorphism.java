class A {

    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {

    @Override
    public void show() {
        System.out.println("In C Show");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        A obj;

        obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}