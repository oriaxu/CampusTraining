package Page290;

/**
 * Created by jingyixu on 7/12/17.
 */
public class Child extends Parent {
    public void method1(){
        System.out.println("Call method1 in Child");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    public void method2(){
        System.out.println("Call method2 in Child");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
