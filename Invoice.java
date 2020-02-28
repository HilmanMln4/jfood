/**
 * Kelas Invoice merupakan bagian dari JFood yang menangani data pembelian yang terdiri dari id, idfood, date, totalPrice, custsomer
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/
public class Invoice
{
    // instance variables - replace the example below with your own
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, string, dan tipe data buatan sendiri
     * Kemudian variable yang digunakan yaitu id, idfood, date, totalPrice, custsomer
     */
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, idfood, date, customer, dan totalprice.
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
    {
        this.id=id;
        this.idFood=idFood;
        this.date=date;
        this.customer=customer;
        this.totalPrice=totalPrice;
    }

    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Invoice
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * method getter IdFood akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter IdFood untuk Invoice
     */
    public int getIdFood()
    {
        return idFood;
    }
    
    /** 
     * method getter Date akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Date untuk Invoice
     */
    public String getDate()
    {
        return date;
    }
    
    /** 
     * method getter TotalPrice akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter TotalPrice untuk Invoice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /** 
     * method getter Customer akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Customer untuk Invoice
     */
    public Customer getCustomer()
    {
        return customer=customer;
    }
    
    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Invoice
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method setter IdFoods akan set sebuah nilai sesuai dengan variable
     * Setter IdFoods untuk Invoice
     */
    public void setIdFoods(int idFood)
    {
        this.idFood=idFood;
    }
    
    /**
     * method setter Date akan set sebuah nilai sesuai dengan variable
     * Setter Date untuk Invoice
     */
    public void setDate(String date)
    {
        this.date=date;
    }
    
    /**
     * method setter TotalPrice akan set sebuah nilai sesuai dengan variable
     * Setter TotalPrice untuk Invoice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    /**
     * method setter Customer akan set sebuah nilai sesuai dengan variable
     * Setter Customer untuk Invoice
     */
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    /**
     * Untuk mencetak data sesuai dengan value dalam kurung
     */
    public void printData()
    {
    }
}
