package com.demo.gnotesapp.service.implementation;

import com.demo.gnotesapp.entity.Note;
import com.demo.gnotesapp.repository.NotesRepository;
import com.demo.gnotesapp.service.intrface.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    NotesRepository notesRepository;

    @Override
    public Note addNote(Note note) {
        return notesRepository.save(note);
    }

    @Override
    public Note GetNote(Long id) {
        return notesRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }

    @Override
    public List<Note> GetAllNotes() {
        return notesRepository.findAll();
    }

    @Override
    public void DeleteNote(Long noteID) {
        notesRepository.findById(noteID).orElseThrow(() -> new RuntimeException("Note not found"));
        notesRepository.deleteById(noteID);
    }
}
