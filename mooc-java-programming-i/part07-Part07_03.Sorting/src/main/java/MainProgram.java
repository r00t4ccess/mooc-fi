
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        int[] array = {6, 3, 0, -1, 4};
        System.out.println(indexOfSmallest(array));
        //sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++ ) {
            if (table[i] < smallest) {
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
        
    }
    
    public static void sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            print(array);
            int smallIndex = indexOfSmallestFrom(array, index);
            swap(array, smallIndex, index);
        } 
    }
    
    public static void print(int[] array) {
        int index = 0;
        System.out.print("[");
        for (int i : array) {
            if (index >= array.length -1) {
                System.out.print(i);
            } else {
            System.out.print(i + ", ");
            }
            index++;
        }
        System.out.print("]");
        System.out.println("");
    }

}
