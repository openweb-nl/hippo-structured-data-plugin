package nl.openweb.structured.data.schema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchAction extends Action {

    private String target;
    @JsonProperty("query-input")
    private String queryInput;

    public String getTarget() {
        return target;
    }

    public String getQueryInput() {
        return queryInput;
    }

    public SearchAction(final SearchAction.Builder builder) {
        super(builder);
        this.target = builder.target;
        this.queryInput = builder.queryInput;
    }

    public static class Builder extends Action.Builder {

        private String target;
        private String queryInput;

        public Builder setTarget(final String target) {
            this.target = target;
            return this;
        }

        public Builder setQueryInput(final String queryInput) {
            this.queryInput = queryInput;
            return this;
        }

        @Override
        public SearchAction build() {
            return new SearchAction(this);
        }
    }
}