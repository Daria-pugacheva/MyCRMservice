package ru.gb.pugacheva.crm.myCRMservice.helpers;

import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;

public interface LetterFactory {
    Letter createLetter (String address);
}
