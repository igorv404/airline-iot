package ua.lviv.iot.airline.managers.impl;

import ua.lviv.iot.airline.managers.ISearcher;

import java.util.Set;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searcher implements ISearcher {

  @Override
  public Set<String> findRightWords(String txt, int size) {
    String reg = String.format("\\b\\w{%d}\\b", size);
    Pattern pattern = Pattern.compile(reg);
    Matcher matcher = pattern.matcher(txt);
    Set<String> words = new HashSet<>();
    while (matcher.find())
      words.add(matcher.group().toLowerCase());
    return words;
  }
}
