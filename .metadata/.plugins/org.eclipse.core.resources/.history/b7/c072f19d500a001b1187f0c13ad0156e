package com.spring5.ch2;

import com.spring5.ch2.decoupled.HelloWorldMessageProvider;
import com.spring5.ch2.decoupled.MessageProvider;
import com.spring5.ch2.decoupled.MessageRenderer;
import com.spring5.ch2.decoupled.StandardOutMessageRenderer;

public class HelloWorld {

	public static void main(String[] args) {

		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();

	}

}
