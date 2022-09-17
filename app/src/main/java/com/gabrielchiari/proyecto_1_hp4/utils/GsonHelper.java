package com.gabrielchiari.proyecto_1_hp4.utils;

import com.google.gson.Gson;

public class GsonHelper {
    private static Gson gson = new Gson();

    public static String serialize(Object object) {
        return gson.toJson(object);
    }

    public static Object deserialize(String json, Class classType) {
        return gson.fromJson(json, classType);
    }
}
