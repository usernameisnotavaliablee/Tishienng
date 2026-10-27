package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CameraPositionCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.CameraPosition> {
    public CameraPositionCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.CameraPosition createFromParcel(android.os.Parcel r9) {
            r8 = this;
            float r0 = r9.readFloat()
            float r1 = r9.readFloat()
            float r2 = r9.readFloat()
            float r3 = r9.readFloat()
            float r9 = r9.readFloat()
            com.amap.api.maps.model.CameraPosition r4 = new com.amap.api.maps.model.CameraPosition
            com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
            double r6 = (double) r1
            double r1 = (double) r2
            r5.<init>(r6, r1)
            r4.<init>(r5, r9, r3, r0)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.CameraPosition createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.CameraPosition r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.CameraPosition[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.CameraPosition[] r1 = new com.amap.api.maps.model.CameraPosition[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.CameraPosition[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.CameraPosition[] r1 = r0.newArray(r1)
            return r1
    }
}
