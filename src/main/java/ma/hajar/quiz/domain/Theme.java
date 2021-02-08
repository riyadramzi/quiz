/**
 * 
 */
package ma.hajar.quiz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


/**
 * @author HajarBenBella
 *
 */
@Entity
public class Theme {
	@Id
	@GeneratedValue
	private Long idTheme;
	private String nomTheme;
	
	@ManyToMany
	@JoinTable(name = "theme_quiz", joinColumns = @JoinColumn(name = "idTheme"), inverseJoinColumns = @JoinColumn(name = "idQuiz"))
	private List<Quiz> quizList;

	/**
	 * @return the idTheme
	 */
	public Long getIdTheme() {
		return idTheme;
	}

	/**
	 * @param idTheme the idTheme to set
	 */
	public void setIdTheme(Long idTheme) {
		this.idTheme = idTheme;
	}

	/**
	 * @return the nomTheme
	 */
	public String getNomTheme() {
		return nomTheme;
	}

	/**
	 * @param nomTheme the nomTheme to set
	 */
	public void setNomTheme(String nomTheme) {
		this.nomTheme = nomTheme;
	}

	/**
	 * @return the quizList
	 */
	public List<Quiz> getQuizList() {
		return quizList;
	}

	/**
	 * @param quizList the quizList to set
	 */
	public void setQuizList(List<Quiz> quizList) {
		this.quizList = quizList;
	}
	
	
	
	
}
