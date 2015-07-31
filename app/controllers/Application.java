package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result testJson() {
    	
    	String jsonString = "";
    	JsonNode json = request().body().asJson();
    	if(json == null) {
    		return badRequest("Expecting json");
    		
    	}
    	
    	jsonString = json.toString();
    	return ok(jsonString);
    }

}
