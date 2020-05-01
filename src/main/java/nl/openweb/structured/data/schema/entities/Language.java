package nl.openweb.structured.data.schema.entities;

public class Language extends Thing {
    protected Language(Language.Builder builder) {
        super(builder);
    }

    public static class Builder extends Thing.Builder {
        
        @Override
        public Language.Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Language build() { return new Language(this);
        }
    }
}
