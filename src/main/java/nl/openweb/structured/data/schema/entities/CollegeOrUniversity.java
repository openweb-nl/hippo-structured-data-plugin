package nl.openweb.structured.data.schema.entities;

public class CollegeOrUniversity extends nl.openweb.structured.data.schema.entities.Organization {

    protected CollegeOrUniversity(Builder builder) {
        super(builder);
    }

    public static class Builder extends Organization.Builder {
        @Override
        public Organization build() {
            return new CollegeOrUniversity(this);
        }

    }
}
