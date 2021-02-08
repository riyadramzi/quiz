package ma.hajar.quiz.repository;

import java.util.List;

import ma.hajar.quiz.domain.Reponse;
import ma.hajar.quiz.domain.Theme;

public interface IReponseRepository {
	public void add(Reponse reponse);
	public void update(Reponse reponse);
	public Theme findOneById(Long id);
	public List<Reponse> list();
	public void delete(Reponse reponse);
}
