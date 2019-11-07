package dk.kea.dat18c.webshop.Model;
//class to handle category information
//category has a many to many relatioin to Product:
//a product can belong to several categories, e.g. shoes, running
//a category may be linked to many products
public class Category
{
    private int id;
    private String categoryName;

    public Category() {
    }

    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
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
}
