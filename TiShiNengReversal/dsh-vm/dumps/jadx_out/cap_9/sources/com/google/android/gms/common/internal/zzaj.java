package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzaj implements android.os.Parcelable.Creator {
    public zzaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r2 == r8) goto L3f
            r8 = 2
            if (r2 == r8) goto L3a
            r8 = 3
            if (r2 == r8) goto L35
            r8 = 4
            if (r2 == r8) goto L30
            r8 = 5
            if (r2 == r8) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto La
        L2b:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L30:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L35:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            goto La
        L3a:
            boolean r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            goto La
        L3f:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration[] r1 = new com.google.android.gms.common.internal.RootTelemetryConfiguration[r1]
            return r1
    }
}
