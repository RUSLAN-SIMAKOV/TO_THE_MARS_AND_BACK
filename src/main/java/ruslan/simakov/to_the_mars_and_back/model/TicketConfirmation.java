package ruslan.simakov.to_the_mars_and_back.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public final class TicketConfirmation {

    private String confirmationId = UUID.randomUUID().toString();
    private String username;
    private int quantity;
    private Date flyDate;
    private float price;

    public TicketConfirmation(String username, Date flyDate, int quantity, float price) {
        this.username = username;
        this.flyDate = flyDate;
        this.quantity = quantity;
        this.price = price;
    }
}
