/**
 * 
 */
package ma.hajar.quiz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.hajar.quiz.domain.Theme;
import ma.hajar.quiz.repositoryImpl.ThemeRepository;
import ma.hajar.quiz.service.IThemeService;

/**
 * @author HajarBenBella
 *
 */
@Service
public class ThemeService implements IThemeService {
	
	@Autowired
	ThemeRepository themeRepository;

	@Override
	public void add(Theme theme) {
		themeRepository.add(theme);
		
	}

	@Override
	public void update(Theme theme) {
		themeRepository.update(theme);
		
	}

	@Override
	public Theme findOneById(Long id) {
		return themeRepository.findOneById(id);
	}

	@Override
	public List<Theme> list() {
		return themeRepository.list();
	}

	@Override
	public void delete(Theme theme) {
		themeRepository.delete(theme);
		
	}

}
