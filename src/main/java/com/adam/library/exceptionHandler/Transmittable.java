package com.adam.library.exceptionHandler;

import com.adam.library.enums.APIMessageLevel;

public interface Transmittable {

    /**
     * Sets the message used by Transmittable notification
     * 
     * @param message
     *            : the message to be transmitted
     */
    public void setMessage(String message);

    /**
     * Gets the message used by Transmittable
     * 
     * @return : return the message
     */
    public String getMessage();

    /**
     * Sets the ExplicitDismissal for this transmittable notification
     * 
     * @param explicitDismissal
     *            : sets the explicit dismissal flag as either True=Requires
     *            user interaction or False otherwise
     */
    public void setExcplicitDismissal(boolean explicitDismissal);

    /**
     * Gets the ExplicitDismissal for this transmittable notification
     * 
     * @return : returns the explicit dismissal flag as either True=Requires
     *         user interaction or False otherwise
     */
    public boolean getExcplicitDismissal();

    /**
     * Set the Notification Type for this transmittable notification
     * 
     * @param notificationType
     *            : sets the notification type as defined by NotificationType
     *            enum
     */

    public void setNotificationType(APIMessageLevel notificationType);

    /**
     * Gets the notification type for this transmittable notification
     * 
     * @return : Returns the notification type for this transmittable
     *         notification
     */

    public APIMessageLevel getNotificationType();

}
