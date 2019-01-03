package com.sahar.repository;

public interface DBQueries {
  String GET_ALL_TULIPS = "SELECT listOfTulips.id, listOfTulips.price, tulipType.tulipType, color.colorKind " +
          " FROM listOfTulips LEFT JOIN tulipType ON  listOfTulips.tulipType = tulipType.id " +
          "LEFT JOIN color ON listOfTulips.tulipColor = color.idColor;";


}
