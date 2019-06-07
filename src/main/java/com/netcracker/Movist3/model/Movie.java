package com.netcracker.Movist3.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="movies")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="title", nullable = false)
    private String title;

    @Column (name="url", nullable = false)
    private String url;

    @Column (name="description", nullable = false)
    private String description;

    @Column (name="poster", nullable = false)
    private String poster;
}
