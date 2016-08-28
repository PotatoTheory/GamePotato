/**
 * Created by d95wang on 8/27/2016.
 *
 * Contains the base class for general in game items
 * In general items should be derivatives of this class.
 * Pretty much anything built with this will be like... useless
 */
public class gameItem {
    private String desc;
    private String name;

    // Constructor of the general game item
    public gameItem(String desc, String name) {
        this.desc = desc;
        this.name = name;
    }

    // Return the name of this item
    public String getName() {
        return name;
    }

    // Return the description of this item
    public String getDesc() {
        return desc;
    }
}
