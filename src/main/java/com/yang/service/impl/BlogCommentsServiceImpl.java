package com.yang.service.impl;

import com.yang.entity.BlogComments;
import com.yang.mapper.BlogCommentsMapper;
import com.yang.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
