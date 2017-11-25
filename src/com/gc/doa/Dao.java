package com.gc.doa;

import java.util.List;
import com.gc.dto.ItemDto;

public interface Dao {

	//add-insert-create
	public void insert(ItemDto item) ;	
	
	//read- list
	public List<ItemDto> listAll();
	
	//update
	public void update(ItemDto item);
	
	//delete
	public void delete(ItemDto item);
	
	
}

