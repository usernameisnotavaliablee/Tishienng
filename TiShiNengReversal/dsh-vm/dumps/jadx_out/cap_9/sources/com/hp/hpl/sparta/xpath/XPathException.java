package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class XPathException extends java.lang.Exception {
    private java.lang.Throwable cause_;

    XPathException(com.hp.hpl.sparta.xpath.c0 r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r1.cause_ = r3
            return
    }

    public XPathException(com.hp.hpl.sparta.xpath.c0 r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r2 = 0
            r1.cause_ = r2
            return
    }

    XPathException(com.hp.hpl.sparta.xpath.c0 r2, java.lang.String r3, com.hp.hpl.sparta.xpath.s r4, java.lang.String r5) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " got \""
            r0.append(r3)
            java.lang.String r3 = toString(r4)
            r0.append(r3)
            java.lang.String r3 = "\" instead of expected "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r1.<init>(r2, r3)
            return
    }

    private static java.lang.String toString(com.hp.hpl.sparta.xpath.s r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L23
            r0.<init>()     // Catch: java.io.IOException -> L23
            java.lang.String r1 = tokenToString(r3)     // Catch: java.io.IOException -> L23
            r0.append(r1)     // Catch: java.io.IOException -> L23
            int r1 = r3.a     // Catch: java.io.IOException -> L23
            r2 = -1
            if (r1 == r2) goto L1e
            r3.a()     // Catch: java.io.IOException -> L23
            java.lang.String r1 = tokenToString(r3)     // Catch: java.io.IOException -> L23
            r0.append(r1)     // Catch: java.io.IOException -> L23
            r3.c()     // Catch: java.io.IOException -> L23
        L1e:
            java.lang.String r3 = r0.toString()     // Catch: java.io.IOException -> L23
            return r3
        L23:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(cannot get  info: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String tokenToString(com.hp.hpl.sparta.xpath.s r3) {
            int r0 = r3.a
            r1 = -3
            if (r0 == r1) goto L35
            r1 = -2
            java.lang.String r2 = ""
            if (r0 == r1) goto L23
            r1 = -1
            if (r0 == r1) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r3.a
            char r3 = (char) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
        L20:
            java.lang.String r3 = "<end of expression>"
            return r3
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r3.b
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
        L35:
            java.lang.String r3 = r3.c
            return r3
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause_
            return r0
    }
}
