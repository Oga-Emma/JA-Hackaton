package org.ja_nigeria.janigeria.repository;

import org.ja_nigeria.janigeria.model.Program;
import org.ja_nigeria.janigeria.model.ProgramSession;
import org.ja_nigeria.janigeria.model.ProgramsCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramsRepository implements ProgramMVP.Programs{

    private static ProgramsRepository programsRepository;


    List<ProgramsCategory> programCategoryList;

    /**
     * var title: String,
     var implementation: String,
     var duration: String,
     var level: String,
     var concepts: String,
     var skills: String,
     var session: List<ProgramSession>,
     var about: String
     */

    private ProgramsRepository() {
        programCategoryList = new ArrayList<>();


        List programList = new ArrayList<>();

        List<ProgramSession> sessions = Arrays.asList(
                new ProgramSession(1, "A place where people live, work and play",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(2, "A place where people spend money",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(3, "A place where people dine",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(4, "A place where people communicate",
                        "Students identify the different zones used in city planning and apply the information to organize businesses.")
                );
        programList.add(new Program("JA OUR CITY", "Classroom-Based",
                "5 Weeks", "Elementary School(Primary 4, Primary 5, Primary 6",
                "Banking, Business, Business decisions, Circular flow of money, City, City planner, Communication, Consumer, Currency, Deposit, Digital communication, Economic development, Entrepreneur, Goods, Interdependence, Interest, Jobs, Making payments, Money choices, Needs and wants, Producer, Savings account, Services, Taxes, Technology, Transaction, Withdrawal, Zones.",
                "Addition and subtraction, Brainstorming, Conceptualizing, Critical thinking, Decision making, Developing ideas, Drawing conclusions, Following simple, multi-step directions, Identifying zones, Listening critically, Making choices, Making decisions, Making observations, Mapping information, Participating in large-group activities, Planning a business, Problem solving, Reading and writing, Teamwork, Verbal communication, Working in groups, Writing.",
                sessions,
                "\n" +
                        "\n" +
                        "JA Our City introduces students to the basics of financial literacy, the characteristics of cities, and how people and businesses in cities manage their money.\n" +
                        "\n" +
                        "Students will explore zoning found within a city; the importance of money to a city, paying taxes, and how people use different methods to pay for goods and services. They also will explore how financial institutions, entrepreneurs, and news media contribute to the financial well-being of a city.\n"));

        sessions = Arrays.asList(
                new ProgramSession(1, "A place where people live, work and play",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(2, "A place where people spend money",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(3, "A place where people dine",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(4, "A place where people communicate",
                        "Students identify the different zones used in city planning and apply the information to organize businesses.")
                );
        programList.add(new Program("JA OUR NATION", "Classroom-Based",
                "5 Weeks", "Elementary School(Primary 4, Primary 5, Primary 6",
                "Banking, Business, Business decisions, Circular flow of money, City, City planner, Communication, Consumer, Currency, Deposit, Digital communication, Economic development, Entrepreneur, Goods, Interdependence, Interest, Jobs, Making payments, Money choices, Needs and wants, Producer, Savings account, Services, Taxes, Technology, Transaction, Withdrawal, Zones.",
                "Addition and subtraction, Brainstorming, Conceptualizing, Critical thinking, Decision making, Developing ideas, Drawing conclusions, Following simple, multi-step directions, Identifying zones, Listening critically, Making choices, Making decisions, Making observations, Mapping information, Participating in large-group activities, Planning a business, Problem solving, Reading and writing, Teamwork, Verbal communication, Working in groups, Writing.",
                sessions,
                "\n" +
                        "\n" +
                        "JA Our City introduces students to the basics of financial literacy, the characteristics of cities, and how people and businesses in cities manage their money.\n" +
                        "\n" +
                        "Students will explore zoning found within a city; the importance of money to a city, paying taxes, and how people use different methods to pay for goods and services. They also will explore how financial institutions, entrepreneurs, and news media contribute to the financial well-being of a city.\n"));


        sessions = Arrays.asList(
                new ProgramSession(1, "A place where people live, work and play",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(2, "A place where people spend money",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(3, "A place where people dine",
                        "Students identify the different zones used in city planning and apply the information to organize businesses."),
                new ProgramSession(4, "A place where people communicate",
                        "Students identify the different zones used in city planning and apply the information to organize businesses.")
                );

        programList.add(new Program("JA MORE THAN MONEY", "Classroom-Based",
                "5 Weeks", "Elementary School(Primary 4, Primary 5, Primary 6",
                "Banking, Business, Business decisions, Circular flow of money, City, City planner, Communication, Consumer, Currency, Deposit, Digital communication, Economic development, Entrepreneur, Goods, Interdependence, Interest, Jobs, Making payments, Money choices, Needs and wants, Producer, Savings account, Services, Taxes, Technology, Transaction, Withdrawal, Zones.",
                "Addition and subtraction, Brainstorming, Conceptualizing, Critical thinking, Decision making, Developing ideas, Drawing conclusions, Following simple, multi-step directions, Identifying zones, Listening critically, Making choices, Making decisions, Making observations, Mapping information, Participating in large-group activities, Planning a business, Problem solving, Reading and writing, Teamwork, Verbal communication, Working in groups, Writing.",
                sessions,
                "\n" +
                        "\n" +
                        "JA Our City introduces students to the basics of financial literacy, the characteristics of cities, and how people and businesses in cities manage their money.\n" +
                        "\n" +
                        "Students will explore zoning found within a city; the importance of money to a city, paying taxes, and how people use different methods to pay for goods and services. They also will explore how financial institutions, entrepreneurs, and news media contribute to the financial well-being of a city.\n"));

        programCategoryList.add(new ProgramsCategory("PRIMARY", programList));

    }

    public static ProgramsRepository getInstance() {
         if(programsRepository == null){
             programsRepository = new ProgramsRepository();
         }

         return programsRepository;
    }

    @Override
    public List<ProgramsCategory> getAllProgramCategories() {
        return programCategoryList;
    }
}
