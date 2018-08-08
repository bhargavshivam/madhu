package com.madhu.madhu;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class TypePipe {
    @Id
    @GeneratedValue
	private Integer TpId;
   
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="typeId")
    private Type type;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pipeId")
    private Pipe pipe;

	public Integer getTpId() {
		return TpId;
	}

	public void setTpId(Integer tpId) {
		TpId = tpId;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Pipe getPipe() {
		return pipe;
	}

	public void setPipe(Pipe pipe) {
		this.pipe = pipe;
	}
    
    
    
}
