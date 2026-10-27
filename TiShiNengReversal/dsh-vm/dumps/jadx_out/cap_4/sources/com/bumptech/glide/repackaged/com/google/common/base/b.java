package com.bumptech.glide.repackaged.com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private final java.lang.String a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.repackaged.com.google.common.base.b {
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.b c;

        a(com.bumptech.glide.repackaged.com.google.common.base.b r1, com.bumptech.glide.repackaged.com.google.common.base.b r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r1 = 0
                r0.<init>(r2, r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.b
        java.lang.CharSequence h(java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L5
                java.lang.String r2 = r1.b
                return r2
            L5:
                com.bumptech.glide.repackaged.com.google.common.base.b r0 = r1.c
                java.lang.CharSequence r2 = r0.h(r2)
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.b
        public com.bumptech.glide.repackaged.com.google.common.base.b i(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "already specified useForNull"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.repackaged.com.google.common.base.b$b, reason: collision with other inner class name */
    public static final class C0034b {
        private final com.bumptech.glide.repackaged.com.google.common.base.b a;
        private final java.lang.String b;

        private C0034b(com.bumptech.glide.repackaged.com.google.common.base.b r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.b = r1
                return
        }

        /* synthetic */ C0034b(com.bumptech.glide.repackaged.com.google.common.base.b r1, java.lang.String r2, com.bumptech.glide.repackaged.com.google.common.base.b.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public <A extends java.lang.Appendable> A a(A r4, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> r5) throws java.io.IOException {
                r3 = this;
                com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L63
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.bumptech.glide.repackaged.com.google.common.base.b r1 = r3.a
                java.lang.Object r2 = r0.getKey()
                java.lang.CharSequence r1 = r1.h(r2)
                r4.append(r1)
                java.lang.String r1 = r3.b
                r4.append(r1)
                com.bumptech.glide.repackaged.com.google.common.base.b r1 = r3.a
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = r1.h(r0)
                r4.append(r0)
            L2e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L63
                com.bumptech.glide.repackaged.com.google.common.base.b r0 = r3.a
                java.lang.String r0 = com.bumptech.glide.repackaged.com.google.common.base.b.a(r0)
                r4.append(r0)
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.bumptech.glide.repackaged.com.google.common.base.b r1 = r3.a
                java.lang.Object r2 = r0.getKey()
                java.lang.CharSequence r1 = r1.h(r2)
                r4.append(r1)
                java.lang.String r1 = r3.b
                r4.append(r1)
                com.bumptech.glide.repackaged.com.google.common.base.b r1 = r3.a
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = r1.h(r0)
                r4.append(r0)
                goto L2e
            L63:
                return r4
        }

        public java.lang.StringBuilder b(java.lang.StringBuilder r1, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> r2) {
                r0 = this;
                java.util.Iterator r2 = r2.iterator()
                java.lang.StringBuilder r1 = r0.c(r1, r2)
                return r1
        }

        public java.lang.StringBuilder c(java.lang.StringBuilder r1, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> r2) {
                r0 = this;
                r0.a(r1, r2)     // Catch: java.io.IOException -> L4
                return r1
            L4:
                r1 = move-exception
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>(r1)
                throw r2
        }

        public java.lang.StringBuilder d(java.lang.StringBuilder r1, java.util.Map<?, ?> r2) {
                r0 = this;
                java.util.Set r2 = r2.entrySet()
                java.lang.StringBuilder r1 = r0.b(r1, r2)
                return r1
        }
    }

    private b(com.bumptech.glide.repackaged.com.google.common.base.b r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.a
            r0.a = r1
            return
    }

    /* synthetic */ b(com.bumptech.glide.repackaged.com.google.common.base.b r1, com.bumptech.glide.repackaged.com.google.common.base.b.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private b(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.a = r1
            return
    }

    static /* synthetic */ java.lang.String a(com.bumptech.glide.repackaged.com.google.common.base.b r0) {
            java.lang.String r0 = r0.a
            return r0
    }

    public static com.bumptech.glide.repackaged.com.google.common.base.b f(char r1) {
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = new com.bumptech.glide.repackaged.com.google.common.base.b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.bumptech.glide.repackaged.com.google.common.base.b g(java.lang.String r1) {
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = new com.bumptech.glide.repackaged.com.google.common.base.b
            r0.<init>(r1)
            return r0
    }

    public <A extends java.lang.Appendable> A b(A r2, java.util.Iterator<?> r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            java.lang.CharSequence r0 = r1.h(r0)
            r2.append(r0)
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.String r0 = r1.a
            r2.append(r0)
            java.lang.Object r0 = r3.next()
            java.lang.CharSequence r0 = r1.h(r0)
            r2.append(r0)
            goto L14
        L2b:
            return r2
    }

    public final java.lang.StringBuilder c(java.lang.StringBuilder r1, java.util.Iterator<?> r2) {
            r0 = this;
            r0.b(r1, r2)     // Catch: java.io.IOException -> L4
            return r1
        L4:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }

    public final java.lang.String d(java.lang.Iterable<?> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = r0.e(r1)
            return r1
    }

    public final java.lang.String e(java.util.Iterator<?> r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r1.c(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    java.lang.CharSequence h(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto La
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
        La:
            java.lang.String r2 = r2.toString()
            return r2
    }

    public com.bumptech.glide.repackaged.com.google.common.base.b i(java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.base.b$a r0 = new com.bumptech.glide.repackaged.com.google.common.base.b$a
            r0.<init>(r1, r1, r2)
            return r0
    }

    public com.bumptech.glide.repackaged.com.google.common.base.b.C0034b j(java.lang.String r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.base.b$b r0 = new com.bumptech.glide.repackaged.com.google.common.base.b$b
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
