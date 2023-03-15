package com.example.SampleDatabasePractice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_receipe")
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer receipe_id;
    @Column(name = "receipe_name")
    private String name;
    @Column(name = "receipe_ingredients")
    private String ingredients;
    @Column(name = "receipe_instructions")
    private String instructions;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="comment_id",referencedColumnName = "commentId")
    @JsonManagedReference
    private Comment comment;

}
