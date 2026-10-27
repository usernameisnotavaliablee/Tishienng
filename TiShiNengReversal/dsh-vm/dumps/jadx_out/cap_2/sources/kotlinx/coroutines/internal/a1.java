package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a1 implements kotlin.coroutines.i.c<kotlinx.coroutines.internal.z0<?>> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<?> a;

    public a1(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private final java.lang.ThreadLocal<?> a() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.a
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.internal.a1 c(kotlinx.coroutines.internal.a1 r0, java.lang.ThreadLocal r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.ThreadLocal<?> r1 = r0.a
        L6:
            kotlinx.coroutines.internal.a1 r0 = r0.b(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.a1 b(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<?> r2) {
            r1 = this;
            kotlinx.coroutines.internal.a1 r0 = new kotlinx.coroutines.internal.a1
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlinx.coroutines.internal.a1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.internal.a1 r4 = (kotlinx.coroutines.internal.a1) r4
            java.lang.ThreadLocal<?> r1 = r3.a
            java.lang.ThreadLocal<?> r4 = r4.a
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocalKey(threadLocal="
            r0.append(r1)
            java.lang.ThreadLocal<?> r1 = r2.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
