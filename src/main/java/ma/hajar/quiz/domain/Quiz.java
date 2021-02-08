package ma.hajar.quiz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author HajarBenBella
 *
 */
@Entity
public class Quiz {
	@Id
	@GeneratedValue
	private Long idQuiz;
	private String titreQuiz;
	private String description;
	
	
	@ManyToMany
	@JoinTable(name = "theme_quiz", joinColumns = @JoinColumn(name = "idTheme"), inverseJoinColumns = @JoinColumn(name = "idQuiz"))
	private List<Theme> themeslist;
	
	
	@OneToMany(mappedBy = "quiz")
	private List<Question> questionsList;


	/**
	 * @return the idQuiz
	 */
	public Long getIdQuiz() {
		return idQuiz;
	}


	/**
	 * @param idQuiz the idQuiz to set
	 */
	public void setIdQuiz(Long idQuiz) {
		this.idQuiz = idQuiz;
	}


	/**
	 * @return the titreQuiz
	 */
	public String getTitreQuiz() {
		return titreQuiz;
	}


	/**
	 * @param titreQuiz the titreQuiz to set
	 */
	public void setTitreQuiz(String titreQuiz) {
		this.titreQuiz = titreQuiz;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the themeslist
	 */
	public List<Theme> getThemeslist() {
		return themeslist;
	}


	/**
	 * @param themeslist the themeslist to set
	 */
	public void setThemeslist(List<Theme> themeslist) {
		this.themeslist = themeslist;
	}


	/**
	 * @return the questionsList
	 */
	public List<Question> getQuestionsList() {
		return questionsList;
	}


	/**
	 * @param questionsList the questionsList to set
	 */
	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}
	
	
}
