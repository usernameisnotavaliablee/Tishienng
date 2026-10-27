package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d<T> extends org.hamcrest.b<T> {
    private static final java.util.regex.Pattern d = null;
    private final java.lang.String a;
    private final org.hamcrest.j<T> b;
    private final java.lang.Object[] c;

    static {
            java.lang.String r0 = "%([0-9]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.hamcrest.core.d.d = r0
            return
    }

    public d(java.lang.String r1, org.hamcrest.j<T> r2, java.lang.Object[] r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Object r1 = r3.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> d(java.lang.String r1, org.hamcrest.j<T> r2, java.lang.Object... r3) {
            org.hamcrest.core.d r0 = new org.hamcrest.core.d
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.hamcrest.b, org.hamcrest.j
    public void b(java.lang.Object r2, org.hamcrest.g r3) {
            r1 = this;
            org.hamcrest.j<T> r0 = r1.b
            r0.b(r2, r3)
            return
    }

    @Override // org.hamcrest.j
    public boolean c(java.lang.Object r2) {
            r1 = this;
            org.hamcrest.j<T> r0 = r1.b
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r5) {
            r4 = this;
            java.util.regex.Pattern r0 = org.hamcrest.core.d.d
            java.lang.String r1 = r4.a
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r1 = 0
        L9:
            boolean r2 = r0.find()
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.a
            int r3 = r0.start()
            java.lang.String r1 = r2.substring(r1, r3)
            r5.b(r1)
            java.lang.Object[] r1 = r4.c
            r2 = 1
            java.lang.String r2 = r0.group(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            r1 = r1[r2]
            r5.c(r1)
            int r1 = r0.end()
            goto L9
        L31:
            java.lang.String r0 = r4.a
            int r0 = r0.length()
            if (r1 >= r0) goto L42
            java.lang.String r0 = r4.a
            java.lang.String r0 = r0.substring(r1)
            r5.b(r0)
        L42:
            return
    }
}
