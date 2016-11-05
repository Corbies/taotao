package com.taotao.controller;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cxj on 2016/11/5.
 */
@Controller
public class ItemController {

    @Autowired
   private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getTbItemById(@PathVariable Long itemId){
        TbItem tbItem=itemService.getItemByID(itemId);
        return tbItem;
    }





}

