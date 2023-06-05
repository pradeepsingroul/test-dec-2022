package com.RedCarpetUp.Exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrotDetails {
	
	private String desc;
	
	private String message;
	
	private LocalDateTime dateStamp;

}
