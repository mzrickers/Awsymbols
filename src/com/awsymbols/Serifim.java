package com.awsymbols;

// import necessary packages
import java.util.HashMap;
import java.util.Map;

public class Serifim
{
    //    Maybe another program for Serif finisher (chinese opera with six flags on his back so looks like a seraphin angel)
    //
    //    Finds words that can be changed in following ways: (one extra stroke changes letter)
    //            a = d or g or q
    //            (comma (,) = or)
    //            c = d, e, g, q
    //            C = O
    //            i = l
    //            l = b, d, h, k, K, P, t, T
    //            n = h, m
    //            N = M
    //            o = a, b, d, g, p, q
    //            O = Q
    //            P = B
    //            r = n
    //            t = f
    //            T = I, J
    //            u = a, w, y
    //            v = w, y
    //     `       y = g

    // create method to change word entered from keyboard into a serif counterpart and letter to replace
    static String serifize(String word, Character letter, HashMap<Character, Character> map)
    {
        // check if letter is in the map
        if (map.containsKey(letter))
        {
            // get the changed value from the hashMap
            Character value = map.get(letter);
            // replace all instances of the letter
            String serifWord = word.replace(letter, value);
            return serifWord;
        }
        else
        {
            return "Sorry, I cannot change that letter.";
        }
    }

    // create hashMap method

    public static HashMap<Character, Character> createSerifMap() {

        // initialize a HashMap to put the key and value pairs of letters to change
        HashMap<Character, Character> serifMap = new HashMap<>();

        // put the key value pairs into the HashMap
        serifMap.put('a', 'd');
        serifMap.put('c', 'e');
        serifMap.put('i', 'l');
        serifMap.put('l', 'b');
        serifMap.put('n', 'h');
        serifMap.put('o', 'a');
        serifMap.put('r', 'n');
        serifMap.put('t', 'f');
        serifMap.put('u', 'w');
        serifMap.put('v', 'w');
        serifMap.put('N', 'M');
        serifMap.put('O', 'Q');
        serifMap.put('y', 'g');
        serifMap.put('P', 'B');
        serifMap.put('T', 'I');
        serifMap.put('C', 'O');

        return serifMap;

    }

    // create method to check long list of words to see if it matches them

    public static void main(String[] args)
    {

        HashMap<Character, Character> newMap = createSerifMap();

        // run serifize() method
        System.out.println(serifize("Zach", 'Z', newMap));

    }
}

