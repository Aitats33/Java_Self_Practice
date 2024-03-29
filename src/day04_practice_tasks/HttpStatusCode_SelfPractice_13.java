package day04_practice_tasks;
/*
Create a class named HttpStatusCode. HTTP is the protocol that governs communications between
Web servers and web clients. Part of the protocol includes a status code returned by the server to
inform the browser of its most recent page request status.

		Here are some of the codes and their meanings:

			200, OK
			201, Created
			202, Accepted
			301, Moved Permanently
			303, See Other
			304, Not Modified
			307, Temporary Redirect
			400, Bad Request
			401, Unauthorized
			403, Forbidden
			404, Not Found
			410, Gone
			500, Internal Server Error
			503, Service Unavailable

	Given an integer variable named statusCode, write a switch that prints out the appropriate label
	from the above list based on the status.

			Example:
				   if status code = 200

			Output:
				   OK
 */
public class HttpStatusCode_SelfPractice_13 {

    public static void main(String[] args) {

 /*       int statusCode = 400;
        String result = "";

        switch (statusCode) {

            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Invalid Status Code";

        }

        System.out.println(result);

    }

}
*/


int statusCode=400;

     switch (statusCode){

         case 200-> System.out.println("OK");
         case 201 -> System.out.println("Created");
         case 202 -> System.out.println("Accepted");
         case 301 -> System.out.println("Moved Permanently");
         case 303 -> System.out.println("See Other");
         case 304 -> System.out.println("Not Modified");
         case 307 -> System.out.println("Temporary Redirect");
         case 400 -> System.out.println("Bad Request");
         case 401->  System.out.println("Unauthorized");
         case 403 -> System.out.println("Forbidden");
         case 404 -> System.out.println("Not Found");
         case 410 -> System.out.println("Gone");
         case 500 -> System.out.println("Internal Server Error");
         case 503-> System.out.println("Service Unavailable");
         default -> System.out.println("Invalid");
     }
     }
    }

