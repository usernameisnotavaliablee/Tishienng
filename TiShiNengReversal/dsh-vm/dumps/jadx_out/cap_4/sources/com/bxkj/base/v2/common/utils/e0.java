package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e0 {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.e0 a = null;

    static {
            com.bxkj.base.v2.common.utils.e0 r0 = new com.bxkj.base.v2.common.utils.e0
            r0.<init>()
            com.bxkj.base.v2.common.utils.e0.a = r0
            return
    }

    private e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.text.SpannableString a(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @androidx.annotation.ColorInt int r6) {
            r4 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r5)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r6)
            int r6 = r5.length()
            r2 = 0
            r3 = 33
            r0.setSpan(r1, r2, r6, r3)
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r1 = 1
            r6.<init>(r1)
            int r5 = r5.length()
            r0.setSpan(r6, r2, r5, r3)
            return r0
    }
}
