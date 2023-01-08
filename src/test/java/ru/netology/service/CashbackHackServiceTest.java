package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 10;

        int actual = cashbackHackService.remain(amount);
        int expected = 990;

        assertEquals(expected, actual);
    }
}