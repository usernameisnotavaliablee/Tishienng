package com.bytedance.android.live.base.api.outer.data;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RoomInfo {
    com.bytedance.android.live.base.api.outer.data.City city;
    java.lang.String count;
    com.bytedance.android.live.base.api.outer.data.CouponInfo couponInfo;
    java.lang.String cover;
    java.util.HashMap<java.lang.Integer, java.lang.String> extraCover;
    java.lang.String openRoomId;
    long orientation;
    com.bytedance.android.live.base.api.outer.data.AnchorInfo owner;
    java.lang.String requestId;
    long status;
    java.lang.String title;
    java.lang.String trackExtra;

    public RoomInfo() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.couponInfo = r0
            return
    }

    public RoomInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, com.bytedance.android.live.base.api.outer.data.City r7, long r8, com.bytedance.android.live.base.api.outer.data.AnchorInfo r10, java.lang.String r11, java.lang.String r12, java.util.HashMap<java.lang.Integer, java.lang.String> r13, com.bytedance.android.live.base.api.outer.data.CouponInfo r14) {
            r0 = this;
            r0.<init>()
            r0.openRoomId = r1
            r0.title = r2
            r0.cover = r3
            r0.count = r4
            r0.orientation = r5
            r0.city = r7
            r0.status = r8
            r0.owner = r10
            r0.requestId = r11
            r0.trackExtra = r12
            r0.extraCover = r13
            r0.couponInfo = r14
            return
    }

    public com.bytedance.android.live.base.api.outer.data.City getCity() {
            r1 = this;
            com.bytedance.android.live.base.api.outer.data.City r0 = r1.city
            return r0
    }

    public java.lang.String getCount() {
            r1 = this;
            java.lang.String r0 = r1.count
            return r0
    }

    public com.bytedance.android.live.base.api.outer.data.CouponInfo getCouponInfo() {
            r1 = this;
            com.bytedance.android.live.base.api.outer.data.CouponInfo r0 = r1.couponInfo
            return r0
    }

    public java.lang.String getCover() {
            r1 = this;
            java.lang.String r0 = r1.cover
            return r0
    }

    public java.util.HashMap<java.lang.Integer, java.lang.String> getExtraCover() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r1.extraCover
            return r0
    }

    public java.lang.String getOpenRoomId() {
            r1 = this;
            java.lang.String r0 = r1.openRoomId
            return r0
    }

    public long getOrientation() {
            r2 = this;
            long r0 = r2.orientation
            return r0
    }

    public com.bytedance.android.live.base.api.outer.data.AnchorInfo getOwner() {
            r1 = this;
            com.bytedance.android.live.base.api.outer.data.AnchorInfo r0 = r1.owner
            return r0
    }

    public java.lang.String getRequestId() {
            r1 = this;
            java.lang.String r0 = r1.requestId
            return r0
    }

    public long getStatus() {
            r2 = this;
            long r0 = r2.status
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public java.lang.String getTrackExtra() {
            r1 = this;
            java.lang.String r0 = r1.trackExtra
            return r0
    }

    public void setCount(java.lang.String r1) {
            r0 = this;
            r0.count = r1
            return
    }

    public void setCover(java.lang.String r1) {
            r0 = this;
            r0.cover = r1
            return
    }

    public void setOrientation(long r1) {
            r0 = this;
            r0.orientation = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }
}
