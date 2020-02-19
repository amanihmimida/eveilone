package tn.enig.model;

import javax.persistence.*;

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
public class Historique {

	@Id @GeneratedValue
	int id;
	@ManyToOne @JoinColumn(name="Antenne_id")
	Antenne antenne;
	Double temperature;
	Double humidite;
	@ManyToOne @JoinColumn(name="Device_id")
	Device device;
}
