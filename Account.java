public class Account {
    private String account_id;
    private String tweet;

    public Account(String account_id, String tweet) {
        this.account_id = account_id;
        this.tweet = tweet;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
}