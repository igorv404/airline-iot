package ua.lviv.iot.airline.managers.impl;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearcherTest {
  Searcher searcher = new Searcher();
  Set<String> exmpl = new HashSet<>();
  String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
          " Cras semper libero non orci maximus, non laoreet massa varius. Sed consequat metus id felis mollis ullamcorper vitae id ligula." +
          " Aliquam rhoncus at justo sed viverra. Mauris eleifend ante eget urna varius, in rutrum augue ullamcorper." +
          " Nunc est risus, aliquam at tortor eu, fermentum lobortis mi." +
          " Nulla vehicula, erat quis fermentum mattis, ligula massa viverra est, quis auctor lorem massa quis metus." +
          " Nunc sed facilisis dolor. Aenean nec dignissim mauris. Donec eu ornare nunc.";

  @Test
  void findRightWords() {
    exmpl.add("ante");
    exmpl.add("amet");
    exmpl.add("urna");
    exmpl.add("quis");
    exmpl.add("elit");
    exmpl.add("orci");
    exmpl.add("eget");
    exmpl.add("cras");
    exmpl.add("nunc");
    exmpl.add("erat");
    assertNotEquals(searcher.findRightWords(txt, 4), null);
    assertEquals(searcher.findRightWords(txt, 4), exmpl);
  }
}