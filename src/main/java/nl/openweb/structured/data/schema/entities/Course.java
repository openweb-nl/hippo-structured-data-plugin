package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;

public class Course extends Thing {

    private String courseCode;
    private String coursePrerequisites;
    private String educationalCredentialAwarded;
    //TODO: private CourseInstance hasCourseInstance;
    private String occupationalCredentialAwarded;
    private Thing about;
    private String accessMode;
    private ItemList accessModeSufficient;
    private String accessibilityAPI;
    private String accessibilityControl;
    private String accessibilityFeature;
    private String accessibilityHazard;
    private String accessibilitySummary;
    private Person accountablePerson;
    private AggregateRating aggregateRating;
    private String alternativeHeadline;
    private MediaObject associatedMedia;
    private Audience audience;
    private Thing audio; //AudioObject or Clip
    private Thing author; //Organisation or Person
    private String award;
    private Person character;
    private String citation;
    private Comment comment;
    private Integer commentCount;
    private String conditionsOfAccess;
    private Place contentLocation;
    private String contentRating;
    private Calendar contentReferenceTime;
    private Thing contributor; //Organisation or Person
    private Thing copyrightHolder; //Organisation or Person
    private Integer copyrightYear;
    private String correction;
    private String creativeWorkStatus;
    private Thing creator; //Organisation or Person
    private Calendar dateCreated;
    private Calendar dateModified;
    private Calendar datePublished;
    //TODO: private Url discussionUrl;
    private Person editor;
    //TODO: private AlignmentObject educationalAlignment;
    private String educationalUse;
    private MediaObject encoding;
    private String encodingFormat;
    private CreativeWork exampleOfWork;
    private Calendar expires;
    private Thing funder; //Organisation or Person
    private String genre;
    private CreativeWork hasPart;
    private Language inLanguage;
    //TODO: private InteractionStatistic interactionStatistic;
    private String interactivityType;
    private Boolean isAccessibleForFree;
    private Thing isBasedOn;
    private Boolean isFamilyFriendly;
    private CreativeWork isPartOf;
    private String keywords;
    private String learningResourceType;
    private Thing license;
    private Place locationCreated;
    private Thing mainEntity;
    private Thing material;
    private Thing materialExtent;
    private Thing mentions;
    //TODO: private Offer offers;
    private String position;
    private Thing producer; //Organisation or Person
    private Thing provider; //Organisation or Person
    //TODO: private PublicationEvent publication;
    private Thing publisher; //Organisation or Person
    private Organization publisherImprint;
    private Thing publishingPrinciples;
    private Event recordedAt;
    //TODO: private PublicationEvent releasedEvent;
    private Review review;
    private String schemaVersion;
    private Calendar sdDatePublished;
    private Thing sdLicense;
    private Thing sdPublisher; //Organisation or Person
    private Organization sourceOrganization;
    private Place spatial;
    private Place spatialCoverage;
    private Thing sponsor; //Organisation or Person
    private String temporal;
    private String temporalCoverage;
    private String text;
    //TODO: private Url thumbnailUrl;
    //TODO: private Duration timeRequired;
    private CreativeWork translationOfWork;
    private Thing translator; //Organisation or Person
    private String typicalAgeRange;
    private String version;
    private Thing video; //Clip or VideoObject
    private CreativeWork workExample;
    private CreativeWork workTranslation;

