package Page290;

/**
 * Created by jingyixu on 7/12/17.
 */
public class Parent {
    public void method1(){
        System.out.println("Call method1 in Parent");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    public void method2(){
        System.out.println("Call method2 in Parent");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public static void invokeMethod(Parent parent){
        if (parent instanceof Parent){
            parent.method1();
            parent.method2();
        }
    }
}

