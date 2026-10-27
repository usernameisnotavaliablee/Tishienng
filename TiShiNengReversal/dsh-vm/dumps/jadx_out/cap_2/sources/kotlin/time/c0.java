package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n80#2:212\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n184#1:211\n191#1:212\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c0 extends kotlin.time.c {
    private long d;

    public c0() {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1.<init>(r0)
            r1.a()
            return
    }

    private final void i(long r5) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TestTimeSource will overflow if its reading "
            r1.append(r2)
            long r2 = r4.d
            r1.append(r2)
            kotlin.time.DurationUnit r2 = r4.e()
            java.lang.String r2 = kotlin.time.m.h(r2)
            r1.append(r2)
            java.lang.String r2 = " is advanced by "
            r1.append(r2)
            java.lang.String r5 = kotlin.time.h.j0(r5)
            r1.append(r5)
            r5 = 46
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // kotlin.time.c
    protected long g() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public final void j(long r10) {
            r9 = this;
            kotlin.time.DurationUnit r0 = r9.e()
            long r0 = kotlin.time.h.i0(r10, r0)
            r2 = 1
            long r4 = r0 - r2
            long r4 = r4 | r2
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L3e
            r0 = 2
            long r0 = kotlin.time.h.o(r10, r0)
            kotlin.time.DurationUnit r4 = r9.e()
            long r4 = kotlin.time.h.i0(r0, r4)
            long r4 = r4 - r2
            long r2 = r2 | r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L2d
            r9.i(r10)
            return
        L2d:
            long r2 = r9.d
            r9.j(r0)     // Catch: java.lang.IllegalStateException -> L3a
            long r10 = kotlin.time.h.X(r10, r0)     // Catch: java.lang.IllegalStateException -> L3a
            r9.j(r10)     // Catch: java.lang.IllegalStateException -> L3a
            return
        L3a:
            r10 = move-exception
            r9.d = r2
            throw r10
        L3e:
            long r2 = r9.d
            long r4 = r2 + r0
            long r0 = r0 ^ r2
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L52
            long r0 = r2 ^ r4
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r9.i(r10)
        L52:
            r9.d = r4
            return
    }
}
