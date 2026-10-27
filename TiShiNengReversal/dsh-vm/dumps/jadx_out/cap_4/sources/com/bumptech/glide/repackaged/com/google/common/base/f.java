package com.bumptech.glide.repackaged.com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {
    private static final com.bumptech.glide.repackaged.com.google.common.base.b a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<T> implements com.bumptech.glide.repackaged.com.google.common.base.e<T>, java.io.Serializable {
        private final T a;

        private b(T r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(java.lang.Object r1, com.bumptech.glide.repackaged.com.google.common.base.f.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.e
        public boolean apply(T r2) {
                r1 = this;
                T r0 = r1.a
                boolean r2 = r0.equals(r2)
                return r2
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.base.f.b
                if (r0 == 0) goto Lf
                com.bumptech.glide.repackaged.com.google.common.base.f$b r2 = (com.bumptech.glide.repackaged.com.google.common.base.f.b) r2
                T r0 = r1.a
                T r2 = r2.a
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                T r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Predicates.equalTo("
                r0.append(r1)
                T r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum c extends java.lang.Enum<com.bumptech.glide.repackaged.com.google.common.base.f.c> implements com.bumptech.glide.repackaged.com.google.common.base.e<java.lang.Object> {
        public static final com.bumptech.glide.repackaged.com.google.common.base.f.c a = null;
        public static final com.bumptech.glide.repackaged.com.google.common.base.f.c b = null;
        public static final com.bumptech.glide.repackaged.com.google.common.base.f.c c = null;
        public static final com.bumptech.glide.repackaged.com.google.common.base.f.c d = null;
        private static final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.f.c[] e = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum a extends com.bumptech.glide.repackaged.com.google.common.base.f.c {
            a(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.base.e
            public boolean apply(java.lang.Object r1) {
                    r0 = this;
                    r1 = 1
                    return r1
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "Predicates.alwaysTrue()"
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum b extends com.bumptech.glide.repackaged.com.google.common.base.f.c {
            b(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.base.e
            public boolean apply(java.lang.Object r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "Predicates.alwaysFalse()"
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.repackaged.com.google.common.base.f$c$c, reason: collision with other inner class name */
        enum C0035c extends com.bumptech.glide.repackaged.com.google.common.base.f.c {
            C0035c(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.base.e
            public boolean apply(java.lang.Object r1) {
                    r0 = this;
                    if (r1 != 0) goto L4
                    r1 = 1
                    return r1
                L4:
                    r1 = 0
                    return r1
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "Predicates.isNull()"
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum d extends com.bumptech.glide.repackaged.com.google.common.base.f.c {
            d(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.base.e
            public boolean apply(java.lang.Object r1) {
                    r0 = this;
                    if (r1 == 0) goto L4
                    r1 = 1
                    return r1
                L4:
                    r1 = 0
                    return r1
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "Predicates.notNull()"
                    return r0
            }
        }

        static {
                com.bumptech.glide.repackaged.com.google.common.base.f$c$a r0 = new com.bumptech.glide.repackaged.com.google.common.base.f$c$a
                java.lang.String r1 = "ALWAYS_TRUE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.repackaged.com.google.common.base.f.c.a = r0
                com.bumptech.glide.repackaged.com.google.common.base.f$c$b r1 = new com.bumptech.glide.repackaged.com.google.common.base.f$c$b
                java.lang.String r3 = "ALWAYS_FALSE"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.repackaged.com.google.common.base.f.c.b = r1
                com.bumptech.glide.repackaged.com.google.common.base.f$c$c r3 = new com.bumptech.glide.repackaged.com.google.common.base.f$c$c
                java.lang.String r5 = "IS_NULL"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.repackaged.com.google.common.base.f.c.c = r3
                com.bumptech.glide.repackaged.com.google.common.base.f$c$d r5 = new com.bumptech.glide.repackaged.com.google.common.base.f$c$d
                java.lang.String r7 = "NOT_NULL"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.repackaged.com.google.common.base.f.c.d = r5
                r7 = 4
                com.bumptech.glide.repackaged.com.google.common.base.f$c[] r7 = new com.bumptech.glide.repackaged.com.google.common.base.f.c[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.bumptech.glide.repackaged.com.google.common.base.f.c.e = r7
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ c(java.lang.String r1, int r2, com.bumptech.glide.repackaged.com.google.common.base.f.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        <T> com.bumptech.glide.repackaged.com.google.common.base.e<T> a() {
                r0 = this;
                return r0
        }
    }

    static {
            r0 = 44
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = com.bumptech.glide.repackaged.com.google.common.base.b.f(r0)
            com.bumptech.glide.repackaged.com.google.common.base.f.a = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.base.e<T> a(T r2) {
            if (r2 != 0) goto L7
            com.bumptech.glide.repackaged.com.google.common.base.e r2 = b()
            return r2
        L7:
            com.bumptech.glide.repackaged.com.google.common.base.f$b r0 = new com.bumptech.glide.repackaged.com.google.common.base.f$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.base.e<T> b() {
            com.bumptech.glide.repackaged.com.google.common.base.f$c r0 = com.bumptech.glide.repackaged.com.google.common.base.f.c.c
            com.bumptech.glide.repackaged.com.google.common.base.e r0 = r0.a()
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.base.e<T> c() {
            com.bumptech.glide.repackaged.com.google.common.base.f$c r0 = com.bumptech.glide.repackaged.com.google.common.base.f.c.d
            com.bumptech.glide.repackaged.com.google.common.base.e r0 = r0.a()
            return r0
    }
}
