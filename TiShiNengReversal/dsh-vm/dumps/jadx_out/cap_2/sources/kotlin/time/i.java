package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {
    private static final boolean a = false;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.ThreadLocal<java.text.DecimalFormat>[] b = null;

    static {
            r0 = 4
            java.lang.ThreadLocal[] r1 = new java.lang.ThreadLocal[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L10:
            kotlin.time.i.b = r1
            return
    }

    private static final java.text.DecimalFormat a(int r2) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0"
            r0.<init>(r1)
            if (r2 <= 0) goto Lc
            r0.setMinimumFractionDigits(r2)
        Lc:
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
            r0.setRoundingMode(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(double r2, int r4) {
            java.lang.ThreadLocal<java.text.DecimalFormat>[] r0 = kotlin.time.i.b
            int r1 = r0.length
            if (r4 >= r1) goto L17
            r0 = r0[r4]
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L14
            java.text.DecimalFormat r1 = a(r4)
            r0.set(r1)
        L14:
            java.text.DecimalFormat r1 = (java.text.DecimalFormat) r1
            goto L1b
        L17:
            java.text.DecimalFormat r1 = a(r4)
        L1b:
            java.lang.String r2 = r1.format(r2)
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    public static final boolean c() {
            boolean r0 = kotlin.time.i.a
            return r0
    }
}
