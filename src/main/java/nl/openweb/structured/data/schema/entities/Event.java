package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event extends Thing {
    private Calendar startDate;
    private Calendar endDate;
    private Place location;
    private PostalAddress locationAsPostalAddress;
    private String locationAsString;
    private boolean accessibleForFree;
    private Object organizer;
    private String performer;
    private List<Offer> offers;
    private String eventStatus;

    protected Event(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.location = builder.location;
        this.startDate = builder.startDate;
        this.locationAsPostalAddress = builder.locationAsPostalAddress;
        this.locationAsString = builder.locationAsString;
        this.accessibleForFree = builder.accessibleForFree;
        this.organizer = builder.organizer;
        this.performer = builder.performer;
        this.offers = builder.offers;
        this.eventStatus = builder.eventStatus;
    }

    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate != null ? startDate.getTime() : null;
    }

    @JsonProperty("endDate")
    public Calendar getEndDate() {
        return endDate;
    }

    @JsonProperty("location")
    public Object getLocation() {
        Object result = this.location;
        if (result == null) {
            result = locationAsPostalAddress;
        }
        if (result == null) {
            result = locationAsString;
        }
        return result;
    }

    @JsonProperty("isAccessibleForFree")
    public boolean isAccessibleForFree() {
        return accessibleForFree;
    }

    public Object getOrganizer() {
        return organizer;
    }

    public String getPerformer() {
        return performer;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public static class Builder extends Thing.Builder {
        private Calendar endDate;
        private Place location;
        private Calendar startDate;
        private PostalAddress locationAsPostalAddress;
        private String locationAsString;
        private boolean accessibleForFree;
        private Object organizer;
        private String performer;
        private List<Offer> offers;
        private String eventStatus;

        public Builder setEndDate(Calendar endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setLocation(Place location) {
            this.location = location;
            return this;
        }

        public Builder setStartDate(Calendar startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setLocation(PostalAddress locationAsPostalAddress) {
            this.locationAsPostalAddress = locationAsPostalAddress;
            return this;
        }

        public Builder setLocation(String locationAsString) {
            this.locationAsString = locationAsString;
            return this;
        }

        public Builder setAccessibleForFree(boolean accessibleForFree) {
            this.accessibleForFree = accessibleForFree;
            return this;
        }

        public Builder setOrganizer(Person person) {
            this.organizer = person;
            return this;
        }

        public Builder setOrganizer(Organization organization) {
            this.organizer = organization;
            return this;
        }

        public Builder setPerformer(String performer) {
            this.performer = performer;
            return this;
        }

        public Builder setOffers(List<Offer> offers) {
            this.offers = offers;
            return this;
        }

        public Builder setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
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
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Thing.Builder setSameAs(String[] sameAs) {
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
        public Event build() {
            return new Event(this);
        }
    }
}