package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PageSettingTypeModel {
    java.util.List<java.lang.String> containsTextList;
    int cropped_height;
    java.lang.String cropped_text;
    java.lang.String is_click_jd_title;
    java.lang.String package_name;
    java.lang.String read_description;
    int read_length;
    int read_time;
    java.lang.String read_type;

    public PageSettingTypeModel() {
            r2 = this;
            r2.<init>()
            r0 = 7000(0x1b58, float:9.809E-42)
            r2.read_time = r0
            java.lang.String r0 = "0"
            r2.read_type = r0
            int r1 = com.acse.ottn.l0.m
            r2.read_length = r1
            r2.read_description = r0
            r2.is_click_jd_title = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.containsTextList = r0
            java.lang.String r0 = ""
            r2.cropped_text = r0
            r0 = 0
            r2.cropped_height = r0
            return
    }

    public java.util.List<java.lang.String> getContainsTextList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.containsTextList
            return r0
    }

    public int getCropped_height() {
            r1 = this;
            int r0 = r1.cropped_height
            return r0
    }

    public java.lang.String getCropped_text() {
            r1 = this;
            java.lang.String r0 = r1.cropped_text
            return r0
    }

    public java.lang.String getIs_click_jd_title() {
            r1 = this;
            java.lang.String r0 = r1.is_click_jd_title
            return r0
    }

    public java.lang.String getPackage_name() {
            r1 = this;
            java.lang.String r0 = r1.package_name
            return r0
    }

    public java.lang.String getRead_description() {
            r1 = this;
            java.lang.String r0 = r1.read_description
            return r0
    }

    public int getRead_length() {
            r1 = this;
            int r0 = r1.read_length
            return r0
    }

    public int getRead_time() {
            r1 = this;
            int r0 = r1.read_time
            return r0
    }

    public java.lang.String getRead_type() {
            r1 = this;
            java.lang.String r0 = r1.read_type
            return r0
    }

    public void setContainsTextList(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.containsTextList = r1
            return
    }

    public void setCropped_height(int r1) {
            r0 = this;
            r0.cropped_height = r1
            return
    }

    public void setCropped_text(java.lang.String r1) {
            r0 = this;
            r0.cropped_text = r1
            return
    }

    public void setIs_click_jd_title(java.lang.String r1) {
            r0 = this;
            r0.is_click_jd_title = r1
            return
    }

    public void setPackage_name(java.lang.String r1) {
            r0 = this;
            r0.package_name = r1
            return
    }

    public void setRead_description(java.lang.String r1) {
            r0 = this;
            r0.read_description = r1
            return
    }

    public void setRead_length(int r1) {
            r0 = this;
            r0.read_length = r1
            return
    }

    public void setRead_time(int r1) {
            r0 = this;
            r0.read_time = r1
            return
    }

    public void setRead_type(java.lang.String r1) {
            r0 = this;
            r0.read_type = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PageSettingTypeModel{package_name='"
            r0.append(r1)
            java.lang.String r1 = r3.package_name
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", read_time="
            r0.append(r2)
            int r2 = r3.read_time
            r0.append(r2)
            java.lang.String r2 = ", read_type='"
            r0.append(r2)
            java.lang.String r2 = r3.read_type
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", read_length="
            r0.append(r2)
            int r2 = r3.read_length
            r0.append(r2)
            java.lang.String r2 = ", read_description='"
            r0.append(r2)
            java.lang.String r2 = r3.read_description
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", is_click_jd_title='"
            r0.append(r2)
            java.lang.String r2 = r3.is_click_jd_title
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
