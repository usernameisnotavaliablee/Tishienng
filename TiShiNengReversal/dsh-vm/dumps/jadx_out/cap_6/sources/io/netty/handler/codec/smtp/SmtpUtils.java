package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SmtpUtils {
    private SmtpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.List<java.lang.CharSequence> toUnmodifiableList(java.lang.CharSequence... r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }
}
