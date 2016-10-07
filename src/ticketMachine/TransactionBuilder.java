package ticketMachine;

import java.time.LocalDateTime;

/*
class for building a transaction
 */
public class TransactionBuilder {

    private LocalDateTime startTime = LocalDateTime.now();
    private LocalDateTime endTime = LocalDateTime.now();
    private String licencePlate;
    private int paidAmount;
    private int fee;

    /*
     * constructs a new Transactionbuilder
     *
     * @param fee Parking fee cent/ minute
     */
    public TransactionBuilder(int fee) {
        this.fee = fee;
    }

    /*
     * increases endTime and paidAmount by adding money
     *
     * @param amount in cents
     */
    public void addMoney(int amount) {
    }

    /*
     * decreases endTime and paidAmount by removing money paidAmount will never
     * be less then zero
     *
     * @param amount in cents
     */
    public void removeMoney(int amount) {
    }

    /*
     * puts attributes of this object in a new car object
     */
    public Car finishTransaction() {

    }


}