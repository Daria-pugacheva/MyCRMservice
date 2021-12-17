package ru.gb.pugacheva.crm.myCRMservice.helpers;

import lombok.RequiredArgsConstructor;
import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;

@RequiredArgsConstructor
public class AbstractSending implements SendingLetters{
    private final SendingLetters sendingLetters;

    @Override
    public void sendLetter(Letter letter) {
        sendingLetters.sendLetter(letter);
    }
}
