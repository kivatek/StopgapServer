import static spark.Spark.get;
import static spark.SparkBase.externalStaticFileLocation;

public class StopgapServer {

	public static void main(String[] args) {
		externalStaticFileLocation("./public");
		get("/", (request, response) -> "" );
	}
}
