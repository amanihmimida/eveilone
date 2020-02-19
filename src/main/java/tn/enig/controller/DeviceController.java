package tn.enig.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.model.Device;
import tn.enig.service.DeviceService;


@RestController
@RequestMapping("/api/device")


public class DeviceController {

	@Autowired
	private DeviceService   deviceService;
	
	@GetMapping(path="/")
	public List<Device> listdevice(){
		return deviceService.listDevice();
	}
	@GetMapping(path="/{id}")
	public Optional<Device> getDeviceById(@PathVariable(value="id") int id) {
		return deviceService.getDeviceById(id);
	}
	
	@PostMapping(path="/")
	public void addDevice(@RequestBody Device d) {
		deviceService.save(d);
	}
	@PutMapping(path="/")
	public void editDevice(Device d) {
		deviceService.save(d);
	}
    
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable(value="id") int id) {
		deviceService.deleteDeviceById(id);
	}
	
}
