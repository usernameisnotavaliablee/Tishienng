package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "2.1")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,864:1\n1#2:865\n803#3,14:866\n786#3,6:880\n803#3,14:886\n786#3,6:900\n786#3,6:907\n548#4:906\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n150#1:866,14\n153#1:880,6\n161#1:886,14\n164#1:900,6\n188#1:907,6\n184#1:906\n*E\n"})
@kotlin.time.ExperimentalTime
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Instant implements java.lang.Comparable<kotlin.time.Instant>, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.Instant.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.time.Instant MAX = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.time.Instant MIN = null;
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,864:1\n786#2,6:865\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n312#1:865,6\n*E\n"})
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.time.Instant d(kotlin.time.Instant.a r0, long r1, long r3, int r5, java.lang.Object r6) {
                r5 = r5 & 2
                if (r5 == 0) goto L6
                r3 = 0
            L6:
                kotlin.time.Instant r0 = r0.c(r1, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant a(long r10) {
                r9 = this;
                r0 = 1000(0x3e8, double:4.94E-321)
                long r2 = r10 / r0
                long r4 = r10 ^ r0
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L15
                long r4 = r2 * r0
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L15
                r4 = -1
                long r2 = r2 + r4
            L15:
                long r10 = r10 % r0
                long r4 = r10 ^ r0
                long r6 = -r10
                long r6 = r6 | r10
                long r4 = r4 & r6
                r6 = 63
                long r4 = r4 >> r6
                long r0 = r0 & r4
                long r10 = r10 + r0
                r0 = 1000000(0xf4240, float:1.401298E-39)
                long r0 = (long) r0
                long r10 = r10 * r0
                int r11 = (int) r10
                r0 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 >= 0) goto L35
                kotlin.time.Instant r10 = r9.h()
                return r10
            L35:
                r0 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 <= 0) goto L43
                kotlin.time.Instant r10 = r9.g()
                return r10
            L43:
                kotlin.time.Instant r10 = r9.b(r2, r11)
                return r10
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant b(long r3, int r5) {
                r2 = this;
                long r0 = (long) r5
                kotlin.time.Instant r3 = r2.c(r3, r0)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant c(long r12, long r14) {
                r11 = this;
                r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r2 = r14 / r0
                long r4 = r14 ^ r0
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L16
                long r4 = r2 * r0
                int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r8 == 0) goto L16
                r4 = -1
                long r2 = r2 + r4
            L16:
                long r4 = r12 + r2
                long r8 = r12 ^ r4
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 >= 0) goto L33
                long r2 = r2 ^ r12
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 < 0) goto L33
                int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                kotlin.time.Instant$a r12 = kotlin.time.Instant.Companion
                if (r14 <= 0) goto L2e
                kotlin.time.Instant r12 = r12.g()
                return r12
            L2e:
                kotlin.time.Instant r12 = r12.h()
                return r12
            L33:
                r12 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
                int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r2 >= 0) goto L41
                kotlin.time.Instant r12 = r11.h()
                return r12
            L41:
                r12 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
                int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r2 <= 0) goto L4f
                kotlin.time.Instant r12 = r11.g()
                return r12
            L4f:
                long r14 = r14 % r0
                long r12 = r14 ^ r0
                long r2 = -r14
                long r2 = r2 | r14
                long r12 = r12 & r2
                r2 = 63
                long r12 = r12 >> r2
                long r12 = r12 & r0
                long r14 = r14 + r12
                int r12 = (int) r14
                kotlin.time.Instant r13 = new kotlin.time.Instant
                r13.<init>(r4, r12)
                return r13
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant e() {
                r3 = this;
                r0 = 3093527980800(0x2d044a2eb00, double:1.528405899762E-311)
                r2 = 0
                kotlin.time.Instant r0 = r3.b(r0, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant f() {
                r3 = this;
                r0 = -3217862419201(0xfffffd12c8741cff, double:NaN)
                r2 = 999999999(0x3b9ac9ff, float:0.004723787)
                kotlin.time.Instant r0 = r3.b(r0, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant g() {
                r1 = this;
                kotlin.time.Instant r0 = kotlin.time.Instant.access$getMAX$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant h() {
                r1 = this;
                kotlin.time.Instant r0 = kotlin.time.Instant.access$getMIN$cp()
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @kotlin.ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant i() {
                r3 = this;
                kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
                r1 = 0
                r2 = 1
                r0.<init>(r1, r2, r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.Instant j(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.time.w r2 = kotlin.time.v.h(r2)
                kotlin.time.Instant r2 = r2.toInstant()
                return r2
        }

        @kotlin.SinceKotlin(version = "2.2")
        @org.jetbrains.annotations.Nullable
        public final kotlin.time.Instant k(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.time.w r2 = kotlin.time.v.h(r2)
                kotlin.time.Instant r2 = r2.a()
                return r2
        }
    }

    static {
            kotlin.time.Instant$a r0 = new kotlin.time.Instant$a
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Instant.Companion = r0
            kotlin.time.Instant r0 = new kotlin.time.Instant
            r1 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            r3 = 0
            r0.<init>(r1, r3)
            kotlin.time.Instant.MIN = r0
            kotlin.time.Instant r0 = new kotlin.time.Instant
            r1 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            r3 = 999999999(0x3b9ac9ff, float:0.004723787)
            r0.<init>(r1, r3)
            kotlin.time.Instant.MAX = r0
            return
    }

    public Instant(long r3, int r5) {
            r2 = this;
            r2.<init>()
            r2.epochSeconds = r3
            r2.nanosecondsOfSecond = r5
            r0 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L1a
            r0 = 31556889864403200(0x701cd2fa957900, double:1.4340684931547173E-306)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Instant exceeds minimum or maximum instant"
            r3.<init>(r4)
            throw r3
    }

    public static final /* synthetic */ kotlin.time.Instant access$getMAX$cp() {
            kotlin.time.Instant r0 = kotlin.time.Instant.MAX
            return r0
    }

    public static final /* synthetic */ kotlin.time.Instant access$getMIN$cp() {
            kotlin.time.Instant r0 = kotlin.time.Instant.MIN
            return r0
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    private final java.lang.Object writeReplace() {
            r1 = this;
            java.lang.Object r0 = kotlin.time.o.b(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Instant r1) {
            r0 = this;
            kotlin.time.Instant r1 = (kotlin.time.Instant) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull kotlin.time.Instant r5) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            long r0 = r4.epochSeconds
            long r2 = r5.epochSeconds
            int r0 = kotlin.jvm.internal.g0.u(r0, r2)
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r4.nanosecondsOfSecond
            int r5 = r5.nanosecondsOfSecond
            int r5 = kotlin.jvm.internal.g0.t(r0, r5)
            return r5
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            if (r5 == r6) goto L19
            boolean r0 = r6 instanceof kotlin.time.Instant
            if (r0 == 0) goto L17
            long r0 = r5.epochSeconds
            kotlin.time.Instant r6 = (kotlin.time.Instant) r6
            long r2 = r6.epochSeconds
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            int r0 = r5.nanosecondsOfSecond
            int r6 = r6.nanosecondsOfSecond
            if (r0 != r6) goto L17
            goto L19
        L17:
            r6 = 0
            return r6
        L19:
            r6 = 1
            return r6
    }

    public final long getEpochSeconds() {
            r2 = this;
            long r0 = r2.epochSeconds
            return r0
    }

    public final int getNanosecondsOfSecond() {
            r1 = this;
            int r0 = r1.nanosecondsOfSecond
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.epochSeconds
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            int r1 = r2.nanosecondsOfSecond
            int r1 = r1 * 51
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public final kotlin.time.Instant m35minusLRDsOJo(long r1) {
            r0 = this;
            long r1 = kotlin.time.h.n0(r1)
            kotlin.time.Instant r1 = r0.m37plusLRDsOJo(r1)
            return r1
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m36minusUwyO8pc(@org.jetbrains.annotations.NotNull kotlin.time.Instant r5) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.time.h$a r0 = kotlin.time.h.b
            long r0 = r4.epochSeconds
            long r2 = r5.epochSeconds
            long r0 = r0 - r2
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.j.x(r0, r2)
            int r2 = r4.nanosecondsOfSecond
            int r5 = r5.nanosecondsOfSecond
            int r2 = r2 - r5
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.j.w(r2, r5)
            long r0 = kotlin.time.h.Y(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final kotlin.time.Instant m37plusLRDsOJo(long r13) {
            r12 = this;
            long r0 = kotlin.time.h.C(r13)
            int r2 = kotlin.time.h.I(r13)
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            if (r2 != 0) goto L11
            return r12
        L11:
            long r5 = r12.epochSeconds
            long r7 = r5 + r0
            long r9 = r5 ^ r7
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L2c
            long r0 = r0 ^ r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L2c
            boolean r13 = kotlin.time.h.W(r13)
            if (r13 == 0) goto L29
            kotlin.time.Instant r13 = kotlin.time.Instant.MAX
            return r13
        L29:
            kotlin.time.Instant r13 = kotlin.time.Instant.MIN
            return r13
        L2c:
            int r13 = r12.nanosecondsOfSecond
            int r13 = r13 + r2
            kotlin.time.Instant$a r14 = kotlin.time.Instant.Companion
            kotlin.time.Instant r13 = r14.b(r7, r13)
            return r13
    }

    public final long toEpochMilliseconds() {
            r13 = this;
            long r0 = r13.epochSeconds
            r2 = 1000000(0xf4240, float:1.401298E-39)
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L3c
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 != 0) goto L19
            goto L29
        L19:
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L28
            long r5 = r0 * r3
            long r3 = r5 / r3
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 != 0) goto L27
            r3 = r5
            goto L29
        L27:
            return r9
        L28:
            r3 = r7
        L29:
            int r0 = r13.nanosecondsOfSecond
            int r0 = r0 / r2
            long r0 = (long) r0
            long r5 = r3 + r0
            long r11 = r3 ^ r5
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L3b
            long r0 = r0 ^ r3
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L3b
            return r9
        L3b:
            return r5
        L3c:
            long r0 = r0 + r5
            r9 = -9223372036854775808
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 != 0) goto L44
            goto L54
        L44:
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L53
            long r5 = r0 * r3
            long r3 = r5 / r3
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 != 0) goto L52
            r3 = r5
            goto L54
        L52:
            return r9
        L53:
            r3 = r7
        L54:
            int r0 = r13.nanosecondsOfSecond
            int r0 = r0 / r2
            int r0 = r0 + (-1000)
            long r0 = (long) r0
            long r5 = r3 + r0
            long r11 = r3 ^ r5
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L68
            long r0 = r0 ^ r3
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L68
            return r9
        L68:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = kotlin.time.v.g(r1)
            return r0
    }
}
