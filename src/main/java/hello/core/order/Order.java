package hello.core.order;

public class Order {

    private Long MemberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    // 생성자 생성
    // 주문에서 할인 다 했을때 만들어지는 객체
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        MemberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    // 계산로직
    // 계산된 결과
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }


    public Long getMemberId() {
        return MemberId;
    }

    public void setMemberId(Long memberId) {
        MemberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    // 출력시 보기좋게
    // 객체를 출력하면 to String 으로 출력
    @Override
    public String toString() {
        return "Order{" +
                "MemberId=" + MemberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';

    }
}
