package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AccessiblityModel implements java.io.Serializable {
    private int agl;
    private java.lang.String ck;
    private java.lang.String ck_v;
    private int cost_time;
    private com.acse.ottn.model.AccessiblityModel.DataBean data;
    private java.lang.String genuine_packagename;
    private long is_l;
    private long is_xp;
    private java.lang.String product_info;
    private int r;
    private int red_package;
    private java.lang.String reset_heartbeat;
    private java.lang.String reset_tag;
    private java.lang.String scrolled_screen;
    private java.lang.String toast_status;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DataBean implements java.io.Serializable {
        private int activity_dismiss_time;
        private java.lang.String auto_open_coupon;
        private java.lang.String coupon_activity_name;
        private int coupon_detail_url;
        private int coupon_load_time;
        private java.lang.String coupon_show_package_name;
        private int coupon_show_time;
        private java.lang.String coupon_show_type;
        private java.lang.String coupon_type;
        private java.lang.String debug_state;
        private java.lang.String discount;
        private java.lang.String find_type;
        private java.lang.String first_price;
        private java.lang.String jump_type;
        private java.lang.String key_content;
        private java.lang.String location_type;
        private java.lang.String need_click;
        private java.lang.String new_time_remaining;
        private java.lang.String origin_url;
        private java.lang.String original_price;
        private java.lang.String package_name;
        private java.lang.String pic_md5;
        private java.lang.String pic_name;
        private java.lang.String pic_type;
        private java.lang.String pic_update_status;
        private int play_audio;
        private java.lang.String present_price;
        private int second_price;
        private java.lang.String service_control;
        private java.lang.String short_link;
        private int show_coupon_time;
        private int smallfloat_hour;
        private java.lang.String smallfloat_minute;
        private java.lang.String spop_coupon_price;
        private java.lang.String spop_coupon_title;
        private java.lang.String spop_deeplink;
        private java.lang.String spop_describe;
        private java.lang.String spop_link;
        private java.lang.String spop_pic;
        private java.lang.String spop_title;
        private int third_price;
        private int time_four;
        private java.lang.String tkl_turn_url;
        private java.lang.String tkl_url;
        private java.lang.String to_loading;
        private java.lang.String zip_md5;
        private java.lang.String zip_url;

        public DataBean() {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = ""
                r3.spop_deeplink = r0
                r3.spop_coupon_price = r0
                r3.spop_coupon_title = r0
                r3.spop_describe = r0
                r3.spop_link = r0
                r3.spop_pic = r0
                r3.spop_title = r0
                r3.package_name = r0
                r3.coupon_show_package_name = r0
                r3.coupon_activity_name = r0
                r3.pic_type = r0
                r3.discount = r0
                r3.original_price = r0
                r3.present_price = r0
                r3.to_loading = r0
                java.lang.String r1 = "0"
                r3.need_click = r1
                r3.debug_state = r0
                r3.tkl_url = r0
                r3.tkl_turn_url = r0
                r2 = 40000(0x9c40, float:5.6052E-41)
                r3.coupon_detail_url = r2
                r3.new_time_remaining = r0
                r3.first_price = r0
                r3.key_content = r0
                r3.find_type = r0
                r3.location_type = r0
                r3.service_control = r1
                r1 = 2000(0x7d0, float:2.803E-42)
                r3.second_price = r1
                r1 = 4000(0xfa0, float:5.605E-42)
                r3.third_price = r1
                r3.short_link = r0
                r3.auto_open_coupon = r0
                r3.origin_url = r0
                r3.coupon_type = r0
                java.lang.String r2 = "1"
                r3.coupon_show_type = r2
                r3.jump_type = r0
                r3.time_four = r1
                r0 = 1500(0x5dc, float:2.102E-42)
                r3.activity_dismiss_time = r0
                r0 = 8000(0x1f40, float:1.121E-41)
                r3.coupon_show_time = r0
                return
        }

        public int getActivity_dismiss_time() {
                r1 = this;
                int r0 = r1.activity_dismiss_time
                return r0
        }

        public java.lang.String getAuto_open_coupon() {
                r1 = this;
                java.lang.String r0 = r1.auto_open_coupon
                return r0
        }

        public java.lang.String getCoupon_activity_name() {
                r1 = this;
                java.lang.String r0 = r1.coupon_activity_name
                return r0
        }

        public int getCoupon_detail_url() {
                r1 = this;
                int r0 = r1.coupon_detail_url
                return r0
        }

        public int getCoupon_load_time() {
                r1 = this;
                int r0 = r1.coupon_load_time
                return r0
        }

        public java.lang.String getCoupon_show_package_name() {
                r1 = this;
                java.lang.String r0 = r1.coupon_show_package_name
                return r0
        }

        public int getCoupon_show_time() {
                r1 = this;
                int r0 = r1.coupon_show_time
                return r0
        }

        public java.lang.String getCoupon_show_type() {
                r1 = this;
                java.lang.String r0 = r1.coupon_show_type
                return r0
        }

        public java.lang.String getCoupon_type() {
                r1 = this;
                java.lang.String r0 = r1.coupon_type
                return r0
        }

        public java.lang.String getDebug_state() {
                r1 = this;
                java.lang.String r0 = r1.debug_state
                return r0
        }

        public java.lang.String getDiscount() {
                r1 = this;
                java.lang.String r0 = r1.discount
                return r0
        }

        public java.lang.String getFind_type() {
                r1 = this;
                java.lang.String r0 = r1.find_type
                return r0
        }

        public java.lang.String getFirst_price() {
                r1 = this;
                java.lang.String r0 = r1.first_price
                return r0
        }

        public java.lang.String getJump_type() {
                r1 = this;
                java.lang.String r0 = r1.jump_type
                return r0
        }

        public java.lang.String getKey_content() {
                r1 = this;
                java.lang.String r0 = r1.key_content
                return r0
        }

        public java.lang.String getLocation_type() {
                r1 = this;
                java.lang.String r0 = r1.location_type
                return r0
        }

        public java.lang.String getNeed_click() {
                r1 = this;
                java.lang.String r0 = r1.need_click
                return r0
        }

        public java.lang.String getNew_time_remaining() {
                r1 = this;
                java.lang.String r0 = r1.new_time_remaining
                return r0
        }

        public java.lang.String getOrigin_url() {
                r1 = this;
                java.lang.String r0 = r1.origin_url
                return r0
        }

        public java.lang.String getOriginal_price() {
                r1 = this;
                java.lang.String r0 = r1.original_price
                return r0
        }

        public java.lang.String getPackage_name() {
                r1 = this;
                java.lang.String r0 = r1.package_name
                return r0
        }

        public java.lang.String getPic_md5() {
                r1 = this;
                java.lang.String r0 = r1.pic_md5
                return r0
        }

        public java.lang.String getPic_name() {
                r1 = this;
                java.lang.String r0 = r1.pic_name
                return r0
        }

        public java.lang.String getPic_type() {
                r1 = this;
                java.lang.String r0 = r1.pic_type
                return r0
        }

        public java.lang.String getPic_update_status() {
                r1 = this;
                java.lang.String r0 = r1.pic_update_status
                return r0
        }

        public int getPlay_audio() {
                r1 = this;
                int r0 = r1.play_audio
                return r0
        }

        public java.lang.String getPresent_price() {
                r1 = this;
                java.lang.String r0 = r1.present_price
                return r0
        }

        public int getSecond_price() {
                r1 = this;
                int r0 = r1.second_price
                return r0
        }

        public java.lang.String getService_control() {
                r1 = this;
                java.lang.String r0 = r1.service_control
                return r0
        }

        public java.lang.String getShort_link() {
                r1 = this;
                java.lang.String r0 = r1.short_link
                return r0
        }

        public int getShow_coupon_time() {
                r1 = this;
                int r0 = r1.show_coupon_time
                return r0
        }

        public int getSmallfloat_hour() {
                r1 = this;
                int r0 = r1.smallfloat_hour
                return r0
        }

        public java.lang.String getSmallfloat_minute() {
                r1 = this;
                java.lang.String r0 = r1.smallfloat_minute
                return r0
        }

        public java.lang.String getSpop_coupon_price() {
                r1 = this;
                java.lang.String r0 = r1.spop_coupon_price
                return r0
        }

        public java.lang.String getSpop_coupon_title() {
                r1 = this;
                java.lang.String r0 = r1.spop_coupon_title
                return r0
        }

        public java.lang.String getSpop_deeplink() {
                r1 = this;
                java.lang.String r0 = r1.spop_deeplink
                return r0
        }

        public java.lang.String getSpop_describe() {
                r1 = this;
                java.lang.String r0 = r1.spop_describe
                return r0
        }

        public java.lang.String getSpop_link() {
                r1 = this;
                java.lang.String r0 = r1.spop_link
                return r0
        }

        public java.lang.String getSpop_pic() {
                r1 = this;
                java.lang.String r0 = r1.spop_pic
                return r0
        }

        public java.lang.String getSpop_title() {
                r1 = this;
                java.lang.String r0 = r1.spop_title
                return r0
        }

        public int getThird_price() {
                r1 = this;
                int r0 = r1.third_price
                return r0
        }

        public int getTime_four() {
                r1 = this;
                int r0 = r1.time_four
                return r0
        }

        public java.lang.String getTkl_turn_url() {
                r1 = this;
                java.lang.String r0 = r1.tkl_turn_url
                return r0
        }

        public java.lang.String getTkl_url() {
                r1 = this;
                java.lang.String r0 = r1.tkl_url
                return r0
        }

        public java.lang.String getTo_loading() {
                r1 = this;
                java.lang.String r0 = r1.to_loading
                return r0
        }

        public java.lang.String getZip_md5() {
                r1 = this;
                java.lang.String r0 = r1.zip_md5
                return r0
        }

        public java.lang.String getZip_url() {
                r1 = this;
                java.lang.String r0 = r1.zip_url
                return r0
        }

        public void setActivity_dismiss_time(int r1) {
                r0 = this;
                r0.activity_dismiss_time = r1
                return
        }

        public void setAuto_open_coupon(java.lang.String r1) {
                r0 = this;
                r0.auto_open_coupon = r1
                return
        }

        public void setCoupon_activity_name(java.lang.String r1) {
                r0 = this;
                r0.coupon_activity_name = r1
                return
        }

        public void setCoupon_detail_url(int r1) {
                r0 = this;
                r0.coupon_detail_url = r1
                return
        }

        public void setCoupon_load_time(int r1) {
                r0 = this;
                r0.coupon_load_time = r1
                return
        }

        public void setCoupon_show_package_name(java.lang.String r1) {
                r0 = this;
                r0.coupon_show_package_name = r1
                return
        }

        public void setCoupon_show_time(int r1) {
                r0 = this;
                r0.coupon_show_time = r1
                return
        }

        public void setCoupon_show_type(java.lang.String r1) {
                r0 = this;
                r0.coupon_show_type = r1
                return
        }

        public void setCoupon_type(java.lang.String r1) {
                r0 = this;
                r0.coupon_type = r1
                return
        }

        public void setDebug_state(java.lang.String r1) {
                r0 = this;
                r0.debug_state = r1
                return
        }

        public void setDiscount(java.lang.String r1) {
                r0 = this;
                r0.discount = r1
                return
        }

        public void setFind_type(java.lang.String r1) {
                r0 = this;
                r0.find_type = r1
                return
        }

        public void setFirst_price(java.lang.String r1) {
                r0 = this;
                r0.first_price = r1
                return
        }

        public void setJump_type(java.lang.String r1) {
                r0 = this;
                r0.jump_type = r1
                return
        }

        public void setKey_content(java.lang.String r1) {
                r0 = this;
                r0.key_content = r1
                return
        }

        public void setLocation_type(java.lang.String r1) {
                r0 = this;
                r0.location_type = r1
                return
        }

        public void setNeed_click(java.lang.String r1) {
                r0 = this;
                r0.need_click = r1
                return
        }

        public void setNew_time_remaining(java.lang.String r1) {
                r0 = this;
                r0.new_time_remaining = r1
                return
        }

        public void setOrigin_url(java.lang.String r1) {
                r0 = this;
                r0.origin_url = r1
                return
        }

        public void setOriginal_price(java.lang.String r1) {
                r0 = this;
                r0.original_price = r1
                return
        }

        public void setPackage_name(java.lang.String r1) {
                r0 = this;
                r0.package_name = r1
                return
        }

        public void setPic_md5(java.lang.String r1) {
                r0 = this;
                r0.pic_md5 = r1
                return
        }

        public void setPic_name(java.lang.String r1) {
                r0 = this;
                r0.pic_name = r1
                return
        }

        public void setPic_type(java.lang.String r1) {
                r0 = this;
                r0.pic_type = r1
                return
        }

        public void setPic_update_status(java.lang.String r1) {
                r0 = this;
                r0.pic_update_status = r1
                return
        }

        public void setPlay_audio(int r1) {
                r0 = this;
                r0.play_audio = r1
                return
        }

        public void setPresent_price(java.lang.String r1) {
                r0 = this;
                r0.present_price = r1
                return
        }

        public void setSecond_price(int r1) {
                r0 = this;
                r0.second_price = r1
                return
        }

        public void setService_control(java.lang.String r1) {
                r0 = this;
                r0.service_control = r1
                return
        }

        public void setShort_link(java.lang.String r1) {
                r0 = this;
                r0.short_link = r1
                return
        }

        public void setShow_coupon_time(int r1) {
                r0 = this;
                r0.show_coupon_time = r1
                return
        }

        public void setSmallfloat_hour(int r1) {
                r0 = this;
                r0.smallfloat_hour = r1
                return
        }

        public void setSmallfloat_minute(java.lang.String r1) {
                r0 = this;
                r0.smallfloat_minute = r1
                return
        }

        public void setSpop_coupon_price(java.lang.String r1) {
                r0 = this;
                r0.spop_coupon_price = r1
                return
        }

        public void setSpop_coupon_title(java.lang.String r1) {
                r0 = this;
                r0.spop_coupon_title = r1
                return
        }

        public void setSpop_deeplink(java.lang.String r1) {
                r0 = this;
                r0.spop_deeplink = r1
                return
        }

        public void setSpop_describe(java.lang.String r1) {
                r0 = this;
                r0.spop_describe = r1
                return
        }

        public void setSpop_link(java.lang.String r1) {
                r0 = this;
                r0.spop_link = r1
                return
        }

        public void setSpop_pic(java.lang.String r1) {
                r0 = this;
                r0.spop_pic = r1
                return
        }

        public void setSpop_title(java.lang.String r1) {
                r0 = this;
                r0.spop_title = r1
                return
        }

        public void setThird_price(int r1) {
                r0 = this;
                r0.third_price = r1
                return
        }

        public void setTime_four(int r1) {
                r0 = this;
                r0.time_four = r1
                return
        }

        public void setTkl_turn_url(java.lang.String r1) {
                r0 = this;
                r0.tkl_turn_url = r1
                return
        }

        public void setTkl_url(java.lang.String r1) {
                r0 = this;
                r0.tkl_url = r1
                return
        }

        public void setTo_loading(java.lang.String r1) {
                r0 = this;
                r0.to_loading = r1
                return
        }

        public void setZip_md5(java.lang.String r1) {
                r0 = this;
                r0.zip_md5 = r1
                return
        }

        public void setZip_url(java.lang.String r1) {
                r0 = this;
                r0.zip_url = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DataBean{spop_deeplink='"
                r0.append(r1)
                java.lang.String r1 = r3.spop_deeplink
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", spop_coupon_price='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_coupon_price
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", play_audio="
                r0.append(r2)
                int r2 = r3.play_audio
                r0.append(r2)
                java.lang.String r2 = ", spop_coupon_title='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_coupon_title
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", spop_describe='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_describe
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", spop_link='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_link
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", spop_pic='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_pic
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", spop_title='"
                r0.append(r2)
                java.lang.String r2 = r3.spop_title
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", package_name='"
                r0.append(r2)
                java.lang.String r2 = r3.package_name
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", coupon_show_package_name='"
                r0.append(r2)
                java.lang.String r2 = r3.coupon_show_package_name
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", coupon_activity_name='"
                r0.append(r2)
                java.lang.String r2 = r3.coupon_activity_name
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", pic_type='"
                r0.append(r2)
                java.lang.String r2 = r3.pic_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", discount='"
                r0.append(r2)
                java.lang.String r2 = r3.discount
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", original_price='"
                r0.append(r2)
                java.lang.String r2 = r3.original_price
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", present_price='"
                r0.append(r2)
                java.lang.String r2 = r3.present_price
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", to_loading='"
                r0.append(r2)
                java.lang.String r2 = r3.to_loading
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", debug_state='"
                r0.append(r2)
                java.lang.String r2 = r3.debug_state
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", tkl_url='"
                r0.append(r2)
                java.lang.String r2 = r3.tkl_url
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", tkl_turn_url='"
                r0.append(r2)
                java.lang.String r2 = r3.tkl_turn_url
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", coupon_detail_url="
                r0.append(r2)
                int r2 = r3.coupon_detail_url
                r0.append(r2)
                java.lang.String r2 = ", new_time_remaining='"
                r0.append(r2)
                java.lang.String r2 = r3.new_time_remaining
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", first_price='"
                r0.append(r2)
                java.lang.String r2 = r3.first_price
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", key_content='"
                r0.append(r2)
                java.lang.String r2 = r3.key_content
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", find_type='"
                r0.append(r2)
                java.lang.String r2 = r3.find_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", location_type='"
                r0.append(r2)
                java.lang.String r2 = r3.location_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", service_control='"
                r0.append(r2)
                java.lang.String r2 = r3.service_control
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", second_price="
                r0.append(r2)
                int r2 = r3.second_price
                r0.append(r2)
                java.lang.String r2 = ", third_price="
                r0.append(r2)
                int r2 = r3.third_price
                r0.append(r2)
                java.lang.String r2 = ", short_link='"
                r0.append(r2)
                java.lang.String r2 = r3.short_link
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", auto_open_coupon='"
                r0.append(r2)
                java.lang.String r2 = r3.auto_open_coupon
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", origin_url='"
                r0.append(r2)
                java.lang.String r2 = r3.origin_url
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", show_coupon_time="
                r0.append(r2)
                int r2 = r3.show_coupon_time
                r0.append(r2)
                java.lang.String r2 = ", coupon_type='"
                r0.append(r2)
                java.lang.String r2 = r3.coupon_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", coupon_show_type='"
                r0.append(r2)
                java.lang.String r2 = r3.coupon_show_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", jump_type='"
                r0.append(r2)
                java.lang.String r2 = r3.jump_type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", time_four="
                r0.append(r2)
                int r2 = r3.time_four
                r0.append(r2)
                java.lang.String r2 = ", activity_dismiss_time="
                r0.append(r2)
                int r2 = r3.activity_dismiss_time
                r0.append(r2)
                java.lang.String r2 = ", coupon_load_time="
                r0.append(r2)
                int r2 = r3.coupon_load_time
                r0.append(r2)
                java.lang.String r2 = ", coupon_show_time="
                r0.append(r2)
                int r2 = r3.coupon_show_time
                r0.append(r2)
                java.lang.String r2 = ", smallfloat_hour="
                r0.append(r2)
                int r2 = r3.smallfloat_hour
                r0.append(r2)
                java.lang.String r2 = ", smallfloat_minute='"
                r0.append(r2)
                java.lang.String r2 = r3.smallfloat_minute
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", pic_update_status='"
                r0.append(r2)
                java.lang.String r2 = r3.pic_update_status
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", pic_name='"
                r0.append(r2)
                java.lang.String r2 = r3.pic_name
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", zip_md5='"
                r0.append(r2)
                java.lang.String r2 = r3.zip_md5
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", zip_url='"
                r0.append(r2)
                java.lang.String r2 = r3.zip_url
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", pic_md5='"
                r0.append(r2)
                java.lang.String r2 = r3.pic_md5
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AccessiblityModel() {
            r4 = this;
            r4.<init>()
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = new com.acse.ottn.model.AccessiblityModel$DataBean
            r0.<init>()
            r4.data = r0
            java.lang.String r0 = ""
            r4.genuine_packagename = r0
            r4.toast_status = r0
            java.lang.String r1 = com.acse.ottn.l0.p
            r4.scrolled_screen = r1
            java.lang.String r1 = "0"
            r4.reset_heartbeat = r1
            r2 = -1
            r4.is_l = r2
            r4.is_xp = r2
            r4.reset_tag = r1
            r4.product_info = r0
            return
    }

    public int getAgl() {
            r1 = this;
            int r0 = r1.agl
            return r0
    }

    public java.lang.String getCk() {
            r1 = this;
            java.lang.String r0 = r1.ck
            return r0
    }

    public java.lang.String getCk_v() {
            r1 = this;
            java.lang.String r0 = r1.ck_v
            return r0
    }

    public int getCost_time() {
            r1 = this;
            int r0 = r1.cost_time
            return r0
    }

    public com.acse.ottn.model.AccessiblityModel.DataBean getData() {
            r1 = this;
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r1.data
            return r0
    }

    public java.lang.String getGenuine_packagename() {
            r1 = this;
            java.lang.String r0 = r1.genuine_packagename
            return r0
    }

    public long getIs_l() {
            r2 = this;
            long r0 = r2.is_l
            return r0
    }

    public long getIs_xp() {
            r2 = this;
            long r0 = r2.is_xp
            return r0
    }

    public java.lang.String getProduct_info() {
            r1 = this;
            java.lang.String r0 = r1.product_info
            return r0
    }

    public int getR() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public int getRed_package() {
            r1 = this;
            int r0 = r1.red_package
            return r0
    }

    public java.lang.String getReset_heartbeat() {
            r1 = this;
            java.lang.String r0 = r1.reset_heartbeat
            return r0
    }

    public java.lang.String getReset_tag() {
            r1 = this;
            java.lang.String r0 = r1.reset_tag
            return r0
    }

    public java.lang.String getScrolled_screen() {
            r1 = this;
            java.lang.String r0 = r1.scrolled_screen
            return r0
    }

    public java.lang.String getToast_status() {
            r1 = this;
            java.lang.String r0 = r1.toast_status
            return r0
    }

    public void setAgl(int r1) {
            r0 = this;
            r0.agl = r1
            return
    }

    public void setCk(java.lang.String r1) {
            r0 = this;
            r0.ck = r1
            return
    }

    public void setCk_v(java.lang.String r1) {
            r0 = this;
            r0.ck_v = r1
            return
    }

    public void setCost_time(int r1) {
            r0 = this;
            r0.cost_time = r1
            return
    }

    public void setData(com.acse.ottn.model.AccessiblityModel.DataBean r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setGenuine_packagename(java.lang.String r1) {
            r0 = this;
            r0.genuine_packagename = r1
            return
    }

    public void setIs_l(long r1) {
            r0 = this;
            r0.is_l = r1
            return
    }

    public void setIs_xp(long r1) {
            r0 = this;
            r0.is_xp = r1
            return
    }

    public void setProduct_info(java.lang.String r1) {
            r0 = this;
            r0.product_info = r1
            return
    }

    public void setR(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setRed_package(int r1) {
            r0 = this;
            r0.red_package = r1
            return
    }

    public void setReset_heartbeat(java.lang.String r1) {
            r0 = this;
            r0.reset_heartbeat = r1
            return
    }

    public void setReset_tag(java.lang.String r1) {
            r0 = this;
            r0.reset_tag = r1
            return
    }

    public void setScrolled_screen(java.lang.String r1) {
            r0 = this;
            r0.scrolled_screen = r1
            return
    }

    public void setToast_status(java.lang.String r1) {
            r0 = this;
            r0.toast_status = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AccessiblityModel{ck_v='"
            r0.append(r1)
            java.lang.String r1 = r3.ck_v
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", r="
            r0.append(r2)
            int r2 = r3.r
            r0.append(r2)
            java.lang.String r2 = ", data="
            r0.append(r2)
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r3.data
            r0.append(r2)
            java.lang.String r2 = ", cost_time="
            r0.append(r2)
            int r2 = r3.cost_time
            r0.append(r2)
            java.lang.String r2 = ", agl="
            r0.append(r2)
            int r2 = r3.agl
            r0.append(r2)
            java.lang.String r2 = ", ck='"
            r0.append(r2)
            java.lang.String r2 = r3.ck
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", red_package='"
            r0.append(r2)
            int r2 = r3.red_package
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", genuine_packagename='"
            r0.append(r2)
            java.lang.String r2 = r3.genuine_packagename
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
