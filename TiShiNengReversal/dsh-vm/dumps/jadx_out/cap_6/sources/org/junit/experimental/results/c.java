package org.junit.experimental.results;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends org.hamcrest.o<org.junit.experimental.results.b> {
        final /* synthetic */ int c;

        a(int r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                return
        }

        @Override // org.hamcrest.l
        public void describeTo(org.hamcrest.g r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "has "
                r0.append(r1)
                int r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = " failures"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.b(r0)
                return
        }

        @Override // org.hamcrest.o
        public /* bridge */ /* synthetic */ boolean e(org.junit.experimental.results.b r1) {
                r0 = this;
                org.junit.experimental.results.b r1 = (org.junit.experimental.results.b) r1
                boolean r1 = r0.f(r1)
                return r1
        }

        public boolean f(org.junit.experimental.results.b r2) {
                r1 = this;
                int r2 = r2.a()
                int r0 = r1.c
                if (r2 != r0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends org.hamcrest.b<java.lang.Object> {
        final /* synthetic */ java.lang.String a;

        b(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // org.hamcrest.j
        public boolean c(java.lang.Object r3) {
                r2 = this;
                java.lang.String r0 = r3.toString()
                java.lang.String r1 = r2.a
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L18
                r0 = 1
                org.hamcrest.j r1 = org.junit.experimental.results.c.a(r0)
                boolean r3 = r1.c(r3)
                if (r3 == 0) goto L18
                return r0
            L18:
                r3 = 0
                return r3
        }

        @Override // org.hamcrest.l
        public void describeTo(org.hamcrest.g r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "has single failure containing "
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.experimental.results.c$c, reason: collision with other inner class name */
    static class C0074c extends org.hamcrest.b<org.junit.experimental.results.b> {
        final /* synthetic */ java.lang.String a;

        C0074c(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // org.hamcrest.j
        public boolean c(java.lang.Object r2) {
                r1 = this;
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = r1.a
                boolean r2 = r2.contains(r0)
                return r2
        }

        @Override // org.hamcrest.l
        public void describeTo(org.hamcrest.g r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "has failure containing "
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.b(r0)
                return
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.hamcrest.j<org.junit.experimental.results.b> a(int r1) {
            org.junit.experimental.results.c$a r0 = new org.junit.experimental.results.c$a
            r0.<init>(r1)
            return r0
    }

    public static org.hamcrest.j<org.junit.experimental.results.b> b(java.lang.String r1) {
            org.junit.experimental.results.c$c r0 = new org.junit.experimental.results.c$c
            r0.<init>(r1)
            return r0
    }

    public static org.hamcrest.j<java.lang.Object> c(java.lang.String r1) {
            org.junit.experimental.results.c$b r0 = new org.junit.experimental.results.c$b
            r0.<init>(r1)
            return r0
    }

    public static org.hamcrest.j<org.junit.experimental.results.b> d() {
            r0 = 0
            org.hamcrest.j r0 = a(r0)
            return r0
    }
}
