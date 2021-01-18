package homework6.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {

    @JsonProperty("summary")
    private List<String> summary = null;
    @JsonProperty("elements")
    private List<String> elements = null;
    @JsonProperty("color")
    private String color;
    @JsonProperty("metals")
    private String metals;
    @JsonProperty("vegetables")
    private List<String> vegetables = null;

    public List<String> getSummary() {
        return summary;
    }

    public List<String> getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setSummary(List<String> summary) {
        this.summary = summary;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetals(String metals) {
        this.metals = metals;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    public String getSummaryRow() {
        int sum = Integer.parseInt(this.summary.get(0)) + Integer.parseInt(this.summary.get(1));
        return "Summary: " + sum;
    }

    public String getElementsRow() {
        return "Elements: " + this.elements.get(0) + ", " + this.elements.get(1);
    }

    public String getColorRow() {
        return "Color: " + this.color;
    }

    public String getMetalRow() {
        return "Metal: " + this.metals;
    }

    public String getVegetablesRow() {
        String veg = "Vegetables: ";
        for (int i = 0; i < this.vegetables.size() - 1; i++) {
            //Cucumber, Vegetables
            veg += this.vegetables.get(i) + ", ";
        }
        veg += this.vegetables.get(this.vegetables.size() - 1);
        return veg;
    }
}
