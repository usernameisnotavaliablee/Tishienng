package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Base64Utils {
    public Base64Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decode(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafe(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encode(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafe(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafeNoPadding(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }
}
