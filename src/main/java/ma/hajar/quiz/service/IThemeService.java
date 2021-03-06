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
	public void add(Theme theme);
	public void update(Theme theme);
	public Theme findOneById(Long id);
	public List<Theme> list();
	public void delete(Theme theme);
}