    protected Course(Builder builder) {
        super(builder);
        this.courseCode = builder.courseCode;
        this.coursePrerequisites = builder.coursePrerequisites;
        this.educationalCredentialAwarded = builder.educationalCredentialAwarded;
        this.occupationalCredentialAwarded = builder.occupationalCredentialAwarded;
        this.about = builder.about;
        this.accessMode = builder.accessMode;
        this.accessModeSufficient = builder.accessModeSufficient;
        this.accessibilityAPI = builder.accessibilityAPI;
        this.accessibilityControl = builder.accessibilityControl;
        this.accessibilityFeature = builder.accessibilityFeature;
        this.accessibilityHazard = builder.accessibilityHazard;
        this.accessibilitySummary = builder.accessibilitySummary;
        this.accountablePerson = builder.accountablePerson;
        this.aggregateRating = builder.aggregateRating;
        this.alternativeHeadline = builder.alternativeHeadline;
        this.associatedMedia = builder.associatedMedia;
        this.audience = builder.audience;
        this.audio = builder.audio;
        this.author = builder.author;
        this.award = builder.award;
        this.character = builder.character;
        this.citation = builder.citation;
        this.comment = builder.comment;
        this.commentCount = builder.commentCount;
        this.conditionsOfAccess = builder.conditionsOfAccess;
        this.contentLocation = builder.contentLocation;
        this.contentRating = builder.contentRating;
        this.contentReferenceTime = builder.contentReferenceTime;
        this.contributor = builder.contributor;
        this.copyrightHolder = builder.copyrightHolder;
        this.copyrightYear = builder.copyrightYear;
        this.correction = builder.correction;
        this.creativeWorkStatus = builder.creativeWorkStatus;
        this.creator = builder.creator;
        this.dateCreated = builder.dateCreated;
        this.dateModified = builder.dateModified;
        this.datePublished = builder.datePublished;
        this.editor = builder.editor;
        this.educationalUse = builder.educationalUse;
        this.encoding = builder.encoding;
        this.encodingFormat = builder.encodingFormat;
        this.exampleOfWork = builder.exampleOfWork;
        this.expires = builder.expires;
        this.funder = builder.funder;
        this.genre = builder.genre;
        this.hasPart = builder.hasPart;
        this.inLanguage = builder.inLanguage;
        this.interactivityType = builder.interactivityType;
        this.isAccessibleForFree = builder.isAccessibleForFree;
        this.isBasedOn = builder.isBasedOn;
        this.isFamilyFriendly = builder.isFamilyFriendly;
        this.isPartOf = builder.isPartOf;
        this.keywords = builder.keywords;
        this.learningResourceType = builder.learningResourceType;
        this.license = builder.license;
        this.locationCreated = builder.locationCreated;
        this.mainEntity = builder.mainEntity;
        this.material = builder.material;
        this.materialExtent = builder.materialExtent;
        this.mentions = builder.mentions;
        this.position = builder.position;
        this.producer = builder.producer;
        this.provider = builder.provider;
        this.publisher = builder. publisher;
        this.publisherImprint = builder.publisherImprint;
        this.publishingPrinciples = builder.publishingPrinciples;
        this.recordedAt = builder.recordedAt;
        this.review = builder.review;
        this.schemaVersion = builder.schemaVersion;
        this.sdDatePublished = builder.sdDatePublished;
        this.sdLicense = builder.sdLicense;
        this.sdPublisher = builder.sdPublisher;
        this.sourceOrganization = builder.sourceOrganization;
        this.spatial = builder.spatial;
        this.spatialCoverage = builder.spatialCoverage;
        this.sponsor = builder.sponsor;
        this.temporal = builder.temporal;
        this.temporalCoverage = builder.temporalCoverage;
        this.text = builder.text;
        this.translationOfWork = builder.translationOfWork;
        this.translator = builder.translator;
        this.typicalAgeRange = builder.typicalAgeRange;
        this.version = builder.version;
        this.video = builder.video;
        this.workExample = builder.workExample;
        this.workTranslation = builder.workTranslation;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCoursePrerequisites() {
        return coursePrerequisites;
    }

    public String getEducationalCredentialAwarded() {
        return educationalCredentialAwarded;
    }

    public String getOccupationalCredentialAwarded() {
        return occupationalCredentialAwarded;
    }

    public Thing getAbout() {
        return about;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public ItemList getAccessModeSufficient() {
        return accessModeSufficient;
    }

    public String getAccessibilityAPI() {
        return accessibilityAPI;
    }

    public String getAccessibilityControl() {
        return accessibilityControl;
    }

    public String getAccessibilityFeature() {
        return accessibilityFeature;
    }

    public String getAccessibilityHazard() {
        return accessibilityHazard;
    }

    public String getAccessibilitySummary() {
        return accessibilitySummary;
    }

    public Person getAccountablePerson() {
        return accountablePerson;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }

    public MediaObject getAssociatedMedia() {
        return associatedMedia;
    }

    public Audience getAudience() {
        return audience;
    }

    public Thing getAudio() {
        return audio;
    }

    public Thing getAuthor() {
        return author;
    }

    public String getAward() {
        return award;
    }

    public Person getCharacter() {
        return character;
    }

    public String getCitation() {
        return citation;
    }

    public Comment getComment() {
        return comment;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public String getConditionsOfAccess() {
        return conditionsOfAccess;
    }

    public Place getContentLocation() {
        return contentLocation;
    }

    public String getContentRating() {
        return contentRating;
    }

    public Calendar getContentReferenceTime() {
        return contentReferenceTime;
    }

    public Thing getContributor() {
        return contributor;
    }

    public Thing getCopyrightHolder() {
        return copyrightHolder;
    }

    public Integer getCopyrightYear() {
        return copyrightYear;
    }

    public String getCorrection() {
        return correction;
    }

    public String getCreativeWorkStatus() {
        return creativeWorkStatus;
    }

    public Thing getCreator() {
        return creator;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Calendar getDatePublished() {
        return datePublished;
    }

    public Person getEditor() {
        return editor;
    }

    public String getEducationalUse() {
        return educationalUse;
    }

    public MediaObject getEncoding() {
        return encoding;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public CreativeWork getExampleOfWork() {
        return exampleOfWork;
    }

    public Calendar getExpires() {
        return expires;
    }

    public Thing getFunder() {
        return funder;
    }

    public String getGenre() {
        return genre;
    }

    public CreativeWork getHasPart() {
        return hasPart;
    }

    public Language getInLanguage() {
        return inLanguage;
    }

    public String getInteractivityType() {
        return interactivityType;
    }

    public Boolean getAccessibleForFree() {
        return isAccessibleForFree;
    }

    public Thing getIsBasedOn() {
        return isBasedOn;
    }

    public Boolean getFamilyFriendly() {
        return isFamilyFriendly;
    }

    public CreativeWork getIsPartOf() {
        return isPartOf;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getLearningResourceType() {
        return learningResourceType;
    }

    public Thing getLicense() {
        return license;
    }

    public Place getLocationCreated() {
        return locationCreated;
    }

    public Thing getMainEntity() {
        return mainEntity;
    }

    public Thing getMaterial() {
        return material;
    }

    public Thing getMaterialExtent() {
        return materialExtent;
    }

    public Thing getMentions() {
        return mentions;
    }

    public String getPosition() {
        return position;
    }

    public Thing getProducer() {
        return producer;
    }

    public Thing getProvider() {
        return provider;
    }

    public Thing getPublisher() {
        return publisher;
    }

    public Organization getPublisherImprint() {
        return publisherImprint;
    }

    public Thing getPublishingPrinciples() {
        return publishingPrinciples;
    }

    public Event getRecordedAt() {
        return recordedAt;
    }

    public Review getReview() {
        return review;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public Calendar getSdDatePublished() {
        return sdDatePublished;
    }

    public Thing getSdLicense() {
        return sdLicense;
    }

    public Thing getSdPublisher() {
        return sdPublisher;
    }

    public Organization getSourceOrganization() {
        return sourceOrganization;
    }

    public Place getSpatial() {
        return spatial;
    }

    public Place getSpatialCoverage() {
        return spatialCoverage;
    }

    public Thing getSponsor() {
        return sponsor;
    }

    public String getTemporal() {
        return temporal;
    }

    public String getTemporalCoverage() {
        return temporalCoverage;
    }

    public String getText() {
        return text;
    }

    public CreativeWork getTranslationOfWork() {
        return translationOfWork;
    }

    public Thing getTranslator() {
        return translator;
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public String getVersion() {
        return version;
    }

    public Thing getVideo() {
        return video;
    }

    public CreativeWork getWorkExample() {
        return workExample;
    }

    public CreativeWork getWorkTranslation() {
        return workTranslation;
    }

    public static class Builder extends Thing.Builder {
        private String courseCode;
        private String coursePrerequisites;
        private String educationalCredentialAwarded;
        //TODO: private CourseInstance hasCourseInstance;
        private String occupationalCredentialAwarded;
        private Thing about;
        private String accessMode;
        private ItemList accessModeSufficient;
        private String accessibilityAPI;
        private String accessibilityControl;
        private String accessibilityFeature;
        private String accessibilityHazard;
        private String accessibilitySummary;
        private Person accountablePerson;
        private AggregateRating aggregateRating;
        private String alternativeHeadline;
        private MediaObject associatedMedia;
        private Audience audience;
        private Thing audio; //AudioObject or Clip
        private Thing author; //Organisation or Person
        private String award;
        private Person character;
        private String citation;
        private Comment comment;
        private Integer commentCount;
        private String conditionsOfAccess;
        private Place contentLocation;
        private String contentRating;
        private Calendar contentReferenceTime;
        private Thing contributor; //Organisation or Person
        private Thing copyrightHolder; //Organisation or Person
        private Integer copyrightYear;
        private String correction;
        private String creativeWorkStatus;
        private Thing creator; //Organisation or Person
        private Calendar dateCreated;
        private Calendar dateModified;
        private Calendar datePublished;
        //TODO: private Url discussionUrl;
        private Person editor;
        //TODO: private AlignmentObject educationalAlignment;
        private String educationalUse;
        private MediaObject encoding;
        private String encodingFormat;
        private CreativeWork exampleOfWork;
        private Calendar expires;
        private Thing funder; //Organisation or Person
        private String genre;
        private CreativeWork hasPart;
        private Language inLanguage;
        //TODO: private InteractionStatistic interactionStatistic;
        private String interactivityType;
        private Boolean isAccessibleForFree;
        private Thing isBasedOn;
        private Boolean isFamilyFriendly;
        private CreativeWork isPartOf;
        private String keywords;
        private String learningResourceType;
        private Thing license;
        private Place locationCreated;
        private Thing mainEntity;
        private Thing material;
        private Thing materialExtent;
        private Thing mentions;
        //TODO: private Offer offers;
        private String position;
        private Thing producer; //Organisation or Person
        private Thing provider; //Organisation or Person
        //TODO: private PublicationEvent publication;
        private Thing publisher; //Organisation or Person
        private Organization publisherImprint;
        private Thing publishingPrinciples;
        private Event recordedAt;
        //TODO: private PublicationEvent releasedEvent;
        private Review review;
        private String schemaVersion;
        private Calendar sdDatePublished;
        private Thing sdLicense;
        private Thing sdPublisher; //Organisation or Person
        private Organization sourceOrganization;
        private Place spatial;
        private Place spatialCoverage;
        private Thing sponsor; //Organisation or Person
        private String temporal;
        private String temporalCoverage;
        private String text;
        //TODO: private Url thumbnailUrl;
        //TODO: private Duration timeRequired;
        private CreativeWork translationOfWork;
        private Thing translator; //Organisation or Person
        private String typicalAgeRange;
        private String version;
        private Thing video; //Clip or VideoObject
        private CreativeWork workExample;
        private CreativeWork workTranslation;

        public Builder setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }

        public Builder setCoursePrerequisites(String coursePrerequisites) {
            this.coursePrerequisites = coursePrerequisites;
            return this;
        }

        public Builder setEducationalCredentialAwarded(String educationalCredentialAwarded) {
            this.educationalCredentialAwarded = educationalCredentialAwarded;
            return this;
        }

        public Builder setOccupationalCredentialAwarded(String occupationalCredentialAwarded) {
            this.occupationalCredentialAwarded = occupationalCredentialAwarded;
            return this;
        }

        public Builder setAbout(Thing about) {
            this.about = about;
            return this;
        }

        public Builder setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }

        public Builder setAccessModeSufficient(ItemList accessModeSufficient) {
            this.accessModeSufficient = accessModeSufficient;
            return this;
        }

        public Builder setAccessibilityAPI(String accessibilityAPI) {
            this.accessibilityAPI = accessibilityAPI;
            return this;
        }

        public Builder setAccessibilityControl(String accessibilityControl) {
            this.accessibilityControl = accessibilityControl;
            return this;
        }

        public Builder setAccessibilityFeature(String accessibilityFeature) {
            this.accessibilityFeature = accessibilityFeature;
            return this;
        }

        public Builder setAccessibilityHazard(String accessibilityHazard) {
            this.accessibilityHazard = accessibilityHazard;
            return this;
        }

        public Builder setAccessibilitySummary(String accessibilitySummary) {
            this.accessibilitySummary = accessibilitySummary;
            return this;
        }

        public Builder setAccountablePerson(Person accountablePerson) {
            this.accountablePerson = accountablePerson;
            return this;
        }

        public Builder setAggregateRating(AggregateRating aggregateRating) {
            this.aggregateRating = aggregateRating;
            return this;
        }

        public Builder setAlternativeHeadline(String alternativeHeadline) {
            this.alternativeHeadline = alternativeHeadline;
            return this;
        }

        public Builder setAssociatedMedia(MediaObject associatedMedia) {
            this.associatedMedia = associatedMedia;
            return this;
        }

        public Builder setAudience(Audience audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAudio(Thing audio) {
            this.audio = audio;
            return this;
        }

        public Builder setAuthor(Thing author) {
            this.author = author;
            return this;
        }

        public Builder setAward(String award) {
            this.award = award;
            return this;
        }

        public Builder setCharacter(Person character) {
            this.character = character;
            return this;
        }

        public Builder setCitation(String citation) {
            this.citation = citation;
            return this;
        }

        public Builder setComment(Comment comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
            return this;
        }

        public Builder setConditionsOfAccess(String conditionsOfAccess) {
            this.conditionsOfAccess = conditionsOfAccess;
            return this;
        }

        public Builder setContentLocation(Place contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        public Builder setContentRating(String contentRating) {
            this.contentRating = contentRating;
            return this;
        }

        public Builder setContentReferenceTime(Calendar contentReferenceTime) {
            this.contentReferenceTime = contentReferenceTime;
            return this;
        }

        public Builder setContributor(Thing contributor) {
            this.contributor = contributor;
            return this;
        }

        public Builder setCopyrightHolder(Thing copyrightHolder) {
            this.copyrightHolder = copyrightHolder;
            return this;
        }

        public Builder setCopyrightYear(Integer copyrightYear) {
            this.copyrightYear = copyrightYear;
            return this;
        }

        public Builder setCorrection(String correction) {
            this.correction = correction;
            return this;
        }

        public Builder setCreativeWorkStatus(String creativeWorkStatus) {
            this.creativeWorkStatus = creativeWorkStatus;
            return this;
        }

        public Builder setCreator(Thing creator) {
            this.creator = creator;
            return this;
        }

        public Builder setDateCreated(Calendar dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setDateModified(Calendar dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public Builder setDatePublished(Calendar datePublished) {
            this.datePublished = datePublished;
            return this;
        }

        public Builder setEditor(Person editor) {
            this.editor = editor;
            return this;
        }

        public Builder setEducationalUse(String educationalUse) {
            this.educationalUse = educationalUse;
            return this;
        }

        public Builder setEncoding(MediaObject encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncodingFormat(String encodingFormat) {
            this.encodingFormat = encodingFormat;
            return this;
        }

        public Builder setExampleOfWork(CreativeWork exampleOfWork) {
            this.exampleOfWork = exampleOfWork;
            return this;
        }

        public Builder setExpires(Calendar expires) {
            this.expires = expires;
            return this;
        }

        public Builder setFunder(Thing funder) {
            this.funder = funder;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setHasPart(CreativeWork hasPart) {
            this.hasPart = hasPart;
            return this;
        }

        public Builder setGetAlternativeHeadline(String alternativeHeadline) {
            this.alternativeHeadline = alternativeHeadline;
            return this;
        }

        public Builder setInLanguage(Language inLanguage) {
            this.inLanguage = inLanguage;
            return this;
        }

        public Builder setInteractivityType(String interactivityType) {
            this.interactivityType = interactivityType;
            return this;
        }

        public Builder setAccessibleForFree(Boolean accessibleForFree) {
            isAccessibleForFree = accessibleForFree;
            return this;
        }

        public Builder setIsBasedOn(Thing isBasedOn) {
            this.isBasedOn = isBasedOn;
            return this;
        }

        public Builder setFamilyFriendly(Boolean familyFriendly) {
            isFamilyFriendly = familyFriendly;
            return this;
        }

        public Builder setIsPartOf(CreativeWork isPartOf) {
            this.isPartOf = isPartOf;
            return this;
        }

        public Builder setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder setLearningResourceType(String learningResourceType) {
            this.learningResourceType = learningResourceType;
            return this;
        }

        public Builder setLicense(Thing license) {
            this.license = license;
            return this;
        }

        public Builder setLocationCreated(Place locationCreated) {
            this.locationCreated = locationCreated;
            return this;
        }

        public Builder setMainEntity(Thing mainEntity) {
            this.mainEntity = mainEntity;
            return this;
        }

        public Builder setMaterial(Thing material) {
            this.material = material;
            return this;
        }

        public Builder setMaterialExtent(Thing materialExtent) {
            this.materialExtent = materialExtent;
            return this;
        }

        public Builder setMentions(Thing mentions) {
            this.mentions = mentions;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setProducer(Thing producer) {
            this.producer = producer;
            return this;
        }

        public Builder setProvider(Thing provider) {
            this.provider = provider;
            return this;
        }

        public Builder setPublisher(Thing publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisherImprint(Organization publisherImprint) {
            this.publisherImprint = publisherImprint;
            return this;
        }

        public Builder setPublishingPrinciples(Thing publishingPrinciples) {
            this.publishingPrinciples = publishingPrinciples;
            return this;
        }

        public Builder setRecordedAt(Event recordedAt) {
            this.recordedAt = recordedAt;
            return this;
        }

        public Builder setReview(Review review) {
            this.review = review;
            return this;
        }

        public Builder setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Builder setSdDatePublished(Calendar sdDatePublished) {
            this.sdDatePublished = sdDatePublished;
            return this;
        }

        public Builder setSdLicense(Thing sdLicense) {
            this.sdLicense = sdLicense;
            return this;
        }

        public Builder setSdPublisher(Thing sdPublisher) {
            this.sdPublisher = sdPublisher;
            return this;
        }

        public Builder setSourceOrganization(Organization sourceOrganization) {
            this.sourceOrganization = sourceOrganization;
            return this;
        }

        public Builder setSpatial(Place spatial) {
            this.spatial = spatial;
            return this;
        }

        public Builder setSpatialCoverage(Place spatialCoverage) {
            this.spatialCoverage = spatialCoverage;
            return this;
        }

        public Builder setSponsor(Thing sponsor) {
            this.sponsor = sponsor;
            return this;
        }

        public Builder setTemporal(String temporal) {
            this.temporal = temporal;
            return this;
        }

        public Builder setTemporalCoverage(String temporalCoverage) {
            this.temporalCoverage = temporalCoverage;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setTranslationOfWork(CreativeWork translationOfWork) {
            this.translationOfWork = translationOfWork;
            return this;
        }

        public Builder setTranslator(Thing translator) {
            this.translator = translator;
            return this;
        }

        public Builder setTypicalAgeRange(String typicalAgeRange) {
            this.typicalAgeRange = typicalAgeRange;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setVideo(Thing video) {
            this.video = video;
            return this;
        }

        public Builder setWorkExample(CreativeWork workExample) {
            this.workExample = workExample;
            return this;
        }

        public Builder setWorkTranslation(CreativeWork workTranslation) {
            this.workTranslation = workTranslation;
            return this;
        }

        // Following lines override the Parent Thing Builder
        @Override
        public Course.Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Course.Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Course.Builder setDescription(String description) {
            super.setDescription(description);
            return this;
        }

        @Override
        public Course.Builder setImage(String image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Course.Builder setImage(ImageObject image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Course.Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Course.Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Course.Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Course.Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Thing.Builder setSameAs(String[] sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Course.Builder setUrl(String url) {
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
        public Course build() {
            return new Course(this);
        }
    }
}
