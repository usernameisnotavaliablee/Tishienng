package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class r extends kotlin.reflect.jvm.internal.impl.protobuf.d {
    private static final int[] i = null;
    private final int c;
    private final kotlin.reflect.jvm.internal.impl.protobuf.d d;
    private final kotlin.reflect.jvm.internal.impl.protobuf.d e;
    private final int f;
    private final int g;
    private int h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> a;

        private b() {
                r1 = this;
                r1.<init>()
                java.util.Stack r0 = new java.util.Stack
                r0.<init>()
                r1.a = r0
                return
        }

        /* synthetic */ b(kotlin.reflect.jvm.internal.impl.protobuf.r.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d a(kotlin.reflect.jvm.internal.impl.protobuf.r.b r0, kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r0.b(r1, r2)
                return r0
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d r3, kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
                r2 = this;
                r2.c(r3)
                r2.c(r4)
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r3 = r2.a
                java.lang.Object r3 = r3.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.d r3 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r3
            Le:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r4 = r2.a
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L26
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r4 = r2.a
                java.lang.Object r4 = r4.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.d r4 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r4
                kotlin.reflect.jvm.internal.impl.protobuf.r r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r
                r1 = 0
                r0.<init>(r4, r3, r1)
                r3 = r0
                goto Le
            L26:
                return r3
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
                r3 = this;
                boolean r0 = r4.p()
                if (r0 == 0) goto La
                r3.insert(r4)
                return
            La:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.protobuf.r
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.protobuf.r r4 = (kotlin.reflect.jvm.internal.impl.protobuf.r) r4
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = kotlin.reflect.jvm.internal.impl.protobuf.r.C(r4)
                r3.c(r0)
                kotlin.reflect.jvm.internal.impl.protobuf.d r4 = kotlin.reflect.jvm.internal.impl.protobuf.r.D(r4)
                r3.c(r4)
                return
            L1f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r4.length()
                int r2 = r2 + 49
                r1.<init>(r2)
                java.lang.String r2 = "Has a new type of ByteString been created? Found "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private int d(int r2) {
                r1 = this;
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.r.E()
                int r2 = java.util.Arrays.binarySearch(r0, r2)
                if (r2 >= 0) goto Lf
                int r2 = r2 + 1
                int r2 = -r2
                int r2 = r2 + (-1)
            Lf:
                return r2
        }

        private void insert(kotlin.reflect.jvm.internal.impl.protobuf.d r6) {
                r5 = this;
                int r0 = r6.size()
                int r0 = r5.d(r0)
                int[] r1 = kotlin.reflect.jvm.internal.impl.protobuf.r.E()
                int r2 = r0 + 1
                r1 = r1[r2]
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r2 = r5.a
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L9c
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r2 = r5.a
                java.lang.Object r2 = r2.peek()
                kotlin.reflect.jvm.internal.impl.protobuf.d r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r2
                int r2 = r2.size()
                if (r2 < r1) goto L28
                goto L9c
            L28:
                int[] r1 = kotlin.reflect.jvm.internal.impl.protobuf.r.E()
                r0 = r1[r0]
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r1 = r5.a
                java.lang.Object r1 = r1.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.d r1 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r1
            L36:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r2 = r5.a
                boolean r2 = r2.isEmpty()
                r3 = 0
                if (r2 != 0) goto L5c
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r2 = r5.a
                java.lang.Object r2 = r2.peek()
                kotlin.reflect.jvm.internal.impl.protobuf.d r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r2
                int r2 = r2.size()
                if (r2 >= r0) goto L5c
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r2 = r5.a
                java.lang.Object r2 = r2.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.d r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r2
                kotlin.reflect.jvm.internal.impl.protobuf.r r4 = new kotlin.reflect.jvm.internal.impl.protobuf.r
                r4.<init>(r2, r1, r3)
                r1 = r4
                goto L36
            L5c:
                kotlin.reflect.jvm.internal.impl.protobuf.r r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r
                r0.<init>(r1, r6, r3)
            L61:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r6 = r5.a
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L96
                int r6 = r0.size()
                int r6 = r5.d(r6)
                int[] r1 = kotlin.reflect.jvm.internal.impl.protobuf.r.E()
                int r6 = r6 + 1
                r6 = r1[r6]
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r1 = r5.a
                java.lang.Object r1 = r1.peek()
                kotlin.reflect.jvm.internal.impl.protobuf.d r1 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r1
                int r1 = r1.size()
                if (r1 >= r6) goto L96
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r6 = r5.a
                java.lang.Object r6 = r6.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.d r6 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r6
                kotlin.reflect.jvm.internal.impl.protobuf.r r1 = new kotlin.reflect.jvm.internal.impl.protobuf.r
                r1.<init>(r6, r0, r3)
                r0 = r1
                goto L61
            L96:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r6 = r5.a
                r6.push(r0)
                return
            L9c:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> r0 = r5.a
                r0.push(r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.m> {
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.r> a;
        private kotlin.reflect.jvm.internal.impl.protobuf.m b;

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
                r1 = this;
                r1.<init>()
                java.util.Stack r0 = new java.util.Stack
                r0.<init>()
                r1.a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.m r2 = r1.a(r2)
                r1.b = r2
                return
        }

        /* synthetic */ c(kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.r.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.m a(kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
                r1 = this;
            L0:
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.r
                if (r0 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.protobuf.r r2 = (kotlin.reflect.jvm.internal.impl.protobuf.r) r2
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.r> r0 = r1.a
                r0.push(r2)
                kotlin.reflect.jvm.internal.impl.protobuf.d r2 = kotlin.reflect.jvm.internal.impl.protobuf.r.C(r2)
                goto L0
            L10:
                kotlin.reflect.jvm.internal.impl.protobuf.m r2 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r2
                return r2
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.m b() {
                r2 = this;
            L0:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.r> r0 = r2.a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto La
                r0 = 0
                return r0
            La:
                java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.r> r0 = r2.a
                java.lang.Object r0 = r0.pop()
                kotlin.reflect.jvm.internal.impl.protobuf.r r0 = (kotlin.reflect.jvm.internal.impl.protobuf.r) r0
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = kotlin.reflect.jvm.internal.impl.protobuf.r.D(r0)
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r2.a(r0)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L0
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.m c() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r2.b
                if (r0 == 0) goto Lb
                kotlin.reflect.jvm.internal.impl.protobuf.m r1 = r2.b()
                r2.b = r1
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r1.b
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.m next() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r1.c()
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {
        private final kotlin.reflect.jvm.internal.impl.protobuf.r.c a;
        private kotlin.reflect.jvm.internal.impl.protobuf.d.a b;
        int c;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.r d;

        private d(kotlin.reflect.jvm.internal.impl.protobuf.r r3) {
                r2 = this;
                r2.d = r3
                r2.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.r$c r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$c
                r1 = 0
                r0.<init>(r3, r1)
                r2.a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r0.r()
                r2.b = r0
                int r3 = r3.size()
                r2.c = r3
                return
        }

        /* synthetic */ d(kotlin.reflect.jvm.internal.impl.protobuf.r r1, kotlin.reflect.jvm.internal.impl.protobuf.r.a r2) {
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
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.b
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L14
                kotlin.reflect.jvm.internal.impl.protobuf.r$c r0 = r1.a
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r0.r()
                r1.b = r0
            L14:
                int r0 = r1.c
                int r0 = r0 + (-1)
                r1.c = r0
                kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.b
                byte r0 = r0.d()
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.c
                if (r0 <= 0) goto L6
                r0 = 1
                return r0
            L6:
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends java.io.InputStream {
        private kotlin.reflect.jvm.internal.impl.protobuf.r.c a;
        private kotlin.reflect.jvm.internal.impl.protobuf.m b;
        private int c;
        private int d;
        private int e;
        private int f;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.r g;

        public e(kotlin.reflect.jvm.internal.impl.protobuf.r r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                r0.b()
                return
        }

        private void a() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r2.b
                if (r0 == 0) goto L2e
                int r0 = r2.d
                int r1 = r2.c
                if (r0 != r1) goto L2e
                int r0 = r2.e
                int r0 = r0 + r1
                r2.e = r0
                r0 = 0
                r2.d = r0
                kotlin.reflect.jvm.internal.impl.protobuf.r$c r1 = r2.a
                boolean r1 = r1.hasNext()
                if (r1 == 0) goto L29
                kotlin.reflect.jvm.internal.impl.protobuf.r$c r0 = r2.a
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r0.c()
                r2.b = r0
                int r0 = r0.size()
                r2.c = r0
                return
            L29:
                r1 = 0
                r2.b = r1
                r2.c = r0
            L2e:
                return
        }

        private void b() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.r$c r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$c
                kotlin.reflect.jvm.internal.impl.protobuf.r r1 = r3.g
                r2 = 0
                r0.<init>(r1, r2)
                r3.a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r0.c()
                r3.b = r0
                int r0 = r0.size()
                r3.c = r0
                r0 = 0
                r3.d = r0
                r3.e = r0
                return
        }

        private int c(byte[] r5, int r6, int r7) {
                r4 = this;
                r0 = r7
            L1:
                if (r0 <= 0) goto L28
                r4.a()
                kotlin.reflect.jvm.internal.impl.protobuf.m r1 = r4.b
                if (r1 != 0) goto Le
                if (r0 != r7) goto L28
                r5 = -1
                return r5
            Le:
                int r1 = r4.c
                int r2 = r4.d
                int r1 = r1 - r2
                int r1 = java.lang.Math.min(r1, r0)
                if (r5 == 0) goto L21
                kotlin.reflect.jvm.internal.impl.protobuf.m r2 = r4.b
                int r3 = r4.d
                r2.m(r5, r3, r6, r1)
                int r6 = r6 + r1
            L21:
                int r2 = r4.d
                int r2 = r2 + r1
                r4.d = r2
                int r0 = r0 - r1
                goto L1
            L28:
                int r7 = r7 - r0
                return r7
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r2 = this;
                int r0 = r2.e
                int r1 = r2.d
                int r0 = r0 + r1
                kotlin.reflect.jvm.internal.impl.protobuf.r r1 = r2.g
                int r1 = r1.size()
                int r1 = r1 - r0
                return r1
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
                r1 = this;
                int r2 = r1.e
                int r0 = r1.d
                int r2 = r2 + r0
                r1.f = r2
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r3 = this;
                r3.a()
                kotlin.reflect.jvm.internal.impl.protobuf.m r0 = r3.b
                if (r0 != 0) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r3.d
                int r2 = r1 + 1
                r3.d = r2
                byte r0 = r0.C(r1)
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                r2.getClass()
                if (r3 < 0) goto L10
                if (r4 < 0) goto L10
                int r0 = r2.length
                int r0 = r0 - r3
                if (r4 > r0) goto L10
                int r2 = r1.c(r2, r3, r4)
                return r2
            L10:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                r2.<init>()
                throw r2
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
                r3 = this;
                monitor-enter(r3)
                r3.b()     // Catch: java.lang.Throwable -> Ld
                int r0 = r3.f     // Catch: java.lang.Throwable -> Ld
                r1 = 0
                r2 = 0
                r3.c(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)
                return
            Ld:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L17
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Le
                r4 = r0
            Le:
                r0 = 0
                int r5 = (int) r4
                r4 = 0
                int r4 = r3.c(r4, r0, r5)
                long r4 = (long) r4
                return r4
            L17:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
                r4.<init>()
                throw r4
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 1
        L7:
            if (r1 <= 0) goto L15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.add(r3)
            int r2 = r2 + r1
            r4 = r2
            r2 = r1
            r1 = r4
            goto L7
        L15:
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            int r1 = r0.size()
            int[] r1 = new int[r1]
            kotlin.reflect.jvm.internal.impl.protobuf.r.i = r1
            r1 = 0
        L28:
            int[] r2 = kotlin.reflect.jvm.internal.impl.protobuf.r.i
            int r3 = r2.length
            if (r1 >= r3) goto L3c
            java.lang.Object r3 = r0.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L28
        L3c:
            return
    }

    private r(kotlin.reflect.jvm.internal.impl.protobuf.d r3, kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r2.d = r3
            r2.e = r4
            int r0 = r3.size()
            r2.f = r0
            int r1 = r4.size()
            int r0 = r0 + r1
            r2.c = r0
            int r3 = r3.o()
            int r4 = r4.o()
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + 1
            r2.g = r3
            return
    }

    /* synthetic */ r(kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.d r2, kotlin.reflect.jvm.internal.impl.protobuf.r.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d C(kotlin.reflect.jvm.internal.impl.protobuf.r r0) {
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r0.d
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d D(kotlin.reflect.jvm.internal.impl.protobuf.r r0) {
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r0.e
            return r0
    }

    static /* synthetic */ int[] E() {
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.r.i
            return r0
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d F(kotlin.reflect.jvm.internal.impl.protobuf.d r6, kotlin.reflect.jvm.internal.impl.protobuf.d r7) {
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.protobuf.r
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r6
            kotlin.reflect.jvm.internal.impl.protobuf.r r0 = (kotlin.reflect.jvm.internal.impl.protobuf.r) r0
            goto La
        L9:
            r0 = r1
        La:
            int r2 = r7.size()
            if (r2 != 0) goto L11
            return r6
        L11:
            int r2 = r6.size()
            if (r2 != 0) goto L18
            return r7
        L18:
            int r2 = r6.size()
            int r3 = r7.size()
            int r2 = r2 + r3
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L2a
            kotlin.reflect.jvm.internal.impl.protobuf.m r6 = G(r6, r7)
            return r6
        L2a:
            if (r0 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r0.e
            int r4 = r4.size()
            int r5 = r7.size()
            int r4 = r4 + r5
            if (r4 >= r3) goto L47
            kotlin.reflect.jvm.internal.impl.protobuf.d r6 = r0.e
            kotlin.reflect.jvm.internal.impl.protobuf.m r6 = G(r6, r7)
            kotlin.reflect.jvm.internal.impl.protobuf.r r7 = new kotlin.reflect.jvm.internal.impl.protobuf.r
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r0.d
            r7.<init>(r0, r6)
            return r7
        L47:
            if (r0 == 0) goto L70
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = r0.d
            int r3 = r3.o()
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r0.e
            int r4 = r4.o()
            if (r3 <= r4) goto L70
            int r3 = r0.o()
            int r4 = r7.o()
            if (r3 <= r4) goto L70
            kotlin.reflect.jvm.internal.impl.protobuf.r r6 = new kotlin.reflect.jvm.internal.impl.protobuf.r
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = r0.e
            r6.<init>(r1, r7)
            kotlin.reflect.jvm.internal.impl.protobuf.r r7 = new kotlin.reflect.jvm.internal.impl.protobuf.r
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r0.d
            r7.<init>(r0, r6)
            return r7
        L70:
            int r0 = r6.o()
            int r3 = r7.o()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = r0 + 1
            int[] r3 = kotlin.reflect.jvm.internal.impl.protobuf.r.i
            r0 = r3[r0]
            if (r2 < r0) goto L8a
            kotlin.reflect.jvm.internal.impl.protobuf.r r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r
            r0.<init>(r6, r7)
            return r0
        L8a:
            kotlin.reflect.jvm.internal.impl.protobuf.r$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$b
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r6 = kotlin.reflect.jvm.internal.impl.protobuf.r.b.a(r0, r6, r7)
            return r6
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.m G(kotlin.reflect.jvm.internal.impl.protobuf.d r4, kotlin.reflect.jvm.internal.impl.protobuf.d r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            int r2 = r0 + r1
            byte[] r2 = new byte[r2]
            r3 = 0
            r4.m(r2, r3, r3, r0)
            r5.m(r2, r3, r0, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.m r4 = new kotlin.reflect.jvm.internal.impl.protobuf.m
            r4.<init>(r2)
            return r4
    }

    private boolean H(kotlin.reflect.jvm.internal.impl.protobuf.d r12) {
            r11 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.r$c r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$c
            r1 = 0
            r0.<init>(r11, r1)
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.protobuf.m r2 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r2
            kotlin.reflect.jvm.internal.impl.protobuf.r$c r3 = new kotlin.reflect.jvm.internal.impl.protobuf.r$c
            r3.<init>(r12, r1)
            java.lang.Object r12 = r3.next()
            kotlin.reflect.jvm.internal.impl.protobuf.m r12 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r12
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L1b:
            int r7 = r2.size()
            int r7 = r7 - r4
            int r8 = r12.size()
            int r8 = r8 - r5
            int r9 = java.lang.Math.min(r7, r8)
            if (r4 != 0) goto L30
            boolean r10 = r2.D(r12, r5, r9)
            goto L34
        L30:
            boolean r10 = r12.D(r2, r4, r9)
        L34:
            if (r10 != 0) goto L37
            return r1
        L37:
            int r6 = r6 + r9
            int r10 = r11.c
            if (r6 < r10) goto L46
            if (r6 != r10) goto L40
            r12 = 1
            return r12
        L40:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L46:
            if (r9 != r7) goto L50
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.protobuf.m r2 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r2
            r4 = 0
            goto L51
        L50:
            int r4 = r4 + r9
        L51:
            if (r9 != r8) goto L5b
            java.lang.Object r12 = r3.next()
            kotlin.reflect.jvm.internal.impl.protobuf.m r12 = (kotlin.reflect.jvm.internal.impl.protobuf.m) r12
            r5 = 0
            goto L1b
        L5b:
            int r5 = r5 + r9
            goto L1b
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void B(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.f
            if (r0 > r1) goto Lc
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            r0.B(r3, r4, r5)
            return
        Lc:
            if (r4 < r1) goto L15
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.e
            int r4 = r4 - r1
            r0.B(r3, r4, r5)
            return
        L15:
            int r1 = r1 - r4
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            r0.B(r3, r4, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r2.e
            r0 = 0
            int r5 = r5 - r1
            r4.B(r3, r0, r5)
            return
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
            kotlin.reflect.jvm.internal.impl.protobuf.d r5 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r5
            int r1 = r4.c
            int r3 = r5.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r4.c
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r0 = r4.h
            if (r0 == 0) goto L29
            int r0 = r5.w()
            if (r0 == 0) goto L29
            int r1 = r4.h
            if (r1 == r0) goto L29
            return r2
        L29:
            boolean r5 = r4.H(r5)
            return r5
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.h
            if (r0 != 0) goto L10
            int r0 = r2.c
            r1 = 0
            int r0 = r2.u(r0, r1, r0)
            if (r0 != 0) goto Le
            r0 = 1
        Le:
            r2.h = r0
        L10:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.r()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void n(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r2.f
            if (r0 > r1) goto Lc
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            r0.n(r3, r4, r5, r6)
            return
        Lc:
            if (r4 < r1) goto L15
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.e
            int r4 = r4 - r1
            r0.n(r3, r4, r5, r6)
            return
        L15:
            int r1 = r1 - r4
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            r0.n(r3, r4, r5, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r2.e
            int r5 = r5 + r1
            int r6 = r6 - r1
            r0 = 0
            r4.n(r3, r0, r5, r6)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int o() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean p() {
            r3 = this;
            int r0 = r3.c
            int[] r1 = kotlin.reflect.jvm.internal.impl.protobuf.r.i
            int r2 = r3.g
            r1 = r1[r2]
            if (r0 < r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean q() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r4.d
            int r1 = r4.f
            r2 = 0
            int r0 = r0.v(r2, r2, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = r4.e
            int r3 = r1.size()
            int r0 = r1.v(r0, r2, r3)
            if (r0 != 0) goto L17
            r0 = 1
            return r0
        L17:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a r() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.r$d r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$d
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.r$e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.r$e
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.e r0 = kotlin.reflect.jvm.internal.impl.protobuf.e.g(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int u(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.f
            if (r0 > r1) goto Ld
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            int r3 = r0.u(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.e
            int r4 = r4 - r1
            int r3 = r0.u(r3, r4, r5)
            return r3
        L17:
            int r1 = r1 - r4
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            int r3 = r0.u(r3, r4, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r2.e
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.u(r3, r0, r5)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.f
            if (r0 > r1) goto Ld
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            int r3 = r0.v(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.e
            int r4 = r4 - r1
            int r3 = r0.v(r3, r4, r5)
            return r3
        L17:
            int r1 = r1 - r4
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.d
            int r3 = r0.v(r3, r4, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d r4 = r2.e
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.v(r3, r0, r5)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public java.lang.String y(java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.x()
            r0.<init>(r1, r3)
            return r0
    }
}
