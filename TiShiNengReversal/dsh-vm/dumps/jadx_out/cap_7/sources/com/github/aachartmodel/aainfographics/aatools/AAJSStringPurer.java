package com.github.aachartmodel.aainfographics.aatools;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAJSStringPurer {
    public static final com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer INSTANCE = null;

    static {
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer r0 = new com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer
            r0.<init>()
            com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer.INSTANCE = r0
            return
    }

    private AAJSStringPurer() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String pureAnonymousJSFunctionString(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r2.pureJavaScriptFunctionString(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String pureJavaScriptFunctionString(@org.jetbrains.annotations.NotNull java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "JSStr"
            kotlin.jvm.internal.g0.p(r14, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "'"
            java.lang.String r3 = "\""
            r4 = 0
            r1 = r14
            java.lang.String r7 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            r11 = 4
            r12 = 0
            java.lang.String r8 = "\u0000"
            java.lang.String r9 = ""
            r10 = 0
            java.lang.String r0 = kotlin.text.u.x2(r7, r8, r9, r10, r11, r12)
            r4 = 4
            r5 = 0
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r6 = kotlin.text.u.x2(r0, r1, r2, r3, r4, r5)
            r10 = 4
            r11 = 0
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            r9 = 0
            java.lang.String r0 = kotlin.text.u.x2(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "\""
            java.lang.String r2 = "\\\""
            java.lang.String r6 = kotlin.text.u.x2(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "'"
            java.lang.String r8 = "\\'"
            java.lang.String r0 = kotlin.text.u.x2(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\\n"
            java.lang.String r6 = kotlin.text.u.x2(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r0 = kotlin.text.u.x2(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "\u2028"
            java.lang.String r2 = "\\u2028"
            java.lang.String r6 = kotlin.text.u.x2(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "\u2029"
            java.lang.String r8 = "\\u2029"
            java.lang.String r14 = kotlin.text.u.x2(r6, r7, r8, r9, r10, r11)
            return r14
    }
}
