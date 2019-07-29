package co.grandcircus.LAB215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DistanceCalcController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showAddResult(@RequestParam("mpg") double mpg, @RequestParam("gallons") double gallons) {

		double result = Math.round((gallons * mpg) * 100.0) / 100.0;

		ModelAndView mav = new ModelAndView("mileage-result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		return mav;
	}

}
