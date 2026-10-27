package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class HpackHeaderField {
    static final int HEADER_ENTRY_OVERHEAD = 32;
    final java.lang.CharSequence name;
    final java.lang.CharSequence value;

    HpackHeaderField(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "name"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.name = r2
            java.lang.String r2 = "value"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.value = r2
            return
    }

    static long sizeOf(java.lang.CharSequence r0, java.lang.CharSequence r1) {
            int r0 = r0.length()
            int r1 = r1.length()
            int r0 = r0 + r1
            int r0 = r0 + 32
            long r0 = (long) r0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.handler.codec.http2.HpackHeaderField
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.handler.codec.http2.HpackHeaderField r5 = (io.netty.handler.codec.http2.HpackHeaderField) r5
            java.lang.CharSequence r1 = r4.name
            java.lang.CharSequence r3 = r5.name
            int r1 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r1, r3)
            java.lang.CharSequence r3 = r4.value
            java.lang.CharSequence r5 = r5.value
            int r5 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r3, r5)
            r5 = r5 & r1
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    final int size() {
            r2 = this;
            java.lang.CharSequence r0 = r2.name
            int r0 = r0.length()
            java.lang.CharSequence r1 = r2.value
            int r1 = r1.length()
            int r0 = r0 + r1
            int r0 = r0 + 32
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
