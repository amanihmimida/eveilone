package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

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
public class Device {
	
@Id @GeneratedValue	
 int id;
 int num;
 String nom;
 String cle;
}
