import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.flywaydb.core.Flyway;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

import javax.sql.DataSource;


public class DBConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "datasourceKm")
    @Primary
    @ConfigurationProperties(prefix = "datasource.km")
    public DataSource dataSource() {
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        // 数据库驱动
        boneCPDataSource.setDriverClass(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        boneCPDataSource.setJdbcUrl(jdbcUrl);
        // 数据库的用户名
        boneCPDataSource.setUsername(jdbcUsername);
        // 数据库的密码
        boneCPDataSource.setPassword(jdbcUsername);
        // 检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消则设置为0
        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
        // 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
        boneCPDataSource.setIdleMaxAgeInMinutes(30);
        // 每个分区最大的连接数
        boneCPDataSource.setMaxConnectionsPerPartition(100);
        // 每个分区最小的连接数
        boneCPDataSource.setMinConnectionsPerPartition(5);

        return boneCPDataSource;
    }

    @Bean(name = "KmMigration", initMethod = "migrate")
    public Flyway flyway() throws SQLException {
        //logger.info(("================= start km db migration ================="));
        Flyway flyway = new Flyway();
        DataSource dataSource=dataSource();

        flyway.setDataSource(dataSource); // instance of your datasource
        return flyway;
    }
}
