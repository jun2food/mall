package kr.co.mall.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mall.util.MyAppSqlConfig;
import kr.co.mall.vo.ProductVO;

public class ProductDAO {
	public static SqlSession sqlMapping;
	public ProductDAO () {
		sqlMapping = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List<ProductVO> selectLowPrice(int page){
		return sqlMapping.selectList("product.ProductDAO.selectLowPrice", page);
	}

	public List<ProductVO> selectHighPrice(int page) {
		
		return sqlMapping.selectList("product.ProductDAO.selectHighPrice", page);
	}

	public List<ProductVO> selectPName(int page) {
		
		return sqlMapping.selectList("product.ProductDAO.selectPName", page);
	}

	public List<ProductVO> selectPRegDate(int page) {
		
		return sqlMapping.selectList("product.ProductDAO.selectPRegDate", page);
	}
}
