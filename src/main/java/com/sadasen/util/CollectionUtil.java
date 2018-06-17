package com.sadasen.util;

import java.io.Serializable;
import java.util.Collection;

/**
 * @date 2018年3月23日
 * @author lei.ys
 * @addr company
 * @desc 集合类工具类
 */
public class CollectionUtil implements Serializable {
	
	private static final long serialVersionUID = -8798105551876918582L;
	
	private CollectionUtil() {
	}

	public static boolean isEmpty(Collection<?> coll) {
		if(null==coll || coll.size()==0)
			return true;
		return false;
	}
	
	public static boolean isNotEmpty(Collection<?> coll) {
		return !isEmpty(coll);
	}

}
