package io.github.jeqo.poc.tracing;

import com.typesafe.config.Config;
import zipkin2.reporter.Sender;
import zipkin2.reporter.okhttp3.OkHttpSender;

public class TracingHelper {

	public static Sender sender(Config config) {
		// final String kafkaBootstrapServers =
		// config.getString("kafka.bootstrap-servers");
		// final KafkaSender sender = KafkaSender.newBuilder()
		// .bootstrapServers(kafkaBootstrapServers).build();
		final String zipkinApiEndpoint = config.getString("zipkin.api.endpoint");
		final OkHttpSender sender = OkHttpSender.create(zipkinApiEndpoint);
		return sender;
	}

}
