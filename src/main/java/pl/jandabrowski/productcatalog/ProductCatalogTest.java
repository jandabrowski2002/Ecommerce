package pl.jandabrowski.productcatalog;

import org.junit.jupiter.api.Test

import java.util.List;

public class ProductCatalogTest {

    @Test
    void itAllowsToAddProduct() {
        //Arrange
        ProductCatalog catalog = thereIsProductCatalog();
        //Act
        List<Product> products = catalog.allProducts();
        //Assert
        assertListIsEmpty(products);
    }

    private void assertListIsEmpty(List<Product> products) {
        assert 0 == products.size();
    }


}
