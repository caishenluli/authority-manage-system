package cn.edu.jxnu.base.service;

import cn.edu.jxnu.base.entity.Resource;
import cn.edu.jxnu.base.entity.ZtreeView;

import java.util.List;

/**
 * 资源服务接口
 *
 * @author 梦境迷离
 * @version V2.0 2020年11月20日
 */
public interface IResourceService extends IBaseService<Resource, Integer> {

    /**
     * 获取角色的权限树
     *
     * @param roleId
     * @return List<ZtreeView>
     */
    List<ZtreeView> tree(int roleId);

    /**
     * 修改或者新增资源
     *
     * @param resource
     */
    void saveOrUpdate(Resource resource);

    /**
     * 根据id查询资源
     *
     * @param integer
     * @return Resource
     * @author 梦境迷离
     */
    Resource find(Integer integer);

}
