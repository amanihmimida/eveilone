package tn.enig.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.model.Device;
import tn.enig.repository.IDeviceRepository;


@Service
public class DeviceService {
	@Autowired
	private IDeviceRepository deviceRepository;
	
	public void save(Device device) {
		deviceRepository.save(device);

	}
public List<Device> listDevice() {
 return (List<Device>) deviceRepository.findAll();
	
}

public Optional<Device> getDeviceById(int idDevice) {
	return deviceRepository.findById(idDevice);
}
public Device getByNum(String numDevice) throws Exception {
	try {
		return deviceRepository.findByNum(numDevice);
	} catch (Exception e) {
		throw new Exception("Pas de device avec le num "+numDevice);
	}
	
}
public void deleteDeviceById (int idDevice) {
	deviceRepository.deleteById(idDevice);
}
}

