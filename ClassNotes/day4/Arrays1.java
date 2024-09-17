package day4;

public class Arrays1 {
    //? Java programs are run by JVM(java virtual machine)
    //? In Java, everything is either stored in stack or heap memory
    //? Array is a class , so it is a primitive datatype and stored as Array heap

    public static void main(String[] args) {
        //? Initialize the array with either 'null' or length n or {whole data}
        //? The variable 'arr' is stored in stack of main
        int [] arr = new int[5];
        arr[0] = 9;

        System.out.println(arr[0]); //*'[I@372f7a8d' ia the output and it defines the address of the array 
        arr[0] = 8;
        int [] other = arr; //? The array created is only once so the address will remain same

        //? We cannot get the address of any particular index of an array
        //? But it can be calculated using formula : 
                    //! base + 1*dataSize
        System.out.println(other[0]);

        int arr1[] = new int[8];  //? This is known as the C-type declaration
    }
}
    
