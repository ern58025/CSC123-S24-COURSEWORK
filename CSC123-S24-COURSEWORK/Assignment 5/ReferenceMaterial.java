public class ReferenceMaterial {
    private int itemReference;
    private String title;
    private boolean suitableForChildren;
    private double replacementValue;
    private String location;
    private boolean available;

    public ReferenceMaterial(int itemReference, String title, boolean suitableForChildren, double replacementValue, String location) {
        this.itemReference = itemReference;
        this.title = title;
        this.suitableForChildren = suitableForChildren;
        this.replacementValue = replacementValue;
        this.location = location;
        this.available = true;
    }

    public int getItemReference() {
        return itemReference;
    }

    public String getTitle() {
        return title;
    }

    public boolean isSuitableForChildren() {
        return suitableForChildren;
    }

    public double getReplacementValue() {
        return replacementValue;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "ReferenceMaterial" +
                "itemReference=" + itemReference +
                ", title='" + title + '\'' +
                ", suitableForChildren=" + suitableForChildren +
                ", replacementValue=" + replacementValue +
                ", location='" + location + '\'' +
                ", available=" + available;
    }
}