package com.clientui.proxies;

import com.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "microservice-produits", url = "localhost:9901")
public interface MicroserviceProduitsProxy {

@GetMapping(value = "/Produits")
List<ProductBean> listeDesProduits();

@GetMapping( value = "/Produits/{id}")
ProductBean recupererUnProduit(@PathVariable("id") int id);

}