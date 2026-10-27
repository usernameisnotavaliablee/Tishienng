package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.ranges.a implements kotlin.ranges.h<java.lang.Character>, kotlin.ranges.s<java.lang.Character> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.c.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.c f = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
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

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.c a() {
                r1 = this;
                kotlin.ranges.c r0 = kotlin.ranges.c.m()
                return r0
        }
    }

    static {
            kotlin.ranges.c$a r0 = new kotlin.ranges.c$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.c.e = r0
            kotlin.ranges.c r0 = new kotlin.ranges.c
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.ranges.c.f = r0
            return
    }

    public c(char r2, char r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public static final /* synthetic */ kotlin.ranges.c m() {
            kotlin.ranges.c r0 = kotlin.ranges.c.f
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static /* synthetic */ void p() {
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            boolean r1 = r0.n(r1)
            return r1
    }

    @Override // kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Character d() {
            r1 = this;
            java.lang.Character r0 = r1.o()
            return r0
    }

    @Override // kotlin.ranges.a
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.c
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.c r0 = (kotlin.ranges.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            char r0 = r2.e()
            kotlin.ranges.c r3 = (kotlin.ranges.c) r3
            char r1 = r3.e()
            if (r0 != r1) goto L2b
            char r0 = r2.f()
            char r3 = r3.f()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }

    @Override // kotlin.ranges.h
    public /* bridge */ /* synthetic */ java.lang.Character getEndInclusive() {
            r1 = this;
            java.lang.Character r0 = r1.q()
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Character r0 = r1.r()
            return r0
    }

    @Override // kotlin.ranges.a
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            char r0 = r2.e()
            int r0 = r0 * 31
            char r1 = r2.f()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.ranges.a, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r2 = this;
            char r0 = r2.e()
            char r1 = r2.f()
            int r0 = kotlin.jvm.internal.g0.t(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean n(char r2) {
            r1 = this;
            char r0 = r1.e()
            int r0 = kotlin.jvm.internal.g0.t(r0, r2)
            if (r0 > 0) goto L16
            char r0 = r1.f()
            int r2 = kotlin.jvm.internal.g0.t(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Character o() {
            r2 = this;
            char r0 = r2.f()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L15
            char r0 = r2.f()
            int r0 = r0 + 1
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Character q() {
            r1 = this;
            char r0 = r1.f()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Character r() {
            r1 = this;
            char r0 = r1.e()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.a
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            char r1 = r2.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
