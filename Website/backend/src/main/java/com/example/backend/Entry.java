package com.example.backend;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Date startDate;
	private Date endDate;
	// todo: add created by User

	public Entry(){}
	public Entry(
			String _title,
			Date _startDate,
			Date _endDate) {
		title = _title;
		startDate = _startDate;
		endDate = _endDate;
			}

	// Getter & Setter
	public String getTitle() {
		return title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
}
