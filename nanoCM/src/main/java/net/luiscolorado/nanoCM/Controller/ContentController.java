/**
 * 
 */
package net.luiscolorado.nanoCM.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.luiscolorado.nanoCM.Entity.Content;
import net.luiscolorado.nanoCM.Service.ContentService;

/**
 * @author Luis Colorado
 *
 */
@RestController
@RequestMapping("/contents")
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Content> getAllContents() {
		return contentService.getAllContents();
	}
}
