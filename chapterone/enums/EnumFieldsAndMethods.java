package chapterone.enums;

public enum EnumFieldsAndMethods {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String abbreviation;

    EnumFieldsAndMethods(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
