package tn.enig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Antenne;

@Repository
public interface IAntenneRepository extends CrudRepository<Antenne, Integer>{

}
