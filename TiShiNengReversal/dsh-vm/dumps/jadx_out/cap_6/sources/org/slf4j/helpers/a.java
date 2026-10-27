package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements i5.c {
    private java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.slf4j.helpers.a$a, reason: collision with other inner class name */
    class C0088a extends java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> {
        final /* synthetic */ org.slf4j.helpers.a a;

        C0088a(org.slf4j.helpers.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        protected java.util.Map<java.lang.String, java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r2)
                return r0
        }

        @Override // java.lang.InheritableThreadLocal
        protected /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.String> childValue(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                java.util.Map r1 = r0.a(r1)
                return r1
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            org.slf4j.helpers.a$a r0 = new org.slf4j.helpers.a$a
            r0.<init>(r1)
            r1.a = r0
            return
    }

    @Override // i5.c
    public void a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L16
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r1 = r2.a
            r1.set(r0)
        L16:
            r0.put(r3, r4)
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "key cannot be null"
            r3.<init>(r4)
            throw r3
    }

    @Override // i5.c
    public java.util.Map<java.lang.String, java.lang.String> b() {
            r2 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L10
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // i5.c
    public void c(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r2.a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r3)
            r0.set(r1)
            return
    }

    @Override // i5.c
    public void clear() {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L12
            r0.clear()
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.a
            r0.remove()
        L12:
            return
    }

    public java.util.Set<java.lang.String> d() {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lf
            java.util.Set r0 = r0.keySet()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // i5.c
    public java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // i5.c
    public void remove(java.lang.String r2) {
            r1 = this;
            java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Ld
            r0.remove(r2)
        Ld:
            return
    }
}
