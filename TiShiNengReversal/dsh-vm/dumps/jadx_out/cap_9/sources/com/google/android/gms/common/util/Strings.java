package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Strings {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "\\$\\{(.*?)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.Strings.zza = r0
            return
    }

    private Strings() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String emptyToNull(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isEmptyOrWhitespace(@androidx.annotation.Nullable java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
