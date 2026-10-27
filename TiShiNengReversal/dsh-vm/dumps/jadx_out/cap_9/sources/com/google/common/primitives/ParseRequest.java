package com.google.common.primitives;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ParseRequest {
    final int radix;
    final java.lang.String rawValue;

    private ParseRequest(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            r0.radix = r2
            return
    }

    static com.google.common.primitives.ParseRequest fromString(java.lang.String r4) {
            int r0 = r4.length()
            if (r0 == 0) goto L47
            r0 = 0
            char r0 = r4.charAt(r0)
            java.lang.String r1 = "0x"
            boolean r1 = r4.startsWith(r1)
            r2 = 16
            if (r1 != 0) goto L3c
            java.lang.String r1 = "0X"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L1e
            goto L3c
        L1e:
            r1 = 35
            r3 = 1
            if (r0 != r1) goto L28
            java.lang.String r4 = r4.substring(r3)
            goto L41
        L28:
            r1 = 48
            if (r0 != r1) goto L39
            int r0 = r4.length()
            if (r0 <= r3) goto L39
            java.lang.String r4 = r4.substring(r3)
            r2 = 8
            goto L41
        L39:
            r2 = 10
            goto L41
        L3c:
            r0 = 2
            java.lang.String r4 = r4.substring(r0)
        L41:
            com.google.common.primitives.ParseRequest r0 = new com.google.common.primitives.ParseRequest
            r0.<init>(r4, r2)
            return r0
        L47:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.String r0 = "empty string"
            r4.<init>(r0)
            throw r4
    }
}
