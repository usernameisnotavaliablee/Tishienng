package org.junit.runner.manipulation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class a {
    public static final org.junit.runner.manipulation.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.runner.manipulation.a$a, reason: collision with other inner class name */
    static class C0082a extends org.junit.runner.manipulation.a {
        C0082a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.junit.runner.manipulation.a
        public void a(java.lang.Object r1) throws org.junit.runner.manipulation.NoTestsRemainException {
                r0 = this;
                return
        }

        @Override // org.junit.runner.manipulation.a
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = "all tests"
                return r0
        }

        @Override // org.junit.runner.manipulation.a
        public org.junit.runner.manipulation.a c(org.junit.runner.manipulation.a r1) {
                r0 = this;
                return r1
        }

        @Override // org.junit.runner.manipulation.a
        public boolean e(org.junit.runner.Description r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends org.junit.runner.manipulation.a {
        final /* synthetic */ org.junit.runner.Description b;

        b(org.junit.runner.Description r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // org.junit.runner.manipulation.a
        public java.lang.String b() {
                r3 = this;
                org.junit.runner.Description r0 = r3.b
                java.lang.String r0 = r0.getDisplayName()
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "Method %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }

        @Override // org.junit.runner.manipulation.a
        public boolean e(org.junit.runner.Description r2) {
                r1 = this;
                boolean r0 = r2.isTest()
                if (r0 == 0) goto Ld
                org.junit.runner.Description r0 = r1.b
                boolean r2 = r0.equals(r2)
                return r2
            Ld:
                java.util.ArrayList r2 = r2.getChildren()
                java.util.Iterator r2 = r2.iterator()
            L15:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r2.next()
                org.junit.runner.Description r0 = (org.junit.runner.Description) r0
                boolean r0 = r1.e(r0)
                if (r0 == 0) goto L15
                r2 = 1
                return r2
            L29:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends org.junit.runner.manipulation.a {
        final /* synthetic */ org.junit.runner.manipulation.a b;
        final /* synthetic */ org.junit.runner.manipulation.a c;
        final /* synthetic */ org.junit.runner.manipulation.a d;

        c(org.junit.runner.manipulation.a r1, org.junit.runner.manipulation.a r2, org.junit.runner.manipulation.a r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // org.junit.runner.manipulation.a
        public java.lang.String b() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                org.junit.runner.manipulation.a r1 = r2.b
                java.lang.String r1 = r1.b()
                r0.append(r1)
                java.lang.String r1 = " and "
                r0.append(r1)
                org.junit.runner.manipulation.a r1 = r2.c
                java.lang.String r1 = r1.b()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // org.junit.runner.manipulation.a
        public boolean e(org.junit.runner.Description r2) {
                r1 = this;
                org.junit.runner.manipulation.a r0 = r1.b
                boolean r0 = r0.e(r2)
                if (r0 == 0) goto L12
                org.junit.runner.manipulation.a r0 = r1.c
                boolean r2 = r0.e(r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }
    }

    static {
            org.junit.runner.manipulation.a$a r0 = new org.junit.runner.manipulation.a$a
            r0.<init>()
            org.junit.runner.manipulation.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.junit.runner.manipulation.a d(org.junit.runner.Description r1) {
            org.junit.runner.manipulation.a$b r0 = new org.junit.runner.manipulation.a$b
            r0.<init>(r1)
            return r0
    }

    public void a(java.lang.Object r2) throws org.junit.runner.manipulation.NoTestsRemainException {
            r1 = this;
            boolean r0 = r2 instanceof org.junit.runner.manipulation.b
            if (r0 != 0) goto L5
            return
        L5:
            org.junit.runner.manipulation.b r2 = (org.junit.runner.manipulation.b) r2
            r2.b(r1)
            return
    }

    public abstract java.lang.String b();

    public org.junit.runner.manipulation.a c(org.junit.runner.manipulation.a r2) {
            r1 = this;
            if (r2 == r1) goto Ld
            org.junit.runner.manipulation.a r0 = org.junit.runner.manipulation.a.a
            if (r2 != r0) goto L7
            goto Ld
        L7:
            org.junit.runner.manipulation.a$c r0 = new org.junit.runner.manipulation.a$c
            r0.<init>(r1, r1, r2)
            return r0
        Ld:
            return r1
    }

    public abstract boolean e(org.junit.runner.Description r1);
}
