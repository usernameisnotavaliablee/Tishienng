package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f0<T> {
    private final T a;
    private final long b;

    private f0(T r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* synthetic */ f0(java.lang.Object r1, long r2, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ kotlin.time.f0 d(kotlin.time.f0 r0, java.lang.Object r1, long r2, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            T r1 = r0.a
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            long r2 = r0.b
        Lc:
            kotlin.time.f0 r0 = r0.c(r1, r2)
            return r0
    }

    public final T a() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public final long b() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.time.f0<T> c(T r3, long r4) {
            r2 = this;
            kotlin.time.f0 r0 = new kotlin.time.f0
            r1 = 0
            r0.<init>(r3, r4, r1)
            return r0
    }

    public final long e() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlin.time.f0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.time.f0 r8 = (kotlin.time.f0) r8
            T r1 = r7.a
            T r3 = r8.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r5 = r8.b
            boolean r8 = kotlin.time.h.q(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final T f() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            long r1 = r3.b
            int r1 = kotlin.time.h.Q(r1)
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TimedValue(value="
            r0.append(r1)
            T r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = kotlin.time.h.j0(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
