package com.example.backend;

import com.example.backend.EntryService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entries")
//@CrossOrigin(origins = "http://localhost:4200") // Erlaubt Angular-Anfragen
public class EntryController {
    private final EntryService entryService;

    public EntryController(EntryService _entryService) {
        entryService = _entryService;
    }

    @GetMapping
    public List<Entry> getEntrys() {
        return entryService.getAllEntries();
    }

    @PostMapping
    public Entry createEntry(@RequestBody Entry entry) {
        return entryService.saveEntry(entry);
    }

		@GetMapping("/{id}")
		public Entry getEntry(@PathVariable int id) {
				return entryService.getEntryById(id);
		}
}
