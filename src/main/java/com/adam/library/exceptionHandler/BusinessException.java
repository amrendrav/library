package com.adam.library.exceptionHandler;

import com.adam.library.enums.APIMessageLevel;

public class BusinessException extends RuntimeException implements Transmittable {

        private String message;
        private boolean explicitDismissal;

        private APIMessageLevel notificationType;

        /**
         * Create an BaseException based on defaults
         *
         * message:=This constructor uses the thrown exceptions message for its
         * value explicitDismissal:=false notificationType:=NotificationType.I
         *
         * @param throwable
         *            : thrown exception object
         */
    public BusinessException(Throwable throwable) {
            super(throwable);
            this.message = throwable.getMessage();

            this.explicitDismissal = true;
            this.notificationType = APIMessageLevel.E;
        }

        /**
         * Create an BaseException based on a custom message and passes the
         * flow of control through the thrown exceptions constructor
         *
         * explicitDismissal:=false notificationType:=NotificationType.I
         *
         * @param message
         *            : message for the BaseException
         * @param throwable
         *            : thrown exception object value
         */
    public BusinessException(String message, Throwable throwable) {
            super(message, throwable);
            this.message = message;
            this.explicitDismissal = true;

            this.notificationType = APIMessageLevel.E;
        }

        /**
         * Creates an BaseException and specifies the following values as
         * defaults.
         *
         * explicitDismissal:=false notificationType:=NotificationType.I
         *
         * @param message
         *            : message for the BaseException
         */
    public BusinessException(String message) {
            super(message);
            this.message = message;
            this.explicitDismissal = true;

            this.notificationType = APIMessageLevel.E;
        }

        /**
         * Creates an BaseException and specifies the following values as
         * defaults.
         *
         * notificationType:=NotificationType.I
         *
         * @param message
         *            : message for the BaseException
         * @param explicitDismissal
         *            : True requires the user to explicitly dismiss the
         *            notification, false otherwise.
         */
    public BusinessException(String message, boolean explicitDismissal) {
            super(message);
            this.message = message;
            this.explicitDismissal = explicitDismissal;
            this.notificationType = APIMessageLevel.E;
        }

        /**
         * Creates an BaseException and specifies the following values as
         * defaults.
         *
         * @param message
         *            : message for the BaseException
         * @param explicitDismissal
         *            : True requires the user to explicitly dismiss the
         *            notification, false otherwise.
         * @param nt
         *            : The type of notification to be sent to the users machine.
         */

    public BusinessException(String message, boolean explicitDismissal, APIMessageLevel nt) {
            super(message);
            this.message = message;
            this.explicitDismissal = explicitDismissal;
            this.notificationType = nt;
        }

    public BusinessException(Exception e, String s) {
            super(e);
            this.explicitDismissal = true;
            this.message = s;
            this.notificationType = APIMessageLevel.E;

        }

    public BusinessException(Exception e, APIMessageLevel messageLevel) {
            super(e);
            this.notificationType = messageLevel;
        }

        @Override
        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String getMessage() {
            return this.message;
        }

        @Override
        public void setExcplicitDismissal(boolean explicitDismissal) {
            this.explicitDismissal = explicitDismissal;
        }

        @Override
        public boolean getExcplicitDismissal() {
            return this.explicitDismissal;
        }

        @Override
        public void setNotificationType(APIMessageLevel notificationType) {
            this.notificationType = notificationType;
        }

        public APIMessageLevel getNotificationType() {
            return this.notificationType;
        }
}
