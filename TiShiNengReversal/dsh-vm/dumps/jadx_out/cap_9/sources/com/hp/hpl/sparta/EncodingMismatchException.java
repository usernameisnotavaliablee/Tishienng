package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class EncodingMismatchException extends com.hp.hpl.sparta.ParseException {
    private java.lang.String declaredEncoding_;

    EncodingMismatchException(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            int r0 = r9.length()
            int r0 = r0 + (-1)
            char r4 = r9.charAt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "encoding '"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "' declared instead of of "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " as expected"
            r0.append(r10)
            java.lang.String r6 = r0.toString()
            r3 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r1.declaredEncoding_ = r5
            return
    }

    java.lang.String getDeclaredEncoding() {
            r1 = this;
            java.lang.String r0 = r1.declaredEncoding_
            return r0
    }
}
