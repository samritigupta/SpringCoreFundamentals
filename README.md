# Spring Framework Fundamentals

Its always difficult to get started when comes to new things. This project is all about how one can start to understand spring framework.
First come first, basics are always important.

<center><img src="images/SpringFramework.jpg" width=250 height=300/></center>


Spring Core container conatins the beans i.e. the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. This project highlights the use of,
1. IOC Inversion of control
2. Dependency Injection
3. Creating beans using XML
4. Creating beans using Java Annotations

# Internal Working


                |     incoming request
                |   -------------->   Front Controller  (Dispatcher servlet) -> already developed by spring dev team  - it delegates request to other model objects
                |                           |
        web     |                           |   Model (pojos, beans)
        Browser |                           >
                |                      Controller  (actual business logic resides here)
                |                           |
                |                           |   Model
                |                           >
                |    <--------------    View template   (html page e.g. jsp)
                



# Components of spring MVC
  1. Set of web pages UI components
  2. Collection of spring beans (controllers, services)
  3. Spring configuration (xml or java annotation)
  
# What is Controller
    - Handle the request
    - Store/retrieve data
    - place data in model
    - send to appropriate view template
