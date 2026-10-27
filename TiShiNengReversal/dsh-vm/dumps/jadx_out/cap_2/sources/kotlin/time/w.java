package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.time.ExperimentalTime
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
interface w {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.time.w {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.CharSequence b;

        public a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
                r1 = this;
                java.lang.String r0 = "error"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // kotlin.time.w
        @org.jetbrains.annotations.Nullable
        public kotlin.time.Instant a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.CharSequence c() {
                r1 = this;
                java.lang.CharSequence r0 = r1.b
                return r0
        }

        @Override // kotlin.time.w
        @org.jetbrains.annotations.NotNull
        public kotlin.time.Instant toInstant() {
                r4 = this;
                kotlin.time.n r0 = new kotlin.time.n
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r4.a
                r1.append(r2)
                java.lang.String r2 = " when parsing an Instant from \""
                r1.append(r2)
                java.lang.CharSequence r2 = r4.b
                r3 = 64
                java.lang.String r2 = kotlin.time.v.i(r2, r3)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.time.w {
        private final long a;
        private final int b;

        public b(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                return
        }

        @Override // kotlin.time.w
        @org.jetbrains.annotations.Nullable
        public kotlin.time.Instant a() {
                r6 = this;
                long r0 = r6.a
                kotlin.time.Instant$a r2 = kotlin.time.Instant.Companion
                kotlin.time.Instant r3 = r2.h()
                long r3 = r3.getEpochSeconds()
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L28
                long r0 = r6.a
                kotlin.time.Instant r3 = r2.g()
                long r3 = r3.getEpochSeconds()
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 <= 0) goto L1f
                goto L28
            L1f:
                long r0 = r6.a
                int r3 = r6.b
                kotlin.time.Instant r0 = r2.b(r0, r3)
                return r0
            L28:
                r0 = 0
                return r0
        }

        public final long b() {
                r2 = this;
                long r0 = r2.a
                return r0
        }

        public final int c() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @Override // kotlin.time.w
        @org.jetbrains.annotations.NotNull
        public kotlin.time.Instant toInstant() {
                r6 = this;
                long r0 = r6.a
                kotlin.time.Instant$a r2 = kotlin.time.Instant.Companion
                kotlin.time.Instant r3 = r2.h()
                long r3 = r3.getEpochSeconds()
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L27
                long r0 = r6.a
                kotlin.time.Instant r3 = r2.g()
                long r3 = r3.getEpochSeconds()
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 > 0) goto L27
                long r0 = r6.a
                int r3 = r6.b
                kotlin.time.Instant r0 = r2.b(r0, r3)
                return r0
            L27:
                kotlin.time.n r0 = new kotlin.time.n
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "The parsed date is outside the range representable by Instant (Unix epoch second "
                r1.append(r2)
                long r2 = r6.a
                r1.append(r2)
                r2 = 41
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    @org.jetbrains.annotations.Nullable
    kotlin.time.Instant a();

    @org.jetbrains.annotations.NotNull
    kotlin.time.Instant toInstant();
}
