package com.example.SpringBootSample2.application.service;

import com.sun.source.doctree.LinkTree;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {

  /** 性別のMapを生成する */
  public Map<String, Integer> getGenderMap() {
    Map<String, Integer> genderMap = new LinkedHashMap<>();
    genderMap.put("男性",1);
    genderMap.put("女性",2);
    return genderMap;
  }
}
