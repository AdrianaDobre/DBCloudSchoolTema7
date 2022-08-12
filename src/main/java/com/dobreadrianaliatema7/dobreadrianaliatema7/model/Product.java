package com.dobreadrianaliatema7.dobreadrianaliatema7.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String code;

    @NotNull
    private Category category;

    @NotNull
    private Integer stock;

    @Column(nullable = false)
    private boolean deleted;
}
