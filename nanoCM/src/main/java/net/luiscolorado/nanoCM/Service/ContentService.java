/**
 * 
 */
package net.luiscolorado.nanoCM.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.luiscolorado.nanoCM.Dao.ContentDao;
import net.luiscolorado.nanoCM.Entity.Content;

/**
 * @author Luis Colorado
 *
 */
@Service
public class ContentService {
	@Autowired 
	private ContentDao contentDao;

	public Collection<Content> getAllContents() {
		return contentDao.getAllContents();
	}
}
