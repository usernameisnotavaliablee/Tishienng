package com.amap.api.services.cloud;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.cloud.CloudItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5114b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5115c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5116d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.String> f5117e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.amap.api.services.cloud.CloudImage> f5118f;
    protected final com.amap.api.services.core.LatLonPoint mPoint;
    protected final java.lang.String mSnippet;
    protected final java.lang.String mTitle;


    static {
            com.amap.api.services.cloud.CloudItem$1 r0 = new com.amap.api.services.cloud.CloudItem$1
            r0.<init>()
            com.amap.api.services.cloud.CloudItem.CREATOR = r0
            return
    }

    protected CloudItem(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f5114b = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            int r0 = r3.readInt()
            r2.f5114b = r0
            java.lang.Class<com.amap.api.services.core.LatLonPoint> r0 = com.amap.api.services.core.LatLonPoint.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            com.amap.api.services.core.LatLonPoint r0 = (com.amap.api.services.core.LatLonPoint) r0
            r2.mPoint = r0
            java.lang.String r0 = r3.readString()
            r2.mTitle = r0
            java.lang.String r0 = r3.readString()
            r2.mSnippet = r0
            java.lang.String r0 = r3.readString()
            r2.f5115c = r0
            java.lang.String r0 = r3.readString()
            r2.f5116d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f5117e = r0
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.readMap(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5118f = r0
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.readList(r0, r1)
            return
    }

    public CloudItem(java.lang.String r2, com.amap.api.services.core.LatLonPoint r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f5114b = r0
            r1.a = r2
            r1.mPoint = r3
            r1.mTitle = r4
            r1.mSnippet = r5
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.amap.api.services.cloud.CloudItem
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.amap.api.services.cloud.CloudItem r4 = (com.amap.api.services.cloud.CloudItem) r4
            java.lang.String r2 = r3.a
            if (r2 != 0) goto L18
            java.lang.String r4 = r4.a
            if (r4 == 0) goto L21
            return r1
        L18:
            java.lang.String r4 = r4.a
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L21
            return r1
        L21:
            return r0
    }

    public java.util.List<com.amap.api.services.cloud.CloudImage> getCloudImage() {
            r1 = this;
            java.util.List<com.amap.api.services.cloud.CloudImage> r0 = r1.f5118f
            return r0
    }

    public java.lang.String getCreatetime() {
            r1 = this;
            java.lang.String r0 = r1.f5115c
            return r0
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getCustomfield() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.f5117e
            return r0
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.f5114b
            return r0
    }

    public java.lang.String getID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.mPoint
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.mSnippet
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }

    public java.lang.String getUpdatetime() {
            r1 = this;
            java.lang.String r0 = r1.f5116d
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }

    public void setCreatetime(java.lang.String r1) {
            r0 = this;
            r0.f5115c = r1
            return
    }

    public void setCustomfield(java.util.HashMap<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f5117e = r1
            return
    }

    public void setDistance(int r1) {
            r0 = this;
            r0.f5114b = r1
            return
    }

    public void setUpdatetime(java.lang.String r1) {
            r0 = this;
            r0.f5116d = r1
            return
    }

    public void setmCloudImage(java.util.List<com.amap.api.services.cloud.CloudImage> r1) {
            r0 = this;
            r0.f5118f = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            int r2 = r0.f5114b
            r1.writeInt(r2)
            com.amap.api.services.core.LatLonPoint r2 = r0.mPoint
            r1.writeValue(r2)
            java.lang.String r2 = r0.mTitle
            r1.writeString(r2)
            java.lang.String r2 = r0.mSnippet
            r1.writeString(r2)
            java.lang.String r2 = r0.f5115c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5116d
            r1.writeString(r2)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f5117e
            r1.writeMap(r2)
            java.util.List<com.amap.api.services.cloud.CloudImage> r2 = r0.f5118f
            r1.writeList(r2)
            return
    }
}
