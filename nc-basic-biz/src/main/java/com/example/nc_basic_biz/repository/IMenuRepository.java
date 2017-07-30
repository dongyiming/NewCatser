package com.example.nc_basic_biz.repository;


import com.example.uc_common_bean.vo.MenuInfo;

import java.util.List;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/11 11:50
 */
public interface IMenuRepository {
    void addOrUpdate(MenuInfo menuInfo);

    void insert(MenuInfo menuInfo);

    boolean insertList(List<MenuInfo> menuInfos);

    MenuInfo selectById(int menuInfoCode);

    List<MenuInfo> selectByType(int type, int startIndex, int pageCount);

    List<MenuInfo> selectByType(int menuType);
}
