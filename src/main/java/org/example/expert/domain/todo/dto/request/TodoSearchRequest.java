package org.example.expert.domain.todo.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoSearchRequest {
	private String title;
	private String managerNickname;
}
