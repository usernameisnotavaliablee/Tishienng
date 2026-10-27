package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ByteBufferExtractor {
    private ByteBufferExtractor() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.nio.ByteBuffer extract(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r2) {
            com.google.android.odml.image.zzg r2 = r2.zza()
            com.google.android.odml.image.ImageProperties r0 = r2.zzb()
            int r0 = r0.getStorageType()
            r1 = 2
            if (r0 != r1) goto L1a
            com.google.android.odml.image.zzf r2 = (com.google.android.odml.image.zzf) r2
            java.nio.ByteBuffer r2 = r2.zza()
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            return r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported"
            r2.<init>(r0)
            throw r2
    }
}
