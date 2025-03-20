
public class app_path {
	@ApplicationPath("api")
	public class LibraryApplication extends ResourceConfig {
	    public LibraryApplication() {
	        packages("it.html.tutorial.library.api");
	    }
	}
}
