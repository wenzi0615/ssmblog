package com.blog.dao;

import com.blog.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDao {

    /**
     * 列出所有blog category
     * @param offset
     * @param limit
     * @return
     */

    List<Category> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新的blog category
     * @param name
     * @return
     */

    int addCategory(@Param("name") String name);

    /**
     * 删除一条blog category
     * @param id
     * @return
     */

    int deleteCategory(int id);

    /**
     * 更新一条blog category的名字
     * @param id
     * @param name
     * @return
     */

    int updateCategory(@Param("id") int id, @Param("name") String name);

    /**
     * 查看指定blog category
     * @param id
     * @return
     */
    Category queryById(int id);

}
