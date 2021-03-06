package com.spring5.ch2.decoupled;

import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance;

	private Properties props;

	private MessageRenderer messageRenderer;

	private MessageProvider messageProvider;

	@SuppressWarnings("deprecation")
	private MessageSupportFactory()
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		super();

		props = new Properties();

		props.load(this.getClass().getResourceAsStream("/msf.properties"));

		messageRenderer = (MessageRenderer) Class.forName(props.getProperty("renderer.class")).newInstance();
		messageProvider = (MessageProvider) Class.forName(props.getProperty("provider.class")).newInstance();

	}

	static {
		try {
			instance = new MessageSupportFactory();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return messageRenderer;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
