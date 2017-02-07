package cn.sheetanchor.sparrow.sys.dao.impl;

import cn.sheetanchor.common.hibernate.HibernateBaseDao;
import cn.sheetanchor.sparrow.sys.dao.UserDao;
import cn.sheetanchor.sparrow.sys.model.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @Author 阁楼麻雀
 * @Email netuser.orz@icloud.com
 * @Date 2017/2/6
 * @Desc
 */
@Repository
public class UserDaoImpl extends HibernateBaseDao<SysUser,Integer> implements UserDao{
    @Override
    protected Class<SysUser> getEntityClass() {
        return SysUser.class;
    }

    /**
     * @Author 阁楼麻雀
     * @Date 2017/2/6 15:27
     * @Desc 通过ID查找用户信息
     */
    public SysUser findById(Integer id) {
        SysUser entity = get(id);
        return entity;
    }

    /**
     * @Author 阁楼麻雀
     * @Date 2017/2/6 15:32
     * @Desc 根据登录名查询用户信息
     */
    public SysUser findByLoginName(String loginName) {
        return findUniqueByProperty("loginName", loginName);
    }

    /**
     * @Author 阁楼麻雀
     * @Date 2017/2/7 17:02
     * @Desc 更新用户信息
     */
    public SysUser update(SysUser bean) {
        getSession().update(bean);
        return bean;
    }
}
