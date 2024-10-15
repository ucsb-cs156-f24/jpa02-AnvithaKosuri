package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }
    
    

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
   }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    
     
     @Test
     public void check_correct_bool_value() 
     {
        Team test = new Team("test-team");
        assertEquals(true, test.equals(test));
       
     }

     @Test
     public void check_incorrect_bool_value() 
     {
        Team test = new Team("test-team");
        assertEquals(false, test.equals("hello"));
       
     }


     @Test
     public void check_true_test() 
     {
        Team x = new Team("verify");
         Team y = new Team("verify");
         x.addMember("check");
         y.addMember("check");
        assertEquals( y.equals(x), true );
       }
      
     
     @Test
     public void check_true_false_test() 
     {
        Team x = new Team("verify");
         Team y = new Team("verify");
         x.addMember("error");
         y.addMember("check");
        assertEquals( y.equals(x), false );
       }
     
      @Test
     public void check_falset_true_test() 
     {
        Team x = new Team("verify");
         Team y = new Team("error");
         x.addMember("check");
         y.addMember("check");
        assertEquals( y.equals(x), false );
       }

     
      @Test
     public void checkfalsefalsetest() 
     {
        Team x = new Team("verify");
         Team y = new Team("error");
         x.addMember("check");
         y.addMember("wrong");
        assertEquals( y.equals(x), false );
       }


      @Test
     public void hashcode()
     {
        Team x = new Team();
        Team y = new Team();
        Team z = new Team("not equal"); 
        assertEquals(x.hashCode(), y.hashCode());
        assert(x.hashCode() != z.hashCode());
        y.addMember("extra");
        assert(x.hashCode() != y.hashCode());

        
     }





    


    

}
