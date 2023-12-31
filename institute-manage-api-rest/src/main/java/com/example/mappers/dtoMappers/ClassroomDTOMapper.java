package com.example.mappers.dtoMappers;

import org.springframework.stereotype.Component;

import com.example.dto.aula.ClassroomDTOGet;
import com.example.entities.ClassroomEntity;

@Component
public class ClassroomDTOMapper implements DTOMapperInterface<ClassroomEntity, ClassroomDTOGet> {

	@Override
	public ClassroomDTOGet apply(ClassroomEntity classroom) {
		ClassroomDTOGet classroomDTOGet = new ClassroomDTOGet(
				classroom.getInstitute().getName(),
				classroom.getClassroomNumber(),
				classroom.getTeachers().size(),
				classroom.getStudents().size()
				);
		return classroomDTOGet;
	}

}
