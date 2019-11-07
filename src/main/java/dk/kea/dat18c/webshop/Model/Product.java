package dk.kea.dat18c.webshop.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="products")
public class Product {

    //primær nøgle
    @Id
    //lad MySQL give den næste id (IDENTITY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String description;

    @OneToOne
    @JoinColumn(name = "companyproddesc_id")
    private CompanyProdDesc companyProdDesc;

    private Company company;

    private List<Category> categories = new ArrayList<>();

    public Product() {
    }

    public Product(String name, double price, String description, CompanyProdDesc companyProdDesc, Company company, List<Category> categories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.companyProdDesc = companyProdDesc;
        this.company = company;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompanyProdDesc getCompanyProdDesc() {
        return companyProdDesc;
    }

    public void setCompanyProdDesc(CompanyProdDesc companyProdDesc) {
        this.companyProdDesc = companyProdDesc;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
