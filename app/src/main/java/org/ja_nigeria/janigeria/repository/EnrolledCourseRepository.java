package org.ja_nigeria.janigeria.repository;

import org.ja_nigeria.janigeria.model.CourseModules;
import org.ja_nigeria.janigeria.model.EnrolledCourse;
import org.ja_nigeria.janigeria.model.Instructor;
import org.ja_nigeria.janigeria.model.ModuleContent;
import org.ja_nigeria.janigeria.mvp.EnrolledCourseMVP;
import org.ja_nigeria.janigeria.utils.ModuleStatus;
import org.ja_nigeria.janigeria.utils.ModuleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnrolledCourseRepository implements EnrolledCourseMVP.EnrolledCourseRepo {

    private static List<EnrolledCourse> coursesList;
    private static EnrolledCourseRepository repository;

    private EnrolledCourseRepository(){

        EnrolledCourse course1
                 = new EnrolledCourse("JA CAREER SUCCESS",
                Arrays.asList(new Instructor("Mr. Valentine Ofegbue", "Lead Instructor"),
                        new Instructor("Mr. Okechukwu", "Program Organizer")),

                Arrays.asList(
                        new CourseModules("SECTION I | GET HIRED: CRITICAL THINKING AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                        "intro_video"),

                                        new ModuleContent("Goal of this Module", ModuleType.POST , ModuleStatus.SEEN,
                                                "Students are introduced to the need to be work ready by developing " +
                                                        "the 4Cs skills that employers want from people entering the workforce. " +
                                                        "Students apply critical-thinking skills and creativity to solve problems " +
                                                        "in a real-life work scenario."),

                                        new ModuleContent("Before you begin", ModuleType.PDF , ModuleStatus.SEEN,
                                                "introduction")
                                )

                        ),

                        new CourseModules("SECTION 2 | GET HIRED: COMMUNICATION AND CONFLICT MANAGEMENT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.POST , ModuleStatus.NOTSEEN,
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Instructors note", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "introduction")
                                )

                        ),


                        new CourseModules("SECTION 3 | GET HIRED: COLLABORATION AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "study_material")
                                )

                        ),

                        new CourseModules("SECTION 4 | GET HIRED: STRONG SOFT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students will review soft skills that are in demand by employers and rate their " +
                                                        "own soft skills. They will use personal " +
                                                        "stories in a job-interview workshop to communicate these skills " +
                                                        "to a potential employer."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "study_material")
                                )

                        )

                ));

        EnrolledCourse course3
                 = new EnrolledCourse("JA CAREER SUCCESS",
                Arrays.asList(new Instructor("Mr. Valentine Ofegbue", "Lead Instructor"),
                        new Instructor("Mr. Okechukwu", "Program Organizer")),

                Arrays.asList(
                        new CourseModules("SECTION I | GET HIRED: CRITICAL THINKING AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                        "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students are introduced to the need to be work ready by developing " +
                                                        "the 4Cs skills that employers want from people entering the workforce. " +
                                                        "Students apply critical-thinking skills and creativity to solve problems " +
                                                        "in a real-life work scenario."),

                                        new ModuleContent("Before you begin", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "introduction")
                                )

                        ),

                        new CourseModules("SECTION 2 | GET HIRED: COMMUNICATION AND CONFLICT MANAGEMENT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Instructors note", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "introduction")
                                )

                        ),


                        new CourseModules("SECTION 3 | GET HIRED: COLLABORATION AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "study_material")
                                )

                        ),

                        new CourseModules("SECTION 4 | GET HIRED: STRONG SOFT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students will review soft skills that are in demand by employers and rate their " +
                                                        "own soft skills. They will use personal " +
                                                        "stories in a job-interview workshop to communicate these skills " +
                                                        "to a potential employer."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "study_material")
                                )

                        )

                ));

        EnrolledCourse course2
                 = new EnrolledCourse("JA CAREER SUCCESS",
                Arrays.asList(new Instructor("Mr. Valentine Ofegbue", "Lead Instructor"),
                        new Instructor("Mr. Okechukwu", "Program Organizer")),

                Arrays.asList(
                        new CourseModules("SECTION I | GET HIRED: CRITICAL THINKING AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                        "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students are introduced to the need to be work ready by developing " +
                                                        "the 4Cs skills that employers want from people entering the workforce. " +
                                                        "Students apply critical-thinking skills and creativity to solve problems " +
                                                        "in a real-life work scenario."),

                                        new ModuleContent("Before you begin", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "introduction")
                                )

                        ),

                        new CourseModules("SECTION 2 | GET HIRED: COMMUNICATION AND CONFLICT MANAGEMENT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Instructors note", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "introduction")
                                )

                        ),


                        new CourseModules("SECTION 3 | GET HIRED: COLLABORATION AND CREATIVITY",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.SEEN, 
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "Students apply communication skills to resolve conflicts in work-based scenarios. " +
                                                        "Students will role-play conflicts and conflict management. " +
                                                        "They will explore behaviors that inflame conflict and behaviors " +
                                                        "that lead to a resolution."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN, 
                                                "study_material")
                                )

                        ),

                        new CourseModules("SECTION 4 | GET HIRED: STRONG SOFT SKILLS",
                                Arrays.asList(new ModuleContent("Introduction to Module", ModuleType.VIDEO, ModuleStatus.NOTSEEN,
                                                "introduction"),

                                        new ModuleContent("Goal of this Module", ModuleType.PDF , ModuleStatus.NOTSEEN,
                                                "Students will review soft skills that are in demand by employers and rate their " +
                                                        "own soft skills. They will use personal " +
                                                        "stories in a job-interview workshop to communicate these skills " +
                                                        "to a potential employer."),

                                        new ModuleContent("Study Material", ModuleType.PDF , ModuleStatus.NOTSEEN,
                                                "study_material")
                                )

                        )

                ));


        coursesList = new ArrayList<>();
        coursesList.add(course1);
        coursesList.add(course2);
        coursesList.add(course3);
    }

    public static EnrolledCourseRepository getInstance(){
        if(repository == null){
            repository = new EnrolledCourseRepository();
        }

        return repository;
    }

    @Override
    public List<EnrolledCourse> getEnrolledCourses() {
        return coursesList;

    }
}
