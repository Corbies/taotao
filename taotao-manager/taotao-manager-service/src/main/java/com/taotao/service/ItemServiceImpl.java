package com.taotao.service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理
 */
@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  private TbItemMapper itemMapper;

    @Override
    public TbItem getItemByID(long itemId) {
        TbItem item=  itemMapper.selectByPrimaryKey(itemId);
//        TbItemExample tbItemExample=new TbItemExample();
//        tbItemExample.createCriteria().andIdEqualTo(itemId);
//        List<TbItem> items= itemMapper.selectByExample(tbItemExample);
//        if(items!=null&&items.size()>0){
//            return items.get(0);
//        }
       return item;
    }
}
