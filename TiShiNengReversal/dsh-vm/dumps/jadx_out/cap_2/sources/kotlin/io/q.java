package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class q implements kotlin.sequences.m<java.lang.String> {

    @org.jetbrains.annotations.NotNull
    private final java.io.BufferedReader a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<java.lang.String>, l3.a {
        private java.lang.String a;
        private boolean b;
        final /* synthetic */ kotlin.io.q c;

        a(kotlin.io.q r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                return
        }

        public java.lang.String a() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                java.lang.String r0 = r2.a
                r1 = 0
                r2.a = r1
                kotlin.jvm.internal.g0.m(r0)
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.lang.String r0 = r2.a
                r1 = 1
                if (r0 != 0) goto L19
                boolean r0 = r2.b
                if (r0 != 0) goto L19
                kotlin.io.q r0 = r2.c
                java.io.BufferedReader r0 = kotlin.io.q.c(r0)
                java.lang.String r0 = r0.readLine()
                r2.a = r0
                if (r0 != 0) goto L19
                r2.b = r1
            L19:
                java.lang.String r0 = r2.a
                if (r0 == 0) goto L1e
                return r1
            L1e:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.a()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public q(@org.jetbrains.annotations.NotNull java.io.BufferedReader r2) {
            r1 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public static final /* synthetic */ java.io.BufferedReader c(kotlin.io.q r0) {
            java.io.BufferedReader r0 = r0.a
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            kotlin.io.q$a r0 = new kotlin.io.q$a
            r0.<init>(r1)
            return r0
    }
}
