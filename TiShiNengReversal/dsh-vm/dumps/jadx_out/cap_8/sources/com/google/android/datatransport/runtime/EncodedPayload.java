package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final com.google.android.datatransport.Encoding encoding;

    public EncodedPayload(@androidx.annotation.NonNull com.google.android.datatransport.Encoding r1, @androidx.annotation.NonNull byte[] r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.encoding = r1
            r0.bytes = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "bytes is null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "encoding is null"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof com.google.android.datatransport.runtime.EncodedPayload
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.datatransport.runtime.EncodedPayload r4 = (com.google.android.datatransport.runtime.EncodedPayload) r4
            com.google.android.datatransport.Encoding r0 = r3.encoding
            com.google.android.datatransport.Encoding r2 = r4.encoding
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            byte[] r0 = r3.bytes
            byte[] r4 = r4.bytes
            boolean r4 = java.util.Arrays.equals(r0, r4)
            return r4
    }

    public byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.bytes
            return r0
    }

    public com.google.android.datatransport.Encoding getEncoding() {
            r1 = this;
            com.google.android.datatransport.Encoding r0 = r1.encoding
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.android.datatransport.Encoding r0 = r2.encoding
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.bytes
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EncodedPayload{encoding="
            r0.append(r1)
            com.google.android.datatransport.Encoding r1 = r2.encoding
            r0.append(r1)
            java.lang.String r1 = ", bytes=[...]}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
