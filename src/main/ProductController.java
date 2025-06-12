
public class ProductContoroller {


    @RestController
    @RequestMapping("/api/products")
    public class ProductController {
        @GetMapping("/{id}")
        public Product getProductById(@PathVariable String id) {
            // Логика получения продукта по ID
            return new Product();
        }

        @PostMapping
        public Product addProduct(@RequestBody Product product) {
            // Логика добавления продукта
            return product;
        }
    }
}
