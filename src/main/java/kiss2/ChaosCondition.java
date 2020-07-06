package kiss2;

public class ChaosCondition {
    private boolean isUpdateReady;
    private boolean isSynchCompleted;
    private boolean isCacheEnabled;

    private void updateDb(boolean isForceUpdate) {

        // isUpdateReady is class level
        // variable
        if (isUpdateReady) {

            // isForceUpdate is argument variable
            // and based on this inner blocks is
            // executed
            if (isForceUpdate) {

                // isSynchCompleted is also class
                // level variable, based on its
                // true/false updateDbMain is called
                // here updateBackupDb is called
                // in both the cases
                if (isSynchCompleted) {
                    updateDbMain(true);
                    updateBackupDb(true);

                } else {
                    updateDbMain(false);
                    updateBackupDb(true);
                }
            } else {

                // execute this if isUpdateReady is
                // false i. e., this is dependent on
                // if condition
                updateCache(!isCacheEnabled);

                // end of second isForceUpdate block
            }

            // end of first if block
        }

        // end of method
    }

    private void updateCache(boolean b) {

    }

    private void updateBackupDb(boolean b) {

    }

    private void updateDbMain(boolean b) {

    }
}
