package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.jvm.internal.c b;
    private final long c;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.StackTraceElement> d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String e;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Thread f;

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.jvm.internal.c g;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.StackTraceElement> h;

    public d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.e r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r2 = this;
            r2.<init>()
            r2.a = r4
            kotlinx.coroutines.debug.internal.k r4 = r3.c()
            r2.b = r4
            long r0 = r3.b
            r2.c = r0
            java.util.List r4 = r3.d()
            r2.d = r4
            java.lang.String r4 = r3.f()
            r2.e = r4
            java.lang.Thread r4 = r3.lastObservedThread
            r2.f = r4
            kotlin.coroutines.jvm.internal.c r4 = r3.e()
            r2.g = r4
            java.util.List r3 = r3.g()
            r2.h = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.c a() {
            r1 = this;
            kotlin.coroutines.jvm.internal.c r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> b() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.c c() {
            r1 = this;
            kotlin.coroutines.jvm.internal.c r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Thread d() {
            r1 = this;
            java.lang.Thread r0 = r1.f
            return r0
    }

    public final long e() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @kotlin.jvm.JvmName(name = "lastObservedStackTrace")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> g() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.a
            return r0
    }
}
