package dk.kea.dat18c.webshop.Model;

import javax.persistence.*;

@Entity
@Table(name = "CompanyDesc")
public class CompanyProdDesc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    //mappedBy er den anden entitets navn for denne klasse
    @OneToOne( cascade = CascadeType.ALL,
            mappedBy = "companyProdDesc" )

    private Product product;

    public CompanyProdDesc() {
    }

    public CompanyProdDesc(String description, Product product) {
        this.description = description;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
