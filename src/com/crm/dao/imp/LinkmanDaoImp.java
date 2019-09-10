package com.crm.dao.imp;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.crm.beans.LinkMan;
import com.crm.dao.LinkmanDao;

public class LinkmanDaoImp extends HibernateDaoSupport implements LinkmanDao {

	@Override
	public void add(LinkMan linkman) {
		getHibernateTemplate().save(linkman);
	}

	@Override
	public void deleteLinkman(Long id) {
		LinkMan man = getHibernateTemplate().get(LinkMan.class, id);
		getHibernateTemplate().delete(man);
		
	}

	@Override
	public void modify(LinkMan linkman) {
		getHibernateTemplate().update(linkman);
	}

	@Override
	public LinkMan findLinkmanById(Long id) {
		
		LinkMan man = getHibernateTemplate().get(LinkMan.class, id);
		
		return man;
	}

	@Override
	public List<LinkMan> findLinkMan(DetachedCriteria dc) {

		List<LinkMan> findByCriteria = (List<LinkMan>) getHibernateTemplate().findByCriteria(dc);
		
		return findByCriteria;
	}

	@Override
	public int findTotalCount(DetachedCriteria dc) {

		dc.setProjection(Projections.rowCount());
		
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(dc);
		
		dc.setProjection(null);
		
		return (int)(long)list.get(0);
	}

	@Override
	public List<LinkMan> findAllLinkmanByPageBean(DetachedCriteria dc, int currentPage, int pageSize) {
		int firstResult = (currentPage -1) * pageSize;
		List<LinkMan> list = (List<LinkMan>) getHibernateTemplate().findByCriteria(dc,firstResult,pageSize);
		
		return list;
	}


}
