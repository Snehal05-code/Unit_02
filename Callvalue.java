//Define class
public class Callvalue {
    //Static method for taking integer
    static void change(int m){
        //add 5 to variable m
        m=m+5;
    }
    //main method
    public static void main(String[] args) {
        //Declare and initilize varilabe n  with 10
        int n=10;
       //static method
        change(n);
        //Print vale of 'n'
        System.out.println(n);

    }
}