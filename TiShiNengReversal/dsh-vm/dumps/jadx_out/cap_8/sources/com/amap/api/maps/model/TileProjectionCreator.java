package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileProjectionCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.TileProjection> {
    public TileProjectionCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TileProjection createFromParcel(android.os.Parcel r8) {
            r7 = this;
            com.amap.api.maps.model.TileProjection r0 = new com.amap.api.maps.model.TileProjection
            int r1 = r8.readInt()
            int r2 = r8.readInt()
            int r3 = r8.readInt()
            int r4 = r8.readInt()
            int r5 = r8.readInt()
            int r6 = r8.readInt()
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TileProjection createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.TileProjection r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TileProjection[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TileProjection[] r1 = new com.amap.api.maps.model.TileProjection[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TileProjection[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TileProjection[] r1 = r0.newArray(r1)
            return r1
    }
}
