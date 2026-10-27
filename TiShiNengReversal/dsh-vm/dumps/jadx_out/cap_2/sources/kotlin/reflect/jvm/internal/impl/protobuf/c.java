package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c extends kotlin.reflect.jvm.internal.impl.protobuf.m {
    private final int e;
    private final int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private int a;
        private final int b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.c c;

        private b(kotlin.reflect.jvm.internal.impl.protobuf.c r2) {
                r1 = this;
                r1.c = r2
                r1.<init>()
                int r0 = r2.E()
                r1.a = r0
                int r2 = r2.size()
                int r0 = r0 + r2
                r1.b = r0
                return
        }

        /* synthetic */ b(kotlin.reflect.jvm.internal.impl.protobuf.c r1, kotlin.reflect.jvm.internal.impl.protobuf.c.a r2) {
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
                int r0 = r3.a
                int r1 = r3.b
                if (r0 >= r1) goto L11
                kotlin.reflect.jvm.internal.impl.protobuf.c r1 = r3.c
                byte[] r1 = r1.c
                int r2 = r0 + 1
                r3.a = r2
                r0 = r1[r0]
                return r0
            L11:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
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

    c(byte[] r5, int r6, int r7) {
            r4 = this;
            r4.<init>(r5)
            r0 = 29
            if (r6 < 0) goto L4f
            if (r7 < 0) goto L38
            long r0 = (long) r6
            long r2 = (long) r7
            long r0 = r0 + r2
            int r5 = r5.length
            long r2 = (long) r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L17
            r4.e = r6
            r4.f = r7
            return
        L17:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 48
            r0.<init>(r1)
            java.lang.String r1 = "Offset+Length too large: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "+"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = "Length too small: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L4f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = "Offset too small: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public byte C(int r5) {
            r4 = this;
            if (r5 < 0) goto L35
            int r0 = r4.size()
            if (r5 >= r0) goto L10
            byte[] r0 = r4.c
            int r1 = r4.e
            int r1 = r1 + r5
            r5 = r0[r1]
            return r5
        L10:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r1 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Index too large: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
        L35:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 28
            r1.<init>(r2)
            java.lang.String r2 = "Index too small: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    protected int E() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.r()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void n(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            byte[] r0 = r2.c
            int r1 = r2.E()
            int r1 = r1 + r4
            java.lang.System.arraycopy(r0, r1, r3, r5, r6)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a r() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.c$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.c$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
            r1 = this;
            int r0 = r1.f
            return r0
    }
}
