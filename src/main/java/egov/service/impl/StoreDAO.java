package egov.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egov.service1.BusinessEnterVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("storeDAO")
public class StoreDAO extends EgovAbstractDAO{

	
	/*
	 * StoreRegister화면 List (강성모)
	 *	 */
	public List<?> selectstoreService(BusinessEnterVO vo) {
		return list("storeDAO.selectstoreService",vo);
	}

	public BusinessEnterVO selectStoreDetail(BusinessEnterVO vo) {
		return (BusinessEnterVO) select("storeDAO.selectStoreDetail",vo);
	}
	
}
