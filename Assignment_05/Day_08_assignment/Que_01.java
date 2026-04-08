public class Que_01 {

    public static <T extends Number> T findMin(T[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].doubleValue() < min.doubleValue()) {
                min = arr[i];
            }
        }

        return min;
    }

   
    public static void main(String[] args) {

        Integer[] intArr = {10, 5, 20, 3, 15};
        Double[] doubleArr = {2.5, 1.1, 3.8, 0.9};

        Integer minInt = findMin(intArr);
        Double minDouble = findMin(doubleArr);

        System.out.println("Minimum Integer: " + minInt);
        System.out.println("Minimum Double: " + minDouble);
    }
}