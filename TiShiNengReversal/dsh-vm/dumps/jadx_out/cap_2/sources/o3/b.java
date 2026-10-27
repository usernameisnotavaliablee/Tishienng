package o3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> a(@org.jetbrains.annotations.NotNull java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L14
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            kotlin.sequences.m r1 = kotlin.sequences.p.B(r1)
            return r1
        L14:
            kotlin.sequences.m r1 = kotlin.sequences.p.l()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final <T> T b(@org.jetbrains.annotations.NotNull java.util.Optional<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L10
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            return r1
        L10:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final <T> T c(@org.jetbrains.annotations.NotNull java.util.Optional<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L15
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            return r1
        L15:
            java.lang.Object r1 = r2.invoke()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.Nullable
    public static final <T> T d(@org.jetbrains.annotations.NotNull java.util.Optional<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            java.lang.Object r1 = o3.a.a(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C e(@org.jetbrains.annotations.NotNull java.util.Optional<T> r1, @org.jetbrains.annotations.NotNull C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L1c
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            r2.add(r1)
        L1c:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> f(@org.jetbrains.annotations.NotNull java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L14
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            java.util.List r1 = kotlin.collections.f0.l(r1)
            return r1
        L14:
            java.util.List r1 = kotlin.collections.f0.J()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> g(@org.jetbrains.annotations.NotNull java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = com.alibaba.fastjson.parser.deserializer.z0.a(r1)
            if (r0 == 0) goto L14
            java.lang.Object r1 = com.alibaba.fastjson.parser.deserializer.b1.a(r1)
            java.util.Set r1 = kotlin.collections.u1.f(r1)
            return r1
        L14:
            java.util.Set r1 = kotlin.collections.u1.k()
            return r1
    }
}
