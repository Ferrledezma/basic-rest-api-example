package com.example.demo.social_network.mapper.dto_mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.social_network.dto.user.UserDTOGet;
import com.example.demo.social_network.entities.UserEntity;

@Component
public class UserDTOMapper implements DTOMapperInterface<UserEntity, UserDTOGet> {
	
	@Override
	public UserDTOGet apply(UserEntity user) {
		List<String> userNames = user.getFriendUsers()
				.stream()
				.map(friendlyUser -> friendlyUser.getUserIdentifier())
				.toList();
		
		List<String> publicationTitles = user.getPublications()
				.stream()
				.map(publication -> publication.getTitle())
				.toList();
		
		return new UserDTOGet(
				user.getUserIdentifier(),
				user.getUserName(),
				user.getFriendUsers().size(),
				userNames,
				user.getPublications().size(),
				publicationTitles
				);
	}

}
