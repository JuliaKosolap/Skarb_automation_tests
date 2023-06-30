package org.example.test;

import org.example.pages.*;
import org.example.setup.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

public class OptionalTask_CalculateTasksOnLastPage extends BaseTest {

    @Test
    public void calculateNumberOfPartnerTasksOnLastPage() {
        PartnerTasksPage partnerTasksPage = (PartnerTasksPage) (new HomePage(driver)).
                goToTasksPage(EntityType.PARTNERS);

        List<String> taskNames = partnerTasksPage.getListOfTasksOnLastPage();
        System.out.println("The tasks number on the last page is: " + taskNames.size());
        partnerTasksPage.printTheNamesOfTheTasks(taskNames);
    }
    @Test
    public void calculateNumberOfVolunteerTasksOnLastPage() {

        VolunteerTasksPage volunteerTasksPage = (VolunteerTasksPage) (new HomePage(driver)).
                goToTasksPage(EntityType.VOLUNTEERS);

        List<String> taskNames = volunteerTasksPage.getListOfTasksOnLastPage();
        System.out.println("The tasks number on the last page is: " + taskNames.size());
        volunteerTasksPage.printTheNamesOfTheTasks(taskNames);
    }
}