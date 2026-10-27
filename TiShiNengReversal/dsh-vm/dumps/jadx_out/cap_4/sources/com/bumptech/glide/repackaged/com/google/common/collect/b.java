package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b<T> extends com.bumptech.glide.repackaged.com.google.common.collect.u0<T> {
    private com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b a;
    private T b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.bumptech.glide.repackaged.com.google.common.collect.b$b[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.repackaged.com.google.common.collect.b.a.a = r0
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.repackaged.com.google.common.collect.b$b, reason: collision with other inner class name */
    private enum EnumC0036b extends java.lang.Enum<com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b> {
        public static final com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b a = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b b = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b c = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b d = null;
        private static final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b[] e = null;

        static {
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = new com.bumptech.glide.repackaged.com.google.common.collect.b$b
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.a = r0
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = new com.bumptech.glide.repackaged.com.google.common.collect.b$b
                java.lang.String r3 = "NOT_READY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.b = r1
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r3 = new com.bumptech.glide.repackaged.com.google.common.collect.b$b
                java.lang.String r5 = "DONE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.c = r3
                com.bumptech.glide.repackaged.com.google.common.collect.b$b r5 = new com.bumptech.glide.repackaged.com.google.common.collect.b$b
                java.lang.String r7 = "FAILED"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.d = r5
                r7 = 4
                com.bumptech.glide.repackaged.com.google.common.collect.b$b[] r7 = new com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.e = r7
                return
        }

        EnumC0036b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b[] values() {
                com.bumptech.glide.repackaged.com.google.common.collect.b$b[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.e
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.repackaged.com.google.common.collect.b$b[] r0 = (com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b[]) r0
                return r0
        }
    }

    protected b() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.b
            r1.a = r0
            return
    }

    private boolean c() {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.d
            r2.a = r0
            java.lang.Object r0 = r2.a()
            r2.b = r0
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = r2.a
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.c
            if (r0 == r1) goto L16
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.a
            r2.a = r0
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    protected abstract T a();

    protected final T b() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.c
            r1.a = r0
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = r4.a
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.d
            r2 = 0
            r3 = 1
            if (r0 == r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.bumptech.glide.repackaged.com.google.common.base.d.n(r0)
            int[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.a.a
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r1 = r4.a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L23
            r1 = 2
            if (r0 == r1) goto L22
            boolean r0 = r4.c()
            return r0
        L22:
            return r3
        L23:
            return r2
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L10
            com.bumptech.glide.repackaged.com.google.common.collect.b$b r0 = com.bumptech.glide.repackaged.com.google.common.collect.b.EnumC0036b.b
            r2.a = r0
            T r0 = r2.b
            r1 = 0
            r2.b = r1
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
