package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private Rabbit4 rabbit;

    @Autowired
    public Wood3(@Qualifier("getRabbit") Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    public Rabbit4 getRabbit() {
        return rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
