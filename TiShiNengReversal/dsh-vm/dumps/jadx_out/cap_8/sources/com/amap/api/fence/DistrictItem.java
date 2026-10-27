package com.amap.api.fence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DistrictItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.fence.DistrictItem> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4900b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f4901c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<com.amap.api.location.DPoint> f4902d;


    static {
            com.amap.api.fence.DistrictItem$1 r0 = new com.amap.api.fence.DistrictItem$1
            r0.<init>()
            com.amap.api.fence.DistrictItem.CREATOR = r0
            return
    }

    public DistrictItem() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r0 = 0
            r1.f4900b = r0
            r1.f4901c = r0
            r1.f4902d = r0
            return
    }

    protected DistrictItem(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r0 = 0
            r1.f4900b = r0
            r1.f4901c = r0
            r1.f4902d = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f4900b = r0
            java.lang.String r0 = r2.readString()
            r1.f4901c = r0
            android.os.Parcelable$Creator<com.amap.api.location.DPoint> r0 = com.amap.api.location.DPoint.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f4902d = r2
            return
    }

    public static android.os.Parcelable.Creator<com.amap.api.fence.DistrictItem> getCreator() {
            android.os.Parcelable$Creator<com.amap.api.fence.DistrictItem> r0 = com.amap.api.fence.DistrictItem.CREATOR
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdcode() {
            r1 = this;
            java.lang.String r0 = r1.f4901c
            return r0
    }

    public java.lang.String getCitycode() {
            r1 = this;
            java.lang.String r0 = r1.f4900b
            return r0
    }

    public java.lang.String getDistrictName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.util.List<com.amap.api.location.DPoint> getPolyline() {
            r1 = this;
            java.util.List<com.amap.api.location.DPoint> r0 = r1.f4902d
            return r0
    }

    public void setAdcode(java.lang.String r1) {
            r0 = this;
            r0.f4901c = r1
            return
    }

    public void setCitycode(java.lang.String r1) {
            r0 = this;
            r0.f4900b = r1
            return
    }

    public void setDistrictName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setPolyline(java.util.List<com.amap.api.location.DPoint> r1) {
            r0 = this;
            r0.f4902d = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f4900b
            r1.writeString(r2)
            java.lang.String r2 = r0.f4901c
            r1.writeString(r2)
            java.util.List<com.amap.api.location.DPoint> r2 = r0.f4902d
            r1.writeTypedList(r2)
            return
    }
}
