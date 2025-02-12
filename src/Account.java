public class Account {

    /**
     * New int (lastId = 0) Each time a new account object is created, increments
     * Lastaccountnumber/ lastId then assigning it to new account accountId
     */
    private static int lastId = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Account() {
        this.id = ++Account.lastId;
        this.firstName = "Unknown";
    }




    public Account(String firstName,String lastName) {
        this();
        setFirstName(firstName);
        setLastName(lastName);
        this.lastName = lastName;
    }

    /**
     * Setsetname
     * set the last so you cant have a null name so it can assign you an id number
     */

    public void setFirstName (String firstName) {
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.firstName = firstName;
    }


    public void setLastName (String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAccountId() {
        return id;
    }

    public String getAccountName() {
        return firstName;
    }
}