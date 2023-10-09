public class Quest {
    private String description;
    private int rewardXP;
    private int rewardGold;

    public Quest(String description, int rewardXP, int rewardGold) {
        this.description = description;
        this.rewardXP = rewardXP;
        this.rewardGold = rewardGold;
    }

    public String getDescription() {
        return description;
    }

    public int getRewardXP() {
        return rewardXP;
    }

    @Override
    public String toString() {
        return "Quest: " + description;
    }

    public int getRewardGold() {
        return rewardGold;
    }
}
