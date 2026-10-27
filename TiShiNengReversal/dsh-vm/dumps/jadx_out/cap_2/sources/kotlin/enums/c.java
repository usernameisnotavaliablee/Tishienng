package kotlin.enums;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    @kotlin.SinceKotlin(version = "2.0")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final /* synthetic */ <T extends java.lang.Enum<T>> kotlin.enums.a<T> a() {
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Enum<E>> kotlin.enums.a<E> b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<E[]> r1) {
            java.lang.String r0 = "entriesProvider"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.enums.d r0 = new kotlin.enums.d
            java.lang.Object r1 = r1.invoke()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Enum<E>> kotlin.enums.a<E> c(@org.jetbrains.annotations.NotNull E[] r1) {
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.enums.d r0 = new kotlin.enums.d
            r0.<init>(r1)
            return r0
    }
}
