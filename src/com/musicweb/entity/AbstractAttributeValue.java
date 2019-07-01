package com.musicweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAttributeValue entity provides the base persistence definition of the
 * AttributeValue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttributeValue implements java.io.Serializable {

	// Fields

	private Integer attributeId;
	private String attributeName;
	private Set musics = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAttributeValue() {
	}

	/** minimal constructor */
	public AbstractAttributeValue(String attributeName) {
		this.attributeName = attributeName;
	}

	/** full constructor */
	public AbstractAttributeValue(String attributeName, Set musics) {
		this.attributeName = attributeName;
		this.musics = musics;
	}

	// Property accessors

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public Set getMusics() {
		return this.musics;
	}

	public void setMusics(Set musics) {
		this.musics = musics;
	}

}