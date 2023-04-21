package com.yang.service.impl;

import com.yang.entity.ShopType;
import com.yang.mapper.ShopTypeMapper;
import com.yang.service.IShopTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
