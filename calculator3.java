public class calculator3{
    
   public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPyment = 2000;

    if(loanLength <= 0 || interestRate <= 0){
      System.out.println("error! you must tale oyt a valid card.");  
    } else if (downPyment >= carLoan){
      System.out.println("gemme money boi");  
    } else {
        int remainingBalance = carLoan-downPyment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = monthlyBalance * interestRate/100;
        int monthlyPayments = monthlyBalance + interest;
        System.err.println(monthlyPayments); 
     }
        
   } 
}
