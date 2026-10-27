package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.ranges.m b;

    public m(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.ranges.m r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public static /* synthetic */ kotlin.text.m d(kotlin.text.m r0, java.lang.String r1, kotlin.ranges.m r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.ranges.m r2 = r0.b
        Lc:
            kotlin.text.m r0 = r0.c(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.m b() {
            r1 = this;
            kotlin.ranges.m r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.text.m c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.ranges.m r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.m r0 = new kotlin.text.m
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.m e() {
            r1 = this;
            kotlin.ranges.m r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.text.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.text.m r5 = (kotlin.text.m) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.ranges.m r1 = r4.b
            kotlin.ranges.m r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.ranges.m r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MatchGroup(value="
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            kotlin.ranges.m r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
