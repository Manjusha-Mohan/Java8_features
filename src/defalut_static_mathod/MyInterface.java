package defalut_static_mathod;

public interface MyInterface {
    //default method
    default void defaultMethod(){
        System.out.println("Default method");
    }
    //static method
    static void staticMethod(){
        System.out.println("static method");
    }
}
