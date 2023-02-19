import Algorithms.*;
import java.util.*;
import DataTypes.*;

class Driver{
    AlgoType a;
    Driver(AlgoType a){
        this.a = a;
    }

    void start(){
        if(a == AlgoType.parity){
            ParityCheck p = new ParityCheck();
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 for creating parity\n Press 2 for checking parity \n Press 3 to exit");
            int op = sc.nextInt();
            switch(op){
                case 1:
                try {
                    p.getData();
                    System.out.println("Updated code with Parity");
                    System.out.println(p.addParity());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                try {
                    p.getData();
                        if(p.checkParity()){
                            System.out.println("Data is accepted");
                        } else {
                            System.out.println("Data not accepted");
                        }
                        p.printData();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.exit(1);
                    break;
                
            }
        }
    }
}