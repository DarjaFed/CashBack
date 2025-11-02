package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @org.junit.Test
    public void shouldReturnZeroForAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnOneForAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn999ForAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn500ForNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = -500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn1000ForZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn500ForLargeNumber() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}