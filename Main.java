import DataTypes.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Parity");
        int op = sc.nextInt();
         
        if(op == 1){
            Driver d = new Driver(AlgoType.parity);
            d.start();
        }
        
    }
}