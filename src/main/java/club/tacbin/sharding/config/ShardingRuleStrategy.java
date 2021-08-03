package club.tacbin.sharding.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author 01401951
 */
public class ShardingRuleStrategy implements PreciseShardingAlgorithm<String> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        System.out.println(collection);
        System.out.println(preciseShardingValue);
        String value = preciseShardingValue.getValue();
        if (value.equals("123")){
            return "db0";
        }else {
            return "db1";
        }
    }
}
