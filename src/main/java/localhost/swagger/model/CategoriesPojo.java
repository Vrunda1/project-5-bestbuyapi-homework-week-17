package localhost.swagger.model;

import java.util.HashMap;

/**
 * Created by Jay Vaghani
 */
public class CategoriesPojo {
    //only from request body from postman-payload
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

