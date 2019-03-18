package com.tantuo.didicar.domain;//package com.atguigu.beijingnews.domain;
/**
 * Author by TanTuo, WeiXin:86-18601949127, 
 * Email:1991201740@qq.com
 * 作用：
 */
//public class NewsCenterPagerBean {
//
//
//    /**
//     * retcode : 200
//     * data : [{"id":10000,"title":"新闻","type":1,"children":[{"id":10007,"title":"北京","type":1,"url":"/static/api/news/10007/list_1.json"},{"id":10006,"title":"中国","type":1,"url":"/static/api/news/10006/list_5.json"},{"id":10008,"title":"国际","type":1,"url":"/static/api/news/10008/list_7.json"},{"id":10014,"title":"文娱","type":1,"url":"/static/api/news/10014/list_3.json"},{"id":10010,"title":"体育","type":1,"url":"/static/api/news/10010/list_3.json"},{"id":10091,"title":"生活","type":1,"url":"/static/api/news/10091/list_1.json"},{"id":10012,"title":"旅游","type":1,"url":"/static/api/news/10012/list_3.json"},{"id":10095,"title":"科技","type":1,"url":"/static/api/news/10095/list_1.json"},{"id":10009,"title":"军事","type":1,"url":"/static/api/news/10009/list_3.json"},{"id":10011,"title":"财经","type":1,"url":"/static/api/news/10011/list_3.json"},{"id":10093,"title":"女性","type":1,"url":"/static/api/news/10093/list_1.json"},{"id":10192,"title":"倍儿逗","type":1,"url":"/static/api/news/10192/list_1.json"}]},{"id":10002,"title":"专题","type":10,"url":"/static/api/news/10002/list_1.json","url1":"/static/api/news/10002/list1_1.json"},{"id":10003,"title":"组图","type":2,"url":"/static/api/news/10003/list_1.json"},{"id":10004,"title":"互动","type":3,"excurl":"/static/api/news/comment/exc_1.json","dayurl":"/static/api/news/comment/day_1.json","weekurl":"/static/api/news/comment/week_1.json"},{"id":10005,"title":"投票","type":4,"url":"/static/api/news/vote/vote_1.json"}]
//     * extend : [10007,10006,10008,10014,10091,10010,10192,10009,10095,10093,10012,10011]
//     */
//
//    private int retcode;
//    /**
//     * id : 10000
//     * title : 新闻
//     * type : 1
//     * children : [{"id":10007,"title":"北京","type":1,"url":"/static/api/news/10007/list_1.json"},{"id":10006,"title":"中国","type":1,"url":"/static/api/news/10006/list_5.json"},{"id":10008,"title":"国际","type":1,"url":"/static/api/news/10008/list_7.json"},{"id":10014,"title":"文娱","type":1,"url":"/static/api/news/10014/list_3.json"},{"id":10010,"title":"体育","type":1,"url":"/static/api/news/10010/list_3.json"},{"id":10091,"title":"生活","type":1,"url":"/static/api/news/10091/list_1.json"},{"id":10012,"title":"旅游","type":1,"url":"/static/api/news/10012/list_3.json"},{"id":10095,"title":"科技","type":1,"url":"/static/api/news/10095/list_1.json"},{"id":10009,"title":"军事","type":1,"url":"/static/api/news/10009/list_3.json"},{"id":10011,"title":"财经","type":1,"url":"/static/api/news/10011/list_3.json"},{"id":10093,"title":"女性","type":1,"url":"/static/api/news/10093/list_1.json"},{"id":10192,"title":"倍儿逗","type":1,"url":"/static/api/news/10192/list_1.json"}]
//     */
//
//    private List<DataEntity> data;
//    private List<Integer> extend;
//
//    public void setRetcode(int retcode) {
//        this.retcode = retcode;
//    }
//
//    public void setData(List<DataEntity> data) {
//        this.data = data;
//    }
//
//    public void setExtend(List<Integer> extend) {
//        this.extend = extend;
//    }
//
//    public int getRetcode() {
//        return retcode;
//    }
//
//    public List<DataEntity> getData() {
//        return data;
//    }
//
//    public List<Integer> getExtend() {
//        return extend;
//    }
//
//    public static class DataEntity {
//        private int id;
//        private String title;
//        private int type;
//        /**
//         * id : 10007
//         * title : 北京
//         * type : 1
//         * url : /static/api/news/10007/list_1.json
//         */
//
//        private List<ChildrenData> children;
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public void setType(int type) {
//            this.type = type;
//        }
//
//        public void setChildren(List<ChildrenData> children) {
//            this.children = children;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public int getType() {
//            return type;
//        }
//
//        public List<ChildrenData> getChildren() {
//            return children;
//        }
//
//        public static class ChildrenData {
//            private int id;
//            private String title;
//            private int type;
//            private String url;
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//
//            public void setType(int type) {
//                this.type = type;
//            }
//
//            public void setUrl(String url) {
//                this.url = url;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public int getType() {
//                return type;
//            }
//
//            public String getUrl() {
//                return url;
//            }
//        }
//    }
//}
