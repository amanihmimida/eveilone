package tn.enig.model;

import java.util.Date;

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
@Setter
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Historique {

	@Id @GeneratedValue
	int id;
	
	public Historique() {
		createdAt = new Date();
	}
	
	@ManyToOne @JoinColumn(name="Antenne_id")
	Antenne antenne;
	
	@NotBlank(message = "La temperature ne doit pas etre vide")
	@NotNull(message = "La temperature ne doit pas etre null")
	Double temperature;
	
	@NotBlank(message = "L'humidité ne doit pas etre vide")
	@NotNull(message = "L'humidité ne doit pas etre null")
	Double humidite;
	
	Date createdAt;
	
	@ManyToOne @JoinColumn(name="Device_id")
	Device device;
	
}
