package vendingmachine.view;

import java.util.ArrayList;
import java.util.Scanner;

import vendingmachine.vo.ProductVO;

public class ProductView {
	ArrayList<ProductVO> productList;
	Scanner s1 = new Scanner(System.in);
	
	//메서드 
	public void displayProducts() {
			int cnt=0;
			System.out.println("=======Drink Vending Machine=======\n");
			for(ProductVO vo : productList) {
					System.out.print((vo.getProductNum()+1)+":"+vo.getName()
					+"[price:"+vo.getPrice()+", stock:"+vo.getStockNum()+"]\t");
					if(++cnt % 3 ==0)
						System.out.println();
			}
			System.out.println("\n====================================\n");				
			
		}
	
	public void inputPurchase() {
		System.out.println("=======Purchase Drink=======");
		System.out.print("구입제품 번호를 입력하세요 : ");
		int productNum = s1.nextInt();
		ProductVO vo = productList.get(productNum-1);
		
		if(vo.getStockNum() > 0) {
			System.out.print(vo.getName()+"제품의 가격 : "+vo.getPrice()+"원, 돈 투입 :");
			int price = s1.nextInt();
			
			System.out.println(vo.getName()+"제품이 나왔습니다.");
			if(price > vo.getPrice())
				System.out.println("거스름돈: "+(price - vo.getPrice())+"원");
			vo.setStockNum(vo.getStockNum()-1);
		}else {
			System.out.println("선택하신 제품은 재고가 없습니다.");
		}
	}
	
	public Scanner getS1() {
		return s1;
	}
	public void setProductList(ArrayList<ProductVO> productList) {
		this.productList = productList;
	}

}
