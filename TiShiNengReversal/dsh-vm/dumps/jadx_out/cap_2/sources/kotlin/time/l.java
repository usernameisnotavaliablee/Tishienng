package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                kotlin.time.l.a.a = r0
                return
        }
    }

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final double a(double r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r10) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.concurrent.TimeUnit r0 = r10.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r1 = r9.getTimeUnit$kotlin_stdlib()
            r2 = 1
            long r0 = r0.convert(r2, r1)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L22
            double r9 = (double) r0
            double r7 = r7 * r9
            return r7
        L22:
            java.util.concurrent.TimeUnit r9 = r9.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r10 = r10.getTimeUnit$kotlin_stdlib()
            long r9 = r9.convert(r2, r10)
            double r9 = (double) r9
            double r7 = r7 / r9
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long b(long r1, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long c(long r1, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit d(@org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r0 = kotlin.time.l.a.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                default: goto L10;
            }
        L10:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L16:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
            return r1
        L19:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
            return r1
        L1c:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            return r1
        L1f:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            return r1
        L22:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            return r1
        L25:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
            return r1
        L28:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @org.jetbrains.annotations.NotNull
    public static java.util.concurrent.TimeUnit e(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.concurrent.TimeUnit r1 = r1.getTimeUnit$kotlin_stdlib()
            return r1
    }
}
