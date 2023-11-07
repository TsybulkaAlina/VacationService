package ru.netology.services.vacationservicemvn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationMonths() {
        VacationService vacationService = new VacationService();

        int income = 10000; // Сумма ежемесячного пополнения когда работаешь
        int expenses = 3000; // Сумма ежемесячных трат
        int threshold = 20000; //Порог денег на счету для отдыха
        int expectedVacationMonths = 3; //Количество отпускных месяцев

        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void testCalculateVacationMonthsSecond() {
        VacationService vacationService = new VacationService();

        int income = 100000; // Сумма ежемесячного пополнения когда работаешь
        int expenses = 60000; // Сумма ежемесячных трат
        int threshold = 150000; //Порог денег на счету для отдыха
        int expectedVacationMonths = 2; //Количество отпускных месяцев

        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}