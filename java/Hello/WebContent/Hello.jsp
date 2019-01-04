<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head><title>Hello World</title></head>
   
   <body>
      Hello World!<br/>
      
      <%@ page import = "java.io.*,java.util.*" %>
      <%! int day = (new java.util.Date()).getDay(); %>
      <%! int fontSize; %>
      
      <%
         out.println("Your IP address is " + request.getRemoteAddr());
      %>
      
      <p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>
      
      <% if (day == 1 || day == 7) { %>
         <p> Today is weekend</p>
      <% } else { %>
         <p> Today is not weekend</p>
      <% } %>
 
     <% 
         switch(day) {
            case 0:
               out.println("It\'s Sunday.");
               break;
            case 1:
               out.println("It\'s Monday.");
               break;
            case 2:
               out.println("It\'s Tuesday.");
               break;
            case 3:
               out.println("It\'s Wednesday.");
               break;
            case 4:
               out.println("It\'s Thursday.");
               break;
            case 5:
               out.println("It\'s Friday.");
               break;
            default:
               out.println("It's Saturday.");
         }
      %>
      </br>
      
      <%for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
         <font color = "green" size = "<%= fontSize %>">
           parthi
      </font><br />
      <%}%>
      
      
       <center>
         <h2>Auto Refresh Header Example</h2>
         <%
            // Set refresh, autoload time as 5 seconds
            response.setIntHeader("Refresh", 1);
            
            // Get current time
            Calendar calendar = new GregorianCalendar();
            
            String am_pm;
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0) 
               am_pm = "AM";
            else
               am_pm = "PM";
               String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
               out.println("Current Time is: " + CT + "\n");
         %>
      </center>
      
 
   </body>
</html>
