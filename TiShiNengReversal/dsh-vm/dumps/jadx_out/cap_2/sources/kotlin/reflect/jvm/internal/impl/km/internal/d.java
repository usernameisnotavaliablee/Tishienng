package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    private final int a;
    private final int b;
    private final int c;

    public d(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C0055b r2) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.a
            int r2 = r2.b
            r1.<init>(r0, r2, r3)
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final boolean d(int r3) {
            r2 = this;
            int r0 = r2.a
            int r3 = r3 >>> r0
            int r0 = r2.b
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            r3 = r3 & r0
            int r0 = r2.c
            if (r3 != r0) goto Lf
            return r1
        Lf:
            r3 = 0
            return r3
    }
}
