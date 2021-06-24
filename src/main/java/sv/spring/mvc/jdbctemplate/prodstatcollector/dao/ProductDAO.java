package sv.spring.mvc.jdbctemplate.prodstatcollector.dao;

import org.springframework.stereotype.Component;
import sv.spring.mvc.jdbctemplate.prodstatcollector.models.Product;
import sv.spring.mvc.jdbctemplate.prodstatcollector.models.ProductVendor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductDAO {

    static int lastProductId;
    List<Product> products = new ArrayList<>();

    {
        products.add(new Product(++lastProductId,
                            "Volvic", "water",
                            new ProductVendor("Delhaize", Arrays.asList("dlzSearchPar1", "dlzSearchPar2")),
                        "https://www.delhaize.be/nl-be/shop/Dranken-en-alcohol/Water/Plat-water/Mineraal-water-Niet-bruisend-4-2/p/S2020031000194900098"));
        products.add(new Product(++lastProductId,
                        "Passendale", "cheese",
                            new ProductVendor("Delhaize", Arrays.asList("dlzSearchPar1", "dlzSearchPar2")),
                        "https://www.delhaize.be/nl-be/shop/Zuivel-en-kaas/Kazen/Sneden/PASSEND-CLASSIC-5-SN-190G/p/F2017071700003440000#BE10785452"));
        products.add(new Product(++lastProductId,
                            "Volvic", "water",
                new ProductVendor("Carrefour", Arrays.asList("cfrSearchPar1", "cfrSearchPar2")),
                        "https://drive.carrefour.eu/nl/Water/Niet-bruisend-water/Volvic-Natuurlijk-Mineraalwater-6-x-1-5-L/p/06199370"));
    }

    public List<Product> allProducts() {
        return products;
    }

    public Product getProduct(int id) {
        return products.stream().filter(product -> product.getId() == id).findAny().orElse(null);
    }
}
