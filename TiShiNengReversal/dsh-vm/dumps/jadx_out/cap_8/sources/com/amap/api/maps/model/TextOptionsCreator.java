package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TextOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.TextOptions> {
    public TextOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TextOptions createFromParcel(android.os.Parcel r8) {
            r7 = this;
            com.amap.api.maps.model.TextOptions r0 = new com.amap.api.maps.model.TextOptions
            r0.<init>()
            java.lang.String r1 = r8.readString()
            r0.a = r1
            android.os.Bundle r1 = r8.readBundle()
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            java.lang.String r3 = "lat"
            double r3 = r1.getDouble(r3)
            java.lang.String r5 = "lng"
            double r5 = r1.getDouble(r5)
            r2.<init>(r3, r5)
            r0.position(r2)
            java.lang.String r1 = r8.readString()
            r0.text(r1)
            int r1 = r8.readInt()
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r1)
            r0.typeface(r1)
            float r1 = r8.readFloat()
            r0.rotate(r1)
            int r1 = r8.readInt()
            int r2 = r8.readInt()
            r0.align(r1, r2)
            int r1 = r8.readInt()
            r0.backgroundColor(r1)
            int r1 = r8.readInt()
            r0.fontColor(r1)
            int r1 = r8.readInt()
            r0.fontSize(r1)
            float r1 = r8.readFloat()
            r0.zIndex(r1)
            byte r1 = r8.readByte()
            r2 = 1
            if (r1 != r2) goto L6b
            goto L6c
        L6b:
            r2 = 0
        L6c:
            r0.visible(r2)
            android.os.Bundle r8 = r8.readBundle()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "obj"
            android.os.Parcelable r8 = r8.getParcelable(r1)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L7e
            r0.setObject(r8)     // Catch: java.lang.Throwable -> L7e
        L7e:
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TextOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.TextOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.TextOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TextOptions[] r1 = new com.amap.api.maps.model.TextOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.TextOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.TextOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
