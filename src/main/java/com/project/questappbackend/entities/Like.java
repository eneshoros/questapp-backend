package com.project.questappbackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "p_like")
@Getter
@Setter
public class Like {

    @Id
    Long id;
    Long postId;
    Long userId;
}
