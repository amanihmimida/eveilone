package tn.enig.model;

import javax.persistence.GeneratedValue;

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
public class User {
	@Id @GeneratedValue
	int id;
	String nom;
	String prenom;
	String mail;
	String mdp;
}
