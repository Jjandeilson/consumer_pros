package dev.fujioka.java.avancado.web.matricula;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import dev.fujioka.java.avancado.web.model.Disciplina;

@Component
public class DisciplinaConsumer {

    @JmsListener(destination = "disciplina_queue")
    public void receiveMessage(Disciplina disciplina) {
        System.out.println("Mensagem da fila:" + disciplina.getNome());
    }
}
