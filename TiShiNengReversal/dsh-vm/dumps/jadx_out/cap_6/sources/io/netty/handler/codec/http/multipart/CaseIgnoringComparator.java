package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CaseIgnoringComparator implements java.util.Comparator<java.lang.CharSequence>, java.io.Serializable {
    static final io.netty.handler.codec.http.multipart.CaseIgnoringComparator INSTANCE = null;
    private static final long serialVersionUID = 4582133183775373862L;

    static {
            io.netty.handler.codec.http.multipart.CaseIgnoringComparator r0 = new io.netty.handler.codec.http.multipart.CaseIgnoringComparator
            r0.<init>()
            io.netty.handler.codec.http.multipart.CaseIgnoringComparator.INSTANCE = r0
            return
    }

    private CaseIgnoringComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            io.netty.handler.codec.http.multipart.CaseIgnoringComparator r0 = io.netty.handler.codec.http.multipart.CaseIgnoringComparator.INSTANCE
            return r0
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.lang.CharSequence r7, java.lang.CharSequence r8) {
            r6 = this;
            int r0 = r7.length()
            int r1 = r8.length()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        Ld:
            if (r3 >= r2) goto L32
            char r4 = r7.charAt(r3)
            char r5 = r8.charAt(r3)
            if (r4 == r5) goto L2f
            char r4 = java.lang.Character.toUpperCase(r4)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2f
            char r4 = java.lang.Character.toLowerCase(r4)
            char r5 = java.lang.Character.toLowerCase(r5)
            if (r4 == r5) goto L2f
            int r4 = r4 - r5
            return r4
        L2f:
            int r3 = r3 + 1
            goto Ld
        L32:
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }
}
