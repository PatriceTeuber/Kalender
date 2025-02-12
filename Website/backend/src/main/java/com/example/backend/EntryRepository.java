package com.example.backend;

import org.springframework.data.repository.CrudRepository;
import com.example.backend.Entry;
import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, Long> {
	List<Entry> findAll();
	Entry findById(int id);
}
