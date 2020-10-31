package day10_Practices;
/*
status code:
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

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement

 */
public class HTTP_Protocol {
    public static void main(String[] args) {

        int statusCode = 301;
        String label = "ok";

        if(statusCode==200) {
            label = "ok";
        }else if (statusCode==201){
            label = "Created";
        }else if(statusCode==202){
            label = "Accepted";
        }else if(statusCode==301){
            label = "Moved permanently";
        }else if(statusCode==303){
            label = "See other";
        }
        System.out.println(label);


    }
}
