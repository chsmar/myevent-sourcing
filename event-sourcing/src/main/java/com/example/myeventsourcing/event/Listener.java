package com.example.myeventsourcing.event;

import java.lang.annotation.*;

/**
 * Created by Administrador on 16/02/2016.
 */

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@RabbitListener(bindings = @QueueBinding(exchange = @Exchange(value = "java.lang.String", type = ExchangeTypes.FANOUT, durable = "true"), value = @Queue(value = "teststring", durable = "true")))
//@RabbitListener
public @interface Listener {
}
