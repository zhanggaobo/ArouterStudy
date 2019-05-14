package com.gary.library.arouter;

import android.content.Context;
import android.net.Uri;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanggaobo
 * Date :2019/5/13/013
 * Description :
 * Version :1.0
 */
@Route(path = PathReplaceServiceImpl.PATH)
public class PathReplaceServiceImpl implements PathReplaceService {

    static final String PATH = "/service/PathReplaceServiceImpl";
    private Map<String, String> pathMap;

    @Override
    public String forString(String path) {
        String result = pathMap.containsKey(path) ? pathMap.get(path) : path;
        return result;
    }

    @Override
    public Uri forUri(Uri uri) {
        return uri;
    }

    @Override
    public void init(Context context) {
        pathMap = new HashMap<>();
    }

    public void replacePath(String sourcePath, String targetPath) {
        pathMap.put(sourcePath, targetPath);
    }

    public Map<String, String> getReplacePathMap() {
        return Collections.unmodifiableMap(pathMap);
    }
}