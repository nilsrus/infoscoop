package org.infoscoop.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.infoscoop.account.DomainManager;
import org.infoscoop.dao.model.User;
import org.infoscoop.util.SpringUtil;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDAO extends HibernateDaoSupport {

	public static UserDAO newInstance() {
		return (UserDAO) SpringUtil.getContext().getBean("userDAO");
	}

	public List<User> all() {
		return super.getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(User.class).add(
						Expression.eq(User.PROP_FK_DOMAIN_ID, DomainManager.getContextDomainId())));
	}

	public User get(String id) {
		return super.getHibernateTemplate().get(User.class, new Integer(id));
	}
	
	public User getByName(String name){
		List<User> userList = super.getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(User.class).add(Expression.eq( User.PROP_NAME,name )).add(
						Expression.eq(User.PROP_FK_DOMAIN_ID, DomainManager.getContextDomainId())));
		if(userList.isEmpty())
			return null;
		else
			return userList.get(0);
	}

	public List<User> selectByName(String name) {
		return super.getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(User.class).add(Expression.like( User.PROP_NAME,name )).add(
				Expression.eq(User.PROP_FK_DOMAIN_ID, DomainManager.getContextDomainId())));
	}

	public void save(User item){
		super.getHibernateTemplate().saveOrUpdate(item);
	}

}