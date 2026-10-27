package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.AMapOptions> {
    public AMapOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.AMapOptions createFromParcel(android.os.Parcel r4) {
            r3 = this;
            com.amap.api.maps.AMapOptions r0 = new com.amap.api.maps.AMapOptions
            r0.<init>()
            java.lang.Class<com.amap.api.maps.model.CameraPosition> r1 = com.amap.api.maps.model.CameraPosition.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            com.amap.api.maps.model.CameraPosition r1 = (com.amap.api.maps.model.CameraPosition) r1
            int r2 = r4.readInt()
            r0.mapType(r2)
            int r2 = r4.readInt()
            r0.logoPosition(r2)
            r0.camera(r1)
            boolean[] r4 = r4.createBooleanArray()
            if (r4 == 0) goto L5b
            int r1 = r4.length
            r2 = 6
            if (r1 < r2) goto L5b
            r1 = 0
            boolean r1 = r4[r1]
            r0.rotateGesturesEnabled(r1)
            r1 = 1
            boolean r1 = r4[r1]
            r0.scrollGesturesEnabled(r1)
            r1 = 2
            boolean r1 = r4[r1]
            r0.tiltGesturesEnabled(r1)
            r1 = 3
            boolean r1 = r4[r1]
            r0.zoomGesturesEnabled(r1)
            r1 = 4
            boolean r1 = r4[r1]
            r0.zoomControlsEnabled(r1)
            r1 = 5
            boolean r1 = r4[r1]
            r0.zOrderOnTop(r1)
            boolean r1 = r4[r2]
            r0.compassEnabled(r1)
            r1 = 7
            boolean r4 = r4[r1]
            r0.scaleControlsEnabled(r4)
        L5b:
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.AMapOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.AMapOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.AMapOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.AMapOptions[] r1 = new com.amap.api.maps.AMapOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.AMapOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.AMapOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
