package com.madhu.madhu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pipe {
	
	@Id
    @GeneratedValue
	private Integer pipeId;
	private String pipeName;
	
	@OneToMany(mappedBy="pipe",cascade=CascadeType.ALL)
	private List<TypePipe> tp;
	
	
	
	public List<TypePipe> getTp() {
		return tp;
	}
	public void setTp(List<TypePipe> tp) {
		this.tp = tp;
	}
	public Integer getPipeId() {
		return pipeId;
	}
	public void setPipeId(Integer pipeId) {
		this.pipeId = pipeId;
	}
	public String getPipeName() {
		return pipeName;
	}
	public void setPipeName(String pipeName) {
		this.pipeName = pipeName;
	}
	
	
}
