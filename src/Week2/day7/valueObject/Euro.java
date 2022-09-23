package Week2.day7.valueObject;

import java.util.Objects;

public class Euro {
    int money;

    public Euro(int money) {
        this.money = money;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return money == euro.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

    Euro add(Euro euro){
        int newMoney = this.money+euro.money;
        return new Euro(newMoney);
    }
}
