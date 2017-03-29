/**
 * 
 */
package net.luiscolorado.nanoCM.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.luiscolorado.nanoCM.Entity.Content;
import net.luiscolorado.nanoCM.Service.ContentService;
import net.luiscolorado.nanoCM.storage.StorageService;

/**
 * @author Luis Colorado
 *
 */
@RestController
@RequestMapping("/nanocm")
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	@Autowired
	private StorageService storageService;
	
	@GetMapping("/allcontents")
	public Collection<Content> getAllContents() {
		return contentService.getAllContents();
	}
	
	/**
	 * Upload file 
	 * 
	 * @param file
	 * @param redirectAttributes
	 */
	@PostMapping("/content")
	public @ResponseBody void contentUpload(@RequestParam("filename") MultipartFile file,
			RedirectAttributes redirectAttributes) {
		// Save file in local storage
		storageService.store(file);
		
	}
}
