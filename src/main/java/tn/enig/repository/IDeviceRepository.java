package tn.enig.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Device;

@Repository
public interface IDeviceRepository extends CrudRepository<Device, Integer>{
 public Device findByNum(String num) ;
}
