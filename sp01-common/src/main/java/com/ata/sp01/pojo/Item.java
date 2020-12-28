package com.ata.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private Integer id; //用户id
	private String name; //名字
	private Integer number; 
	
}
