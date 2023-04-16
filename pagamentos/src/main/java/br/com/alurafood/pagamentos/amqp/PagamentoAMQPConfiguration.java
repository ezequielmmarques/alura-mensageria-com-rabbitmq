package br.com.alurafood.pagamentos.amqp;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamentoAMQPConfiguration {

    private final String QUEUE_PAGAMENTO_CONCLUIDO = "pagamento.concluido";

    @Bean
    public Queue queuePagamento() {
        // return new Queue(QUEUE_PAGAMENTO_CONCLUIDO, false);
        return QueueBuilder.nonDurable(QUEUE_PAGAMENTO_CONCLUIDO).build();
    }
}
