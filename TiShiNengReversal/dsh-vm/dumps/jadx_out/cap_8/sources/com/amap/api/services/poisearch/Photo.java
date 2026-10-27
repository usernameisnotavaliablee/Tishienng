package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Photo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.Photo> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5265b;


    static {
            com.amap.api.services.poisearch.Photo$1 r0 = new com.amap.api.services.poisearch.Photo$1
            r0.<init>()
            com.amap.api.services.poisearch.Photo.CREATOR = r0
            return
    }

    public Photo() {
            r0 = this;
            r0.<init>()
            return
    }

    public Photo(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r2 = r2.readString()
            r1.f5265b = r2
            return
    }

    public Photo(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5265b = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.f5265b
            return r0
    }

    public final void setTitle(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void setUrl(java.lang.String r1) {
            r0 = this;
            r0.f5265b = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5265b
            r1.writeString(r2)
            return
    }
}
