package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OfflineMapProvince extends com.amap.api.maps.offlinemap.Province {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.OfflineMapProvince> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5049b;

    /* renamed from: c, reason: collision with root package name */
    private long f5050c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5051d;

    /* renamed from: e, reason: collision with root package name */
    private int f5052e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> f5053f;


    static {
            com.amap.api.maps.offlinemap.OfflineMapProvince$1 r0 = new com.amap.api.maps.offlinemap.OfflineMapProvince$1
            r0.<init>()
            com.amap.api.maps.offlinemap.OfflineMapProvince.CREATOR = r0
            return
    }

    public OfflineMapProvince() {
            r1 = this;
            r1.<init>()
            r0 = 6
            r1.f5049b = r0
            r0 = 0
            r1.f5052e = r0
            return
    }

    public OfflineMapProvince(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 6
            r2.f5049b = r0
            r0 = 0
            r2.f5052e = r0
            java.lang.String r0 = r3.readString()
            r2.a = r0
            int r0 = r3.readInt()
            r2.f5049b = r0
            long r0 = r3.readLong()
            r2.f5050c = r0
            java.lang.String r0 = r3.readString()
            r2.f5051d = r0
            int r0 = r3.readInt()
            r2.f5052e = r0
            android.os.Parcelable$Creator<com.amap.api.maps.offlinemap.OfflineMapCity> r0 = com.amap.api.maps.offlinemap.OfflineMapCity.CREATOR
            java.util.ArrayList r3 = r3.createTypedArrayList(r0)
            r2.f5053f = r3
            return
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getCityList() {
            r1 = this;
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r0 = r1.f5053f
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            return r0
    }

    public java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadedCityList() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r1 = r5.f5053f
            if (r1 != 0) goto La
            goto L25
        La:
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = (com.amap.api.maps.offlinemap.OfflineMapCity) r2
            int r3 = r2.getState()
            r4 = 6
            if (r3 == r4) goto Le
            r0.add(r2)
            goto Le
        L25:
            return r0
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.f5050c
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.f5049b
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.f5051d
            return r0
    }

    public int getcompleteCode() {
            r1 = this;
            int r0 = r1.f5052e
            return r0
    }

    public void setCityList(java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r1) {
            r0 = this;
            r0.f5053f = r1
            return
    }

    public void setCompleteCode(int r1) {
            r0 = this;
            r0.f5052e = r1
            return
    }

    public void setSize(long r1) {
            r0 = this;
            r0.f5050c = r1
            return
    }

    public void setState(int r1) {
            r0 = this;
            r0.f5049b = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.f5051d = r1
            return
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            super.writeToParcel(r3, r4)
            java.lang.String r4 = r2.a
            r3.writeString(r4)
            int r4 = r2.f5049b
            r3.writeInt(r4)
            long r0 = r2.f5050c
            r3.writeLong(r0)
            java.lang.String r4 = r2.f5051d
            r3.writeString(r4)
            int r4 = r2.f5052e
            r3.writeInt(r4)
            java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r4 = r2.f5053f
            r3.writeTypedList(r4)
            return
    }
}
