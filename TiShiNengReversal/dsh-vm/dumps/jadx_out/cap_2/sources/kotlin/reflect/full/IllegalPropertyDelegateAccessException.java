package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class IllegalPropertyDelegateAccessException extends java.lang.Exception {
    public IllegalPropertyDelegateAccessException(@org.jetbrains.annotations.NotNull java.lang.IllegalAccessException r2) {
            r1 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible"
            r1.<init>(r0, r2)
            return
    }
}
