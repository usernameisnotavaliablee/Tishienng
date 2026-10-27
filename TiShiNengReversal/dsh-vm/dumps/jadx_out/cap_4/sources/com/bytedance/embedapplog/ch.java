package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ch {
    private static com.bytedance.embedapplog.ch.j az;

    /* renamed from: m, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f2074m = null;
    private long ae;
    private com.bytedance.embedapplog.kc cw;
    private long g;
    private final com.bytedance.embedapplog.rn j;
    private java.lang.String jy;
    private volatile boolean oq;
    private long qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.embedapplog.kc f2075r;
    private int tl;
    private java.lang.String up;
    private int vl;
    private com.bytedance.embedapplog.ry ws;
    private final com.bytedance.embedapplog.wq xt;

    /* renamed from: com.bytedance.embedapplog.ch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static class j extends com.bytedance.embedapplog.aq {
        private j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ j(com.bytedance.embedapplog.ch.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            com.bytedance.embedapplog.ch.f2074m = r0
            return
    }

    ch(com.bytedance.embedapplog.wq r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.g = r0
            r2.xt = r3
            r2.j = r4
            return
    }

    private synchronized void j(com.bytedance.embedapplog.ya r11, java.util.ArrayList<com.bytedance.embedapplog.ya> r12, boolean r13) {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r11 instanceof com.bytedance.embedapplog.ch.j     // Catch: java.lang.Throwable -> L4f
            r1 = -1
            if (r0 == 0) goto L9
            r3 = r1
            goto Lb
        L9:
            long r3 = r11.xt     // Catch: java.lang.Throwable -> L4f
        Lb:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            r10.up = r0     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicLong r0 = com.bytedance.embedapplog.ch.f2074m     // Catch: java.lang.Throwable -> L4f
            r5 = 1000(0x3e8, double:4.94E-321)
            r0.set(r5)     // Catch: java.lang.Throwable -> L4f
            r10.g = r3     // Catch: java.lang.Throwable -> L4f
            r10.oq = r13     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            r10.qv = r5     // Catch: java.lang.Throwable -> L4f
            r10.ae = r5     // Catch: java.lang.Throwable -> L4f
            boolean r0 = com.bytedance.embedapplog.uc.xt     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            if (r0 == 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "startSession, "
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r10.up     // Catch: java.lang.Throwable -> L4f
            r0.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = ", hadUi:"
            r0.append(r6)     // Catch: java.lang.Throwable -> L4f
            r0.append(r13)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = " data:"
            r0.append(r6)     // Catch: java.lang.Throwable -> L4f
            r0.append(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.uc.j(r0, r5)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r11 = move-exception
            goto L11d
        L52:
            r0 = 0
            r6 = 1
            if (r13 == 0) goto Lb1
            java.util.Calendar r7 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r8.<init>()     // Catch: java.lang.Throwable -> L4f
            int r9 = r7.get(r6)     // Catch: java.lang.Throwable -> L4f
            r8.append(r9)     // Catch: java.lang.Throwable -> L4f
            r9 = 2
            int r9 = r7.get(r9)     // Catch: java.lang.Throwable -> L4f
            r8.append(r9)     // Catch: java.lang.Throwable -> L4f
            r9 = 5
            int r7 = r7.get(r9)     // Catch: java.lang.Throwable -> L4f
            r8.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r10.jy     // Catch: java.lang.Throwable -> L4f
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto L92
            com.bytedance.embedapplog.rn r8 = r10.j     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r8.xt()     // Catch: java.lang.Throwable -> L4f
            r10.jy = r8     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.rn r8 = r10.j     // Catch: java.lang.Throwable -> L4f
            int r8 = r8.cw()     // Catch: java.lang.Throwable -> L4f
            r10.vl = r8     // Catch: java.lang.Throwable -> L4f
        L92:
            java.lang.String r8 = r10.jy     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L9f
            r10.jy = r7     // Catch: java.lang.Throwable -> L4f
            r10.vl = r6     // Catch: java.lang.Throwable -> L4f
            goto La4
        L9f:
            int r8 = r10.vl     // Catch: java.lang.Throwable -> L4f
            int r8 = r8 + r6
            r10.vl = r8     // Catch: java.lang.Throwable -> L4f
        La4:
            com.bytedance.embedapplog.rn r8 = r10.j     // Catch: java.lang.Throwable -> L4f
            int r9 = r10.vl     // Catch: java.lang.Throwable -> L4f
            r8.j(r7, r9)     // Catch: java.lang.Throwable -> L4f
            r10.tl = r0     // Catch: java.lang.Throwable -> L4f
            long r7 = r11.xt     // Catch: java.lang.Throwable -> L4f
            r10.ae = r7     // Catch: java.lang.Throwable -> L4f
        Lb1:
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 == 0) goto L11b
            com.bytedance.embedapplog.ry r11 = new com.bytedance.embedapplog.ry     // Catch: java.lang.Throwable -> L4f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r10.up     // Catch: java.lang.Throwable -> L4f
            r11.f2123r = r0     // Catch: java.lang.Throwable -> L4f
            long r0 = r()     // Catch: java.lang.Throwable -> L4f
            r11.cw = r0     // Catch: java.lang.Throwable -> L4f
            long r0 = r10.g     // Catch: java.lang.Throwable -> L4f
            r11.xt = r0     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r10.oq     // Catch: java.lang.Throwable -> L4f
            r0 = r0 ^ r6
            r11.ws = r0     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.wq r0 = r10.xt     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.cw()     // Catch: java.lang.Throwable -> L4f
            r11.jy = r0     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.wq r0 = r10.xt     // Catch: java.lang.Throwable -> L4f
            int r0 = r0.xt()     // Catch: java.lang.Throwable -> L4f
            r11.vl = r0     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = com.bytedance.embedapplog.j.oq()     // Catch: java.lang.Throwable -> L4f
            r11.f2122m = r0     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = com.bytedance.embedapplog.j.g()     // Catch: java.lang.Throwable -> L4f
            r11.ae = r0     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.rn r0 = r10.j     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.tj()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto Lf7
            java.lang.String r0 = com.bytedance.embedapplog.j.up()     // Catch: java.lang.Throwable -> L4f
            r11.tl = r0     // Catch: java.lang.Throwable -> L4f
        Lf7:
            r12.add(r11)     // Catch: java.lang.Throwable -> L4f
            r10.ws = r11     // Catch: java.lang.Throwable -> L4f
            boolean r12 = com.bytedance.embedapplog.uc.xt     // Catch: java.lang.Throwable -> L4f
            if (r12 == 0) goto L11b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "gen launch, "
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r11.f2123r     // Catch: java.lang.Throwable -> L4f
            r12.append(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = ", hadUi:"
            r12.append(r11)     // Catch: java.lang.Throwable -> L4f
            r12.append(r13)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L4f
            com.bytedance.embedapplog.uc.j(r11, r5)     // Catch: java.lang.Throwable -> L4f
        L11b:
            monitor-exit(r10)
            return
        L11d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
            throw r11
    }

    public static boolean j(com.bytedance.embedapplog.ya r1) {
            boolean r0 = r1 instanceof com.bytedance.embedapplog.kc
            if (r0 == 0) goto Lb
            com.bytedance.embedapplog.kc r1 = (com.bytedance.embedapplog.kc) r1
            boolean r1 = r1.oq()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static long r() {
            java.util.concurrent.atomic.AtomicLong r0 = com.bytedance.embedapplog.ch.f2074m
            long r0 = r0.incrementAndGet()
            return r0
    }

    static com.bytedance.embedapplog.ch.j up() {
            com.bytedance.embedapplog.ch$j r0 = com.bytedance.embedapplog.ch.az
            if (r0 != 0) goto Lc
            com.bytedance.embedapplog.ch$j r0 = new com.bytedance.embedapplog.ch$j
            r1 = 0
            r0.<init>(r1)
            com.bytedance.embedapplog.ch.az = r0
        Lc:
            com.bytedance.embedapplog.ch$j r0 = com.bytedance.embedapplog.ch.az
            long r1 = java.lang.System.currentTimeMillis()
            r0.xt = r1
            com.bytedance.embedapplog.ch$j r0 = com.bytedance.embedapplog.ch.az
            return r0
    }

    boolean cw() {
            r5 = this;
            boolean r0 = r5.xt()
            if (r0 == 0) goto L10
            long r0 = r5.qv
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    synchronized android.os.Bundle j(long r6, long r8) {
            r5 = this;
            monitor-enter(r5)
            com.bytedance.embedapplog.rn r0 = r5.j     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.up()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            boolean r0 = r5.cw()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            long r0 = r5.ae     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L50
            long r0 = r6 - r0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L50
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L4e
            r8.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "session_no"
            int r0 = r5.vl     // Catch: java.lang.Throwable -> L4e
            r8.putInt(r9, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "send_times"
            int r0 = r5.tl     // Catch: java.lang.Throwable -> L4e
            int r0 = r0 + 1
            r5.tl = r0     // Catch: java.lang.Throwable -> L4e
            r8.putInt(r9, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "current_duration"
            long r0 = r5.ae     // Catch: java.lang.Throwable -> L4e
            long r0 = r6 - r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r8.putLong(r9, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "session_start_time"
            long r0 = r5.g     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = com.bytedance.embedapplog.ya.xt(r0)     // Catch: java.lang.Throwable -> L4e
            r8.putString(r9, r0)     // Catch: java.lang.Throwable -> L4e
            r5.ae = r6     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r6 = move-exception
            goto L53
        L50:
            r8 = 0
        L51:
            monitor-exit(r5)
            return r8
        L53:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r6
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.up
            return r0
    }

    boolean j(com.bytedance.embedapplog.ya r12, java.util.ArrayList<com.bytedance.embedapplog.ya> r13) {
            r11 = this;
            boolean r0 = r12 instanceof com.bytedance.embedapplog.kc
            boolean r1 = j(r12)
            long r2 = r11.g
            r4 = -1
            r6 = 0
            r8 = 1
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L19
            boolean r1 = j(r12)
            r11.j(r12, r13, r1)
            goto L57
        L19:
            boolean r2 = r11.oq
            if (r2 != 0) goto L23
            if (r1 == 0) goto L23
            r11.j(r12, r13, r8)
            goto L57
        L23:
            long r2 = r11.qv
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L46
            long r4 = r12.xt
            com.bytedance.embedapplog.rn r9 = r11.j
            long r9 = r9.v()
            long r2 = r2 + r9
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 <= 0) goto L46
            boolean r2 = com.bytedance.embedapplog.ri.xt()
            if (r2 != 0) goto L57
            boolean r2 = com.bytedance.embedapplog.ri.j()
            if (r2 == 0) goto L57
            r11.j(r12, r13, r1)
            goto L57
        L46:
            long r2 = r11.g
            long r4 = r12.xt
            r9 = 7200000(0x6ddd00, double:3.5572727E-317)
            long r4 = r4 + r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L56
            r11.j(r12, r13, r1)
            goto L57
        L56:
            r8 = 0
        L57:
            if (r0 == 0) goto Lbe
            r0 = r12
            com.bytedance.embedapplog.kc r0 = (com.bytedance.embedapplog.kc) r0
            boolean r1 = r0.oq()
            if (r1 == 0) goto L9b
            r11.qv = r6
            r13.add(r12)
            java.lang.String r13 = r0.jy
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto Lc5
            com.bytedance.embedapplog.kc r13 = r11.f2075r
            r1 = 500(0x1f4, double:2.47E-321)
            if (r13 == 0) goto L86
            long r3 = r0.xt
            long r5 = r13.xt
            long r3 = r3 - r5
            long r5 = r13.vl
            long r3 = r3 - r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L86
            java.lang.String r13 = r13.ws
            r0.jy = r13
            goto Lc5
        L86:
            com.bytedance.embedapplog.kc r13 = r11.cw
            if (r13 == 0) goto Lc5
            long r3 = r0.xt
            long r5 = r13.xt
            long r3 = r3 - r5
            long r5 = r13.vl
            long r3 = r3 - r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lc5
            java.lang.String r13 = r13.ws
            r0.jy = r13
            goto Lc5
        L9b:
            long r1 = r12.xt
            android.os.Bundle r1 = r11.j(r1, r6)
            if (r1 == 0) goto La8
            java.lang.String r2 = "play_session"
            com.bytedance.embedapplog.j.j(r2, r1)
        La8:
            long r1 = r0.xt
            r11.qv = r1
            r13.add(r12)
            boolean r13 = r0.qv()
            if (r13 == 0) goto Lb8
            r11.cw = r0
            goto Lc5
        Lb8:
            r11.f2075r = r0
            r13 = 0
            r11.cw = r13
            goto Lc5
        Lbe:
            boolean r0 = r12 instanceof com.bytedance.embedapplog.ch.j
            if (r0 != 0) goto Lc5
            r13.add(r12)
        Lc5:
            r11.xt(r12)
            return r8
    }

    public void xt(com.bytedance.embedapplog.ya r3) {
            r2 = this;
            if (r3 == 0) goto L26
            com.bytedance.embedapplog.rn r0 = r2.j
            boolean r0 = r0.tj()
            if (r0 == 0) goto L10
            java.lang.String r0 = com.bytedance.embedapplog.j.up()
            r3.tl = r0
        L10:
            java.lang.String r0 = com.bytedance.embedapplog.j.oq()
            r3.f2122m = r0
            java.lang.String r0 = com.bytedance.embedapplog.j.g()
            r3.ae = r0
            java.lang.String r0 = r2.up
            r3.f2123r = r0
            long r0 = r()
            r3.cw = r0
        L26:
            return
    }

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.oq
            return r0
    }
}
