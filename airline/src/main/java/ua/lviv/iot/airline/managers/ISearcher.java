package ua.lviv.iot.airline.managers;

import java.util.Set;

public interface ISearcher {
  Set<String> findRightWords (String txt, int size);
}
