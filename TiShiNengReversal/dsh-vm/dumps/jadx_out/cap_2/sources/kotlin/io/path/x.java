package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x {

    @org.jetbrains.annotations.NotNull
    private final java.nio.file.Path a;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.io.path.x c;

    @org.jetbrains.annotations.Nullable
    private java.util.Iterator<kotlin.io.path.x> d;

    public x(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable kotlin.io.path.x r4) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Iterator<kotlin.io.path.x> a() {
            r1 = this;
            java.util.Iterator<kotlin.io.path.x> r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.io.path.x c() {
            r1 = this;
            kotlin.io.path.x r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.Path d() {
            r1 = this;
            java.nio.file.Path r0 = r1.a
            return r0
    }

    public final void e(@org.jetbrains.annotations.Nullable java.util.Iterator<kotlin.io.path.x> r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
