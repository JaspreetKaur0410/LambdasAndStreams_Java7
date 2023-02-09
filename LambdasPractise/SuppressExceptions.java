/* while handling exceptions using try or finally lock
* you get exception in those blocks as well*/
/*Suppressed exceptions are the exceptions thrown in the code but were ignored somehow.
One of the classic example is in the scenario’s ‘try-catch-finally’ block execution, where we received
 an exception in try block and again there is one more exception thrown due to which the super exception
 from try block will be ignored.
 */
public class SuppressExceptions {
    public static void main(String[] args) {

    }
}
