package com.example.SampleDatabasePractice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;
    @Column(name = "detailed_comment")
    private String comment;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "comment")
    @JsonBackReference
    private Receipe receipe;
}
