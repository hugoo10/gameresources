package gameresources.pattern.design.singleton.v5_access_through_inheritance;

import java.util.logging.Logger;

abstract class GameObject {
    private static Logger log;
    protected Logger getLog() {
        return log;
    }
}
