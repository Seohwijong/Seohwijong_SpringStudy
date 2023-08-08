package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

/*
이름                널?       유형             
----------------- -------- -------------- 
NO                NOT NULL NUMBER         
GOODS_NAME        NOT NULL VARCHAR2(1000) 
GOODS_SUB                  VARCHAR2(1000) 
GOODS_PRICE       NOT NULL VARCHAR2(50)   
GOODS_DISCOUNT             NUMBER         
GOODS_FIRST_PRICE          VARCHAR2(20)   
GOODS_DELIVERY    NOT NULL VARCHAR2(20)   
GOODS_POSTER               VARCHAR2(260)  
HIT                        NUMBER   
 */
@Getter
@Setter
public class GoodsVO {
	private int no,discount,hit,account;
	private String name,sub,price,first_price,delivery,poster;
}
