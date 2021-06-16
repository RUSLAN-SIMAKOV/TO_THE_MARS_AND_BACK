package ruslan.simakov.to_the_mars_and_back.service.impl;

import org.springframework.stereotype.Service;
import ruslan.simakov.to_the_mars_and_back.model.TicketConfirmation;
import ruslan.simakov.to_the_mars_and_back.service.TicketService;

import java.util.Date;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public TicketConfirmation order(String username, Date flyDate, int quantity) {
        return new TicketConfirmation("ELON MASK", new Date(), 1, 1);
    }
}
