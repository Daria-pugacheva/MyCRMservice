package ru.gb.pugacheva.crm.myCRMservice.helpers;

import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;


public class StandartEmailLetterSender implements SendingLetters{

    @Override
    public void sendLetter(Letter letter) {
        //тут какая-то логика автоматической рассылки на email на заданный адрес заданного текста (берется из письма)
        System.out.println("Отправка письма : " + letter.getMessage() + " по email: " + letter.getAddress());
    }
}
