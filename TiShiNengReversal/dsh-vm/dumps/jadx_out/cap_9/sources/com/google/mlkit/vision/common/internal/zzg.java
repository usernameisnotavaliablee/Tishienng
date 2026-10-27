package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzg implements android.os.Parcelable.Creator {
    public zzg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r8 = r2
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
        Lc:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L4b
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L3f
            r3 = 3
            if (r2 == r3) goto L39
            r3 = 4
            if (r2 == r3) goto L33
            r3 = 5
            if (r2 == r3) goto L2d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Lc
        L2d:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r10 = r1
            goto Lc
        L33:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            r8 = r1
            goto Lc
        L39:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r7 = r1
            goto Lc
        L3f:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r6 = r1
            goto Lc
        L45:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r5 = r1
            goto Lc
        L4b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.mlkit.vision.common.internal.VisionImageMetadataParcel r4 = new com.google.mlkit.vision.common.internal.VisionImageMetadataParcel
            r4.<init>(r5, r6, r7, r8, r10)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.mlkit.vision.common.internal.VisionImageMetadataParcel[] r1 = new com.google.mlkit.vision.common.internal.VisionImageMetadataParcel[r1]
            return r1
    }
}
