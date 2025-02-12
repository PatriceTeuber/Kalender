package com.example.backend;

import com.example.backend.EntryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {
	@Autowired
	private EntryRepository repository;

	public List<Entry> getAllEntries() {
		return repository.findAll();
	}

	public Entry saveEntry(Entry entry) {
		return repository.save(entry);
	}

	public Entry getEntryById(int id) {
		return repository.findById(id);
	}
}
