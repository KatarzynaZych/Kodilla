package challengeOne;


import java.time.LocalDateTime;

public interface OrderService {

    boolean order(OrderRequest orderRequest, LocalDateTime dateOfOrder);
}
