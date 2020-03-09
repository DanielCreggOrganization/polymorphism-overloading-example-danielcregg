public class Main {
    public static void main(String[] args) {

        // Creating a calulator object
        Calculator calcObj1 = new Calculator();

        System.out.println(        calcObj1.add(5, 10)     ); 
        System.out.println(        calcObj1.add(5, 10, 15)     ); 

        System.out.println(        calcObj1.add(5, 10d)     ); 
        System.out.println(        calcObj1.add(5.5, 10)     ); 

        System.out.println(        calcObj1.subtract(5, 10)     ); 
        System.out.println(        calcObj1.subtract(5.9, 10.5)     ); 

    }
}