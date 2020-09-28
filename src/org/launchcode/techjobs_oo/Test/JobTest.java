import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class JobTest {
    Job testJob;
    Job testJobEmpty;


    @Before
    public void createJobObject() {
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Before
    public void createEmptyJobObject() {
        testJobEmpty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals((job1.getId() != job2.getId()),true);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobA != jobB, true);
    }

    @Test
    public void toStringLine() {
        assertTrue(testJob.toString().startsWith("\n") && testJob.toString().endsWith("\n"));
    }

    @Test
    public void toStringFormat() {
        assertEquals(testJob.toString(), "\n" +
                "ID: " + testJob.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }

    @Test
    public void toStringEmpty() {
        assertEquals(testJobEmpty.toString(), "\n" +
                "ID: " + testJobEmpty.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n");
    }


}

