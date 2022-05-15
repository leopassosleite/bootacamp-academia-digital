package com.llsoft.academia.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_stats")
public class Stats implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double Weight;
	private Double Height;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Student client;

	public Stats() {
	}

	public Stats(Long id, Double weight, Double height) {
		this.id = id;
		Weight = weight;
		Height = height;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public Double getHeight() {
		return Height;
	}

	public void setHeight(Double height) {
		Height = height;
	}

	public Student getClient() {
		return client;
	}

	public void setClient(Student client) {
		this.client = client;
	}
}
