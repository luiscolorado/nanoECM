/**
 * 
 */
package net.luiscolorado.nanoCM.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Definining configuration properties for storage,
 * such as the file system local directory.
 * 
 * @author Luis Colorado
 *
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Default path for files
     */
    private String path = "c:/contentstore";

    public String getPath() {
        return path;
    }

    public void setPath(String location) {
        this.path = location;
    }
}
