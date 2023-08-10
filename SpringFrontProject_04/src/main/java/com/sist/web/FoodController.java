package com.sist.web;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.dao.*;
import com.sist.vo.*;
@Controller
public class FoodController {
	@GetMapping("food/food.do")
	public String music_main()
	{
		
		return "food/food";
	}
}
