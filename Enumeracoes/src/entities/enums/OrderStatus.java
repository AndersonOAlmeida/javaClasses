package entities.enums; // para melhor organização, é bom colocar os enums como dependências das entities no projeto

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
