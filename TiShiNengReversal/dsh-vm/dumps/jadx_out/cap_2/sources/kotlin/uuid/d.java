package kotlin.uuid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,648:1\n1#2:649\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d extends kotlin.uuid.c {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.String o(java.lang.String r0, int r1) {
            java.lang.String r0 = u(r0, r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String p(byte[] r0, int r1) {
            java.lang.String r0 = v(r0, r1)
            return r0
    }

    public static final void q(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            char r0 = r2.charAt(r3)
            r1 = 45
            if (r0 != r1) goto Le
            return
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected '-' (hyphen) at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", but was '"
            r0.append(r1)
            char r2 = r2.charAt(r3)
            r0.append(r2)
            r2 = 39
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @kotlin.uuid.ExperimentalUuidApi
    public static final void r(long r4, @org.jetbrains.annotations.NotNull byte[] r6, int r7, int r8, int r9) {
            java.lang.String r0 = "dst"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r8 = 7 - r8
            int r9 = 8 - r9
            if (r9 > r8) goto L2a
        Lb:
            int r0 = r8 << 3
            long r0 = r4 >> r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r1 = (int) r0
            int[] r0 = kotlin.text.i.m()
            r0 = r0[r1]
            int r1 = r7 + 1
            int r2 = r0 >> 8
            byte r2 = (byte) r2
            r6[r7] = r2
            int r7 = r7 + 2
            byte r0 = (byte) r0
            r6[r1] = r0
            if (r8 == r9) goto L2a
            int r8 = r8 + (-1)
            goto Lb
        L2a:
            return
    }

    public static final long s(@org.jetbrains.annotations.NotNull byte[] r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 56
            long r0 = r0 << r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
    }

    public static final void t(@org.jetbrains.annotations.NotNull byte[] r5, int r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 7
        L6:
            r1 = -1
            if (r1 >= r0) goto L17
            int r1 = r0 << 3
            int r2 = r6 + 1
            long r3 = r7 >> r1
            int r1 = (int) r3
            byte r1 = (byte) r1
            r5[r6] = r1
            int r0 = r0 + (-1)
            r6 = r2
            goto L6
        L17:
            return
    }

    private static final java.lang.String u(java.lang.String r2, int r3) {
            int r0 = r2.length()
            if (r0 > r3) goto L7
            return r2
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r2, r1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r3)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r0.append(r2)
            java.lang.String r2 = "..."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final java.lang.String v(byte[] r9, int r10) {
            r7 = 49
            r8 = 0
            r1 = 0
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r5 = 0
            r6 = 0
            r0 = r9
            r4 = r10
            java.lang.String r9 = kotlin.collections.n.yh(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid w(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "randomBytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 6
            r1 = r2[r0]
            r1 = r1 & 15
            byte r1 = (byte) r1
            r2[r0] = r1
            r1 = r1 | 64
            byte r1 = (byte) r1
            r2[r0] = r1
            r0 = 8
            r1 = r2[r0]
            r1 = r1 & 63
            byte r1 = (byte) r1
            r2[r0] = r1
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            kotlin.uuid.Uuid$a r0 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r2 = r0.a(r2)
            return r2
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid x(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "hexString"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 4
            r6 = 0
            r2 = 0
            r3 = 16
            r4 = 0
            r1 = r10
            long r2 = kotlin.text.i.G(r1, r2, r3, r4, r5, r6)
            r8 = 4
            r9 = 0
            r5 = 16
            r6 = 32
            r7 = 0
            r4 = r1
            long r0 = kotlin.text.i.G(r4, r5, r6, r7, r8, r9)
            kotlin.uuid.Uuid$a r10 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r10 = r10.b(r2, r0)
            return r10
    }

    @kotlin.uuid.ExperimentalUuidApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.uuid.Uuid y(@org.jetbrains.annotations.NotNull java.lang.String r14) {
            java.lang.String r0 = "hexDashString"
            kotlin.jvm.internal.g0.p(r14, r0)
            r5 = 4
            r6 = 0
            r2 = 0
            r3 = 8
            r4 = 0
            r1 = r14
            long r2 = kotlin.text.i.G(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r14 = 8
            q(r4, r14)
            r8 = 4
            r9 = 0
            r5 = 9
            r6 = 13
            r7 = 0
            long r0 = kotlin.text.i.G(r4, r5, r6, r7, r8, r9)
            r14 = 13
            q(r4, r14)
            r5 = 14
            r6 = 18
            long r10 = kotlin.text.i.G(r4, r5, r6, r7, r8, r9)
            r14 = 18
            q(r4, r14)
            r5 = 19
            r6 = 23
            long r12 = kotlin.text.i.G(r4, r5, r6, r7, r8, r9)
            r14 = 23
            q(r4, r14)
            r5 = 24
            r6 = 36
            long r4 = kotlin.text.i.G(r4, r5, r6, r7, r8, r9)
            r14 = 32
            long r2 = r2 << r14
            r14 = 16
            long r0 = r0 << r14
            long r0 = r0 | r2
            long r0 = r0 | r10
            r14 = 48
            long r2 = r12 << r14
            long r2 = r2 | r4
            kotlin.uuid.Uuid$a r14 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r14 = r14.b(r0, r2)
            return r14
    }
}
