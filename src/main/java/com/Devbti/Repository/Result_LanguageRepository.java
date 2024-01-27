package com.Devbti.Repository;

import com.Devbti.Entity.Result_Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Result_LanguageRepository extends JpaRepository<Result_Language, Integer> {
}
