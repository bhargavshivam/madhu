package com.madhu.madhu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type {
    @Id
    @GeneratedValue
	private Integer typeId;
	private String typeName;
	
	@OneToMany(mappedBy="type",cascade=CascadeType.ALL)
	private List<TypePipe> tp;
	
	
	public List<TypePipe> getTp() {
		return tp;
	}
	public void setTp(List<TypePipe> tp) {
		this.tp = tp;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
