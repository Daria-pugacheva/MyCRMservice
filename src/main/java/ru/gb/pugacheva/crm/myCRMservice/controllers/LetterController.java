package ru.gb.pugacheva.crm.myCRMservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.pugacheva.crm.myCRMservice.dtos.Letter;
import ru.gb.pugacheva.crm.myCRMservice.services.LetterService;


@RestController
@RequestMapping("/api/v1/letters")
@RequiredArgsConstructor
public class LetterController {
    private final LetterService letterService;

    @GetMapping("/{address}/{phone}/{type}")
    public Letter createLetter(@PathVariable String address, @PathVariable String phone, @PathVariable LetterService.LetterType type) {
        return letterService.createLetter(address,phone, type);

    }

    @PostMapping("/send")//TODO: можно потом расширить вриантами рассылки, которые будут в запросе фигурировать (только почта или еще доп.вайбер и т.п.)
    public void sendLetter(@RequestBody Letter letter) {
       letterService.sendLetter(letter);
    }

}
