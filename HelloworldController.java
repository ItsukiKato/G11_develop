package com.example.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {

	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> years = new ArrayList<>();
	ArrayList<Integer> months = new ArrayList<>();
	ArrayList<Integer> days = new ArrayList<>();
	ArrayList<Data1> datas = new ArrayList<>();
	Map<Integer,String> out = new HashMap<>();
	
  @GetMapping("/before_conect_java")
  private String postMessage(){
    return "before_conect_java";
  }

  @PostMapping(value = "/before_conect_java")
  private String confirmMessage(@RequestParam(name = "mess")String mess, @RequestParam(name = "year")String year, @RequestParam(name = "month")String month, @RequestParam(name = "day")String day, Model model){
	 //names.add(mess);
	 int nyear = Integer.parseInt(year);
	 //years.add(nyear);
	 int nmonth = Integer.parseInt(month);
	 //years.add(nmonth);
	 int nday = Integer.parseInt(day);
	 //years.add(nday);
	 
	 GregorianCalendar gcalendar = new GregorianCalendar();
     
     int current_day2 = gcalendar.get(Calendar.DAY_OF_YEAR);
     
     int weight = Weighting.weighting(mess, nday, nmonth, nyear, current_day2);
     
     Data1 ndata = new Data1(mess, nday, nmonth, nyear, weight);
     datas.add(ndata);
     
     out.put(weight, mess);
     
     int[] tem = new int[datas.size()];
     for(int i  = 0; i < datas.size(); i++) {
    	 tem[i] = datas.get(i).getWeight();
     }
     
     QuickSort.quick_sort(tem, 0, (datas.size() - 1));
     
     for(int i = 0; i < tem.length; i++) {
    	 String temstr = out.get(weight);
    	 for(Data1 d : datas) {
    		 if(d.getName() == temstr) {
    			 names.add(d.getName());
    			 days.add(d.getEndDay());
    			 months.add(d.getEndMonth());
    			 years.add(d.getEndYear());
    		 }
    	 }
     }
     
     Lists list = new Lists(names, years, months, days);
     model.addAttribute("sn", list);
     
    //model.addAttribute("mess1", mess);
    return "before_conect_java";
  }
}
