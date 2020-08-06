package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.ContentMapper;
import com.xiaoshu.entity.Content;
import com.xiaoshu.entity.ContentVo;

@Service
public class ContentService {

	@Autowired
	private ContentMapper cm;
	
	public PageInfo<ContentVo> findList(ContentVo contentVo,Integer pageNum,Integer pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		List<ContentVo> list=cm.findList(contentVo);
		return new PageInfo<>(list);
	}
	public Content findByName(String name)
	{
		Content c=new Content();
		c.setContentname(name);
		return cm.selectOne(c);
	}
	public void addContent(Content content)
	{
		
		cm.insert(content);
	}
	public void updateContent(Content content)
	{
		cm.updateByPrimaryKey(content);
	}
	public void delContent(Integer id)
	{
		cm.deleteByPrimaryKey(id);
	}
}
