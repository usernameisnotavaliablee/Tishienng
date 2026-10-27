package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CircleOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.CircleOptions> {
    public CircleOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.CircleOptions createFromParcel(android.os.Parcel r8) {
            r7 = this;
            com.amap.api.maps.model.CircleOptions r0 = new com.amap.api.maps.model.CircleOptions
            r0.<init>()
            android.os.Bundle r1 = r8.readBundle()
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            java.lang.String r3 = "lat"
            double r3 = r1.getDouble(r3)
            java.lang.String r5 = "lng"
            double r5 = r1.getDouble(r5)
            r2.<init>(r3, r5)
            r0.center(r2)
            double r1 = r8.readDouble()
            r0.radius(r1)
            float r1 = r8.readFloat()
            r0.strokeWidth(r1)
            int r1 = r8.readInt()
            r0.strokeColor(r1)
            int r1 = r8.readInt()
            r0.fillColor(r1)
            float r1 = r8.readFloat()
            r0.zIndex(r1)
            byte r1 = r8.readByte()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L4a
            r1 = 1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            r0.visible(r1)
            java.lang.String r1 = r8.readString()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Class<com.amap.api.maps.model.BaseHoleOptions> r4 = com.amap.api.maps.model.BaseHoleOptions.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r8.readList(r1, r4)
            r0.addHoles(r1)
            int r1 = r8.readInt()
            r0.setStrokeDottedLineType(r1)
            byte r8 = r8.readByte()
            if (r8 != r3) goto L73
            r2 = 1
        L73:
            r0.usePolylineStroke(r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.CircleOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.CircleOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.CircleOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.CircleOptions[] r1 = new com.amap.api.maps.model.CircleOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.CircleOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.CircleOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
