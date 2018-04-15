package spittr.jms;


import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;

import spittr.entity.Spittle;

public class AlertServiceImp implements AlertService {

	private JmsOperations jmsOperations;
	
	@Autowired
	public AlertServiceImp(JmsOperations jmsOperations){
		this.jmsOperations = jmsOperations;
	}
	@Override
	public void sendSpittleAlert(final Spittle spittle) {
//		jmsOperations.send("spitter.queue", new MessageCreator() {
//			@Override
//			public Message createMessage(Session arg0) throws JMSException {
//				return arg0.createObjectMessage(spittle);
//			}
//		});
		jmsOperations.convertAndSend(spittle);
		System.out.println("===============send over===============");
	}
	
	@Override
	public void receiveMessage() {
		try {
			ObjectMessage message = (ObjectMessage) jmsOperations.receive();
			System.out.println(((Spittle)message.getObject()).toString());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
