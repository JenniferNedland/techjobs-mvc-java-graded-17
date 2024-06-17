package org.launchcode.techjobsmvc.models;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Initialize a unique ID.
    public Job() {
        id = nextId;
        nextId++;
    }

    // Initialize the id and value fields.
    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = anEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    private String formatString(String string) {
        return string == null || string.isEmpty() ? "Data not available" : string;
    }
    private String formatField(JobField field) {
        return formatString(field == null ? "" : field.getValue());
    }
    // Custom toString method.
    @Override
    public String toString() {

        return
                """
                
                ID: %s
                Name: %s
                Employer: %s
                Location: %s
                Position Type: %s
                Core Competency: %s
                """.formatted(id,
                        formatString(name),
                        formatField(employer),
                        formatField(location),
                        formatField(positionType),
                        formatField(coreCompetency));
    }

    // Custom equals and hashCode methods. Two Job objects are "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // Getters and setters.

    public int getId() {
        return id;
    }

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
}

