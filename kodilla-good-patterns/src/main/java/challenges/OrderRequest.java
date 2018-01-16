package challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User userName;
    private LocalDateTime dateOfOrder ;
    private int itemId;



    public OrderRequest(User user, int itemId, LocalDateTime dateOfOrder) {
        this.userName = user;
        this.itemId = itemId;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUserName() {
        return userName;
    }

    public int getItemId() {
        return itemId;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

}
