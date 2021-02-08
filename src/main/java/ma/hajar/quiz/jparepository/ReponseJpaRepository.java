package ma.hajar.quiz.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.hajar.quiz.domain.Reponse;

@Repository
public interface ReponseJpaRepository extends JpaRepository<Reponse, Long> {

}
