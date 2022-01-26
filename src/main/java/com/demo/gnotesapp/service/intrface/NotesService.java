package com.demo.gnotesapp.service.intrface;

import com.demo.gnotesapp.entity.Note;

import java.util.List;

public interface NotesService {
    Note addNote(Note note);
    Note GetNote(Long noteid);
    public List<Note> GetAllNotes();
    void DeleteNote(Long noteID);
}
