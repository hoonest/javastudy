package ch14;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> System.out.println("f");
        Object obj = (MyFunction2)(() -> {
            System.out.println("obj");
        });
        String str = ((Object)(MyFunction2) (()->{
            System.out.println("str");
        })).toString();
        f.myMethod();
        ((MyFunction2) obj).myMethod();
        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction2)(()->{}));
        System.out.println(((Object)(MyFunction2) (()->{})).toString());
    }
}
