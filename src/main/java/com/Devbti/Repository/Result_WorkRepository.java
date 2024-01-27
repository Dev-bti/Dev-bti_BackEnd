package com.Devbti.Repository;

import com.Devbti.Entity.Result_Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Result_WorkRepository extends JpaRepository<Result_Work, Integer> {
}
