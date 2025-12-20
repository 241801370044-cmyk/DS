class Datastructures {
    public static void main(String[] args) {
        // static D & I
        int[] numbers = {2, 5, 7, 8};
        String[] names = {"jhanvi", "ishitha", "kalpana"};
       //. traversal 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
      // Dynamic allocation
        int[] darr= new int[10]; // declaration or allocation space

        darr[0]=1;// assign value to particular memory space 
        darr[9]=8;
for (int i = 0; i < darr.length; i++) {
        System.out.println(darr[i]);
}
    }
}
