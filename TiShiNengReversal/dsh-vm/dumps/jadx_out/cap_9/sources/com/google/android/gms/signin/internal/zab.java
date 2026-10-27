package com.google.android.gms.signin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zab implements android.os.Parcelable.Creator {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L35
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L30
            r6 = 2
            if (r5 == r6) goto L2b
            r6 = 3
            if (r5 == r6) goto L22
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L7
        L22:
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            goto L7
        L2b:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L7
        L30:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L7
        L35:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.signin.internal.zaa r8 = new com.google.android.gms.signin.internal.zaa
            r8.<init>(r2, r3, r1)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.signin.internal.zaa[] r1 = new com.google.android.gms.signin.internal.zaa[r1]
            return r1
    }
}
