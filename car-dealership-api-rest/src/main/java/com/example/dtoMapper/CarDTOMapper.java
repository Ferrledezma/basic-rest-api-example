package com.example.dtoMapper;

import java.util.Objects;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.example.dto.dtoCar.CarDTOGet;
import com.example.entities.Car;

@Component
public class CarDTOMapper implements Function<Car, CarDTOGet> {

	@Override
	public CarDTOGet apply(Car car) {
		String concecionariaName = null;
		if(!Objects.isNull(car.getConcesionaria())) {
			concecionariaName = car.getConcesionaria().getName();
		}
		return new CarDTOGet(
				car.getBrand(),
				car.getModel(),
				car.getMatricula(),
				car.getLicense(),
				car.getSeguro(),
				car.getRto(),
				concecionariaName,
				null
				);
	}

}
