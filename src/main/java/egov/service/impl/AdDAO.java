package egov.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egov.service1.AdVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("adDAO")
public class AdDAO extends EgovAbstractDAO {

	public String insertAd(AdVO vo) {
		
		return (String) insert("adDAO.insertAd",vo);
	}

	public List<?> selectadService(AdVO vo) {

		
		return list("adDAO.selectadService",vo);
	}

}
