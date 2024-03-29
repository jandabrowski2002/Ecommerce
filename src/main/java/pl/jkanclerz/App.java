package pl.jandabrowski;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.jkanclerz.productcatalog.HashMapProductStorage;
import pl.jkanclerz.productcatalog.ProductCatalog;
import pl.jkanclerz.sales.Sales;
import pl.jkanclerz.sales.cart.CartStorage;
import pl.jkanclerz.sales.offering.OfferCalculator;
import pl.jkanclerz.sales.productdetails.InMemoryProductDetailsProvider;

import java.math.BigDecimal;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createNewProductCatalog() {
        ProductCatalog productCatalog = new ProductCatalog(new HashMapProductStorage());

        String productId1 = productCatalog.addProduct("My ebok", "NIce one");
        productCatalog.assignImage(productId1, "images/nice.jpeg");
        productCatalog.changePrice(productId1, BigDecimal.TEN);
        productCatalog.publishProduct(productId1);

        String productId2 = productCatalog.addProduct("New Ebook", "NIce one");
        productCatalog.assignImage(productId2, "images/nice.jpeg");
        productCatalog.changePrice(productId2, BigDecimal.valueOf(20.20));
        productCatalog.publishProduct(productId2);

        return productCatalog;
    }

    @Bean
    Sales createSales() {
        InMemoryProductDetailsProvider productDetails = new InMemoryProductDetailsProvider();
        return new Sales(new CartStorage(), productDetails, new OfferCalculator(productDetails));
    }
}
