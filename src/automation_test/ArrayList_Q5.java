package automation_test;

import java.util.ArrayList;

/**
 * 5.1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 *
 * Output
 * Scrum
 * Java
 * Jira
 * Selenium
 * Cucumber
 * Postman
 * Rest Assured
 */
public class ArrayList_Q5 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");
        list.add("Rest Assured");

        for (String arraylist:list) {
            System.out.println(arraylist);
        }
    }
}
