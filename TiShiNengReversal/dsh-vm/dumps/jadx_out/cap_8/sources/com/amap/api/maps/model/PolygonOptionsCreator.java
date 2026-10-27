package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PolygonOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.PolygonOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    public PolygonOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.PolygonOptions createFromParcel(android.os.Parcel r13) {
            r12 = this;
            com.amap.api.maps.model.PolygonOptions r0 = new com.amap.api.maps.model.PolygonOptions
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.amap.api.maps.model.LatLngCreator r2 = com.amap.api.maps.model.LatLng.CREATOR
            r13.readTypedList(r1, r2)
            float r2 = r13.readFloat()
            int r3 = r13.readInt()
            int r4 = r13.readInt()
            float r5 = r13.readFloat()
            byte r6 = r13.readByte()
            r7 = 0
            r8 = 1
            if (r6 != r8) goto L29
            r6 = 1
            goto L2a
        L29:
            r6 = 0
        L2a:
            int r9 = r1.size()
            com.amap.api.maps.model.LatLng[] r9 = new com.amap.api.maps.model.LatLng[r9]
            r10 = 0
        L31:
            int r11 = r1.size()
            if (r10 >= r11) goto L42
            java.lang.Object r11 = r1.get(r10)
            com.amap.api.maps.model.LatLng r11 = (com.amap.api.maps.model.LatLng) r11
            r9[r10] = r11
            int r10 = r10 + 1
            goto L31
        L42:
            r0.add(r9)
            r0.strokeWidth(r2)
            r0.strokeColor(r3)
            r0.fillColor(r4)
            r0.zIndex(r5)
            r0.visible(r6)
            java.lang.String r1 = r13.readString()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Class<com.amap.api.maps.model.BaseHoleOptions> r2 = com.amap.api.maps.model.BaseHoleOptions.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r13.readList(r1, r2)
            r0.addHoles(r1)
            int r1 = r13.readInt()
            com.amap.api.maps.model.AMapPara$LineJoinType r1 = com.amap.api.maps.model.AMapPara.LineJoinType.valueOf(r1)
            r0.lineJoinType(r1)
            byte r13 = r13.readByte()
            if (r13 != r8) goto L7d
            r7 = 1
        L7d:
            r0.usePolylineStroke(r7)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.PolygonOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.PolygonOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.PolygonOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.PolygonOptions[] r1 = new com.amap.api.maps.model.PolygonOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.PolygonOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.PolygonOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
