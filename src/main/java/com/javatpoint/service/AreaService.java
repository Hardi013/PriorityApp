package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Area;
import com.javatpoint.repository.AreaRepository;

@Service
public class AreaService {
	@Autowired
	AreaRepository areaRepository;

	public Area getAreaById(int id) {
		return areaRepository.findById(id).get();
	}

	public void saveOrUpdate(Area area) {
		areaRepository.save(area);
	}

	// deleting a specific record
	public void delete(int id) {
		areaRepository.deleteById(id);
	}
}