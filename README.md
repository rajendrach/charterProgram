# CharterProgram
Sample Program For Charter Interview

## How To Run
  1. Run the command git clone https://github.com/rajendrach/charterProgram.git
  2. Go to project structure and run mvn clean install.
  3. Instead of step three import maven project to your existing workspace and run maven build with clean and install goals.

## Program description
    The program contains a Maven project called CharterParent and has three modules added to it EARModule(to deploy to JBoss server), JARModule(Which is a EJBModule)
    and a WARModule(WebApp with a restService).
    -> The restservice when deployed can be invoked with localhost:8080/WARModule/service/test which has SecurityInterceptor which checks for Basic
       Authentication as the method has @RolesAllowed for "ADMIN".
       calls the stateless EJB from with in the GET method.
## Technologies Used
  1) RESTEasy as it complies with JBOSS
  2) EJB 3.1
  3) Java 1.7
  4) Tested on WildFly which is a JBOSS flavor but can be deployed in JBOSS AS 7
