package com.gary.library.arouter;

/**
 * Created by zhanggaobo
 * Date :2019/5/13/013
 * Description :
 * Version :1.0
 */
public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN + "/Main";
    }

    /**
     * 圈子组件
     */
    public static class Circle {
        private static final String CIRCLE = "/Circle";
        /*主业务界面*/
        public static final String PAGER_MAIN = CIRCLE + "/Main";
        public static final String PAGER_CIRCLE = CIRCLE + "/Circle";
    }

    /**
     * 消息组件
     */
    public static class News {
        private static final String NEWS = "/News";
        /*主业务界面*/
        public static final String PAGER_MAIN = NEWS + "/Main";
        public static final String PAGER_NEWS = NEWS + "/News";
    }

}
