package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class n0<T> {
    private final int a;
    private int b;

    @org.jetbrains.annotations.NotNull
    private final T[] c;

    public n0(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.c = r1
            return
    }

    private static /* synthetic */ void d() {
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull T r4) {
            r3 = this;
            java.lang.String r0 = "spreadArgument"
            kotlin.jvm.internal.g0.p(r4, r0)
            T[] r0 = r3.c
            int r1 = r3.b
            int r2 = r1 + 1
            r3.b = r2
            r0[r1] = r4
            return
    }

    protected final int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    protected abstract int c(@org.jetbrains.annotations.NotNull T r1);

    protected final void e(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    protected final int f() {
            r5 = this;
            int r0 = r5.a
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r0 < 0) goto L1a
            r3 = 0
        L8:
            T[] r4 = r5.c
            r4 = r4[r3]
            if (r4 == 0) goto L13
            int r4 = r5.c(r4)
            goto L14
        L13:
            r4 = 1
        L14:
            int r2 = r2 + r4
            if (r3 == r0) goto L1a
            int r3 = r3 + 1
            goto L8
        L1a:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected final T g(@org.jetbrains.annotations.NotNull T r8, @org.jetbrains.annotations.NotNull T r9) {
            r7 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r7.a
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L33
            r2 = 0
            r3 = 0
            r4 = 0
        L14:
            T[] r5 = r7.c
            r5 = r5[r2]
            if (r5 == 0) goto L2c
            if (r3 >= r2) goto L22
            int r6 = r2 - r3
            java.lang.System.arraycopy(r8, r3, r9, r4, r6)
            int r4 = r4 + r6
        L22:
            int r3 = r7.c(r5)
            java.lang.System.arraycopy(r5, r1, r9, r4, r3)
            int r4 = r4 + r3
            int r3 = r2 + 1
        L2c:
            if (r2 == r0) goto L31
            int r2 = r2 + 1
            goto L14
        L31:
            r1 = r3
            goto L34
        L33:
            r4 = 0
        L34:
            int r0 = r7.a
            if (r1 >= r0) goto L3c
            int r0 = r0 - r1
            java.lang.System.arraycopy(r8, r1, r9, r4, r0)
        L3c:
            return r9
    }
}
