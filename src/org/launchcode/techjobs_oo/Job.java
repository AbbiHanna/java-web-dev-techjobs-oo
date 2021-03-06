package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        String result = "\n";
        String empty = "Data not available";

        result += "ID: " + this.getId() + "\n";

        //Name
        if (this.name.isEmpty()) {
            result += "Name: " + empty + "\n";
        } else {
            result += "Name: " + this.getName() + "\n";
        }

        //Employer
        if (this.employer.getValue().isEmpty()) {
            result += "Employer: " + empty + "\n";
        } else {
            result += "Employer: " + this.getEmployer() + "\n";
        }

        //Location
        if (this.location.getValue().isEmpty()) {
            result += "Location: " + empty + "\n";
        } else {
            result += "Location: " + this.getLocation() + "\n";
        }

        //PositionType
        if (this.positionType.getValue().isEmpty()) {
            result += "Position Type: " + empty + "\n";
        } else {
            result += "Position Type: " + this.getPositionType() + "\n";
        }

        //Core Competency
        if (this.coreCompetency.getValue().isEmpty()) {
            result += "Core Competency: " + empty + "\n";
        } else {
            result += "Core Competency: " + this.getCoreCompetency() + "\n";
        }

        return result;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
