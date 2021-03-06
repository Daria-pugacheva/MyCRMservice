package ru.gb.pugacheva.crm.myCRMservice.services;

import org.springframework.stereotype.Service;
import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;
import ru.gb.pugacheva.crm.myCRMservice.helpers.BirthdayLetterFactory;
import ru.gb.pugacheva.crm.myCRMservice.helpers.BonusLetterFactory;
import ru.gb.pugacheva.crm.myCRMservice.helpers.LetterFactory;

@Service
public class LetterService {
    
    public Letter createLetter (String address, LetterType type){
        return createFactory(type).createLetter(address);
    }

    private LetterFactory createFactory (LetterType type){
        switch (type) {
            case BIRTH:
                return new BirthdayLetterFactory();
            case BONUS:
                return new BonusLetterFactory();
            default:
                throw new IllegalArgumentException("Генерация писем такого типа не поддерживается");
        }
    }

    public enum LetterType{
        BIRTH, BONUS
    }

}
