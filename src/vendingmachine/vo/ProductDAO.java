package vendingmachine.vo;

import java.util.ArrayList;

public class ProductDAO {
	// ArrayList : 제품 정보 객체(ProductVO)들을 저장하기 위해 
	ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	// insert : ArrayList에 제품정보객체인 (ProductVO)를 추가하는 매소드
	public void insert(ProductVO pvo) {	
		productList.add(pvo);
	}
	// select : 전체 제품 정보 객체들을 반환하는 메소드
	public ArrayList<ProductVO> select(){
		return productList;
	}

}
