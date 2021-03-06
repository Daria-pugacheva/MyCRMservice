package ru.gb.pugacheva.crm.myCRMservice.helpers;

import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;

public class BirthdayLetterFactory implements LetterFactory{

    @Override
    public Letter createLetter(String address) {
        return new Letter(address, "С днем рождения!");
    }
}
