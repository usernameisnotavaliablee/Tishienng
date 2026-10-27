package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileProjection implements android.os.Parcelable {
    public static final com.amap.api.maps.model.TileProjection CREATOR = null;
    public final int maxX;
    public final int maxY;
    public final int minX;
    public final int minY;
    public final int offsetX;
    public final int offsetY;

    static {
            com.amap.api.maps.model.TileProjection r0 = new com.amap.api.maps.model.TileProjection
            r5 = 0
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.amap.api.maps.model.TileProjection.CREATOR = r0
            return
    }

    public TileProjection(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.offsetX = r1
            r0.offsetY = r2
            r0.minX = r3
            r0.maxX = r4
            r0.minY = r5
            r0.maxY = r6
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.offsetX
            r1.writeInt(r2)
            int r2 = r0.offsetY
            r1.writeInt(r2)
            int r2 = r0.minX
            r1.writeInt(r2)
            int r2 = r0.maxX
            r1.writeInt(r2)
            int r2 = r0.maxX
            r1.writeInt(r2)
            int r2 = r0.maxY
            r1.writeInt(r2)
            return
    }
}
