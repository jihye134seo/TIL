interface Calculator<T>{
    T cal(T a, T b);
}

public class LamdaPractice {

    public static <T> void calAndShow(Calculator<T> op, T n1, T n2) {
        T r = op.cal(n1, n2);
        System.out.println(r);
    }

    public static void main(String[] args) {
        Calculator<Integer> r1 = (a, b) -> a + b;
        calAndShow(r1, 3, 4);

        Calculator<Double> r2 = (a, b) -> a + b;
        calAndShow(r2, 2.5, 7.1);

        Calculator<Integer> r3 = (a, b) -> a - b;
        calAndShow(r3, 4, 2);

        Calculator<Double> r4 = (a, b) -> a - b;
        calAndShow(r4, 4.9, 3.2);
    }

}
