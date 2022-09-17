package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.bean.WishMessageGenerator;

public class TestWishMessageGenerator 
{
    public static void main( String[] args )
    {
        FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        Object obj=ctx.getBean("wmg");
        WishMessageGenerator generator=(WishMessageGenerator)obj;
        System.out.println(generator.generateMessage("Lalit"));
        ctx.close();
    }
}
