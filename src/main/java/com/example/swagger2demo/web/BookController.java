package com.example.swagger2demo.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Collections;
import java.util.HashMap;
//import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @program: swagger2-demo
 * @description: 用户测试类控制层
 * @author: Bacy
 * @create: 2018年12月01日
 **/

@RestController
@Api(tags = "BookController", description = "BookController | 通过书来测试swagger")
@RequestMapping(value = "/books")
public class BookController {

    private Map<Long, Book> books = Collections.synchronizedMap(new HashMap<>());

//    @ApiOperation(value="创建图书", notes="创建图书")
//    @ApiImplicitParam(name = "book", value = "图书详细实体", required = true, dataType = "Book")
//    @RequestMapping(value="", method= RequestMethod.POST)
//    public String postBook(@RequestBody Book book) {
//        IdentityHashMap<K, V> map;
//        map.put(book.getId(),user);
//        return "success";
//    }

    @ApiOperation(value = "获图书细信息", notes = "根据url的id来获取详细信息")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Long id) {
        return books.get(id);
    }
}

