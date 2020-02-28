
/**
 * Kelas Customer merupakan bagian dari JFood yang menangani data pembeli yang terdiri dari id, nama, email, password, joindate
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/

public class Customer
{
    // instance variables - replace the example below with your own
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, dan string,
     * Kemudian variable yang digunakan yaitu id, name, email, password, dan joindata
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Seller
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, name, email, password, dan joindate.
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=joinDate;
    }

    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Customer
     */
    public int getID()
    {
        return id;
    }
    
    /** 
     * method getter Name akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Name untuk Customer
     */
    public String getName()
    {
        return name;
    }
    
    /** 
     * method getter Email akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Email untuk Customer
     */
    public String getEmail()
    {
        return email;
    }
    
    /** 
     * method getter Password akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Password untuk Customer
     */
    public String getPassword()
    {
        return password;
    }
    
    /** 
     * method getter JoinDate akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter JoinDate untuk Customer
     */
    public String getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Customer
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method setter Name akan set sebuah nilai sesuai dengan variable
     * Setter Name untuk Customer
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * method setter Email akan set sebuah nilai sesuai dengan variable
     * Setter Email untuk Customer
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * method setter Password akan set sebuah nilai sesuai dengan variable
     * Setter Password untuk Customer
     */
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    /**
     * method setter JoinDate akan set sebuah nilai sesuai dengan variable
     * Setter JoinDate untuk Customer
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate=joinDate;
    }  
    
     /**
     * Untuk mencetak data sesuai dengan value dalam kurung
     */
    public void printData()
    {
        System.out.println(getName());
    }
}
