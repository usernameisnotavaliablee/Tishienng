package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p0 extends kotlin.coroutines.a implements kotlinx.coroutines.e3<java.lang.String> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.p0.a b = null;
    private final long a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.coroutines.i.c<kotlinx.coroutines.p0> {
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
            kotlinx.coroutines.p0$a r0 = new kotlinx.coroutines.p0$a
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.p0.b = r0
            return
    }

    public p0(long r2) {
            r1 = this;
            kotlinx.coroutines.p0$a r0 = kotlinx.coroutines.p0.b
            r1.<init>(r0)
            r1.a = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.p0 v(kotlinx.coroutines.p0 r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.a
        L6:
            kotlinx.coroutines.p0 r0 = r0.u(r1)
            return r0
    }

    @Override // kotlinx.coroutines.e3
    public /* bridge */ /* synthetic */ java.lang.String U(kotlin.coroutines.i r1) {
            r0 = this;
            java.lang.String r1 = r0.z(r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlinx.coroutines.p0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.p0 r8 = (kotlinx.coroutines.p0) r8
            long r3 = r7.a
            long r5 = r8.a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            return r0
    }

    @Override // kotlinx.coroutines.e3
    public /* bridge */ /* synthetic */ void n(kotlin.coroutines.i r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.x(r1, r2)
            return
    }

    public final long t() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineId("
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.p0 u(long r2) {
            r1 = this;
            kotlinx.coroutines.p0 r0 = new kotlinx.coroutines.p0
            r0.<init>(r2)
            return r0
    }

    public final long w() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public void x(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String z(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r8) {
            r7 = this;
            kotlinx.coroutines.q0$a r0 = kotlinx.coroutines.q0.b
            kotlin.coroutines.i$b r8 = r8.get(r0)
            kotlinx.coroutines.q0 r8 = (kotlinx.coroutines.q0) r8
            if (r8 == 0) goto L10
            java.lang.String r8 = r8.w()
            if (r8 != 0) goto L12
        L10:
            java.lang.String r8 = "coroutine"
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            r5 = 6
            r6 = 0
            java.lang.String r2 = " @"
            r3 = 0
            r4 = 0
            int r2 = kotlin.text.u.W3(r1, r2, r3, r4, r5, r6)
            if (r2 >= 0) goto L2a
            int r2 = r1.length()
        L2a:
            int r3 = r8.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r8)
            r8 = 35
            r4.append(r8)
            long r2 = r7.a
            r4.append(r2)
            java.lang.String r8 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r8, r2)
            r0.setName(r8)
            return r1
    }
}
