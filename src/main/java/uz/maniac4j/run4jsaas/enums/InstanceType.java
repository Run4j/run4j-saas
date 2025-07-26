package uz.maniac4j.run4jsaas.enums;

public enum InstanceType {
    PROD("Production"),
    TEST("Testing"),
    REPLICA("Replica");

    private final String displayName;

    InstanceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

