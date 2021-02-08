/**
 * 
 */
package ma.hajar.quiz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author HajarBenBella
 *
 */
@Entity
public class Question {
	@Id
	@GeneratedValue
	private Long idQuestion;
	private String question;
	private Boolean isMultiple;
	
	@ManyToOne
	@JoinColumn(name = "idQuiz")
	private Quiz quiz;
	
	@OneToMany(mappedBy = "question")
	private List<Reponse> reponsesList;

	/**
	 * @return the idQuestion
	 */
	public Long getIdQuestion() {
		return idQuestion;
	}

	/**
	 * @param idQuestion the idQuestion to set
	 */
	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the isMultiple
	 */
	public Boolean getIsMultiple() {
		return isMultiple;
	}

	/**
	 * @param isMultiple the isMultiple to set
	 */
	public void setIsMultiple(Boolean isMultiple) {
		this.isMultiple = isMultiple;
	}

	/**
	 * @return the quiz
	 */
	public Quiz getQuiz() {
		return quiz;
	}

	/**
	 * @param quiz the quiz to set
	 */
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	/**
	 * @return the reponsesList
	 */
	public List<Reponse> getReponsesList() {
		return reponsesList;
	}

	/**
	 * @param reponsesList the reponsesList to set
	 */
	public void setReponsesList(List<Reponse> reponsesList) {
		this.reponsesList = reponsesList;
	}
	
	
}
