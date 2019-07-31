package jp.co.systena.tigerscave.springtest;

public class ListService {

  public static void setItem() {

      Item itemA;
      itemA = new Item();

      itemA.itemId = 10001;
      itemA.name = "A";
      itemA.price = 100;

      Item itemB;
      itemB = new Item();

      itemB.itemId = 10002;
      itemB.name = "B";
      itemB.price = 200;

      Item itemC;
      itemC = new Item();

      itemC.itemId = 10003;
      itemC.name = "C";
      itemC.price = 300;
  }

  public static void getItemList() {



  }

}
