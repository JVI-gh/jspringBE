package com.be.bespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.bespring.util.Hardware;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/hardware")
public class Controller {

	@Autowired
	List<Hardware> hardware;

	@GetMapping("/hardware_list")
	public List<Hardware> get_hardware() {
		return hardware;
	}

	@PostMapping("/add_hardware")
	public int add_hardware(@RequestBody Hardware h) {
		hardware.add(h);
		return 0;
	}

	@GetMapping("/edit/{id_hardware}")
	public Hardware showById(@PathVariable("id_hardware") int id_hardware) {
		for (Hardware component : hardware) {
			if (component.getId() == id_hardware) {
				return component;
			}
		}
		return null;
	}

	@PutMapping("/{id_hardware}")
	public Hardware edit(@RequestBody Hardware h, @PathVariable("id_hardware") int id_hardware) {
		for (Hardware component : hardware) {
			System.out.println();
			if (component.getId() == id_hardware) {
				component.setName(h.getName());
				component.setPrice(h.getPrice());
				component.setStock(h.getStock());
			}
		}
		return h;
	}

	@DeleteMapping("/{id_hardware}")
	public int remove_hardware(@PathVariable("id_hardware") int id_hardware) {
		boolean ok = false;
		for (Hardware component : hardware) {
			if (component.getId() == id_hardware) {
				ok = true;
				this.hardware.remove(component);
			}
		}
		if (ok)
			return 0;
		else
			return -1;
	}
}
