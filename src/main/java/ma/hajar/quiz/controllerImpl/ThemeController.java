package ma.hajar.quiz.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.hajar.quiz.controller.IThemeController;
import ma.hajar.quiz.domain.Theme;
import ma.hajar.quiz.serviceImpl.ThemeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/theme")
public class ThemeController implements IThemeController {

	@Autowired
	ThemeService themeService;
	
	@Override
	@PostMapping("/add")
	public void add(@RequestBody Theme theme) {
		themeService.add(theme);

	}

	@Override
	@GetMapping("/list")
	public List<Theme> list() {
		return themeService.list();
	}

}
