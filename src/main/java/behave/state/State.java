package behave.state;

public interface State {


    enum StateEnum {
        /**
         * new -> approving -> approved
         * new -> approving -> rejected
         * rejected -> approving -> approved
         * rejected -> approving -> rejected
         */
        NEW, APPROVING, APPROVED, REJECTED
    }


}
