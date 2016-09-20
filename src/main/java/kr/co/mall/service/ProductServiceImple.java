package kr.co.mall.service;

import java.util.List;

import kr.co.mall.dao.ProductDAO;
import kr.co.mall.vo.ProductVO;

public class ProductServiceImple implements ProductService {
	ProductDAO pDao = new ProductDAO();

	@Override
	public List<ProductVO> selectLowPrice(int page) throws Exception {
		return pDao.selectLowPrice(page);
	}
	@Override
	public List<ProductVO> selectHighPrice(int page) throws Exception {
		
		return pDao.selectHighPrice(page);
	}
	@Override
	public List<ProductVO> selectPName(int page) throws Exception {
	
		return pDao.selectPName(page);
	}
	@Override
	public List<ProductVO> selectPRegDate(int page) throws Exception {
		
		return pDao.selectPRegDate(page);
	}
	
}
