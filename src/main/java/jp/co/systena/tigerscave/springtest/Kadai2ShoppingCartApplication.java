package jp.co.systena.tigerscave.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kadai2ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kadai2ShoppingCartApplication.class, args);

	}



    public class ListService {

      system.out.println();

    }

	public class Item {

      //itemIdを設定する。
	  public static int ItemIdSet{

	      int[] itemId[];

	      itemId[0] = 10001;
    	  itemId[1] = 10002;
    	  itemId[2] = 10003;
    	  itemId[3] = 10004;
    	  itemId[4] = 10005;
	  }

	  //nameを設定する。
      public static String Name {

          String[] name[];

          name[0]="A";
    	  name[1]="B";
    	  name[2]="C";
    	  name[3]="D";
    	  name[4]="E";
      }

      //priceを設定する。
      public static int[] price {

          int[] price;

    	  price[0]=100;
    	  price[1]=200;
    	  price[2]=300;
    	  price[3]=400;
    	  price[4]=500;
      }

	}

}
