public class Main {
    public static void main(String[] args) {
        //showArrays();
        int[] ArrayTest = {10, 10, 10, 10, 2, 3, 5, 5, 2, 10, 10};
        ArrayEx arraysClass = new ArrayEx();
        //System.out.println(arraysClass.nElementInList(ArrayTest, 2));
        //System.out.println(arraysClass.hasRepeat(ArrayTest));
        //System.out.println(arraysClass.nroRepeat(ArrayTest));
        System.out.println(arraysClass.listRepeat(ArrayTest));
    }

    private static void showArrays()
    {
        int[] array;
        String invertedArray = "";
        array = new int[20];

        System.out.println("Array 1 \n");

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            System.out.println(array[i]);
        }
        System.out.println("Array 2 \n");

        for (int i = array.length - 1; i >= 0; i--) {
            invertedArray = invertedArray + array[i] + "\n";
        }
        System.out.println(invertedArray);
    }
}

