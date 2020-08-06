package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshu.dao.ContentcategoryMapper;
import com.xiaoshu.entity.Contentcategory;

@Service
public class CcService {

	@Autowired
	private ContentcategoryMapper cm;
	
	public List<Contentcategory> findCc(Contentcategory cc)
	{
		return cm.findCc(cc);
	}
}
