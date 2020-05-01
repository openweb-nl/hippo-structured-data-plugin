package nl.openweb.structured.data.schema.entities;

public class Offer extends Intangible {

    private Double price;
    private String priceCurrency;
    private String availability;

    public Double getPrice() {
        return price;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public String getAvailability() {
        return availability;
    }

    public Offer(final Offer.Builder builder) {
        super(builder);
        this.price = builder.price;
        this.priceCurrency = builder.priceCurrency;
        this.availability = builder.availability;
    }

    public static class Builder extends Intangible.Builder {

        private Double price;
        private String priceCurrency;
        private String availability;

        public Offer.Builder setPrice(final Double price) {
            this.price = price;
            return this;
        }

        public Offer.Builder setPriceCurrency(final String priceCurrency) {
            this.priceCurrency = priceCurrency;
            return this;
        }

        public Offer.Builder setAvailability(final String availability) {
            this.availability = availability;
            return this;
        }

        @Override
        public Offer.Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Offer.Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Offer build() {
            return new Offer(this);
        }
    }
}
