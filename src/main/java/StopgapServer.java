
import static spark.Spark.get;

import java.nio.file.FileSystems;
import java.nio.file.Files;

import org.apache.commons.lang3.StringEscapeUtils;

public class StopgapServer {

	public static void main(String[] args) {
		get("/download/:filename", (request, response) -> {
			String fn = StringEscapeUtils.unescapeHtml4(request.params("filename"));
			java.nio.file.Path inputPath = FileSystems.getDefault().getPath("./files", fn);
			Files.copy(inputPath, response.raw().getOutputStream());
			return response;
		});
	}
}
