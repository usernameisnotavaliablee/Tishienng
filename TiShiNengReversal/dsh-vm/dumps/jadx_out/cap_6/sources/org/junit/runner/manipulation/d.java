package org.junit.runner.manipulation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements java.util.Comparator<org.junit.runner.Description> {
    public static final org.junit.runner.manipulation.d b = null;
    private final java.util.Comparator<org.junit.runner.Description> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.util.Comparator<org.junit.runner.Description> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(org.junit.runner.Description r1, org.junit.runner.Description r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(org.junit.runner.Description r1, org.junit.runner.Description r2) {
                r0 = this;
                org.junit.runner.Description r1 = (org.junit.runner.Description) r1
                org.junit.runner.Description r2 = (org.junit.runner.Description) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            org.junit.runner.manipulation.d r0 = new org.junit.runner.manipulation.d
            org.junit.runner.manipulation.d$a r1 = new org.junit.runner.manipulation.d$a
            r1.<init>()
            r0.<init>(r1)
            org.junit.runner.manipulation.d.b = r0
            return
    }

    public d(java.util.Comparator<org.junit.runner.Description> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.junit.runner.manipulation.c
            if (r0 == 0) goto L9
            org.junit.runner.manipulation.c r2 = (org.junit.runner.manipulation.c) r2
            r2.d(r1)
        L9:
            return
    }

    public int b(org.junit.runner.Description r2, org.junit.runner.Description r3) {
            r1 = this;
            java.util.Comparator<org.junit.runner.Description> r0 = r1.a
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(org.junit.runner.Description r1, org.junit.runner.Description r2) {
            r0 = this;
            org.junit.runner.Description r1 = (org.junit.runner.Description) r1
            org.junit.runner.Description r2 = (org.junit.runner.Description) r2
            int r1 = r0.b(r1, r2)
            return r1
    }
}
