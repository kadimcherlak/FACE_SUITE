package framework.tests.steps.oracle_fusion_cloud;

public class Data extends framework.core.models.Data {

    // Alpha sorted list of models items (yes it will be long normally)
    private String password;
    private String userId;
    private String userName;

    // Alpha sorted list of getters
    // most of these items get loaded via bean loader, so normally setters not needed.
    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}


