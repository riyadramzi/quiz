/**
 * 
 */
package ma.hajar.quiz.service;

import java.util.List;

import ma.hajar.quiz.domain.Question;
import ma.hajar.quiz.domain.Quiz;

/**
 * @author HajarBenBella
 *
 */
public interface IQuestionService {
	public void add(Question question);
	public void update(Question question);
	public Quiz findOneById(Long id);
	public List<Question> list();
	public void delete(Question question);
}
