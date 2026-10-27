package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BitmapDescriptorCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.BitmapDescriptor> {
    public BitmapDescriptorCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.BitmapDescriptor createFromParcel(android.os.Parcel r4) {
            r3 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = new com.amap.api.maps.model.BitmapDescriptor
            r1 = 0
            java.lang.String r2 = r4.readString()
            r0.<init>(r1, r2)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            r0.mBitmap = r1
            int r1 = r4.readInt()
            r0.a = r1
            int r4 = r4.readInt()
            r0.f4996b = r4
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.BitmapDescriptor createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.BitmapDescriptor r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.BitmapDescriptor[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.BitmapDescriptor[] r1 = new com.amap.api.maps.model.BitmapDescriptor[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.BitmapDescriptor[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.BitmapDescriptor[] r1 = r0.newArray(r1)
            return r1
    }
}
