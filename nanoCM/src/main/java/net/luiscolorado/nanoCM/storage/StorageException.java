/**
 * 
 */
package net.luiscolorado.nanoCM.storage;

/**
 * Exception thrown when there are problems related to storing or
 * retrieving files from storage (e.g., file system)
 * 
 * @author Luis Colorado
 *
 */
public class StorageException extends RuntimeException {
	 public StorageException(String message) {
	        super(message);
	    }
	 
	 public StorageException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
