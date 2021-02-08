package ma.hajar.quiz.repository;

import java.util.List;

import ma.hajar.quiz.domain.Question;
import ma.hajar.quiz.domain.Quiz;

public interface IQuestionRepository {
	public void add(Question question);
	public void update(Question question);
	public Quiz findOneById(Long id);
	public List<Question> list();
	public void delete(Question question);
}