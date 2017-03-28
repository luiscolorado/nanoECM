/**
 * 
 */
package net.luiscolorado.nanoCM.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.luiscolorado.nanoCM.Entity.*;
import net.luiscolorado.nanoCM.Entity.Content.ContentProperties;

/**
 * @author Luis Colorado
 *
 */
@Repository
public class ContentPropertiesDao {
	//TODO Implement actual memory database
	private static Map<Integer, Content.ContentProperties> contentProperties;
	
	static {
		contentProperties = new HashMap<Integer, Content.ContentProperties> () {
		private static final long serialVersionUID = 4908921469627123847L;
		};
	}		
	void addContentProperties(Integer id, Content.ContentProperties cp) {
		contentProperties.put(id, cp);
	}
	
	public Map<String,String> getContentProperties(Content c) {
		return c.getProperties();
	}
}

