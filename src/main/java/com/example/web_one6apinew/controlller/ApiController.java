package com.example.web_one6apinew.controlller;

import com.example.web_one6apinew.model.Produckt;
import com.example.web_one6apinew.repository.ProductReppository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ProductReppository productReppository;

    public ApiController(ProductReppository productReppository) {
        this.productReppository = productReppository;
    }


    @GetMapping("/info")
    public String getInfoApi(){
        return "Данное API предназначено для получения информации о товарах";
    }



    //Получение списка всех товаров
    @GetMapping("/product")
    public List<Produckt> getProduct(){
        System.out.println(productReppository.findAll());
        return productReppository.findAll();

    }

    // Товар по id

    @GetMapping("/product/{id}")
    public Optional<Produckt> getProductID(@PathVariable("id") int id){
        return productReppository.findById(id);

    }


    //Удаление товара
    @GetMapping("/product/delete/{id}")
    public String deleteProductId(@PathVariable("id") int id){
        productReppository.deleteById(id);
        return "Товар удален ! =)";
    }

    //Добавить товар
    @GetMapping("/product/add")
    public String addProduct(@RequestParam("name") String name, @RequestParam("price") float price ){
        Produckt newProduct = new Produckt(name, price);
        productReppository.save(newProduct);
        return "Товар успешно добавлен ! ";
    }












}
