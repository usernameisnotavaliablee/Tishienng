package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MediaImageExtractor {
    private MediaImageExtractor() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.media.Image extract(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r2) {
            com.google.android.odml.image.zzg r2 = r2.zza()
            com.google.android.odml.image.ImageProperties r0 = r2.zzb()
            int r0 = r0.getStorageType()
            r1 = 3
            if (r0 != r1) goto L16
            com.google.android.odml.image.zzi r2 = (com.google.android.odml.image.zzi) r2
            android.media.Image r2 = r2.zza()
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Extract Media Image from an MlImage created by objects other than Media Image is not supported"
            r2.<init>(r0)
            throw r2
    }
}
