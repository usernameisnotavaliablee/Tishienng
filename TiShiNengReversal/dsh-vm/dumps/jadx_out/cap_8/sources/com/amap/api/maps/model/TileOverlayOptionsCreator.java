package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileOverlayOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.TileOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    public TileOverlayOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TileOverlayOptions createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = r11.readInt()
            java.lang.Class<com.amap.api.maps.model.TileProvider> r1 = com.amap.api.maps.model.TileProvider.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r11.readValue(r1)
            com.amap.api.maps.model.TileProvider r1 = (com.amap.api.maps.model.TileProvider) r1
            byte r2 = r11.readByte()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            float r5 = r11.readFloat()
            int r6 = r11.readInt()
            int r7 = r11.readInt()
            java.lang.String r8 = r11.readString()
            byte r9 = r11.readByte()
            if (r9 == 0) goto L33
            r9 = 1
            goto L34
        L33:
            r9 = 0
        L34:
            byte r11 = r11.readByte()
            if (r11 == 0) goto L3b
            r3 = 1
        L3b:
            com.amap.api.maps.model.TileOverlayOptions r11 = new com.amap.api.maps.model.TileOverlayOptions
            r11.<init>(r0, r2, r5)
            if (r1 == 0) goto L45
            r11.tileProvider(r1)
        L45:
            r11.memCacheSize(r6)
            r11.diskCacheSize(r7)
            r11.diskCacheDir(r8)
            r11.memoryCacheEnabled(r9)
            r11.diskCacheEnabled(r3)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TileOverlayOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.TileOverlayOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TileOverlayOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TileOverlayOptions[] r1 = new com.amap.api.maps.model.TileOverlayOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TileOverlayOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TileOverlayOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
