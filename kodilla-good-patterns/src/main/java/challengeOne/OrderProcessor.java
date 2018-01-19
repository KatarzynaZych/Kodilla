package challengeOne;

import java.time.LocalDateTime;

public class OrderProcessor {

    private Shop shop;
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(Shop shop, InformationService informationService,OrderService orderService) {
        this.shop = shop;
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public boolean orderProcess(OrderRequest orderRequest, LocalDateTime dateOfOrder){

        this.shop.process(orderRequest);

        boolean isOrdered = orderService.order(orderRequest, dateOfOrder);

        if(isOrdered){
            informationService.inform(orderRequest);
            return true;
        } else {
            return false;
        }
    }

}
