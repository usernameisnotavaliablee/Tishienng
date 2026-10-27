package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class j0 {
    public static /* synthetic */ java.lang.String a(java.lang.CharSequence r2, java.lang.Iterable r3) {
            if (r2 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
        L11:
            java.lang.Object r1 = r3.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            r0.append(r2)
            goto L11
        L24:
            java.lang.String r2 = r0.toString()
            return r2
        L29:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "delimiter"
            r2.<init>(r3)
            throw r2
    }
}
