package com.RedCarpetUp.Entity;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	private Integer stuId;
	
	private String  name;
	
	private Integer rollNo;
	
	private Integer marks;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Adderess address;
	
}
