package i4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "RegexExtensionsJDK8Kt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.text.m a(@org.jetbrains.annotations.NotNull kotlin.text.n r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof kotlin.text.o
            if (r0 == 0) goto L11
            kotlin.text.o r1 = (kotlin.text.o) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L19
            kotlin.text.m r1 = r1.get(r2)
            return r1
        L19:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Retrieving groups by name is not supported on this platform."
            r1.<init>(r2)
            throw r1
    }
}
