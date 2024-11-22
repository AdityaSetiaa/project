public class calculator{
    public calculator(){
        
    }
    public int add(int a, int b){
        return a + b;
    } 
    public int subtract(int a, int b){
        return a - b;
    } 
    public int multiplication(int a, int b){
        return a * b;
    } 
    public int division(int a, int b){
        return a / b;
    } 
    public int module(int a, int b){
        return a % b;
    } 



    public static void main(String[] args){
        calculator myCalculator = new calculator();
           System.out.println(myCalculator.add(5, 7));
           System.out.println(myCalculator.subtract(5, 7));
           System.out.println(myCalculator.multiplication(5, 7));
           System.out.println(myCalculator.division(5, 7));
           System.out.println(myCalculator.module(5, 7));
           

        }
       

    }
