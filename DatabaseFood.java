/**
 * Kelas DatabaseFood merupakan bagian dari JFood yang menangani pusat data makanan.
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    /** bagian variable instance
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Pada bagian ini hanya menggunakan variable listFood.
     * Adapun tipe data yang digunakan yaitu string[]
     */
    private String[] listFood;

    /**
     * Constructor for objects of class Location
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu listFood
     */
    public DatabaseFood(String[] listFood)
    {
        // initialise instance variables
        this.listFood=listFood;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     * untuk tipe data boolean, hanya dapat menghasilkan nilai kembali
     * true dan false.
     * Pada method ini, boolean digunakan untuk menghasilkan data berupa
     * ada atau tidak data makanan
     */
    public boolean addFood(Food food)
    {
        // put your code here
        return false;
    }
    
    /**
     * Untuk tipe data boolean, hanya dapat menghasilkan nilai kembali
     * true dan false.
     * Pada method ini, boolean digunakan untuk menghasilkan data berupa
     * pilihan ya atau tidak untuk menghapus makanan
     */
    public boolean removeFood(Food food)
    {
        return false;
    }
    
    /** 
     * Untuk tipe data boolean, hanya dapat menghasilkan nilai kembali
     * true dan false.
     * Pada bagian ini untuk menampilkan list makanan
     */
    public String[] getListFood(String[] listFood)
    {
        return listFood;
    }
}
