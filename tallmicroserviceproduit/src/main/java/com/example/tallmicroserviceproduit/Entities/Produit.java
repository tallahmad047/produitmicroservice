package com.example.tallmicroserviceproduit.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data@Entity
@ToString
public class Produit implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  designtion;
    private double  price;
    private int quantite;
    private String description;
    private String photoProd;
    private String categorie;

}
