package challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;// RentalService rentalService;
    private OrderRepository orderRepository;// RentalRepository rentalRepository;


    public OrderProcessor(final InformationService informationService,final OrderService orderService,final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUserName(),orderRequest.getItemId(),orderRequest.getDateOfOrder());

        if(isOrdered){
            informationService.inform(orderRequest.getUserName());
            orderRepository.createOrder(orderRequest.getUserName(),orderRequest.getItemId(),orderRequest.getDateOfOrder());

            return new OrderDto(orderRequest.getUserName(),true);
        } else {
            return new OrderDto(orderRequest.getUserName(), false);
        }
    }
}
