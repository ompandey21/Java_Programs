package day3;

public class lec3 {

    public static void main(String[] args) {

    //* Primitive Datatypes:
    //* For Int :
            //? Byte -> 8 bit -> -128 to 127
            //? Short -> 16 bit -> -2^15 to 2^15 -1
            //? int -> 32 bit -> -2^31 to 2^31 -1 -> 9 digit decimal numbers max
            //? Long -> 64 bit -> -2^63 to 2^63 -1 -> 18 digit decimal numbers max
            byte b = (byte)(168); //? 168 i.e. greater than 127 can be stored by parsing it into byte
            short s = 68; //?The hardcoded literal on RHS (68) has int datatype
            int i = 789;
            System.out.println(b); //? -88 is output since it is converted into 8 bit negative number and 2's compliment gives -88
            i = b; //? if smaller data is put in larger datatype we can do it easily and left bits are filled with zero
            long l = 6678575532l; //? 'l' is used at end for values that are larger than 9 digits to prevent datatype error on literal(int)

            //int a = 0328; //? giving error since 8 can not be in octal 
            int a = 032;
            System.out.println(a); //? output is decimal of octal number 32 as the number starts with zero => 26
        //* For FloatingPoint :
            //? Float -> 32 bit
            //? double -> 8 bit 
        //* String :
            //? Char -> 16 bit
            //? boolean -> 1 bit
    }
       
}
