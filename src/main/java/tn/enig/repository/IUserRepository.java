package tn.enig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {

}
