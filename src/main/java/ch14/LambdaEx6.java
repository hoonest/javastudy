package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int) (Math.random()*100) + 1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i%2 == 0;
        IntUnaryOperator op = i -> i/10*10;

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));
        printEventNum(p,c,arr);
        int[] newArr = doSomthing(op, arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = s.getAsInt();
        }
    }

    private static void printEventNum(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for(int i : arr ) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    private static int[] doSomthing(IntUnaryOperator op, int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i<newArr.length;i++) {
            newArr[i] = op.applyAsInt(arr[i]);
        }
        return newArr;
    }

}
