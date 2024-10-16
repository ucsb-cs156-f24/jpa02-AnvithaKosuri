package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-f24-teams>
        // i.e. your first name, or your first and initial of last name

        return "Anvitha";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "AnvithaKosuri";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
       
        Team team = new Team("f24-13");
        team.addMember("Anvitha");
        team.addMember("Sanjana");
        team.addMember("Emily");
        team.addMember("Steven");
        team.addMember("David");
        team.addMember("Andy");
        return team;
    }


}

