package com.madhu.madhu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePipeRepo extends JpaRepository<TypePipe, Integer> {

}