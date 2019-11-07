package dk.kea.dat18c.webshop.Model;

import java.util.ArrayList;
import java.util.List;

//class to handle category information
//category has a many to many relatioin to Product:
//a product can belong to several categories, e.g. shoes, running
//a category may be linked to many products

public class Category
{
    private int id;
    private String categoryName;
    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(int id, String categoryName, List<Product> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
