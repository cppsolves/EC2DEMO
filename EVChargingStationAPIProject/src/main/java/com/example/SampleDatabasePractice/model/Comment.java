package com.example.SampleDatabasePractice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "comment can't be null")
    @Size(min = 10,max = 255,message = "comment must be between 10 to 255 character")
    private String comment;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "comment")
    @JsonBackReference
    private Receipe receipe;
}
