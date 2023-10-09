public class Player1 {
    private String name;
    private String weapon;
    private int health;
    private String[] inventory;
    private final int inventorySize = 3; // Fixed inventory size
    private int itemsInInventory;
    private int experiencePoints;
    private int level;
    private Quest currentQuest;
//    private Quest[] quests = new Quest[2];
//    private int QuestCount;
    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 100){
            this.health = 100;
        }else this.health = health;

        this.inventory = new String[inventorySize];

        this.itemsInInventory = 0;
        this.experiencePoints = 0;
        this.level = 1;
        this.currentQuest = null;
    }

    public void damageByGun1(){
        this.health -= 30;
        if(this.health <=0){
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 30" +
                ". New health is "+ this.health);
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }
    public void damageByGun2(){
        this.health -= 50;
        if(this.health <=0){
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 50" +
                ". New health is "+ this.health);
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }

    public void heal(){
        if(this.health <= 0 ) System.out.println("Player is dead. Heal not possible");
        else{
            this.health = 100;
            System.out.println("Health is "+this.health);
        }
    }

    public void addtoinventory(String item){
        if (itemsInInventory < inventorySize){
            inventory[itemsInInventory] = item;
            itemsInInventory = itemsInInventory + 1;
            System.out.println(getName() + " added " + item + " to the inventory");
        }
        else{
            System.out.println(getName() + "'s inventory is full.Cannot add item " + item);
        }
    }


    public void showinventory(){
        System.out.println("-----Inventory------");
        for (String item : inventory){

            System.out.println(item);

        }
        System.out.println("-----------");
    }
    public void startQuest(Quest quest) {

            if (currentQuest == null) {
                currentQuest = quest;
                System.out.println(getName() + " started a new quest: " + quest.getDescription());
            } else {
                System.out.println(getName() + " is already on a quest.");
            }
        }

    private void levelup(int RewardXP){
        experiencePoints += RewardXP;
        if (experiencePoints > 500){
            level = level + 1;
            System.out.println("You've leveled up!. You are now level " + level);
        }
    }

    public void completeQuest() {
        if (currentQuest != null) {
            int questRewardXP = currentQuest.getRewardXP();
            int questRewardGold = currentQuest.getRewardGold();


            System.out.println(getName() + " completed the quest and earned " + questRewardXP + " XP.");
            levelup(questRewardXP);

            currentQuest = null;

        } else {
            System.out.println(getName() + " is not currently on a quest.");
        }
    }

    public void abandonQuest() {
        if (currentQuest != null) {
            System.out.println(getName() + " abandoned the quest: " + currentQuest.getDescription());
            currentQuest = null;
        } else {
            System.out.println(getName() + " is not currently on a quest.");
        }
    }

    public void showQuestLog(Quest quest){
        System.out.println(quest);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}