package com.xhgong.o2o.dao;

import java.util.List;

import com.xhgong.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
