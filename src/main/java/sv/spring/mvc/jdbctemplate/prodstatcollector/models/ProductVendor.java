package sv.spring.mvc.jdbctemplate.prodstatcollector.models;

import java.util.List;

public class ProductVendor {
    private String name;
    private List<String> searchParameters;

    public ProductVendor(String name, List<String> searchParameters) {
        this.name = name;
        this.searchParameters = searchParameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSearchParameters() {
        return searchParameters;
    }

    public void setSearchParameters(List<String> searchParameters) {
        this.searchParameters = searchParameters;
    }
}
