package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private static final int e = 10;
    private static final float f = 0.2f;
    private static final long g = 100;
    private final int a;
    private final float b;
    private final java.util.Deque<j0.b> c;
    private long d;

    public c() {
            r2 = this;
            r0 = 10
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2.<init>(r0, r1)
            return
    }

    public c(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.LinkedBlockingDeque r2 = new java.util.concurrent.LinkedBlockingDeque
            r2.<init>(r1)
            r0.c = r2
            return
    }

    public j0.b a(j0.b r12) {
            r11 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.d
            long r2 = r0 - r2
            r4 = 100
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L13
            java.util.Deque<j0.b> r2 = r11.c
            r2.clear()
        L13:
            r11.d = r0
            java.util.Deque<j0.b> r0 = r11.c
            int r0 = r0.size()
            int r1 = r11.a
            if (r0 != r1) goto L24
            java.util.Deque<j0.b> r0 = r11.c
            r0.pollLast()
        L24:
            java.util.Deque<j0.b> r0 = r11.c
            r0.addFirst(r12)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.Deque<j0.b> r0 = r11.c
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            j0.b r1 = (j0.b) r1
            java.util.Set r1 = r1.b()
            r12.addAll(r1)
            goto L34
        L48:
            j0.b r0 = new j0.b
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L51:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Deque<j0.b> r2 = r11.c
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
        L69:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r2.next()
            j0.b r6 = (j0.b) r6
            float r6 = r6.c(r1)
            float r6 = r6 * r5
            float r3 = r3 + r6
            float r4 = r4 + r5
            double r5 = (double) r5
            float r7 = r11.b
            double r7 = (double) r7
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 - r7
            double r5 = r5 * r9
            float r5 = (float) r5
            goto L69
        L88:
            float r3 = r3 / r4
            r0.f(r1, r3)
            goto L51
        L8d:
            return r0
    }
}
