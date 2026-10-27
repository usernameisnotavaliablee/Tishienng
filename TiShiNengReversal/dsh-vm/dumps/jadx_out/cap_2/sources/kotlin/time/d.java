package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d implements kotlin.time.d0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.time.d0 a;
    private final long b;

    private d(kotlin.time.d0 r2, long r3) {
            r1 = this;
            java.lang.String r0 = "mark"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public /* synthetic */ d(kotlin.time.d0 r1, long r2, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.time.d0
    public long a() {
            r4 = this;
            kotlin.time.d0 r0 = r4.a
            long r0 = r0.a()
            long r2 = r4.b
            long r0 = kotlin.time.h.X(r0, r2)
            return r0
    }

    @Override // kotlin.time.d0
    public /* bridge */ boolean b() {
            r1 = this;
            boolean r0 = kotlin.time.d0.a.a(r1)
            return r0
    }

    @Override // kotlin.time.d0
    public /* bridge */ boolean c() {
            r1 = this;
            boolean r0 = kotlin.time.d0.a.b(r1)
            return r0
    }

    public final long d() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    @Override // kotlin.time.d0
    @org.jetbrains.annotations.NotNull
    public kotlin.time.d0 e(long r5) {
            r4 = this;
            kotlin.time.d r0 = new kotlin.time.d
            kotlin.time.d0 r1 = r4.a
            long r2 = r4.b
            long r5 = kotlin.time.h.Y(r2, r5)
            r2 = 0
            r0.<init>(r1, r5, r2)
            return r0
    }

    @Override // kotlin.time.d0
    @org.jetbrains.annotations.NotNull
    public /* bridge */ kotlin.time.d0 f(long r1) {
            r0 = this;
            kotlin.time.d0 r1 = kotlin.time.d0.a.c(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.time.d0 h() {
            r1 = this;
            kotlin.time.d0 r0 = r1.a
            return r0
    }
}
