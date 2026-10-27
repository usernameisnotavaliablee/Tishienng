package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GroundOverlayOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.GroundOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    public GroundOverlayOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GroundOverlayOptions createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r1 = r14.readInt()
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptor> r0 = com.amap.api.maps.model.BitmapDescriptor.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r12 = r0
            com.amap.api.maps.model.BitmapDescriptor r12 = (com.amap.api.maps.model.BitmapDescriptor) r12
            java.lang.Class<com.amap.api.maps.model.LatLng> r0 = com.amap.api.maps.model.LatLng.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r2 = r0
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
            float r3 = r14.readFloat()
            float r4 = r14.readFloat()
            java.lang.Class<com.amap.api.maps.model.LatLngBounds> r0 = com.amap.api.maps.model.LatLngBounds.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r5 = r0
            com.amap.api.maps.model.LatLngBounds r5 = (com.amap.api.maps.model.LatLngBounds) r5
            float r6 = r14.readFloat()
            float r7 = r14.readFloat()
            byte r0 = r14.readByte()
            if (r0 == 0) goto L44
            r0 = 1
            r8 = 1
            goto L46
        L44:
            r0 = 0
            r8 = 0
        L46:
            float r9 = r14.readFloat()
            float r10 = r14.readFloat()
            float r11 = r14.readFloat()
            com.amap.api.maps.model.GroundOverlayOptions r0 = new com.amap.api.maps.model.GroundOverlayOptions
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.image(r12)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.GroundOverlayOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.GroundOverlayOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GroundOverlayOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.GroundOverlayOptions[] r1 = new com.amap.api.maps.model.GroundOverlayOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.GroundOverlayOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.GroundOverlayOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
