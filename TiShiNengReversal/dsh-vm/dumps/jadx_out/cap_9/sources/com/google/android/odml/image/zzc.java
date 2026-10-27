package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzc extends com.google.android.odml.image.ImageProperties {
    private final int zza;
    private final int zzb;

    /* synthetic */ zzc(int r1, int r2, com.google.android.odml.image.zza r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.odml.image.ImageProperties
            r2 = 0
            if (r1 == 0) goto L1c
            com.google.android.odml.image.ImageProperties r5 = (com.google.android.odml.image.ImageProperties) r5
            int r1 = r4.zza
            int r3 = r5.getImageFormat()
            if (r1 != r3) goto L1c
            int r1 = r4.zzb
            int r5 = r5.getStorageType()
            if (r1 != r5) goto L1c
            return r0
        L1c:
            return r2
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.zzb
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.zza
            int r1 = r4.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 65
            r2.<init>(r3)
            java.lang.String r3 = "ImageProperties{imageFormat="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", storageType="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
