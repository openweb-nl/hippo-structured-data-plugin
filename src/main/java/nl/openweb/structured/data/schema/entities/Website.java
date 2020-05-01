package nl.openweb.structured.data.schema.entities;

public class Website extends Thing {

    private SearchAction searchAction;

    protected Website(final Website.Builder builder) {
        super(builder);
    }

    public static class Builder extends Thing.Builder {
        @Override
        public Website build() {
            return new Website(this);
        }
    }

    public SearchAction getSearchAction() {
        return searchAction;
    }
}