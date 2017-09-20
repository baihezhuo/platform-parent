package bhz.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 使用bus-kafka之后: 我们直接http://localhost:4000/bus/refresh刷新配置中心即可。不需要再刷新具体的微服务端
 * <B>系统名称：</B>platform-config-server<BR>
 * <B>模块名称：</B>Application<BR>
 * <B>中文类名：</B>应用启动主入口<BR>
 * <B>概要说明：</B>应用启动主入口<BR>
 * @author baihezhuo
 * @since 2017年9月20日 下午3:02:56
 */
@EnableConfigServer	//开启配置中心服务
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
