package net.luiscolorado.nanoCM.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.luiscolorado.nanoCM.Entity.*;
import net.luiscolorado.nanoCM.Entity.Content.ContentProperties;

@Repository
public class ContentDao {
	// TODO Implement actual memory database
	private static Map<Integer, Content> contents;

	static {
		contents = new HashMap<Integer, Content>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4908921469627279847L;

		};
		/**
		 * Creating temporary data in memory for testing
		 */
		Content newContent = new Content("file1.txt");
		newContent.addContentProperty("author", "luis").addContentProperty("title", "thesis 1");
		contents.put(1, newContent);

		newContent = new Content("file2.pdf");
		newContent.addContentProperty("author", "joe").addContentProperty("title", "great times");
		contents.put(2, newContent);

		newContent = new Content("file3.txt");
		newContent.addContentProperty("author", "tom").addContentProperty("description", "Searching insights.");
		contents.put(3, newContent);

	};

	public Collection<Content> getAllContents() {
		Collection<Content> temp = contents.values();
		System.out.println("Contents=" + temp);
		return temp;
	}
}
