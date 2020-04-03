import java.util.ArrayList;

public class DatabaseInvoice {

    private static int lastId = 0;
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();

    public static ArrayList<Invoice> getInvoiceDatabase();
    {
        return INVOICE_DATABASE;
        }

        public static int getLastId()
        {
        return lastId;
        }

        public static Invoice getInvoiceById(int id)
        {
            for(Invoice invoice : INVOICE_DATABASE)
            {
                if (invoice.getId() == id)
                {
                    return invoice;
                }
            }
            return null;
        }

        public static Invoice getInvoiceByCustomer(int customerId)
        {
            ArrayList<Food> list = new ArrayList<>();
            for(Invoice invoice : INVOICE_DATABASE)
            {
                ArrayList<Invoice> listCust = new ArrayList<Invoice>();
                for(Invoice invoice: INVOICE_DATABASE)
                {
                    if(invoice.getCustomer().getId() == customerId)
                    {
                        listCust.add(invoice);
                        return listCust;
                    }
                }
                return null;
        }

        public static boolean addInvoice(Invoice invoice){
            for(Invoice invoice: INVOICE_DATABASE){
                if(invoice.getInvoiceStatus() != InvoiceStatus.Ongoing){
                    INVOICE_DATABASE.add(invoice);
                    lastId=invoice.getId();
                    return true;
                }
            }
            return false;
        }

        public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
            for(Invoice invoice: INVOICE_DATABASE){
                if(invoice.getInvoiceStatus() == InvoiceStatus.Ongoing && invoice.getId() == id){
                    invoice.setInvoiceStatus(invoiceStatus);
                    return true;
                }
            }
            return false;
        }

        public static boolean removeInvoice(int id){
            for(Invoice invoice : INVOICE_DATABASE){
                if(invoice.getId() == id){
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
            return false;
        }
}
