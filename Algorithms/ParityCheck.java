package Algorithms;
import DataTypes.*;
import Exceptions.InvalidInputException;
import java.util.*;
import java.util.regex.*;

public class ParityCheck{
    String data = "";
    TypeOfCheck type = TypeOfCheck.even;

    public void getData() throws InvalidInputException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        this.data = sc.nextLine();
        Pattern pattern = Pattern.compile("[0-1]+");
        Matcher m = pattern.matcher(data);
        if(!m.matches()){
            throw new InvalidInputException("Invalid Input");
        }
        System.out.println("Enter 1 for Even, 2 for odd");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                type = TypeOfCheck.even;
                break;
            case 2:
                type = TypeOfCheck.odd;
                break;
            default:
                System.out.println("Default Even Parity taken");
                break;
        }
         
    }
    public String addParity() {
            int parity = 0;
            int countOfOnes = 0;
            for(int i = 0; i<data.length();i++){
                if(data.charAt(i) == '1'){
                    countOfOnes++;
                }
            }
            if(type == TypeOfCheck.even){
                if(countOfOnes%2==0){
                    parity = 0;
                }
                else{
                    parity = 1;
                }
            }
            if(type == TypeOfCheck.odd){
                if(countOfOnes%2==1){
                    parity = 0;
                }else{
                    parity = 1;
                }
            }
            String code = String.valueOf(parity) + data;
            return code;
        
    }
    public boolean checkParity(){
        int countOfOnes = 0;
        for(int i = 0; i<data.length();i++){
            if(data.charAt(i) == '1'){
                countOfOnes++;
            }
            
        }
        if(type == TypeOfCheck.even){
            if(countOfOnes%2==0){
                return true;
            }else{
                return false;
            }
        } else {
            if(countOfOnes%2==1){
                return true;
            }else{
                return false;
            }
        }
    }
    public void printData(){
        System.out.println("Data Entered: " + this.data);
        System.out.println("Type of Check: " + this.type);
    }
}
