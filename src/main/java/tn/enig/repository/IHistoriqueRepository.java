package tn.enig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Historique;
@Repository
public interface IHistoriqueRepository extends CrudRepository<Historique, Integer>{
}
