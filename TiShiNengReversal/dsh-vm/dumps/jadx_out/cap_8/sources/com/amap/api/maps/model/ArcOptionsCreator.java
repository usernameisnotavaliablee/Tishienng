package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ArcOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.ArcOptions> {
    public ArcOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.ArcOptions createFromParcel(android.os.Parcel r10) {
            r9 = this;
            com.amap.api.maps.model.ArcOptions r0 = new com.amap.api.maps.model.ArcOptions
            r0.<init>()
            android.os.Bundle r1 = r10.readBundle()
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            java.lang.String r3 = "startlat"
            double r3 = r1.getDouble(r3)
            java.lang.String r5 = "startlng"
            double r5 = r1.getDouble(r5)
            r2.<init>(r3, r5)
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            java.lang.String r4 = "passedlat"
            double r4 = r1.getDouble(r4)
            java.lang.String r6 = "passedlng"
            double r6 = r1.getDouble(r6)
            r3.<init>(r4, r6)
            com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
            java.lang.String r5 = "endlat"
            double r5 = r1.getDouble(r5)
            java.lang.String r7 = "endlng"
            double r7 = r1.getDouble(r7)
            r4.<init>(r5, r7)
            r0.point(r2, r3, r4)
            float r1 = r10.readFloat()
            r0.strokeWidth(r1)
            int r1 = r10.readInt()
            r0.strokeColor(r1)
            float r1 = r10.readFloat()
            r0.zIndex(r1)
            byte r1 = r10.readByte()
            r2 = 1
            if (r1 != r2) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            r0.visible(r2)
            java.lang.String r10 = r10.readString()
            r0.a = r10
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.ArcOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.ArcOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.ArcOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.ArcOptions[] r1 = new com.amap.api.maps.model.ArcOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.ArcOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.ArcOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
