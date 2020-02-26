package tn.enig.model;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"mail"})})
public class User {
	@Id @GeneratedValue
	int id;
	
	@NotBlank(message = "Le nom ne doit pas etre vide")
	@NotNull(message = "Le nom ne doit pas etre null")
	String nom;
	
	@NotBlank(message = "Le prenom ne doit pas etre vide")
	@NotNull(message = "Le prenom ne doit pas etre null")
	String prenom;
	
	@Column(unique = true)
	@NotBlank(message = "L'email ne doit pas etre vide")
	@NotNull(message = "L'email ne doit pas etre null")
	@Email(message = "Le format de l'email n'est pas valide")
	String mail;
	
	@NotBlank(message = "Le mot de passe ne doit pas etre vide")
	@NotNull(message = "Le mot de passe ne doit pas etre nom")
	@Min(value = 6, message = "Le mot de passe doit avoir au minimum 6 caracteres")
	@Max(value = 60, message = "Le mot de passe doit avoir au maximum 60 caracteres")
	String mdp;
}
