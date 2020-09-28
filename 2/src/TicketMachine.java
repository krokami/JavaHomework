import java.util.*;

public class TicketMachine {
    private double TicketPrice;
    private double Money;
    private double TotalMoney;

    public TicketMachine(double cost){
        TicketPrice = cost;
        Money = 0;
        TotalMoney = 0;
    }

    public double getTicketPrice() {
        return TicketPrice;
    }

    public double getMoney(){
        return Money;
    }

    public void insertMoney(double amount){
        if(amount > 0){
            Money += amount;
        }else
            System.out.println("请输入合法数据");
    }

    public void printTicket(){
        if(Money >= TicketPrice){
            System.out.println("TICKET");
            System.out.println(TicketPrice + "￥");
            TicketPrice += Money;
            Money -= TicketPrice;
        }else
            System.out.println("还需要" + (TicketPrice - Money) + "￥");
    }

    public double reMoney(){
        double amountToRefund;
        amountToRefund = Money;
        Money = 0;
        return amountToRefund;
    }
}
