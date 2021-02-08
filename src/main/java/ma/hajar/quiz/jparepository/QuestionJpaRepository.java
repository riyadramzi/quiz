package ma.hajar.quiz.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.hajar.quiz.domain.Question;

@Repository
public interface QuestionJpaRepository extends JpaRepository<Question, Long> {

}
