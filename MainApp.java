package invoiceapp;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){
        
        System.out.println("Welcome to the Invoice Total Calculator\n");
        
        Scanner sc = new Scanner(System.in);

        
        // Perform calculations until choice isn't equal to Y
        String choice = "y";
        while (!choice.equalsIgnoreCase("n"))
        {
            //get the input from user
            String customerType = Validator.getString(sc, 
                    "Enter customer type (r/c): ");
            double subtotal = Validator.getDouble(sc,
                    "Enter subtotal:            ", 0, 10000);
            
            Invoice i = new Invoice(customerType, subtotal);           
     
            double discountPercent = i.getDiscountPercent(customerType, subtotal);
            double discountAmount = i.getDiscountAmount(subtotal, discountPercent);
            double total = i.getTotal(subtotal, discountAmount);
            
            // display the discount amount and total
            String message = "Subtotal:         " + i.getFormattedSubtotal(subtotal) + "\n"
                           + "Customer type:    " + i.getFormattedType(customerType) + "\n"
                           + "Discount percent: " + i.getFormattedDiscountPercent(discountPercent) + "\n"
                           + "Discount amount:  " + i.getFormattedDiscount(discountAmount) + "\n"
                           + "Total:            " + i.getFormattedTotal(total) + "\n";
            System.out.println();
            System.out.println(message);
            
            // see if user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.next();
            System.out.println();
        }


    }//main
    
    
    
    
}//MainApp
