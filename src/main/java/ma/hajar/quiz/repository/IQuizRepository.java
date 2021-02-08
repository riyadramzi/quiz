package ma.hajar.quiz.repository;

import java.util.List;

import ma.hajar.quiz.domain.Quiz;

public interface IQuizRepository {
	public void add(Quiz quiz);
	public void update(Quiz quiz);
	public Quiz findOneById(Long id);
	public List<Quiz> list();
	public void delete(Quiz quiz);
}
