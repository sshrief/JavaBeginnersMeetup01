package ticketMachine;

import java.time.LocalDateTime;

// class for saving the attributes of a transaction
public class Car {
    private LocalDateTime startTime = LocalDateTime.now();
    private LocalDateTime endTime = LocalDateTime.now();
    private String licencePlate;
    private int paidAmount;
    private int fee;

    public Car(LocalDateTime startTime, LocalDateTime endTime, String licencePlate, int paidAmount, int fee){

    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public int getFee() {
        return fee;
    }
}
