package koschei.config;

import koschei.models.Duck5;
import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(@Qualifier("wood3") Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 getWood(@Qualifier("rabbit4")Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean
    public static Rabbit4 getRabbit(@Qualifier("duck5") Duck5 duck) {
        return new Rabbit4(duck);
    }

    @Bean
    public static Duck5 getAnotherDuck(@Qualifier("egg6") Egg6 egg) {
        return new Duck5(egg);
    }

    @Bean(name = "egg6")
    public static Egg6 getEgg(@Qualifier("needle8") Needle7 needle) {
        return new Egg6(needle);
    }

    @Bean(name = "needle8")
    public static Needle7 getNeedle() {
        return new Needle7();
    }
}

