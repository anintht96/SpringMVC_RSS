package spring.mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.model.RSSMessage;
import spring.mvc.rss.RSSFeedViewer;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public ModelAndView getFeedInRss() {
		List<RSSMessage> items=new ArrayList<RSSMessage>();
		
		RSSMessage content=new RSSMessage();
		content.setTitle("Spring.");
		content.setUrl("https://newzing.com");
		content.setSummary("Spring tutorial");
		content.setCreatedDate(new Date());
		items.add(content);
		
		RSSMessage content2=new RSSMessage();
		content2.setTitle("Hibernate");
		content2.setUrl("https://nezing.com");
		content2.setCreatedDate(new Date());
		content2.setSummary("Spring tutorial");
		items.add(content2);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("rssViewer");
		modelAndView.addObject(RSSFeedViewer.FEED_CONTENT, items);
		
		return modelAndView;
	}
}
