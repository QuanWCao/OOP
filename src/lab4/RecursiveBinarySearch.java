package lab4;

public class RecursiveBinarySearch {

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {

        if (fromIdx == toIdx - 1) {

            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }

        } else {

            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }

            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static int binarySearchIndex(int[] array, int key, int fromIdx, int toIdx) {

        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return fromIdx;
            } else {
                return -1;
            }
        } else {

            int middleIdx = (fromIdx + toIdx) / 2;

            if (key == array[middleIdx]) {
                return middleIdx;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }

            return binarySearchIndex(array, key, fromIdx, toIdx);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 9, 13, 20, 22};
        int key = 13;
        int fromIdx = 0;
        int toIdx = array.length - 1;
        if (binarySearch(array, key, fromIdx, toIdx)) {
            System.out.println("Index of key from array is: " + binarySearchIndex(array, key, fromIdx, toIdx));
        } else {
            System.out.println("Not Found");
        }
    }

    // TODO Auto-generated method stub

}

