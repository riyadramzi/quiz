package ma.hajar.quiz.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.hajar.quiz.domain.Quiz;

@Repository
public interface QuizJpaRepository extends JpaRepository<Quiz, Long> {

}
