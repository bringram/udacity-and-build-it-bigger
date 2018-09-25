/*
 * PROJECT LICENSE
 *
 * This project was submitted by Brandon Ingram as part of the Android Developer
 * Nanodegree Program at Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2018 Brandon Ingram
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.example.android.randomjokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomJokeTeller implements JokeTeller {

    private List<String> jokeList = Arrays.asList(
        "Did you hear about the crook who stole a calendar? He got 12 months!",
        "Did you hear about the semi-colon that broke the law? He was given 2 consecutive sentences.",
        "I just got fired from my job at the keyboard factory. They told me I wasn't putting in enough shifts.",
        "Why did the computer show up to work late? It had a hard drive.",
        "I'm a big fan of whiteboards. I find them quite remarkable",
        "Yesterday, a clown held the door open for me. It was such a nice jester!",
        "What do you call a pig that does karate? Pork chop!",
        "What do you call a bear with no teeth? A gummybear!",
        "How do you organize a space party? You planet!",
        "What kind of shorts do clouds wear? Thunderwear!",
        "Becoming a vegetarian is a big missed steak!",
        "What do ou call an alligator in a vest? An investigator!",
        "The machine at the coin factory just suddenly stopped working, with no explanation. It doesn't make any cents!",
        "I was going to make myself a belt made out of watches, but I realized it would just be a waist of time.",
        "What sound does a sleeping T-Rex make? A dino-snore!"
    );

    @Override
    public String tellJoke() {
        Random random = new Random();
        return jokeList.get(random.nextInt(jokeList.size()));
    }

}
