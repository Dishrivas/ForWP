package configdefinition;

import java.util.HashMap;
import java.util.Map;

public enum PageTypeConfig {

    LOGIN_PAGE("Westpac Home Page"),
    ACCOUNTSUMMARY_PAGE("ACCOUNTSUMMARY"),
    RC_PAGE("Retirement Calculator Page");

    private final String key;
    private static final Map<String,PageTypeConfig> lookup = new HashMap<String,PageTypeConfig>();
    static {
        for (PageTypeConfig page: PageTypeConfig.values()){
            lookup.put(page.getkey(),page);
        }
    }
    private PageTypeConfig(String key) { this.key = key;
    }
    public String getkey(){ return key;}
    public static PageTypeConfig getPageType(String key) { return lookup.get(key);}
}
