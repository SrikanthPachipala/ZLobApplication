package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;

@Entity
@Table(name = ("PersonTable"))
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String city;

	@Lob
	private SerialClob text;

	@Lob
	private SerialBlob image;

	@Lob
	private SerialBlob video;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SerialClob getDescription() {
		return text;
	}

	public void setDescription(SerialClob clob) {
		this.text = clob;
	}

	public SerialBlob getImage() {
		return image;
	}

	public void setImage(SerialBlob imageBlob) {
		this.image = imageBlob;
	}

	public SerialBlob getVideo() {
		return video;
	}

	public void setVideo(SerialBlob videoBlob) {
		this.video = videoBlob;
	}

}
