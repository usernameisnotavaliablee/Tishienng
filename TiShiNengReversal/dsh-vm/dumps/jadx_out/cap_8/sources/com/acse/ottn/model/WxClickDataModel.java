package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WxClickDataModel {
    private java.lang.String deeplink;
    private java.lang.String link;
    private java.lang.String request_service_state;
    private long toast_ck;
    private long toast_ck_time;
    private long toast_show_time;
    private int toast_times;
    private java.lang.String toast_type;

    public WxClickDataModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "0"
            r1.request_service_state = r0
            return
    }

    public java.lang.String getDeeplink() {
            r1 = this;
            java.lang.String r0 = r1.deeplink
            return r0
    }

    public java.lang.String getLink() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    public java.lang.String getRequest_service_state() {
            r1 = this;
            java.lang.String r0 = r1.request_service_state
            return r0
    }

    public long getToast_ck() {
            r2 = this;
            long r0 = r2.toast_ck
            return r0
    }

    public java.lang.Long getToast_ck_time() {
            r2 = this;
            long r0 = r2.toast_ck_time
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public long getToast_show_time() {
            r2 = this;
            long r0 = r2.toast_show_time
            return r0
    }

    public int getToast_times() {
            r1 = this;
            int r0 = r1.toast_times
            return r0
    }

    public java.lang.String getToast_type() {
            r1 = this;
            java.lang.String r0 = r1.toast_type
            return r0
    }

    public void setDeeplink(java.lang.String r1) {
            r0 = this;
            r0.deeplink = r1
            return
    }

    public void setLink(java.lang.String r1) {
            r0 = this;
            r0.link = r1
            return
    }

    public void setRequest_service_state(java.lang.String r1) {
            r0 = this;
            r0.request_service_state = r1
            return
    }

    public void setToast_ck(long r1) {
            r0 = this;
            r0.toast_ck = r1
            return
    }

    public void setToast_ck_time(long r1) {
            r0 = this;
            r0.toast_ck_time = r1
            return
    }

    public void setToast_show_time(long r1) {
            r0 = this;
            r0.toast_show_time = r1
            return
    }

    public void setToast_times(int r1) {
            r0 = this;
            r0.toast_times = r1
            return
    }

    public void setToast_type(java.lang.String r1) {
            r0 = this;
            r0.toast_type = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WxClickDataModel{toast_type='"
            r0.append(r1)
            java.lang.String r1 = r4.toast_type
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", deeplink='"
            r0.append(r2)
            java.lang.String r2 = r4.deeplink
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", toast_times="
            r0.append(r2)
            int r2 = r4.toast_times
            r0.append(r2)
            java.lang.String r2 = ", link='"
            r0.append(r2)
            java.lang.String r2 = r4.link
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", toast_ck="
            r0.append(r2)
            long r2 = r4.toast_ck
            r0.append(r2)
            java.lang.String r2 = ", toast_ck_time="
            r0.append(r2)
            long r2 = r4.toast_ck_time
            r0.append(r2)
            java.lang.String r2 = ", toast_show_time="
            r0.append(r2)
            long r2 = r4.toast_show_time
            r0.append(r2)
            java.lang.String r2 = ", request_service_state='"
            r0.append(r2)
            java.lang.String r2 = r4.request_service_state
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
