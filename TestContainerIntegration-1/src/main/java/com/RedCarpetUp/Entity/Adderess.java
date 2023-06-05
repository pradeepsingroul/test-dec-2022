package com.RedCarpetUp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adderess {

	@Id
	private Integer addressId;
	
	private String city;
	
	private String districk;
	
	private Long pincode;
}
