package org.ja_nigeria.janigeria.mvp;

import org.ja_nigeria.janigeria.model.EnrolledCourse;

import java.util.List;

public class EnrolledCourseMVP {
    public interface EnrolledCourseRepo{
        List<EnrolledCourse> getEnrolledCourses();
    }
}
