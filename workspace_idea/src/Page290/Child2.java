package Page290;

/**
 * Created by jingyixu on 7/12/17.
 */
public class Child2 extends Parent{
    public void method2(){
        System.out.println("Call method2 in Child2");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
