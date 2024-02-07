package cs208;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class PracticeController
{
    // TODO: create a GET route with two query parameters
    // GET /
    @GetMapping("/display_name")
    String getNameFromQueryString(@RequestParam("first_name") String firstName,
                                     @RequestParam("last_name") String lastName)
    {
        System.out.println("Start of assigning parameters:");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("End of assigning parameters:");

        String valueReturnedToBrowser =
            "These are the values for the parameters passed in the Browser URL:<br>" +
            "First Name : " + firstName + "<br>" +
            "Last Name  : " + lastName + "<br>" +
            "See getNameFromQueryString() to make changes to the webpage output seen here.";

        return valueReturnedToBrowser;
    }

    // TODO: create a GET route with a path parameter
    // GET /
    @GetMapping("/user/{bsu_username}/profile")
    String getProfileFromBsuUsername(@PathVariable("bsu_username") String bsu_username)
    {
        System.out.println("Start of assigning parameters");
        System.out.println("BSU Username : " + bsu_username);
        System.out.println("End of assigning parameters");

        String valueReturnedToBrowser =
            "This the value for the parameters passed in the Browser URL:<br>" +
            "BSU Username : " + bsu_username + "<br>" +
            "See getProfileFromBsuUsername() to make changes to the webpage output seen here.";

        return valueReturnedToBrowser;
    }


    // TODO: create a POST route with two form parameters
    // POST / users
    @PostMapping("/create_user")
    String postCreateUser(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name
    )
    {
        System.out.println("PracticeController.postCreateUser - START");
        System.out.println("Parameters received in the body of the POST request:");
        System.out.println("first_name = " + first_name);
        System.out.println("last_name  = " + last_name);
        System.out.println("PracticeController.postCreateUser - END");

        String valueReturnedToClient =
                "Parameters received in the body of the POST request:\n" +
                        "first_name = " + first_name + "\n" +
                        "last_name  = " + last_name + "\n\n" +
                        "This REST API route would create a new user with the first name and last name specified in the parameters.\n\n" +
                        "Find me at PracticeController.postCreateUser()";

        return valueReturnedToClient;
    }


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
