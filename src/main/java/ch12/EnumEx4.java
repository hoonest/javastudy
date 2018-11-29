package ch12;

import java.util.Comparator;

abstract class MyEnum<T extends MyEnum<T>> implements Comparator<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {return ordinal;}

    MyEnum(String name) {
        this.name = name;
        this.ordinal = id ++;
    }

    public int compareTo(T t) {
        return ordinal - t.ordinal();
    }
}

abstract class MyTransportation extends MyEnum {
    abstract  int fare(int distance);
    protected final int BASIC_FARE;
    private MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    static final  MyTransportation BUS = new MyTransportation("BUS", 100) {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        int fare(int distance) {return distance*BASIC_FARE;}
    };

    static final  MyTransportation TRAN = new MyTransportation("TRAN", 150) {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        int fare(int distance) {return distance*BASIC_FARE;}
    };

    static final  MyTransportation SHIP = new MyTransportation("SHIP", 100) {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        int fare(int distance) {return distance*BASIC_FARE;}
    };

    static final  MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 300) {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        int fare(int distance) {return distance*BASIC_FARE;}
    };

    public String name() {return name;}
    public String toString() {return name;}
}


public class EnumEx4 {
    public static void main(String[] args) {
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.TRAN;
        MyTransportation t3 = MyTransportation.SHIP;
        MyTransportation t4 = MyTransportation.AIRPLANE;
        MyTransportation t5 = MyTransportation.BUS;

        System.out.printf("t1=%s, %d%n", t1.name(), t1.ordinal());
        System.out.printf("t2=%s, %d%n", t2.name(), t2.ordinal());
        System.out.printf("t3=%s, %d%n", t3.name(), t3.ordinal());
        System.out.printf("t4=%s, %d%n", t4.name(), t4.ordinal());
        System.out.printf("t5=%s, %d%n", t5.name(), t5.ordinal());

        System.out.println("t1==t5 ? " + (t1==t5));
        System.out.println("t1.compareTo(t3)==" + t1.compareTo(t3));
        System.out.println("t1.compareTo(t5)==" + t1.compareTo(t5));

    }
}
