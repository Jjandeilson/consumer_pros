package dev.fujioka.java.avancado.web.matricula;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import dev.fujioka.java.avancado.web.model.Curso;

@Component
public class CursoConsumer {

	@JmsListener(destination = "curso_queue")
	public void reveiceMesage(Curso curso) {
		System.out.println("Mensagem da curso:" + curso.getNome());
	}
	
}
