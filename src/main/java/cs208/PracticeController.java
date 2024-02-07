package cs208;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    // TODO: create a POST route with two form parameters


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
