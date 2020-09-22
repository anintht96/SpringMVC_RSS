package spring.mvc.rss;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;

import spring.mvc.model.RSSMessage;

public class RSSFeedViewer extends AbstractRssFeedView{

	public static String FEED_CONTENT="feedContent";
	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {
		feed.setTitle("Java tutorial RSS");
		feed.setDescription("Java AASASASAS");
		feed.setLink("https://www.vnexpress.vn");
		super.buildFeedMetadata(model, feed, request);
	}

	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<RSSMessage> listContent=(List<RSSMessage>) model.get(FEED_CONTENT);
		List<Item> items=new ArrayList<Item>(listContent.size());
		
		for(RSSMessage tempContent:listContent) {
			Item item=new Item();
			Content content=new Content();
			content.setValue(tempContent.getSummary());
			item.setContent(content);
			item.setTitle(tempContent.getTitle());
			item.setLink(tempContent.getUrl());
			item.setPubDate(tempContent.getCreatedDate());
			items.add(item);
		}
		return items;
	}

}
