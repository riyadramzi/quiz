/**
 * 
 */
package ma.hajar.quiz.service;

import java.util.List;

import ma.hajar.quiz.domain.Quiz;

/**
 * @author HajarBenBelle
 *
 */
public interface IQuizService {
	public void add(Quiz quiz);
	public void update(Quiz quiz);
	public Quiz findOneById(Long id);
	public List<Quiz> list();
	public void delete(Quiz quiz);
}
