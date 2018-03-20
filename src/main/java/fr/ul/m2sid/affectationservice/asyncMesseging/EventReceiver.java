package fr.ul.m2sid.affectationservice.asyncMesseging;

import fr.ul.m2sid.affectationservice.entites.Event;
import fr.ul.m2sid.affectationservice.service.Matcher;
import javafx.util.Pair;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventReceiver {

    @Autowired
    Matcher matcher;
    @Autowired
    AffectationSender affectationSender;

    @RabbitListener(queues = RabbiMQConfig.AFFECTATION_QUEUE)
    public void receiveEventStream(Event event) {
        System.out.println("Received <" + event.toString() + ">");
        Pair<Integer, Integer> matched = matcher.mapEventToAgent(event);
        System.out.println(matched);
        affectationSender.sendAllocation(matched);
    }
}
