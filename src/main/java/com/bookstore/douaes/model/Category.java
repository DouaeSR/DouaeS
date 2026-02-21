package com.bookstore.douaes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.ToString.Exclude;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private List<Book> books;
}