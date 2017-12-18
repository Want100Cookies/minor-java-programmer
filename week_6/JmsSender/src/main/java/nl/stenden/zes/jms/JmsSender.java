package nl.stenden.zes.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.beans.ExceptionListener;
import java.util.Date;

public class JmsSender implements javax.jms.ExceptionListener {

    public static void main(String... args) {
        new JmsSender().run();
    }



    private void run() {
        try {
            // Create a ConnectionFactory
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();
            connection.setExceptionListener(this);
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("stenden6");
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);

            String text = "Hello world! @ " + new Date();
            TextMessage message = session.createTextMessage(text);

            // Tell the producer to send the message
            producer.send(message);

            session.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void onException(JMSException e) {
        System.out.println(e);
    }
}
