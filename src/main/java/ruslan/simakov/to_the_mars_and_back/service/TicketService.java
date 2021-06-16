package ruslan.simakov.to_the_mars_and_back.service;

import ruslan.simakov.to_the_mars_and_back.model.TicketConfirmation;

import java.util.Date;

public interface TicketService {

    public TicketConfirmation order(String username, Date flyDate, int quantity);
}
