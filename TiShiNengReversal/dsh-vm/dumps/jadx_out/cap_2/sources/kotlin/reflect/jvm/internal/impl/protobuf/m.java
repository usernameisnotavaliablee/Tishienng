package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m extends kotlin.reflect.jvm.internal.impl.protobuf.d {
    protected final byte[] c;
    private int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private int a;
        private final int b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.m c;

        private b(kotlin.reflect.jvm.internal.impl.protobuf.m r2) {
                r1 = this;
                r1.c = r2
                r1.<init>()
                r0 = 0
                r1.a = r0
                int r2 = r2.size()
                r1.b = r2
                return
        }

        /* synthetic */ b(kotlin.reflect.jvm.internal.impl.protobuf.m r1, kotlin.reflect.jvm.internal.impl.protobuf.m.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.Byte a() {
                r1 = this;
                byte r0 = r1.d()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte d() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r3.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
                byte[] r0 = r0.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
                int r1 = r3.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
                int r2 = r1 + 1
                r3.a = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
                r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
                return r0
            Ld:
                r0 = move-exception
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.a
                int r1 = r2.b
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Byte next() {
                r1 = this;
                java.lang.Byte r0 = r1.a()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    m(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.c = r2
            return
    }

    static int F(int r2, byte[] r3, int r4, int r5) {
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto Ld
            int r2 = r2 * 31
            r1 = r3[r0]
            int r2 = r2 + r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void B(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.c
            int r1 = r2.E()
            int r1 = r1 + r4
            r3.write(r0, r1, r5)
            return
    }

    public byte C(int r2) {
            r1 = this;
            byte[] r0 = r1.c
            r2 = r0[r2]
            return r2
    }

    boolean D(kotlin.reflect.jvm.internal.impl.protobuf.m r5, int r6, int r7) {
            r4 = this;
            int r0 = r5.size()
            if (r7 > r0) goto L5c
            int r0 = r6 + r7
            int r1 = r5.size()
            if (r0 > r1) goto L31
            byte[] r0 = r4.c
            byte[] r1 = r5.c
            int r2 = r4.E()
            int r2 = r2 + r7
            int r7 = r4.E()
            int r5 = r5.E()
            int r5 = r5 + r6
        L20:
            if (r7 >= r2) goto L2f
            r6 = r0[r7]
            r3 = r1[r5]
            if (r6 == r3) goto L2a
            r5 = 0
            return r5
        L2a:
            int r7 = r7 + 1
            int r5 = r5 + 1
            goto L20
        L2f:
            r5 = 1
            return r5
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r5 = r5.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 59
            r1.<init>(r2)
            java.lang.String r2 = "Ran off end of other: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ", "
            r1.append(r6)
            r1.append(r7)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r6 = r4.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Length too large: "
            r0.append(r1)
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    protected int E() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.size()
            r3 = r5
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r3
            int r3 = r3.size()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r4.size()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.m
            if (r0 == 0) goto L2e
            kotlin.reflect.jvm.internal.impl.protobuf.m r5 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r5
            int r0 = r4.size()
            boolean r5 = r4.D(r5, r2, r0)
            return r5
        L2e:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.r
            if (r0 == 0) goto L37
            boolean r5 = r5.equals(r4)
            return r5
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r5.length()
            int r2 = r2 + 49
            r1.<init>(r2)
            java.lang.String r2 = "Has a new type of ByteString been created? Found "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.d
            if (r0 != 0) goto L12
            int r0 = r2.size()
            r1 = 0
            int r0 = r2.u(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.d = r0
        L12:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.r()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void n(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            byte[] r0 = r1.c
            java.lang.System.arraycopy(r0, r3, r2, r4, r5)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean p() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean q() {
            r3 = this;
            int r0 = r3.E()
            byte[] r1 = r3.c
            int r2 = r3.size()
            int r2 = r2 + r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.protobuf.u.f(r1, r0, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a r() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.m$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.m$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.e r0 = kotlin.reflect.jvm.internal.impl.protobuf.e.h(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
            r1 = this;
            byte[] r0 = r1.c
            int r0 = r0.length
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int u(int r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.c
            int r1 = r2.E()
            int r1 = r1 + r4
            int r3 = F(r3, r0, r1, r5)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.E()
            int r0 = r0 + r3
            byte[] r3 = r1.c
            int r4 = r4 + r0
            int r2 = kotlin.reflect.jvm.internal.impl.protobuf.u.g(r2, r3, r0, r4)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public java.lang.String y(java.lang.String r5) throws java.io.UnsupportedEncodingException {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.c
            int r2 = r4.E()
            int r3 = r4.size()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }
}
