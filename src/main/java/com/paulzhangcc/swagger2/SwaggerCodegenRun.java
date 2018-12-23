package com.paulzhangcc.swagger2;

import io.swagger.codegen.SwaggerCodegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by paul on 2018/12/23.
 */
public class SwaggerCodegenRun {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("generate");
        list.add("-i");
        list.add("http://127.0.0.1:8080/v2/api-docs");
        list.add("-l");
        list.add("java");
        list.add("-o");
        list.add("samples/client/petstore/java");
        String[] strings = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings[i]=list.get(i);
        }
        SwaggerCodegen.main(strings);

    }
}
