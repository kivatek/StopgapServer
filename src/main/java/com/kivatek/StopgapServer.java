package com.kivatek;

import java.nio.file.Path;
import java.nio.file.Paths;

import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class StopgapServer {
	public static void main(String[] args) {
        Path path = Paths.get("public");
        staticFiles.externalLocation(path.toAbsolutePath().toString());
        get("/", (request, response) -> "" );
	}
}
