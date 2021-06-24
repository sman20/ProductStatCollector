package sv.spring.mvc.jdbctemplate.prodstatcollector.models;

public class Product {
    private int id;
    private String name;
    private String type;
    private ProductVendor vendor;
    private String url;
//    private ProductParameters parameters;

    public Product(int id, String name, String type, ProductVendor vendor, String url) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.vendor = vendor;
        this.url = url;
    }

    public Product() {      // for newProduct() method in pr.controller
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductVendor getVendor() {
        return vendor;
    }

    public void setVendor(ProductVendor vendor) {
        this.vendor = vendor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public ProductParameters getParameters() {
//        return parameters;
//    }
//
//    public void setParameters(ProductParameters parameters) {
//        this.parameters = parameters;
//    }
}
