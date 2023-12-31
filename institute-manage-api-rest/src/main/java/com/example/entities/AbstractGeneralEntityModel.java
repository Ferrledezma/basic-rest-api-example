package com.example.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
@Getter
public abstract class AbstractGeneralEntityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
