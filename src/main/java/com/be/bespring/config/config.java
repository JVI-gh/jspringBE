package com.be.bespring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.be.bespring.util.Hardware;

@Configuration
public class config {

	@Bean
	public List<Hardware> get_hardware() {
		List<Hardware> hardware = new ArrayList();
		Hardware h0 = new Hardware(0, "GTX 1060", 325.19, 1000);
		Hardware h1 = new Hardware(1, "RTX 4060", 899.50, 700);
		Hardware h2 = new Hardware(2, "RTX 4070", 1199.99, 500);
		Hardware h3 = new Hardware(3, "RTX 4080", 1499.99, 300);
		Hardware h4 = new Hardware(4, "RTX 4090", 1799.99, 100);
		Hardware h5 = new Hardware(5, "SSD 1TB", 159.99, 300);
		Hardware h6 = new Hardware(6, "SSD 2TB", 209.99, 300);
		Hardware h7 = new Hardware(7, "Intel i-9 13900KF", 729.00, 100);
		Hardware h8 = new Hardware(8, "Intel i-9 12900KF", 609.01, 300);
		Hardware h9 = new Hardware(9, "Intel i-9 11900KF", 729.00, 300);
		hardware.add(h0);
		hardware.add(h1);
		hardware.add(h2);
		hardware.add(h3);
		hardware.add(h4);
		hardware.add(h5);
		hardware.add(h6);
		hardware.add(h7);
		hardware.add(h8);
		hardware.add(h9);

		return hardware;
	}
}
