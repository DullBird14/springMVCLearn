package spittr.jms;

import spittr.entity.Spittle;

public interface AlertService {
	void sendSpittleAlert(Spittle spittle);
	void receiveMessage();
}
