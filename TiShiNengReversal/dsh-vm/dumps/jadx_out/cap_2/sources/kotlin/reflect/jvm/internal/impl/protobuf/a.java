package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements kotlin.reflect.jvm.internal.impl.protobuf.n {
    protected int memoizedHashCode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0058a<BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a> implements kotlin.reflect.jvm.internal.impl.protobuf.n.a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0059a extends java.io.FilterInputStream {
            private int a;

            C0059a(java.io.InputStream r1, int r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.a = r2
                    return
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                    r2 = this;
                    int r0 = super.available()
                    int r1 = r2.a
                    int r0 = java.lang.Math.min(r0, r1)
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                    r2 = this;
                    int r0 = r2.a
                    if (r0 > 0) goto L6
                    r0 = -1
                    return r0
                L6:
                    int r0 = super.read()
                    if (r0 < 0) goto L12
                    int r1 = r2.a
                    int r1 = r1 + (-1)
                    r2.a = r1
                L12:
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                    r1 = this;
                    int r0 = r1.a
                    if (r0 > 0) goto L6
                    r2 = -1
                    return r2
                L6:
                    int r4 = java.lang.Math.min(r4, r0)
                    int r2 = super.read(r2, r3, r4)
                    if (r2 < 0) goto L15
                    int r3 = r1.a
                    int r3 = r3 - r2
                    r1.a = r3
                L15:
                    return r2
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long r4) throws java.io.IOException {
                    r3 = this;
                    int r0 = r3.a
                    long r0 = (long) r0
                    long r4 = java.lang.Math.min(r4, r0)
                    long r4 = super.skip(r4)
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L18
                    int r0 = r3.a
                    long r0 = (long) r0
                    long r0 = r0 - r4
                    int r1 = (int) r0
                    r3.a = r1
                L18:
                    return r4
            }
        }

        public AbstractC0058a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected static <T> void a(java.lang.Iterable<T> r1, java.util.Collection<? super T> r2) {
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.protobuf.l
                if (r0 == 0) goto L14
                r0 = r1
                kotlin.reflect.jvm.internal.impl.protobuf.l r0 = (kotlin.reflect.jvm.internal.impl.protobuf.l) r0
                java.util.List r0 = r0.h()
                b(r0)
                java.util.Collection r1 = (java.util.Collection) r1
                r2.addAll(r1)
                return
            L14:
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L21
                b(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r2.addAll(r1)
                return
            L21:
                java.util.Iterator r1 = r1.iterator()
            L25:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L36
                java.lang.Object r0 = r1.next()
                r0.getClass()
                r2.add(r0)
                goto L25
            L36:
                return
        }

        private static void b(java.lang.Iterable<?> r1) {
                java.util.Iterator r1 = r1.iterator()
            L4:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.next()
                r0.getClass()
                goto L4
            L12:
                return
        }

        protected static kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException f(kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
                kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException
                r0.<init>(r1)
                return r0
        }

        public abstract BuilderType c();

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.a$a r0 = r1.c()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.n.a d(kotlin.reflect.jvm.internal.impl.protobuf.e r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws java.io.IOException {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.a$a r1 = r0.e(r1, r2)
                return r1
        }

        public abstract BuilderType e(kotlin.reflect.jvm.internal.impl.protobuf.e r1, kotlin.reflect.jvm.internal.impl.protobuf.f r2) throws java.io.IOException;
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException newUninitializedMessageException() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte[] toByteArray() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L11
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L11
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.L(r0)     // Catch: java.io.IOException -> L11
            r3.writeTo(r1)     // Catch: java.io.IOException -> L11
            r1.a()     // Catch: java.io.IOException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Serializing to a byte array threw an IOException (should never happen)."
            r1.<init>(r2, r0)
            throw r1
    }

    public void writeDelimitedTo(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.getSerializedSize()
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.w(r0)
            int r1 = r1 + r0
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.v(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r3 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.K(r3, r1)
            r3.s0(r0)
            r2.writeTo(r3)
            r3.J()
            return
    }
}
