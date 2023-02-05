package org.example.listener;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;

//@Slf4j
@Component
public class CourseMessageListener {
    @SqsListener(value = "${courses.queue.name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void processMessage(String message) {
        try {
            //log.debug("Received new SQS message: {}", message );
            /*OrderDto orderDto = OBJECT_MAPPER.readValue(message, OrderDto.class);

            this.orderService.processOrder(orderDto);*/
          /*  {                "courseName": "Devops",                 "courseDuration": "60hours"           }*/
            System.out.println("Received new SQS message:"+message);

        } catch (Exception e) {
            throw new RuntimeException("Cannot process message from SQS", e);
        }
    }
}

