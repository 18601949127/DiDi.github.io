package com.tantuo.didicar.domain;

import java.util.List;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：CardServicePagerBean
 */
public class CardServicePagerBean {

    /**
     * totalCount : 28
     * currentPage : 1
     * totalPage : 6
     * pageSize : 5
     * list : [{"id":1,"name":"联想（Lenovo）拯救者14.0英寸游戏本（i7-4720HQ 4G 1T硬盘 GTX960M 2G独显 FHD IPS屏 背光键盘）黑","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55c1e8f7N4b99de71.jpg","description":null,"price":5979,"sale":8654},{"id":2,"name":"奥林巴斯（OLYMPUS）E-M10-1442-EZ 微单电电动变焦套机 银色 内置WIFI 翻转触摸屏 EM10复古高雅","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_rBEhWlMFnG0IAAAAAAIqnbSuyAAAAIxLwJ57aQAAiq1705.jpg","description":null,"price":3799,"sale":3020},{"id":3,"name":"Apple iPad mini 2 ME276CH/A （配备 Retina 显示屏 7.9英寸 16G WLAN 机型 深空灰色）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_548574edNc366ff4a.jpg","description":null,"price":1938,"sale":9138},{"id":4,"name":"华为（HUAWEI）P8max 移动联通双4G 双卡双待 星光银）","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55ac5bc9N7dc9657c.jpg","description":null,"price":3388,"sale":6631},{"id":5,"name":"联想（Lenovo）7英寸平板电脑 （四核1.3GHz 1G/8G 蓝牙 GPS ） A7-10 (WiFi版 8G存储 黑色) 官方标配","imgUrl":"http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_5535f890Ndfd89dff.jpg","description":null,"price":499,"sale":5742}]
     */

    private int totalCount;
    private int currentPage;
    private int totalPage;
    private int pageSize;
    /**
     * id : 1
     * name : 联想（Lenovo）拯救者14.0英寸游戏本（i7-4720HQ 4G 1T硬盘 GTX960M 2G独显 FHD IPS屏 背光键盘）黑
     * imgUrl : http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_55c1e8f7N4b99de71.jpg
     * description : null
     * price : 5979
     * sale : 8654
     */

    private List<Wares> list;

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setList(List<Wares> list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<Wares> getList() {
        return list;
    }

    /**
     * 商品
     */
    public static class Wares {

        @Override
        public String toString() {
            return "Wares{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", description=" + description +
                    ", price=" + price +
                    ", sale=" + sale +
                    '}';
        }

        /**
         * id : 10
         * name : 金士顿（Kingston）DTM30R 16GB USB3.0 精致炫薄金属U盘
         * imgUrl : http://7mno4h.com2.z0.glb.qiniucdn.com/s_recommend_54b78bf0N24c00fc2.jpg
         * description : null
         * price : 42.9
         * sale : 8442
         */

        private int id;
        private String name;
        private String imgUrl;
        private Object description;
        private double price;
        private int sale;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setSale(int sale) {
            this.sale = sale;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public Object getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public int getSale() {
            return sale;
        }



    }
}
