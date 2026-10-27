package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MarkerOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.MarkerOptions> {
    public MarkerOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.MarkerOptions createFromParcel(android.os.Parcel r5) {
            r4 = this;
            com.amap.api.maps.model.MarkerOptions r0 = new com.amap.api.maps.model.MarkerOptions
            r0.<init>()
            java.lang.Class<com.amap.api.maps.model.LatLng> r1 = com.amap.api.maps.model.LatLng.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r5.readParcelable(r1)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            r0.position(r1)
            java.lang.String r1 = r5.readString()
            r0.title(r1)
            java.lang.String r1 = r5.readString()
            r0.snippet(r1)
            float r1 = r5.readFloat()
            float r2 = r5.readFloat()
            r0.anchor(r1, r2)
            int r1 = r5.readInt()
            int r2 = r5.readInt()
            r0.setInfoWindowOffset(r1, r2)
            r1 = 8
            boolean[] r1 = new boolean[r1]
            r5.readBooleanArray(r1)
            r2 = 0
            boolean r2 = r1[r2]
            r0.visible(r2)
            r2 = 1
            boolean r2 = r1[r2]
            r0.draggable(r2)
            r2 = 2
            boolean r2 = r1[r2]
            r0.setGps(r2)
            r2 = 3
            boolean r2 = r1[r2]
            r0.setFlat(r2)
            r2 = 4
            boolean r2 = r1[r2]
            r0.autoOverturnInfoWindow(r2)
            r2 = 5
            boolean r2 = r1[r2]
            r0.infoWindowEnable(r2)
            r2 = 6
            boolean r2 = r1[r2]
            r0.belowMaskLayer(r2)
            r2 = 7
            boolean r1 = r1[r2]
            r0.setRotatingMode(r1)
            java.lang.String r1 = r5.readString()
            r0.a = r1
            int r1 = r5.readInt()
            r0.period(r1)
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r1 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.util.ArrayList r2 = r5.readArrayList(r2)
            r0.icons(r2)
            float r2 = r5.readFloat()
            r0.zIndex(r2)
            float r2 = r5.readFloat()
            r0.alpha(r2)
            int r2 = r5.readInt()
            r0.displayLevel(r2)
            float r2 = r5.readFloat()
            r0.rotateAngle(r2)
            int r2 = r5.readInt()
            int r3 = r5.readInt()
            r0.setScreenPosition(r2, r3)
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r5 = r5.readParcelable(r1)
            com.amap.api.maps.model.BitmapDescriptor r5 = (com.amap.api.maps.model.BitmapDescriptor) r5
            if (r5 == 0) goto Lbf
            r0.icon(r5)
        Lbf:
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.MarkerOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.MarkerOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.MarkerOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.MarkerOptions[] r1 = new com.amap.api.maps.model.MarkerOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.MarkerOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.MarkerOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
