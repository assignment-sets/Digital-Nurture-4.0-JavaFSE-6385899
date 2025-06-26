public class GithubUser {
    private String name;
    private String location;
    private String bio;

    public GithubUser(String name, String location, String bio) {
        this.name = name;
        this.location = location;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
