package hexaonbusinessmitrasindo.core;

import hexaonbusinessmitrasindo.core.repository.CategoryRepository;
import hexaonbusinessmitrasindo.core.repository.ProductRepository;
import hexaonbusinessmitrasindo.core.service.CategoryService;
import hexaonbusinessmitrasindo.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent(){
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean(ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConsturctorDI(){
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDI(){
        CategoryService categoryService = context.getBean(CategoryService.class);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }
}
