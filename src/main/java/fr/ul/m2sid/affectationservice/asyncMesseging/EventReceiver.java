package fr.ul.m2sid.affectationservice.asyncMesseging;

import fr.ul.m2sid.affectationservice.entites.Event;
import fr.ul.m2sid.affectationservice.service.Matcher;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventReceiver {

    @Autowired
    Matcher matcher;


    @RabbitListener(queues = RabbiMQConfig.queueName)
    public void receiveEventStream(Event event) {
        System.out.println("Received <" + event.toString() + ">");
        System.out.println(matcher.mapEventToAgent(event));
    }
}
