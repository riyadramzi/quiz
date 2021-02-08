/**
 * 
 */
package ma.hajar.quiz.service;

import java.util.List;

import ma.hajar.quiz.domain.Theme;

/**
 * @author HajarBenBella
 *
 */
public interface IThemeService {
	public void addTheme(Theme theme);
	public void updateTheme(Theme theme);
	public Theme findOneById(Long idTheme);
	public List<Theme> listTheme();
	public void deleteTheme(Theme theme);
}
