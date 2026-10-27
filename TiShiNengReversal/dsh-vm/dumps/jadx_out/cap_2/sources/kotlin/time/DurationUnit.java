package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.6")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum DurationUnit extends java.lang.Enum<kotlin.time.DurationUnit> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.time.DurationUnit[] $VALUES = null;
    public static final kotlin.time.DurationUnit DAYS = null;
    public static final kotlin.time.DurationUnit HOURS = null;
    public static final kotlin.time.DurationUnit MICROSECONDS = null;
    public static final kotlin.time.DurationUnit MILLISECONDS = null;
    public static final kotlin.time.DurationUnit MINUTES = null;
    public static final kotlin.time.DurationUnit NANOSECONDS = null;
    public static final kotlin.time.DurationUnit SECONDS = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.TimeUnit timeUnit;

    private static final /* synthetic */ kotlin.time.DurationUnit[] $values() {
            r0 = 7
            kotlin.time.DurationUnit[] r0 = new kotlin.time.DurationUnit[r0]
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            r2 = 0
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
            r2 = 1
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            r2 = 2
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            r2 = 3
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            r2 = 4
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
            r2 = 5
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r3 = "NANOSECONDS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.NANOSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r3 = "MICROSECONDS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.MICROSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r3 = "MILLISECONDS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.MILLISECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r3 = "SECONDS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.SECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r3 = "MINUTES"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.MINUTES = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r3 = "HOURS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.HOURS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            r1 = 6
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r3 = "DAYS"
            r0.<init>(r3, r1, r2)
            kotlin.time.DurationUnit.DAYS = r0
            kotlin.time.DurationUnit[] r0 = $values()
            kotlin.time.DurationUnit.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.time.DurationUnit.$ENTRIES = r0
            return
    }

    DurationUnit(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.timeUnit = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.time.DurationUnit> getEntries() {
            kotlin.enums.a r0 = kotlin.time.DurationUnit.$ENTRIES
            return r0
    }

    public static kotlin.time.DurationUnit valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.time.DurationUnit> r0 = kotlin.time.DurationUnit.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.time.DurationUnit r1 = (kotlin.time.DurationUnit) r1
            return r1
    }

    public static kotlin.time.DurationUnit[] values() {
            kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.time.DurationUnit[] r0 = (kotlin.time.DurationUnit[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.TimeUnit getTimeUnit$kotlin_stdlib() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.timeUnit
            return r0
    }
}
