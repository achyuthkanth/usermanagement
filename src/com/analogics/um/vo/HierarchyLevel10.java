package com.analogics.um.vo;

/**
 * HierarchyLevel10 entity. @author MyEclipse Persistence Tools
 */

public class HierarchyLevel10 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5263694147464632380L;
	// Fields

	private String level10Uniquecode;
	private Integer level10Id;
	private String level10Name;
	private String level10Code;
	private Integer level9Id;

	// Constructors

	/** default constructor */
	public HierarchyLevel10() {
	}

	/** minimal constructor */
	public HierarchyLevel10(String level10Uniquecode, Integer level10Id) {
		this.level10Uniquecode = level10Uniquecode;
		this.level10Id = level10Id;
	}

	/** full constructor */
	public HierarchyLevel10(String level10Uniquecode, Integer level10Id,
			String level10Name, String level10Code, Integer level9Id) {
		this.level10Uniquecode = level10Uniquecode;
		this.level10Id = level10Id;
		this.level10Name = level10Name;
		this.level10Code = level10Code;
		this.level9Id = level9Id;
	}

	// Property accessors

	public String getLevel10Uniquecode() {
		return this.level10Uniquecode;
	}

	public void setLevel10Uniquecode(String level10Uniquecode) {
		this.level10Uniquecode = level10Uniquecode;
	}

	public Integer getLevel10Id() {
		return this.level10Id;
	}

	public void setLevel10Id(Integer level10Id) {
		this.level10Id = level10Id;
	}

	public String getLevel10Name() {
		return this.level10Name;
	}

	public void setLevel10Name(String level10Name) {
		this.level10Name = level10Name;
	}

	public String getLevel10Code() {
		return this.level10Code;
	}

	public void setLevel10Code(String level10Code) {
		this.level10Code = level10Code;
	}

	public Integer getLevel9Id() {
		return this.level9Id;
	}

	public void setLevel9Id(Integer level9Id) {
		this.level9Id = level9Id;
	}

}