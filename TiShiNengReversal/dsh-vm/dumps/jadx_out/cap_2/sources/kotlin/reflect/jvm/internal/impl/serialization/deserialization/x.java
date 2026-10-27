package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x<T> {
    private final T a;
    private final T b;
    private final T c;
    private final T d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String e;

    public x(T r2, T r3, T r4, T r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.x
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.x r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.x) r5
            T r1 = r4.a
            T r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            T r1 = r4.b
            T r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            T r1 = r4.c
            T r3 = r5.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            T r1 = r4.d
            T r3 = r5.d
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.e
            java.lang.String r5 = r5.e
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            T r2 = r3.b
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            T r2 = r3.c
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            T r2 = r3.d
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r2.hashCode()
        L30:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.e
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IncompatibleVersionErrorData(actualVersion="
            r0.append(r1)
            T r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", compilerVersion="
            r0.append(r1)
            T r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", languageVersion="
            r0.append(r1)
            T r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", expectedVersion="
            r0.append(r1)
            T r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", filePath="
            r0.append(r1)
            java.lang.String r1 = r2.e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
