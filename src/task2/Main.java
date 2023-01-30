package task2;

public class Main {
    public static void main(String[] args) {
        try {
            Integer[] integers = new Integer[2];
            integers[0] = 1;
            integers[1] = 1;
            integers[2] = 1;

            Integer[] integers1 = new Integer[2];
            System.out.println(integers1[0].intValue());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("вышли за массив");
        } catch (NullPointerException e) {
            System.out.println("нулл");
        }
    }
}
