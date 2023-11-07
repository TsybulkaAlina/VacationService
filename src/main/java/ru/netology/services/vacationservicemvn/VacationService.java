package ru.netology.services.vacationservicemvn;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0; //Месяцы отпуска
        int currentBalance = 0; //Текущий баланс

        for (int month = 1; month <= 12; month++) {
            if (currentBalance >= threshold) {
                vacationMonths++;

                currentBalance = currentBalance / 3;
            } else {
                currentBalance += income;
            }

            currentBalance -= expenses;
        }

        return vacationMonths; //Количество месяцев для отпуска
    }
}
