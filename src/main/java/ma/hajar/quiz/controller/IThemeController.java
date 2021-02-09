package ma.hajar.quiz.controller;

import java.util.List;

import ma.hajar.quiz.domain.Theme;

public interface IThemeController {
	public void add(Theme theme);
	public List<Theme> list();
}
