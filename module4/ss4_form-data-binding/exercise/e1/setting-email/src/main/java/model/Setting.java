package model;

public class Setting {
    private String language;
    private int pageSize;
    private boolean isSpamFilter;
    private String signature;

    public Setting() {
    }

    public Setting(String language, int pageSize, boolean isSpamFilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.isSpamFilter = isSpamFilter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFilter() {
        return isSpamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        isSpamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
