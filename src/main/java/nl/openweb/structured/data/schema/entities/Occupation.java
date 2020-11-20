package nl.openweb.structured.data.schema.entities;

public class Occupation extends Thing {

    private String educationRequirements;
    private Long estimatedSalary;
    private String experienceRequirements;
    private AdministrativeArea occupationLocation;
    private String occupationalCategory;
    private String qualifications;
    private String responsibilities;
    private String skills;

    protected Occupation(Builder builder) {
        super(builder);
        this.educationRequirements = builder.educationRequirements;
        this.estimatedSalary = builder.estimatedSalary;
        this.experienceRequirements = builder.experienceRequirements;
        this.occupationLocation = builder.occupationLocation;
        this.qualifications = builder.qualifications;
        this.responsibilities = builder.responsibilities;
        this.skills = builder.skills;
    }

    public String getEducationRequirements() {
        return educationRequirements;
    }

    public Long getEstimatedSalary() {
        return estimatedSalary;
    }

    public String getExperienceRequirements() {
        return experienceRequirements;
    }

    public AdministrativeArea getOccupationLocation() {
        return occupationLocation;
    }

    public String getOccupationalCategory() {
        return occupationalCategory;
    }

    public String getQualifications() {
        return qualifications;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public String getSkills() {
        return skills;
    }

    public static class Builder extends Thing.Builder {
        private String educationRequirements;
        private Long estimatedSalary;
        private String experienceRequirements;
        private AdministrativeArea occupationLocation;
        private String occupationalCategory;
        private String qualifications;
        private String responsibilities;
        private String skills;

        public Builder setEducationRequirements(String educationRequirements) {
            this.educationRequirements = educationRequirements;
            return this;
        }

        public Builder setEstimatedSalary(Long estimatedSalary) {
            this.estimatedSalary = estimatedSalary;
            return this;
        }

        public Builder setExperienceRequirements(String experienceRequirements) {
            this.experienceRequirements = experienceRequirements;
            return this;
        }

        public Builder setOccupationLocation(AdministrativeArea occupationLocation) {
            this.occupationLocation = occupationLocation;
            return this;
        }

        public Builder setOccupationalCategory(String occupationalCategory) {
            this.occupationalCategory = occupationalCategory;
            return this;
        }

        public Builder setQualifications(String qualifications) {
            this.qualifications = qualifications;
            return this;
        }

        public Builder setResponsibilities(String responsibilities) {
            this.responsibilities = responsibilities;
            return this;
        }

        public Builder setSkills(String skills) {
            this.skills = skills;
            return this;
        }

        @Override
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            super.setDescription(description);
            return this;
        }

        @Override
        public Builder setImage(String image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setImage(ImageObject image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setSameAs(String[] sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Builder setSubjectOf(Thing subjectOf) {
            super.setSubjectOf(subjectOf);
            return this;
        }

        @Override
        public Occupation build() {
            return new Occupation(this);
        }
    }
}
