package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l implements java.util.Iterator<java.lang.String>, l3.a {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.l.a f = null;

    @java.lang.Deprecated
    public static final int g = 0;

    @java.lang.Deprecated
    public static final int h = 1;

    @java.lang.Deprecated
    public static final int i = 2;

    @org.jetbrains.annotations.NotNull
    private final java.lang.CharSequence a;
    private int b;
    private int c;
    private int d;
    private int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.text.l$a r0 = new kotlin.text.l$a
            r1 = 0
            r0.<init>(r1)
            kotlin.text.l.f = r0
            return
    }

    public l(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String a() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.b = r0
            int r0 = r3.d
            int r1 = r3.c
            int r2 = r3.e
            int r2 = r2 + r0
            r3.c = r2
            java.lang.CharSequence r2 = r3.a
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r8 = this;
            int r0 = r8.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r8.e
            r3 = 2
            if (r0 >= 0) goto L12
            r8.b = r3
            return r1
        L12:
            java.lang.CharSequence r0 = r8.a
            int r0 = r0.length()
            int r1 = r8.c
            java.lang.CharSequence r4 = r8.a
            int r4 = r4.length()
        L20:
            if (r1 >= r4) goto L4b
            java.lang.CharSequence r5 = r8.a
            char r5 = r5.charAt(r1)
            r6 = 13
            r7 = 10
            if (r5 == r7) goto L33
            if (r5 == r6) goto L33
            int r1 = r1 + 1
            goto L20
        L33:
            if (r5 != r6) goto L48
            int r0 = r1 + 1
            java.lang.CharSequence r4 = r8.a
            int r4 = r4.length()
            if (r0 >= r4) goto L48
            java.lang.CharSequence r4 = r8.a
            char r0 = r4.charAt(r0)
            if (r0 != r7) goto L48
            goto L49
        L48:
            r3 = 1
        L49:
            r0 = r1
            goto L4c
        L4b:
            r3 = -1
        L4c:
            r8.b = r2
            r8.e = r3
            r8.d = r0
            return r2
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
