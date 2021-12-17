package ru.gb.pugacheva.crm.myCRMservice.helpers;

import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;

public class BonusLetterFactory implements LetterFactory{

    @Override
    public Letter createLetter(String address, String phone) {
        return new Letter(address, "За покупку товара вы получаете бонус!", phone);
    }
}
