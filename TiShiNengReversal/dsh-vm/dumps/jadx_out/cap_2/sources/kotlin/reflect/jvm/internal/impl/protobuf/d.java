package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d implements java.lang.Iterable<java.lang.Byte> {
    public static final kotlin.reflect.jvm.internal.impl.protobuf.d a = null;
    static final /* synthetic */ boolean b = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a extends java.util.Iterator<java.lang.Byte> {
        byte d();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends java.io.OutputStream {
        private static final byte[] f = null;
        private final int a;
        private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.d> b;
        private int c;
        private byte[] d;
        private int e;

        static {
                r0 = 0
                byte[] r0 = new byte[r0]
                kotlin.reflect.jvm.internal.impl.protobuf.d.b.f = r0
                return
        }

        b(int r2) {
                r1 = this;
                r1.<init>()
                if (r2 < 0) goto L13
                r1.a = r2
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.b = r0
                byte[] r2 = new byte[r2]
                r1.d = r2
                return
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Buffer size < 0"
                r2.<init>(r0)
                throw r2
        }

        private byte[] a(byte[] r3, int r4) {
                r2 = this;
                byte[] r0 = new byte[r4]
                int r1 = r3.length
                int r4 = java.lang.Math.min(r1, r4)
                r1 = 0
                java.lang.System.arraycopy(r3, r1, r0, r1, r4)
                return r0
        }

        private void b(int r4) {
                r3 = this;
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.d> r0 = r3.b
                kotlin.reflect.jvm.internal.impl.protobuf.m r1 = new kotlin.reflect.jvm.internal.impl.protobuf.m
                byte[] r2 = r3.d
                r1.<init>(r2)
                r0.add(r1)
                int r0 = r3.c
                byte[] r1 = r3.d
                int r1 = r1.length
                int r0 = r0 + r1
                r3.c = r0
                int r1 = r3.a
                int r0 = r0 >>> 1
                int r4 = java.lang.Math.max(r4, r0)
                int r4 = java.lang.Math.max(r1, r4)
                byte[] r4 = new byte[r4]
                r3.d = r4
                r4 = 0
                r3.e = r4
                return
        }

        private void c() {
                r3 = this;
                int r0 = r3.e
                byte[] r1 = r3.d
                int r2 = r1.length
                if (r0 >= r2) goto L18
                if (r0 <= 0) goto L28
                byte[] r0 = r3.a(r1, r0)
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.d> r1 = r3.b
                kotlin.reflect.jvm.internal.impl.protobuf.m r2 = new kotlin.reflect.jvm.internal.impl.protobuf.m
                r2.<init>(r0)
                r1.add(r2)
                goto L28
            L18:
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.d> r0 = r3.b
                kotlin.reflect.jvm.internal.impl.protobuf.m r1 = new kotlin.reflect.jvm.internal.impl.protobuf.m
                byte[] r2 = r3.d
                r1.<init>(r2)
                r0.add(r1)
                byte[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.d.b.f
                r3.d = r0
            L28:
                int r0 = r3.c
                int r1 = r3.e
                int r0 = r0 + r1
                r3.c = r0
                r0 = 0
                r3.e = r0
                return
        }

        public synchronized int d() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.c     // Catch: java.lang.Throwable -> L8
                int r1 = r2.e     // Catch: java.lang.Throwable -> L8
                int r0 = r0 + r1
                monitor-exit(r2)
                return r0
            L8:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        public synchronized kotlin.reflect.jvm.internal.impl.protobuf.d e() {
                r1 = this;
                monitor-enter(r1)
                r1.c()     // Catch: java.lang.Throwable -> Lc
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.protobuf.d> r0 = r1.b     // Catch: java.lang.Throwable -> Lc
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = kotlin.reflect.jvm.internal.impl.protobuf.d.e(r0)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)
                return r0
            Lc:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }

        public java.lang.String toString() {
                r4 = this;
                int r0 = java.lang.System.identityHashCode(r4)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                int r1 = r4.d()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                java.lang.String r0 = "<ByteString.Output@%s size=%d>"
                java.lang.String r0 = java.lang.String.format(r0, r2)
                return r0
        }

        @Override // java.io.OutputStream
        public synchronized void write(int r4) {
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.e     // Catch: java.lang.Throwable -> Ld
                byte[] r1 = r3.d     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.length     // Catch: java.lang.Throwable -> Ld
                if (r0 != r1) goto Lf
                r0 = 1
                r3.b(r0)     // Catch: java.lang.Throwable -> Ld
                goto Lf
            Ld:
                r4 = move-exception
                goto L1c
            Lf:
                byte[] r0 = r3.d     // Catch: java.lang.Throwable -> Ld
                int r1 = r3.e     // Catch: java.lang.Throwable -> Ld
                int r2 = r1 + 1
                r3.e = r2     // Catch: java.lang.Throwable -> Ld
                byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Ld
                r0[r1] = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)
                return
            L1c:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r4
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] r4, int r5, int r6) {
                r3 = this;
                monitor-enter(r3)
                byte[] r0 = r3.d     // Catch: java.lang.Throwable -> L12
                int r1 = r0.length     // Catch: java.lang.Throwable -> L12
                int r2 = r3.e     // Catch: java.lang.Throwable -> L12
                int r1 = r1 - r2
                if (r6 > r1) goto L14
                java.lang.System.arraycopy(r4, r5, r0, r2, r6)     // Catch: java.lang.Throwable -> L12
                int r4 = r3.e     // Catch: java.lang.Throwable -> L12
                int r4 = r4 + r6
                r3.e = r4     // Catch: java.lang.Throwable -> L12
                goto L26
            L12:
                r4 = move-exception
                goto L28
            L14:
                int r1 = r0.length     // Catch: java.lang.Throwable -> L12
                int r1 = r1 - r2
                java.lang.System.arraycopy(r4, r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L12
                int r5 = r5 + r1
                int r6 = r6 - r1
                r3.b(r6)     // Catch: java.lang.Throwable -> L12
                byte[] r0 = r3.d     // Catch: java.lang.Throwable -> L12
                r1 = 0
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L12
                r3.e = r6     // Catch: java.lang.Throwable -> L12
            L26:
                monitor-exit(r3)
                return
            L28:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
                throw r4
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.protobuf.m r0 = new kotlin.reflect.jvm.internal.impl.protobuf.m
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d.a = r0
            return
    }

    d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.d a(java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.d> r2, int r3) {
            r0 = 1
            if (r3 != r0) goto La
            java.lang.Object r2 = r2.next()
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r2
            return r2
        La:
            int r0 = r3 >>> 1
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = a(r2, r0)
            int r3 = r3 - r0
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = a(r2, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = r1.d(r2)
            return r2
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d e(java.lang.Iterable<kotlin.reflect.jvm.internal.impl.protobuf.d> r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r1
            r0.add(r1)
            goto Ld
        L1d:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
        L20:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = kotlin.reflect.jvm.internal.impl.protobuf.d.a
            return r2
        L29:
            java.util.Iterator r2 = r0.iterator()
            int r0 = r0.size()
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = a(r2, r0)
            return r2
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d f(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = g(r2, r0, r1)
            return r2
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d g(byte[] r2, int r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            kotlin.reflect.jvm.internal.impl.protobuf.m r2 = new kotlin.reflect.jvm.internal.impl.protobuf.m
            r2.<init>(r0)
            return r2
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d j(java.lang.String r2) {
            kotlin.reflect.jvm.internal.impl.protobuf.m r0 = new kotlin.reflect.jvm.internal.impl.protobuf.m     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Lc
            r0.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "UTF-8 not supported?"
            r0.<init>(r1, r2)
            throw r0
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d.b t() {
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.d$b
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            return r0
    }

    void A(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r4 < 0) goto L44
            if (r5 < 0) goto L2b
            int r0 = r4 + r5
            int r1 = r2.size()
            if (r0 > r1) goto L12
            if (r5 <= 0) goto L11
            r2.B(r3, r4, r5)
        L11:
            return
        L12:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 39
            r4.<init>(r5)
            java.lang.String r5 = "Source end offset exceeded: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2b:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 23
            r4.<init>(r0)
            java.lang.String r0 = "Length < 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L44:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 30
            r5.<init>(r0)
            java.lang.String r0 = "Source offset < 0: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    abstract void B(java.io.OutputStream r1, int r2, int r3) throws java.io.IOException;

    public kotlin.reflect.jvm.internal.impl.protobuf.d d(kotlin.reflect.jvm.internal.impl.protobuf.d r8) {
            r7 = this;
            int r0 = r7.size()
            int r1 = r8.size()
            long r2 = (long) r0
            long r4 = (long) r1
            long r2 = r2 + r4
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L17
            kotlin.reflect.jvm.internal.impl.protobuf.d r8 = kotlin.reflect.jvm.internal.impl.protobuf.r.F(r7, r8)
            return r8
        L17:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 53
            r2.<init>(r3)
            java.lang.String r3 = "ByteString would be too long: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "+"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d$a r0 = r1.r()
            return r0
    }

    public void m(byte[] r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = 30
            if (r5 < 0) goto L7b
            if (r6 < 0) goto L64
            if (r7 < 0) goto L4b
            int r0 = r5 + r7
            int r1 = r3.size()
            r2 = 34
            if (r0 > r1) goto L34
            int r0 = r6 + r7
            int r1 = r4.length
            if (r0 > r1) goto L1d
            if (r7 <= 0) goto L1c
            r3.n(r4, r5, r6, r7)
        L1c:
            return
        L1d:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = "Target end offset < 0: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L34:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r6 = "Source end offset < 0: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4b:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 23
            r5.<init>(r6)
            java.lang.String r6 = "Length < 0: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L64:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r7 = "Target offset < 0: "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L7b:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r7 = "Source offset < 0: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    protected abstract void n(byte[] r1, int r2, int r3, int r4);

    protected abstract int o();

    protected abstract boolean p();

    public abstract boolean q();

    public abstract kotlin.reflect.jvm.internal.impl.protobuf.d.a r();

    public abstract kotlin.reflect.jvm.internal.impl.protobuf.e s();

    public abstract int size();

    public java.lang.String toString() {
            r4 = this;
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            int r1 = r4.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "<ByteString@%s size=%d>"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            return r0
    }

    protected abstract int u(int r1, int r2, int r3);

    protected abstract int v(int r1, int r2, int r3);

    protected abstract int w();

    public byte[] x() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L9
            byte[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.h.a
            return r0
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.n(r1, r2, r2, r0)
            return r1
    }

    public abstract java.lang.String y(java.lang.String r1) throws java.io.UnsupportedEncodingException;

    public java.lang.String z() {
            r3 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = r3.y(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "UTF-8 not supported?"
            r1.<init>(r2, r0)
            throw r1
    }
}
