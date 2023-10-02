public class University {
    private Lab[] labs;

    private int count = 0;
    public void addLab(Lab lab)
    {
        labs[count++] = new Lab(lab.getLabID(), lab.getComputers(), lab.getLabAttendant());
    }

}
