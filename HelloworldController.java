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
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloworldController {

	ArrayList<Data1> datas = new ArrayList<>();
	Map<Integer,String> out = new HashMap<>();
	ArrayList<Data1> sortedlist = new ArrayList<>();
	
  @GetMapping(value = {"/post_message"})
  private String postMessage(){
    return "post_message";
  }

  @PostMapping("/result")
  private String confirmMessage(@RequestParam(name = "mess", required = false, defaultValue = "テスト")String mess, 
		  @RequestParam(name = "year", required = false, defaultValue = "2022")String year, 
		  @RequestParam(name = "month", required = false, defaultValue = "12")String month, 
		  @RequestParam(name = "day", required = false, defaultValue = "24")String day, 
		  Model model){
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
     
     sortedlist.clear();
     for(int i = 0; i < tem.length; i++) {
    	 String temstr = out.get(tem[i]);
    	 for(Data1 d : datas) {
    		 if(d.getName() == temstr) {
    			 sortedlist.add(d);
    		 }
    	 }
     }
     
    return "/post_message.html";
  }
  
  @PostMapping("/result2")
  private String result(Model model) {
	  model.addAttribute("sn", sortedlist);
	  return "/confirm_message.html";
  }
}
