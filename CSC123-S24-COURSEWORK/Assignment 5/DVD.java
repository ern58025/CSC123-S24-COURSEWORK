public class DVD extends ReferenceMaterial {
    private String releaseDate;
    private int durationInMinutes;

    public DVD(int itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
               String releaseDate, int durationInMinutes) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "DVD" +
                "itemReference=" + getItemReference() +
                ", title='" + getTitle() + '\'' +
                ", suitableForChildren=" + isSuitableForChildren() +
                ", replacementValue=" + getReplacementValue() +
                ", location='" + getLocation() + '\'' +
                ", available=" + isAvailable() +
                ", releaseDate='" + releaseDate + '\'' +
                ", durationInMinutes=" + durationInMinutes;
    }
}