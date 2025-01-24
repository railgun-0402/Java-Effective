package com.map;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {
    Map<String, Integer> scores = new HashMap<>();

    public void put() {
        scores.put("Ken", 100);
        scores.put("Shin", 60);
        scores.put("Takuya", 80);
        System.out.println("①Mapの中身：" + scores.toString());

        scores.put("Shin", 50);
        System.out.println("②Mapの中身：" + scores.toString());

        Integer takuyaScore = scores.get("Takuya");
        System.out.println("③Takuyaの点数：" + takuyaScore);

        scores.remove("Shin");
        System.out.println("④Mapの中身：" + scores.toString());

        int size = scores.size();
        System.out.println("⑤size：" + size);

        boolean existKen = scores.containsKey("Ken");
        System.out.println("⑥existKen：" + existKen);

        // containsValueは線形検索で処理は遅くなりがち
        boolean exist80 = scores.containsValue(80);
        System.out.println("⑦exist80：" + exist80);
    }
}
