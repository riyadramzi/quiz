package ma.hajar.quiz.repository;

import java.util.List;

import ma.hajar.quiz.domain.Theme;

public interface IThemeRepository {
	public void add(Theme theme);
	public void update(Theme theme);
	public Theme findOneById(Long id);
	public List<Theme> list();
	public void delete(Theme theme);
}
