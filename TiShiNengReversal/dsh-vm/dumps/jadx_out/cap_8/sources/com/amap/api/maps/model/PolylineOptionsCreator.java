package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PolylineOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.PolylineOptions> {
    public PolylineOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.PolylineOptions createFromParcel(android.os.Parcel r11) {
            r10 = this;
            com.amap.api.maps.model.PolylineOptions r0 = new com.amap.api.maps.model.PolylineOptions
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.amap.api.maps.model.LatLngCreator r2 = com.amap.api.maps.model.LatLng.CREATOR
            r11.readTypedList(r1, r2)
            float r2 = r11.readFloat()
            int r3 = r11.readInt()
            int r4 = r11.readInt()
            float r5 = r11.readFloat()
            float r6 = r11.readFloat()
            java.lang.String r7 = r11.readString()
            r0.a = r7
            int r7 = r11.readInt()
            com.amap.api.maps.model.PolylineOptions$LineCapType r7 = com.amap.api.maps.model.PolylineOptions.LineCapType.valueOf(r7)
            r0.lineCapType(r7)
            int r7 = r11.readInt()
            com.amap.api.maps.model.PolylineOptions$LineJoinType r7 = com.amap.api.maps.model.PolylineOptions.LineJoinType.valueOf(r7)
            r0.lineJoinType(r7)
            r7 = 5
            boolean[] r7 = new boolean[r7]
            r11.readBooleanArray(r7)
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r8 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.ClassLoader r9 = r8.getClassLoader()
            android.os.Parcelable r9 = r11.readParcelable(r9)
            com.amap.api.maps.model.BitmapDescriptor r9 = (com.amap.api.maps.model.BitmapDescriptor) r9
            r0.addAll(r1)
            r0.width(r2)
            r0.color(r3)
            r0.setDottedLineType(r4)
            r0.zIndex(r5)
            r0.transparency(r6)
            r1 = 0
            boolean r1 = r7[r1]
            r0.visible(r1)
            r1 = 1
            boolean r1 = r7[r1]
            r0.setDottedLine(r1)
            r1 = 2
            boolean r1 = r7[r1]
            r0.geodesic(r1)
            r1 = 3
            boolean r1 = r7[r1]
            r0.useGradient(r1)
            r1 = 4
            boolean r1 = r7[r1]
            r0.aboveMaskLayer(r1)
            r0.setCustomTexture(r9)
            java.lang.ClassLoader r1 = r8.getClassLoader()
            java.util.ArrayList r1 = r11.readArrayList(r1)
            r0.setCustomTextureList(r1)
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.util.ArrayList r2 = r11.readArrayList(r2)
            r0.setCustomTextureIndex(r2)
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r1 = r11.readArrayList(r1)
            r0.colorValues(r1)
            float r11 = r11.readFloat()
            r0.setShownRatio(r11)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.PolylineOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.PolylineOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.PolylineOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.PolylineOptions[] r1 = new com.amap.api.maps.model.PolylineOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.PolylineOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.PolylineOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
