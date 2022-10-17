package com.example.tallmicroserviceproduit.web;

import com.example.tallmicroserviceproduit.Entities.Produit;
import com.example.tallmicroserviceproduit.dao.ProduitRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@RestController
@CrossOrigin("*")
public class ProduitRestController {
    private ProduitRepository produitRepository;
    public  ProduitRestController(ProduitRepository produitRepository){
        this.produitRepository=produitRepository;
    }
    @GetMapping("/produits")
    public List<Produit> produits(){
        return  produitRepository.findAll();
    }
    @GetMapping("/produits/{id}")
    public  Produit produit(@PathVariable Long id){
        return  produitRepository.findById(id)
                .orElseThrow(()->
                new RuntimeException(String.format("produit %s not found",id)));

    }
    @DeleteMapping("/produits/{id}")
    public  void delete(@PathVariable Long id){
         produitRepository.deleteById(id);
    }
    @PutMapping("/prodits/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        Produit monproduit=produitRepository.findById(id).orElseThrow();
        if(produit.getCategorie() !=null) monproduit.setCategorie(produit.getCategorie());
        if(produit.getDesigntion() !=null) monproduit.setDesigntion(produit.getDesigntion());
        if (produit.getDescription() !=null) monproduit.setDescription(produit.getDescription());
        if(produit.getPrice() !=0) monproduit.setPrice(produit.getPrice());
        if(produit.getQuantite()!=0) monproduit.setQuantite(produit.getQuantite());
        if(produit.getPhotoProd() !=null) monproduit.setPhotoProd(produit.getPhotoProd());
        return produitRepository.save(monproduit);


    }
    @PostMapping("/saveproduit")
    public Produit saveproduit(@RequestBody Produit produit){
        return produitRepository.save(produit);

    }
     @GetMapping(path="/imageproduit" +
             "/{id}",produces= MediaType.IMAGE_JPEG_VALUE)
	public byte[] image(@PathVariable (name="id")Long id) throws Exception{

		Produit p=produitRepository
                .findById(id).get();
		String photoName= p.getPhotoProd();
		File file=new File(System.getProperty("user.home")+
				"/produit/images/"+photoName);
		Path path= Paths.get(file.toURI());
		return Files.readAllBytes(path);

	}


}
