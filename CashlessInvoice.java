
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food,String date, Customer customer,InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, date, customer, invoiceStatus);
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
        this.promo=promo;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    } 
       
    public void setPromo(Promo promo)
    {
        this.promo=promo;
    }
    
    public void setTotalPrice()
    {
        if(getPromo()!=null && getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
        {
            super.totalPrice=getFood().getPrice()-getPromo().getDiscount();
        }
        
        else
        {
            super.totalPrice=getFood().getPrice();
        }
    }
    
    
    public void printData()
    {
        System.out.println("=====CashlessInvoice=====");
        System.out.println("Id:" + getId());
        System.out.println("Food:" + getFood().getName());
        System.out.println("Date:" + getDate());
        System.out.println("Customer:" + getCustomer().getName());
        System.out.println("Invoice Status:" + getInvoiceStatus());
        System.out.println("Payment Type:" + getPaymentType());
        System.out.println("Promo:");
        
        if(getPromo()!=null && getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
        {
            System.out.println(totalPrice=getFood().getPrice()-getPromo().getDiscount());
        }
        
        else
        {
            System.out.println(totalPrice=getFood().getPrice());
        }
    }
}
