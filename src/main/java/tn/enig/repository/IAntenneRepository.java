package tn.enig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Antenne;
import tn.enig.model.Historique;

@Repository
public interface IAntenneRepository extends CrudRepository<Antenne, Integer>{
	public Antenne findByNum(String num);
}
