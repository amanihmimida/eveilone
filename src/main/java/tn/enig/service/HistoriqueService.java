package tn.enig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.model.Historique;

import tn.enig.repository.IHistoriqueRepository;
import java.util.List;
import java.util.Optional;

@Service
public class HistoriqueService {
	
	@Autowired
	private IHistoriqueRepository historiqueRepository ;
	
	public void save(Historique historique) {
		historiqueRepository .save(historique);
		
	}
	public List<Historique> listHistorique() {
	 return (List<Historique>) historiqueRepository.findAll();
		
	}
	
	public Optional<Historique> getHistoriqueById(int idHistorique) {
		return historiqueRepository.findById(idHistorique);
	}
	public void deleteHisoriqueById (int idHistorique) {
		historiqueRepository.deleteById(idHistorique);
	}
}
