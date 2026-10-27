package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class CommonPattern {
    CommonPattern() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.CommonPattern compile(java.lang.String r0) {
            com.google.common.base.CommonPattern r0 = com.google.common.base.Platform.compilePattern(r0)
            return r0
    }

    public static boolean isPcreLike() {
            boolean r0 = com.google.common.base.Platform.patternCompilerIsPcreLike()
            return r0
    }

    public abstract int flags();

    public abstract com.google.common.base.CommonMatcher matcher(java.lang.CharSequence r1);

    public abstract java.lang.String pattern();

    public abstract java.lang.String toString();
}
