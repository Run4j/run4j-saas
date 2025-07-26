package uz.maniac4j.run4jsaas.enums;

public enum InstanceStatus {
    PROVISIONING,    // Being created or initialized
    RUNNING,         // Fully active and operational
    STOPPED,         // Manually stopped or paused
    ERROR,           // Encountered a problem
    MAINTENANCE,     // Under planned update/patch/backup
    TERMINATED       // Deleted or permanently shut down
}
