package test.com.collections.shipment;

import main.com.collections.list.product.Product;
import main.com.collections.set.ProductCatalogue;
import main.com.collections.set.WeightAwareProductCatalogue;
import main.com.collections.set.supplier.Supplier;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueTest {

    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    @Test
    public void shouldNotRecordDuplicateProducts() {

        Supplier johnsGlazing = new Supplier("Joh's Glazing");
        johnsGlazing.getProducts().add(window);

        Supplier allPurpose = new Supplier("All Purpose Supplier Ltd. ");
        Collections.addAll(allPurpose.getProducts(), door, floorPanel, window);

        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.addSupplier(johnsGlazing);
        catalogue.addSupplier(allPurpose);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void shouldFindLighterProducts() {

        Supplier johnsGlazing = new Supplier("Joh's Glazing");
        johnsGlazing.getProducts().add(window);

        Supplier allPurpose = new Supplier("All Purpose Supplier Ltd. ");
        Collections.addAll(allPurpose.getProducts(), door, floorPanel, window);

        WeightAwareProductCatalogue catalogue = new WeightAwareProductCatalogue();
        catalogue.addSupplier(johnsGlazing);
        catalogue.addSupplier(allPurpose);

        Set<Product> lighterProducts = catalogue.findLighterProducts(door);
        assertThat(lighterProducts, contains(window, floorPanel));
    }
}
