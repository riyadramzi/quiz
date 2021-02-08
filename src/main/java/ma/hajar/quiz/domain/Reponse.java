/**
 * 
 */
package ma.hajar.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author HajarBenBella
 *
 */
@Entity
public class Reponse {
	@Id
	@GeneratedValue
	private Long idReponse;
	private String reponse;
	private Boolean isTrue = false;
	
	@ManyToOne
	@JoinColumn(name = "idQuestion")
	private Question question;

	/**
	 * @return the idReponse
	 */
	public Long getIdReponse() {
		return idReponse;
	}

	/**
	 * @param idReponse the idReponse to set
	 */
	public void setIdReponse(Long idReponse) {
		this.idReponse = idReponse;
	}

	/**
	 * @return the reponse
	 */
	public String getReponse() {
		return reponse;
	}

	/**
	 * @param reponse the reponse to set
	 */
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	/**
	 * @return the isTrue
	 */
	public Boolean getIsTrue() {
		return isTrue;
	}

	/**
	 * @param isTrue the isTrue to set
	 */
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
