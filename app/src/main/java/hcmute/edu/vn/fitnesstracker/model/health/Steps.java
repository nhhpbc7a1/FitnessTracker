package hcmute.edu.vn.fitnesstracker.model.health;

/**
 * Model class for tracking steps data
 */
public class Steps {
    private long id;
    private long timestamp;
    private int stepCount;
    
    // Constructors
    public Steps() {
    }
    
    public Steps(long timestamp, int stepCount) {
        this.timestamp = timestamp;
        this.stepCount = stepCount;
    }
    
    // Getters and Setters
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public int getStepCount() {
        return stepCount;
    }
    
    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }
} 