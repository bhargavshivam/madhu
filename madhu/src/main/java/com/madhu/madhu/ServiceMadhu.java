package com.madhu.madhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMadhu {
    /*@Autowired
	TypeRepo typeRepo;
    @Autowired
	PipeRepo pipeRepo;*/
    @Autowired
    TypePipeRepo tpRepo;
    
	public void save(Combined combo) {
		Pipe pipe=new Pipe();
		pipe.setPipeName(combo.getPipe().getPipeName());
		Type type=new Type();
		type.setTypeName(combo.getType().getTypeName());
		//typeRepo.save(type);
		//pipeRepo.save(pipe);
		TypePipe tp=new TypePipe();
		tp.setPipe(pipe);
		tp.setType(type);
		tpRepo.save(tp);
	}

}
