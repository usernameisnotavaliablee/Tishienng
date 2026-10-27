package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m extends kotlin.time.l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                kotlin.time.m.a.a = r0
                return
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit f(char r2, boolean r3) {
            if (r3 != 0) goto L20
            r3 = 68
            if (r2 != r3) goto L9
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.DAYS
            return r2
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid or unsupported duration ISO non-time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L20:
            r3 = 72
            if (r2 == r3) goto L49
            r3 = 77
            if (r2 == r3) goto L46
            r3 = 83
            if (r2 != r3) goto L2f
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            return r2
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid duration ISO time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L46:
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MINUTES
            return r2
        L49:
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.HOURS
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit g(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "shortName"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.hashCode()
            r1 = 100
            if (r0 == r1) goto L67
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L5c
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L51
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L46
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L3b
            r1 = 3525(0xdc5, float:4.94E-42)
            if (r0 == r1) goto L30
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 != r1) goto L72
            java.lang.String r0 = "us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MICROSECONDS
            return r3
        L30:
            java.lang.String r0 = "ns"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.NANOSECONDS
            return r3
        L3b:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MILLISECONDS
            return r3
        L46:
            java.lang.String r0 = "s"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.SECONDS
            return r3
        L51:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MINUTES
            return r3
        L5c:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.HOURS
            return r3
        L67:
            java.lang.String r0 = "d"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.DAYS
            return r3
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown duration unit short name: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String h(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int[] r0 = kotlin.time.m.a.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L2b;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown unit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            java.lang.String r3 = "d"
            return r3
        L2e:
            java.lang.String r3 = "h"
            return r3
        L31:
            java.lang.String r3 = "m"
            return r3
        L34:
            java.lang.String r3 = "s"
            return r3
        L37:
            java.lang.String r3 = "ms"
            return r3
        L3a:
            java.lang.String r3 = "us"
            return r3
        L3d:
            java.lang.String r3 = "ns"
            return r3
    }
}
