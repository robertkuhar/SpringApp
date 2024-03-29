package springapp.service;

import org.apache.commons.logging.*;

public class PriceIncrease {
    protected final Log logger = LogFactory.getLog(getClass());

    private int percentage;

    public void setPercentage(int percentage) {
        this.percentage = percentage;
        logger.info("Percentage set to " + this.percentage);
    }

    public int getPercentage() {
        return this.percentage;
    }

}
