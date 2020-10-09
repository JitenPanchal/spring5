package com.spring5.ch2.decoupled;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;

	public void render() {
		if (messageProvider == null)
			throw new RuntimeException("MessageProvider is not set");

		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}