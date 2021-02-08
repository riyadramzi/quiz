package ma.hajar.quiz.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.hajar.quiz.domain.Theme;

@Repository
public interface ThemeJpaRepository extends JpaRepository<Theme, Long> {
	
}
