package org.junit.experimental.categories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d extends org.junit.experimental.categories.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends org.junit.experimental.categories.Categories.a {
        public a(java.util.List<java.lang.Class<?>> r2) {
                r1 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>(r2)
                r1.<init>(r0)
                return
        }

        public a(java.util.Set<java.lang.Class<?>> r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r3, r0, r1)
                return
        }

        @Override // org.junit.experimental.categories.Categories.a, org.junit.runner.manipulation.a
        public java.lang.String b() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "includes "
                r0.append(r1)
                java.lang.String r1 = super.b()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.experimental.categories.a
    protected org.junit.runner.manipulation.a b(java.util.List<java.lang.Class<?>> r2) {
            r1 = this;
            org.junit.experimental.categories.d$a r0 = new org.junit.experimental.categories.d$a
            r0.<init>(r2)
            return r0
    }
}
