package com.demo.gnotesapp;

import com.demo.gnotesapp.entity.Note;
import com.demo.gnotesapp.service.intrface.NotesService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GNotesappApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder
														 application) {
		return application.sources(GNotesappApplication.class);
	}

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(GNotesappApplication.class, args);

		Note note = new Note();
		note.setNotecontent("My First Note");

		NotesService notesService = context.getBean(NotesService.class);
		notesService.addNote(note);
	}
}
