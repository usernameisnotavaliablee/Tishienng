package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class b implements android.os.Parcelable.Creator<com.amap.api.maps.model.Tile> {
    b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.amap.api.maps.model.Tile a(android.os.Parcel r6) {
            int r1 = r6.readInt()
            int r2 = r6.readInt()
            int r3 = r6.readInt()
            byte[] r4 = r6.createByteArray()
            int r6 = r6.readInt()
            com.amap.api.maps.model.Tile r0 = new com.amap.api.maps.model.Tile
            r5 = 1
            if (r6 != r5) goto L1a
            goto L1b
        L1a:
            r5 = 0
        L1b:
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    private static com.amap.api.maps.model.Tile[] a(int r0) {
            com.amap.api.maps.model.Tile[] r0 = new com.amap.api.maps.model.Tile[r0]
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.amap.api.maps.model.Tile createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.Tile r1 = a(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.amap.api.maps.model.Tile[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.Tile[] r1 = a(r1)
            return r1
    }
}
