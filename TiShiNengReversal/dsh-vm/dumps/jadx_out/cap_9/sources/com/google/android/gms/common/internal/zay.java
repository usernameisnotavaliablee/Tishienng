package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zay implements android.os.Parcelable.Creator {
    public zay() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3e
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L39
            r7 = 2
            if (r6 == r7) goto L34
            r7 = 3
            if (r6 == r7) goto L2f
            r7 = 4
            if (r6 == r7) goto L26
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L26:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r1 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r9, r5, r1)
            com.google.android.gms.common.api.Scope[] r1 = (com.google.android.gms.common.api.Scope[]) r1
            goto L8
        L2f:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L34:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L39:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L3e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.internal.zax r9 = new com.google.android.gms.common.internal.zax
            r9.<init>(r2, r3, r4, r1)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zax[] r1 = new com.google.android.gms.common.internal.zax[r1]
            return r1
    }
}
