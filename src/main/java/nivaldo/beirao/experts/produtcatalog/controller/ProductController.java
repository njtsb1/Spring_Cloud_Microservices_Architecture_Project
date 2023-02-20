package nivaldo.beirao.experts.produtcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nivaldo.beirao.experts.produtcatalog.model.Product;
import nivaldo.beirao.experts.produtcatalog.repository.ProductRepository;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

@RequestMapping(method = RequestMethod.POST)
Object create(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
    Optional findById(@PathVariable Integer id) {
       return productRepository.findById(id);
    }
}
