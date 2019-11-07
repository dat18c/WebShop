package dk.kea.dat18c.webshop.Model;

//name of vendor
//company has a one to many relation to product
//the webshop may sell many products from the same company
//a product comes from one and only one company
public class Company {
    private int id;
    private String companyName;

    public Company() {
    }

    public Company(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
