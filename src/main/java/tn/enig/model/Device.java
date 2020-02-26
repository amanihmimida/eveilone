package tn.enig.model;

import javax.persistence.*;
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
public class Device {
	
@Id @GeneratedValue	
 int id;

@Column(unique = true)
@NotBlank(message = "Le num ne doit pas etre vide")
@NotNull(message = "Le num ne doit pas etre null")
 int num;

@NotBlank(message = "Le nom ne doit pas etre vide")
@NotNull(message = "Le nom ne doit pas etre null")
 String nom;
@NotBlank(message = "La cle ne doit pas etre vide")
@NotNull(message = "La cle ne doit pas etre null")
 String cle;
}
