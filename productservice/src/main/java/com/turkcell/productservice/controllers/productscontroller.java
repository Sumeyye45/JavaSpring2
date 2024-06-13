package com.turkcell.productservice.controllers;

import com.turkcell.productservice.Services.abstracts.ProductServices;
import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class productscontroller {

   private final ProductServices productServices;

    public productscontroller(ProductServices productServices) {
        this.productServices = productServices;
    }





    @GetMapping("/id")
    public List<ListProductResponse> getIdAllProducts() {
        return productServices.goster();
    }









        @PostMapping("/created")
        Product createdProducted(@RequestBody AddProductRequest addProductRequest){

            Product product = productServices.createdProducted(addProductRequest);

            return product;
        }



/*
       @GetMapping("/getAll")
       public List<Product> getAllProducts() {
           return productServices.getAllProducts();
       }




        @GetMapping
        public int getStock(@RequestParam int productId){

            return   5;

            // System.out.println("Bir istek geldi." + productId);

        }





        @GetMapping("{id}")
        public int test(@PathVariable int id){
            return id;
        }







    @GetMapping("/{id}")
    public int getProductId(@PathVariable int id){
        return id;
    }


 */

      /*

        //product id ye göre tüm ürünlerin liselenmesi
        @GetMapping("/id")
        public List<Product> getIdAllProducts(@RequestParam int id) {
            return productServices.getIdAllProducts(id);
        }
*/






}



