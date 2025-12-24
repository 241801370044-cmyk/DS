class Main {
    public static void main(String[] args) {

        System.out.println("Dynamic Array Simulation");

        // dynamic allocation
        int[] arr = new int[20];
        int cz = 0; // current size

        System.out.println("Capacity of array: " + arr.length);
        System.out.println("Current size: " + cz);

        // initial values
        arr[0] = 10;
        cz++;
        arr[1] = 20;
        cz++;
        arr[2] = 30;
        cz++;

        System.out.println("\nAfter initial insertions:");
        printArray(arr, cz);

        // ---------- Append Operation ----------
        int appendVal = 40;

        if (cz == arr.length) {
            System.out.println("Array is full, cannot append.");
        } else {
            arr[cz] = appendVal;
            cz++;
        }

        System.out.println("\nAfter append operation:");
        printArray(arr, cz);

        // append more values
        arr[cz++] = 50;
        arr[cz++] = 60;

        System.out.println("\nAfter adding more values:");
        printArray(arr, cz);

        // ---------- Pop Operation ----------
        if (cz == 0) {
            System.out.println("Array is empty, cannot pop.");
        } else {
            arr[cz - 1] = 0;
            cz--;
        }

        System.out.println("\nAfter pop operation:");
        printArray(arr, cz);

        // ---------- Insert Operation ----------
        int insertIndex = 2;
        int insertValue = 999;

        if (insertIndex >= 0 && insertIndex <= cz) {
            for (int i = cz; i > insertIndex; i--) {
                arr[i] = arr[i - 1];
            }
            arr[insertIndex] = insertValue;
            cz++;
        } else {
            System.out.println("Invalid index for insertion");
        }

        System.out.println("\nAfter insertion operation:");
        printArray(arr, cz);
    }

    // helper method
    static void printArray(int[] arr, int size) {
        System.out.println("Current size: " + size);
        for (int i = 0; i < size; i++) {
            System.out.println(i + " index value is " + arr[i]);
        }
    }
}
