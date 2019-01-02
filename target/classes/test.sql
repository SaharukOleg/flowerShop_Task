select * from listOfTulips;


SELECT listOfTulips.id,listOfTulips.price, tulipType.tulipType, color.colorKind
FROM listOfTulips LEFT JOIN tulipType ON  listOfTulips.tulipType = tulipType.id
LEFT JOIN color ON listOfTulips.tulipColor = color.idColor;
