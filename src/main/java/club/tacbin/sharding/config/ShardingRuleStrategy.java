package club.tacbin.sharding.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class ShardingRuleStrategy implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        System.out.println(collection);
        System.out.println(preciseShardingValue);
        Long value = preciseShardingValue.getValue();
        if (value.longValue() % 2 == 0){
            return "db0";
        }else {
            return "db1";
        }
    }
}
