package tn.enig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"num"})})
public class Antenne {

	@Id @GeneratedValue
	int id;
	
	@NotBlank(message = "Le nom ne doit pas etre vide")
	@NotNull(message = "Le nom ne doit pas etre null")
	String nom;
	
	@Column(unique = true)
	@NotBlank(message = "Le num ne doit pas etre vide")
	@NotNull(message = "Le num ne doit pas etre null")
	String num;
	
	@NotBlank(message = "La latitude ne doit pas etre vide")
	@NotNull(message = "La latitude ne doit pas etre null")
	Double lat;
	
	@NotBlank(message = "La longitude ne doit pas etre vide")
	@NotNull(message = "La longitude ne doit pas etre null")
	Double lon;
	

}
