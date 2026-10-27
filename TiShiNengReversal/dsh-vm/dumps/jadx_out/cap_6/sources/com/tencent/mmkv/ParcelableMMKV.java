package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ParcelableMMKV implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mmkv.ParcelableMMKV> CREATOR = null;
    private int ashmemFD;
    private int ashmemMetaFD;
    private java.lang.String cryptKey;
    private final java.lang.String mmapID;


    static {
            com.tencent.mmkv.ParcelableMMKV$1 r0 = new com.tencent.mmkv.ParcelableMMKV$1
            r0.<init>()
            com.tencent.mmkv.ParcelableMMKV.CREATOR = r0
            return
    }

    public ParcelableMMKV(@androidx.annotation.NonNull com.tencent.mmkv.MMKV r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.ashmemFD = r0
            r1.ashmemMetaFD = r0
            r0 = 0
            r1.cryptKey = r0
            java.lang.String r0 = r2.mmapID()
            r1.mmapID = r0
            int r0 = r2.ashmemFD()
            r1.ashmemFD = r0
            int r0 = r2.ashmemMetaFD()
            r1.ashmemMetaFD = r0
            java.lang.String r2 = r2.cryptKey()
            r1.cryptKey = r2
            return
    }

    private ParcelableMMKV(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.mmapID = r1
            r0.ashmemFD = r2
            r0.ashmemMetaFD = r3
            r0.cryptKey = r4
            return
    }

    /* synthetic */ ParcelableMMKV(java.lang.String r1, int r2, int r3, java.lang.String r4, com.tencent.mmkv.ParcelableMMKV.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.Nullable
    public com.tencent.mmkv.MMKV toMMKV() {
            r4 = this;
            int r0 = r4.ashmemFD
            if (r0 < 0) goto L11
            int r1 = r4.ashmemMetaFD
            if (r1 < 0) goto L11
            java.lang.String r2 = r4.mmapID
            java.lang.String r3 = r4.cryptKey
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithAshmemFD(r2, r0, r1, r3)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r0 = r2.mmapID     // Catch: java.io.IOException -> L20
            r3.writeString(r0)     // Catch: java.io.IOException -> L20
            int r0 = r2.ashmemFD     // Catch: java.io.IOException -> L20
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.fromFd(r0)     // Catch: java.io.IOException -> L20
            int r1 = r2.ashmemMetaFD     // Catch: java.io.IOException -> L20
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.fromFd(r1)     // Catch: java.io.IOException -> L20
            r4 = r4 | 1
            r0.writeToParcel(r3, r4)     // Catch: java.io.IOException -> L20
            r1.writeToParcel(r3, r4)     // Catch: java.io.IOException -> L20
            java.lang.String r4 = r2.cryptKey     // Catch: java.io.IOException -> L20
            if (r4 == 0) goto L20
            r3.writeString(r4)     // Catch: java.io.IOException -> L20
        L20:
            return
    }
}
