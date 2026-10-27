package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class w {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.checker.w b;

    public w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.checker.w r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.checker.w a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.w r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            return r0
    }
}
