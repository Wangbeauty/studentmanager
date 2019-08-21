package com.wangbeauty.studentmanager;

import org.springframework.beans.factory.annotation.Value;

/**
 * Hello world!
 *
 */
public class App {


    @Value("jdbc.jdbcUsername")
    private static String jdbcName;

    public static void main( String[] args )
    {

        System.out.println( "jdbcName="+jdbcName );
    }
}
