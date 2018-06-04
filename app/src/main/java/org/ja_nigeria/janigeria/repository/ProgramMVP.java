package org.ja_nigeria.janigeria.repository;

import org.ja_nigeria.janigeria.model.ProgramsCategory;

import java.util.List;

public class ProgramMVP {
    public interface Programs{
        List<ProgramsCategory> getAllProgramCategories();
    }
}
