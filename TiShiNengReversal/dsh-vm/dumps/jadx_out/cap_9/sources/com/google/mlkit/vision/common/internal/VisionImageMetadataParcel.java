package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "VisionImageMetadataParcelCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class VisionImageMetadataParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.mlkit.vision.common.internal.VisionImageMetadataParcel> CREATOR = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int height;

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final int rotation;

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final long timestampMillis;

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int width;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zza;

    static {
            com.google.mlkit.vision.common.internal.zzg r0 = new com.google.mlkit.vision.common.internal.zzg
            r0.<init>()
            com.google.mlkit.vision.common.internal.VisionImageMetadataParcel.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public VisionImageMetadataParcel(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r6) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.zza = r3
            r0.timestampMillis = r4
            r0.rotation = r6
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Matrix getUprightRotationMatrix() {
            r4 = this;
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            int r1 = r4.width
            int r2 = r4.height
            int r3 = r4.rotation
            android.graphics.Matrix r0 = r0.getUprightRotationMatrix(r1, r2, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            int r1 = r3.width
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 2
            int r1 = r3.height
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            int r1 = r3.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            long r1 = r3.timestampMillis
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            r0 = 5
            int r1 = r3.rotation
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
