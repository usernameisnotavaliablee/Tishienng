package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    private final java.io.File a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.io.File> b;

    public g(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.io.File> r3) {
            r1 = this;
            java.lang.String r0 = "root"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public static /* synthetic */ kotlin.io.g d(kotlin.io.g r0, java.io.File r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.io.File r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.io.File> r2 = r0.b
        Lc:
            kotlin.io.g r0 = r0.c(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File a() {
            r1 = this;
            java.io.File r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.io.File> b() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.g c(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.io.File> r3) {
            r1 = this;
            java.lang.String r0 = "root"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.io.g r0 = new kotlin.io.g
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File e() {
            r1 = this;
            java.io.File r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.io.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.io.g r5 = (kotlin.io.g) r5
            java.io.File r1 = r4.a
            java.io.File r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.io.File> r1 = r4.b
            java.util.List<java.io.File> r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r2 = this;
            java.io.File r0 = r2.a
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.io.File> g() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.b
            return r0
    }

    public final int h() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.b
            int r0 = r0.size()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.io.File r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.io.File> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final boolean i() {
            r2 = this;
            java.io.File r0 = r2.a
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File j(int r11, int r12) {
            r10 = this;
            if (r11 < 0) goto L2c
            if (r11 > r12) goto L2c
            int r0 = r10.h()
            if (r12 > r0) goto L2c
            java.io.File r0 = new java.io.File
            java.util.List<java.io.File> r1 = r10.b
            java.util.List r11 = r1.subList(r11, r12)
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = java.io.File.separator
            java.lang.String r11 = "separator"
            kotlin.jvm.internal.g0.o(r2, r11)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11)
            return r0
        L2c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FilePathComponents(root="
            r0.append(r1)
            java.io.File r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", segments="
            r0.append(r1)
            java.util.List<java.io.File> r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
