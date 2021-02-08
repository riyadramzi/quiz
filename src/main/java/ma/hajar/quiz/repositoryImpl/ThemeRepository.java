package ma.hajar.quiz.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.hajar.quiz.domain.Theme;
import ma.hajar.quiz.jparepository.ThemeJpaRepository;
import ma.hajar.quiz.repository.IThemeRepository;

@Service
public class ThemeRepository implements IThemeRepository {

	@Autowired
	ThemeJpaRepository themeJpaRepository;
	
	@Override
	public void add(Theme theme) {
		themeJpaRepository.save(theme);
	}

	@Override
	public void update(Theme theme) {
		themeJpaRepository.save(theme);
	}

	@Override
	public Theme findOneById(Long id) {
		Optional<Theme> theme = themeJpaRepository.findById(id);
		if(theme.isPresent()) {
			return theme.get();
		}
		return null;
	}

	@Override
	public List<Theme> list() {
		return themeJpaRepository.findAll();
	}

	@Override
	public void delete(Theme theme) {
		themeJpaRepository.delete(theme);
	}

}
