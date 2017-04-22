package com.robbiedaves.simplespecbuilder;

import static com.robbiedaves.simplespecbuilder.Util.checkNotNull;

public class RequirementSpec extends Spec {

    public final String description;
    public final String author;

    @Override
    public String getSpecString() {
        return super.getSpecString() +
                this.description + '\n' +
                this.author + '\n';
    }

    private RequirementSpec(Builder builder){
        this.name = checkNotNull(builder.name, "name == null");
        this.description = builder.description;
        this.author = builder.author;
    }

    public static Builder requirementsBuilder(String name){
        return new Builder(name);
    }


    public static final class Builder {

        private final String name;
        private String description;
        private String author;

        private Builder(String name) {
            this.name = name;
        }

        public RequirementSpec build() {
            return new RequirementSpec(this);
        }

        public Builder addDescription(String desc){
            this.description = desc;
            return this;
        }

        public Builder addAuthor(String author) {
            this.author = author;
            return this;
        }
    }

}