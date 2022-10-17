package com.example.tallmicroserviceproduit.dao;

import com.example.tallmicroserviceproduit.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
