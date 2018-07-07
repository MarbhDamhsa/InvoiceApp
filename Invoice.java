package invoiceapp;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {
 
    
    private ArrayList<LineItem> lineItems;

    public Invoice()
    {
        lineItems = new ArrayList<>();
    }
    
    public void addItem(LineItem lineItem)
    {
        this.lineItems.add(lineItem);
    }
    
    public ArrayList<LineItem> getLineItems()
    {
        return lineItems;
    }
    
    public double getInvoiceTotal()
    {
        double invoiceTotal = 0;
        for (LineItem lineItem : this.lineItems)
        {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }
    
    public String getFormattedTotal()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getInvoiceTotal());
    }
//    
//    
//    public Invoice(String type, double subtotal){
//    
//        
//    }//Invoice
//    
//    
//    
//    public double getSubtotal()
//    {
//    
//        return subtotal;
//    
//    }//getSubtotal
//    
//    
//    
//    public double getDiscountPercent(String type, double subtotal)
//    {
//        //calculate discount amount and total
//            
//            double discountPercent = 0.0;
//            if (type.equalsIgnoreCase("R"))
//            {
//                if (subtotal >= 500)
//                    discountPercent = .2;
//                else if (subtotal >= 250 && subtotal < 500)
//                   discountPercent =.15;
//                else if (subtotal >= 100 && subtotal < 250)
//                   discountPercent =.1;
//                else if (subtotal < 100)
//                    discountPercent =.0;
//            }
//            else if (type.equalsIgnoreCase("C"))
//            {
//                discountPercent = 0.2;
//            }
//            else 
//                    discountPercent = 0.5;
//            
//        return discountPercent;
//        
//    }//getDiscountPercent
//    
//    
//    
//    public double getDiscountAmount(double subtotal, double discountPercent)
//    {
////        discountPercent = this.getDiscountPercent(type, subtotal);
//        double discountAmount = subtotal * discountPercent;
//        
//        return discountAmount;
//        
//    }//getDiscountAmount
//    
//    
//    
//    public double getTotal(double subtotal, double discountAmount)
//    {
//        
//        double total = subtotal - discountAmount;
//        return total;
//        
//    }//getTotal
//    
//    
//    
//    public String getFormattedSubtotal(double subtotal)
//    {
//        
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String sSubtotal = currency.format(subtotal);
//        
//        return sSubtotal;
//    }//getFormattedSubtotal
//    
//    
//    
//    public String getFormattedTotal(double total)
//    {
//        
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String sTotal = currency.format(total);
//        
//        return sTotal;
//        
//    }//getFormattedTotal
//    
//    
//    
//    public String getFormattedDiscountPercent(double discountPercent)
//    {
//        
//            NumberFormat percent = NumberFormat.getPercentInstance();
//            String sDiscountPercent = percent.format(discountPercent);
//            
//            return sDiscountPercent;
//            
//    }//getFormattedDiscountPercent
//    
//    
//    
//    public String getFormattedDiscount(double discountAmount){
//        
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String sDiscountAmount = currency.format(discountAmount);
//        
//        return sDiscountAmount;
//        
//    }//getFormattedDiscount
//    
//    
//    public String getFormattedType(String type)
//    {
//        
//        String sCustomerType = "Unknown";
//        if (type.equalsIgnoreCase("r"))
//            sCustomerType = "Retail";
//        else if (type.equalsIgnoreCase("c"))
//            sCustomerType = "College";
//        
//        return sCustomerType;
// 
//    }//getFormattedType
//

}//class Invoice
