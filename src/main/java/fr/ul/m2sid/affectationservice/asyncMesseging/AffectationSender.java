package fr.ul.m2sid.affectationservice.asyncMesseging;

import fr.ul.m2sid.affectationservice.entites.Allocation;
import javafx.util.Pair;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class AffectationSender {

    private RabbitTemplate rabbitTemplate;

    public AffectationSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendAllocation(Pair<Integer,Integer> allocation){
        rabbitTemplate.convertAndSend(RabbiMQConfig.ALLOCATION_QUEUE, new Allocation(allocation.getKey(),allocation.getValue()));
    }
}

