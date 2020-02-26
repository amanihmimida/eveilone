package tn.enig.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.model.Antenne;

import tn.enig.repository.IAntenneRepository;


@Service
public class AntenneService {
	@Autowired
	private IAntenneRepository antenneRepository;
	
public void save(Antenne antenne) {
		antenneRepository.save(antenne);

	}
public List<Antenne> listAntenne() {
 return (List<Antenne>) antenneRepository.findAll();
	
}

public Optional<Antenne> getAntenneById(int idAntenne) {
	return antenneRepository.findById(idAntenne);
}
public void deletAntenneById (int idAntenne) {
	antenneRepository.deleteById(idAntenne);
}
}