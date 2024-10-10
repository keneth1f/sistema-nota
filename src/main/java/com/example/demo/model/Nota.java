package com.example.demo.model;


@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estudiante;
    private int actividades;
    private int primerParcial;
    private int segundoParcial;
    private int examenFinal;
    
    // Getters, setters, constructor vacío y con parámetros
}