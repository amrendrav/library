package com.adam.library.enums;

import org.springframework.core.style.ToStringCreator;

public enum APIMessageLevel {

        I("Information", "Informational message"), W("Warning", "Warning message"), E("Error", "Error message"), A("Alert", "Alert message");

        private String description;
        private String name;

        private APIMessageLevel(String name, String description) {
            this.description = description;
            this.name = name;
        }

        @Override
        public String toString() {
            return new ToStringCreator(this).append(name).toString();
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }
}
