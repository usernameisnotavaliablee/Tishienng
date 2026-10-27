package androidx.camera.core.impl.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EncoderProfilesProxyCompat {
    private static final java.lang.String TAG = "EncoderProfilesProxyCompat";

    private EncoderProfilesProxyCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.EncoderProfilesProxy from(@androidx.annotation.NonNull android.media.CamcorderProfile r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Should use from(EncoderProfiles) on API "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "instead. CamcorderProfile is deprecated on API 31."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "EncoderProfilesProxyCompat"
            androidx.camera.core.Logger.w(r1, r0)
        L21:
            androidx.camera.core.impl.EncoderProfilesProxy r3 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompatBaseImpl.from(r3)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(31)
    public static androidx.camera.core.impl.EncoderProfilesProxy from(@androidx.annotation.NonNull android.media.EncoderProfiles r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            androidx.camera.core.impl.EncoderProfilesProxy r3 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi33Impl.from(r3)
            return r3
        Lb:
            r1 = 31
            if (r0 < r1) goto L14
            androidx.camera.core.impl.EncoderProfilesProxy r3 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi31Impl.from(r3)
            return r3
        L14:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to call from(EncoderProfiles) on API "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". Version 31 or higher required."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }
}
