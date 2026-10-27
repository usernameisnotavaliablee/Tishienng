package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class qv implements com.ss.android.socialbase.downloader.g.cw.j, com.ss.android.socialbase.downloader.qv.m {
    private int a;
    private volatile boolean ae;
    private int av;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.g> az;
    private long ch;
    private final com.ss.android.socialbase.downloader.qv.xt cw;
    private volatile boolean f;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.i> g;
    private final com.ss.android.socialbase.downloader.ws.up.xt h;
    private com.ss.android.socialbase.downloader.up.j i;
    private final com.ss.android.socialbase.downloader.ae.cw j;
    private long jy;
    private final com.ss.android.socialbase.downloader.az.up kt;
    private final boolean l;
    private volatile boolean m;
    private final java.lang.Object mi;
    private com.ss.android.socialbase.downloader.ae.m oq;
    private final com.ss.android.socialbase.downloader.ws.up.xt p;
    private com.ss.android.socialbase.downloader.ae.m qv;
    private final com.ss.android.socialbase.downloader.ws.m r;
    private float s;
    private final com.ss.android.socialbase.downloader.ws.up tj;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.jy> tl;
    private final com.ss.android.socialbase.downloader.qv.ae up;
    private long v;
    private volatile boolean vl;
    private volatile boolean w;
    private final java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> ws;
    private long x;
    private final com.ss.android.socialbase.downloader.qv.ws xt;



    public qv(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r5, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.qv.ws r6, com.ss.android.socialbase.downloader.ws.m r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.m = r0
            r4.ae = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.tl = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.g = r1
            r1 = 1
            r4.vl = r1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r4.ws = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.az = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.mi = r2
            r4.f = r0
            com.ss.android.socialbase.downloader.qv.qv$1 r2 = new com.ss.android.socialbase.downloader.qv.qv$1
            r2.<init>(r4)
            r4.p = r2
            com.ss.android.socialbase.downloader.qv.qv$2 r2 = new com.ss.android.socialbase.downloader.qv.qv$2
            r2.<init>(r4)
            r4.h = r2
            r4.j = r5
            r4.xt = r6
            com.ss.android.socialbase.downloader.qv.xt r2 = new com.ss.android.socialbase.downloader.qv.xt
            int r3 = r6.r()
            int r6 = r6.up()
            r2.<init>(r3, r6)
            r4.cw = r2
            r4.r = r7
            com.ss.android.socialbase.downloader.qv.ae r6 = new com.ss.android.socialbase.downloader.qv.ae
            r6.<init>(r5, r7, r2)
            r4.up = r6
            com.ss.android.socialbase.downloader.ws.up r6 = new com.ss.android.socialbase.downloader.ws.up
            r6.<init>()
            r4.tj = r6
            com.ss.android.socialbase.downloader.az.up r6 = new com.ss.android.socialbase.downloader.az.up
            r6.<init>()
            r4.kt = r6
            int r5 = r5.ae()
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r6 = "debug"
            int r5 = r5.xt(r6)
            if (r5 != r1) goto L79
            r0 = 1
        L79:
            r4.l = r0
            return
    }

    static /* synthetic */ long ae(com.ss.android.socialbase.downloader.qv.qv r2) {
            long r0 = r2.w()
            return r0
    }

    private void ae() {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.ws r0 = r5.xt
            long r1 = r0.oq()
            r5.v = r1
            long r1 = r0.qv()
            r5.x = r1
            float r0 = r0.az()
            r5.s = r0
            int r0 = r5.a
            if (r0 <= 0) goto L20
            com.ss.android.socialbase.downloader.ws.up r1 = r5.tj
            com.ss.android.socialbase.downloader.ws.up$xt r2 = r5.p
            long r3 = (long) r0
            r1.j(r2, r3)
        L20:
            return
    }

    private com.ss.android.socialbase.downloader.qv.g av() {
            r14 = this;
            r0 = 0
        L1:
            com.ss.android.socialbase.downloader.qv.g r1 = r14.i()
            r2 = 0
            if (r1 != 0) goto L9
            return r2
        L9:
            com.ss.android.socialbase.downloader.qv.jy r4 = r1.j
            if (r4 != 0) goto Lf
            r3 = r14
            goto L6f
        Lf:
            int r3 = r1.oq()
            r13 = 2
            if (r3 < r13) goto L17
            return r2
        L17:
            long r7 = java.lang.System.currentTimeMillis()
            r14.xt(r7)
            long r5 = r4.m
            long r5 = r7 - r5
            r9 = 2000(0x7d0, double:9.88E-321)
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L57
            long r5 = r7 - r9
            r9 = 500(0x1f4, double:2.47E-321)
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = r14
            boolean r5 = r3.j(r4, r5, r7, r9, r11)
            if (r5 == 0) goto L58
            boolean r0 = r3.l
            if (r0 == 0) goto L6f
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "obtainSegmentWhenNoNewSegment: isDownloadSpeedPoor segment = "
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r5 = ", owner.threadIndex = "
            r2.append(r5)
            int r4 = r4.cw
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
            return r1
        L57:
            r3 = r14
        L58:
            int r4 = r0 + 1
            if (r0 <= r13) goto L70
            boolean r0 = r3.l
            if (r0 == 0) goto L6f
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r2 = "obtainSegmentWhenNoNewSegment: waitCount > 2, return segment = "
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r4)
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
        L6f:
            return r1
        L70:
            monitor-enter(r14)     // Catch: java.lang.InterruptedException -> L7c
            r0 = 500(0x1f4, double:2.47E-321)
            r14.wait(r0)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L79
            r0 = r4
            goto L1
        L79:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.InterruptedException -> L7c
        L7c:
            return r2
    }

    private long az() {
            r5 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r5.tl
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.qv.jy r3 = (com.ss.android.socialbase.downloader.qv.jy) r3
            long r3 = r3.xt()
            long r1 = r1 + r3
            goto L8
        L1a:
            return r1
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.m cw(com.ss.android.socialbase.downloader.qv.qv r0) {
            com.ss.android.socialbase.downloader.ae.m r0 = r0.oq
            return r0
    }

    private com.ss.android.socialbase.downloader.qv.g cw(com.ss.android.socialbase.downloader.qv.jy r28, com.ss.android.socialbase.downloader.qv.i r29) {
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r2 = r0.az
            int r2 = r2.size()
            r3 = -1
            r5 = -1
            r6 = 0
        Le:
            if (r6 >= r2) goto L1d
            long r7 = r0.j(r6, r2)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L1a
            r5 = r6
            r3 = r7
        L1a:
            int r6 = r6 + 1
            goto Le
        L1d:
            com.ss.android.socialbase.downloader.qv.ws r2 = r0.xt
            long r6 = r2.ae()
            com.ss.android.socialbase.downloader.qv.ws r2 = r0.xt
            long r8 = r2.g()
            if (r5 < 0) goto L1d7
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L1d7
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r2 = r0.az
            java.lang.Object r2 = r2.get(r5)
            com.ss.android.socialbase.downloader.qv.g r2 = (com.ss.android.socialbase.downloader.qv.g) r2
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r5 = r0.az
            int r5 = r5.size()
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r10 = r0.tl
            int r10 = r10.size()
            if (r5 >= r10) goto L47
            r5 = 2
            goto L4d
        L47:
            com.ss.android.socialbase.downloader.qv.ws r5 = r0.xt
            int r5 = r5.ws()
        L4d:
            java.lang.String r10 = ", threadIndex = "
            java.lang.String r12 = ", ratio = "
            java.lang.String r13 = ", childLength = "
            java.lang.String r14 = ", maxRemainBytes = "
            java.lang.String r15 = ", child = "
            java.lang.String r11 = "obtainSegment: parent = "
            r18 = r6
            java.lang.String r6 = "SegmentDispatcher"
            r20 = 2
            r22 = 0
            r7 = 1
            if (r5 != r7) goto L127
            com.ss.android.socialbase.downloader.qv.jy r5 = r2.j
            if (r5 == 0) goto L124
            r16 = r8
            long r7 = java.lang.System.currentTimeMillis()
            r24 = 4000(0xfa0, double:1.9763E-320)
            r26 = r10
            long r9 = r7 - r24
            long r24 = r5.j(r9, r7)
            long r7 = r1.j(r9, r7)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r10 <= 0) goto L8c
            int r10 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r10 <= 0) goto L8c
            float r10 = (float) r7
            long r7 = r24 + r7
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L8e
        L8c:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L8e:
            int r7 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r7 != 0) goto Laa
            long r7 = r5.xt()
            r24 = r7
            long r7 = r1.xt()
            int r5 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r5 <= 0) goto Laa
            int r5 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r5 <= 0) goto Laa
            float r5 = (float) r7
            long r7 = r24 + r7
            float r7 = (float) r7
            float r10 = r5 / r7
        Laa:
            r5 = 0
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 <= 0) goto L124
            r5 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r5
            float r5 = (float) r3
            float r5 = r5 * r10
            long r7 = (long) r5
            int r5 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r5 >= 0) goto Lbe
            r7 = r18
        Lbe:
            int r5 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r5 <= 0) goto Lc9
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 <= 0) goto Lc9
            r8 = r16
            goto Lca
        Lc9:
            r8 = r7
        Lca:
            long r16 = r18 / r20
            long r18 = r3 - r16
            int r5 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r5 <= 0) goto Ld5
            r8 = r18
            goto Ldb
        Ld5:
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 >= 0) goto Ldb
            r8 = r16
        Ldb:
            com.ss.android.socialbase.downloader.qv.g r5 = new com.ss.android.socialbase.downloader.qv.g
            long r16 = r2.up()
            long r18 = r3 - r8
            r24 = r6
            long r6 = r16 + r18
            long r0 = r2.m()
            r5.<init>(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            r0.append(r2)
            r0.append(r15)
            r0.append(r5)
            r0.append(r14)
            r0.append(r3)
            r0.append(r13)
            r0.append(r8)
            r0.append(r12)
            r0.append(r10)
            r1 = r26
            r0.append(r1)
            r6 = r28
            int r1 = r6.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r24
            com.ss.android.socialbase.downloader.m.j.cw(r7, r0)
            return r5
        L124:
            r7 = r6
            goto L1af
        L127:
            r7 = r6
            r16 = r8
            r0 = 2
            r6 = r1
            r1 = r10
            if (r5 != r0) goto L1af
            r0 = r27
            long r8 = r0.jy
            com.ss.android.socialbase.downloader.ae.cw r5 = r0.j
            long r24 = r5.uq()
            long r8 = r8 - r24
            float r5 = r27.r(r28, r29)
            float r8 = (float) r8
            float r8 = r8 * r5
            long r8 = (long) r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 >= 0) goto L149
            r8 = r18
        L149:
            int r10 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r10 <= 0) goto L153
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 <= 0) goto L153
            r8 = r16
        L153:
            long r16 = r18 / r20
            long r18 = r3 - r16
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L15e
            r8 = r18
            goto L164
        L15e:
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 >= 0) goto L164
            r8 = r16
        L164:
            com.ss.android.socialbase.downloader.qv.g r10 = new com.ss.android.socialbase.downloader.qv.g
            long r16 = r2.up()
            long r18 = r3 - r8
            r24 = r7
            long r6 = r16 + r18
            r26 = r1
            long r0 = r2.m()
            r10.<init>(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            r0.append(r2)
            r0.append(r15)
            r0.append(r10)
            r0.append(r14)
            r0.append(r3)
            r0.append(r13)
            r0.append(r8)
            r0.append(r12)
            r0.append(r5)
            r1 = r26
            r0.append(r1)
            r1 = r28
            int r1 = r1.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r24
            com.ss.android.socialbase.downloader.m.j.cw(r7, r0)
            return r10
        L1af:
            com.ss.android.socialbase.downloader.qv.g r0 = new com.ss.android.socialbase.downloader.qv.g
            long r5 = r2.up()
            long r3 = r3 / r20
            long r5 = r5 + r3
            long r3 = r2.m()
            r0.<init>(r5, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            r1.append(r2)
            java.lang.String r2 = ",child = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r7, r1)
            return r0
        L1d7:
            r0 = 0
            return r0
    }

    private java.util.List<com.ss.android.socialbase.downloader.qv.i> cw(java.lang.String r8, java.util.List<java.net.InetAddress> r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L9c
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto Lb
            goto L9c
        Lb:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r3 = 0
        L16:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r9.next()
            java.net.InetAddress r4 = (java.net.InetAddress) r4
            if (r4 == 0) goto L16
            java.lang.String r4 = r4.getHostAddress()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L16
            boolean r5 = r7.l
            if (r5 == 0) goto L41
            java.lang.String r5 = "onDnsResolved: ip = "
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r5.concat(r6)
            java.lang.String r6 = "SegmentDispatcher"
            com.bytedance.sdk.component.utils.vl.j(r6, r5)
        L41:
            com.ss.android.socialbase.downloader.qv.i r5 = new com.ss.android.socialbase.downloader.qv.i
            r5.<init>(r8, r4)
            java.lang.String r4 = r5.cw
            java.lang.Object r4 = r1.get(r4)
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            if (r4 != 0) goto L5a
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r6 = r5.cw
            r1.put(r6, r4)
        L5a:
            r4.add(r5)
            int r3 = r3 + 1
            goto L16
        L60:
            if (r3 <= 0) goto L9c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L67:
            java.util.Set r9 = r1.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
        L70:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r9.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            if (r4 == 0) goto L70
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L70
            java.lang.Object r0 = r4.pollFirst()
            com.ss.android.socialbase.downloader.qv.i r0 = (com.ss.android.socialbase.downloader.qv.i) r0
            r8.add(r0)
            int r3 = r3 + (-1)
            r0 = 1
            goto L70
        L97:
            if (r3 <= 0) goto L9b
            if (r0 != 0) goto L67
        L9b:
            return r8
        L9c:
            return r0
    }

    private void cw() throws com.ss.android.socialbase.downloader.up.j, java.lang.InterruptedException {
            r2 = this;
            java.lang.Object r0 = r2.mi
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.ae.m r1 = r2.oq     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            com.ss.android.socialbase.downloader.ae.m r1 = r2.qv     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.lang.Object r1 = r2.mi     // Catch: java.lang.Throwable -> L11
            r1.wait()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L23
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.m r0 = r2.oq
            if (r0 != 0) goto L22
            com.ss.android.socialbase.downloader.ae.m r0 = r2.qv
            if (r0 != 0) goto L22
            com.ss.android.socialbase.downloader.up.j r0 = r2.i
            if (r0 != 0) goto L21
            goto L22
        L21:
            throw r0
        L22:
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private void cw(java.util.List<com.ss.android.socialbase.downloader.qv.g> r7) {
            r6 = this;
            long r0 = com.ss.android.socialbase.downloader.qv.az.xt(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "checkDownloadBytes: getCurBytes = "
            r7.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.j
            long r2 = r2.uq()
            r7.append(r2)
            java.lang.String r2 = ", totalBytes = "
            r7.append(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.j
            long r2 = r2.ka()
            r7.append(r2)
            java.lang.String r2 = ", downloadedBytes = "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.m.j.cw(r2, r7)
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r2 = r7.ka()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L4f
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r2 = r7.ka()
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L4f
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r0 = r7.ka()
        L4f:
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r2 = r7.uq()
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r4 = r7.ka()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L6e
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            long r2 = r7.uq()
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L6e
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j
            r7.up(r0)
        L6e:
            return
    }

    private boolean cw(com.ss.android.socialbase.downloader.qv.jy r2) {
            r1 = this;
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.qv.i r0 = r1.r(r2)     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            r2 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = move-exception
            goto L12
        Lc:
            boolean r2 = r2.j(r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    private void g() {
            r6 = this;
            com.ss.android.socialbase.downloader.qv.ws r0 = r6.xt
            int r0 = r0.vl()
            if (r0 > 0) goto Lf
            r0 = 0
            r6.vl = r0
            r6.up()
            return
        Lf:
            com.ss.android.socialbase.downloader.g.cw r1 = com.ss.android.socialbase.downloader.g.cw.j()
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.j
            java.lang.String r2 = r2.oq()
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.j(r2, r6, r3)
            r2 = 2
            if (r0 <= r2) goto L43
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.j
            java.util.List r0 = r0.ja()
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L2d
            r1.j(r2, r6, r3)
            goto L2d
        L43:
            return
    }

    private com.ss.android.socialbase.downloader.qv.g i() {
            r9 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r0 = r9.az
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
        La:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.qv.g r3 = (com.ss.android.socialbase.downloader.qv.g) r3
            long r4 = r9.j(r3)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto La
            int r4 = r3.oq()
            if (r4 >= r2) goto La
            r1 = r3
            r2 = r4
            goto La
        L29:
            return r1
    }

    private int j(long r7) {
            r6 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r0 = r6.az
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L25
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r2 = r6.az
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.socialbase.downloader.qv.g r2 = (com.ss.android.socialbase.downloader.qv.g) r2
            long r3 = r2.cw()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L1a
            return r1
        L1a:
            long r2 = r2.cw()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L25
            int r1 = r1 + 1
            goto L7
        L25:
            r7 = -1
            return r7
    }

    private int j(java.lang.String r4) {
            r3 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r3.g
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r2 = r3.g
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.socialbase.downloader.qv.i r2 = (com.ss.android.socialbase.downloader.qv.i) r2
            java.lang.String r2 = r2.j
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r4 = -1
            return r4
    }

    private long j(int r6, int r7) {
            r5 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r0 = r5.az
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.socialbase.downloader.qv.g r0 = (com.ss.android.socialbase.downloader.qv.g) r0
            long r1 = r5.j(r0)
            int r6 = r6 + 1
            if (r6 >= r7) goto L19
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r7 = r5.az
            java.lang.Object r6 = r7.get(r6)
            com.ss.android.socialbase.downloader.qv.g r6 = (com.ss.android.socialbase.downloader.qv.g) r6
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 != 0) goto L1d
            return r1
        L1d:
            long r6 = r6.cw()
            long r3 = r0.up()
            long r6 = r6 - r3
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L2d
            return r6
        L2d:
            long r6 = java.lang.Math.min(r1, r6)
            return r6
    }

    private long j(com.ss.android.socialbase.downloader.qv.g r8) {
            r7 = this;
            long r0 = r8.xt()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            long r2 = r7.jy
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            long r0 = r8.up()
            long r2 = r2 - r0
            return r2
        L18:
            return r0
    }

    private com.ss.android.socialbase.downloader.qv.jy j(long r21, long r23, long r25, int r27) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r3 = r0.tl
            java.util.Iterator r3 = r3.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r8 = 0
        L11:
            boolean r9 = r3.hasNext()
            java.lang.String r10 = ", threadIndex = "
            java.lang.String r11 = "SegmentDispatcher"
            if (r9 == 0) goto L6f
            java.lang.Object r9 = r3.next()
            com.ss.android.socialbase.downloader.qv.jy r9 = (com.ss.android.socialbase.downloader.qv.jy) r9
            long r12 = r9.m
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L6a
            int r7 = r7 + 1
            long r12 = r9.m
            int r16 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r12 = r23
            r17 = r7
            if (r16 >= 0) goto L67
            r16 = 0
            long r6 = r9.j(r1, r12)
            r18 = r14
            boolean r14 = r0.l
            if (r14 == 0) goto L5a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "findPoorReadThread: speed = "
            r14.<init>(r15)
            r14.append(r6)
            r14.append(r10)
            int r10 = r9.cw
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            com.bytedance.sdk.component.utils.vl.j(r11, r10)
        L5a:
            int r10 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto L64
            r4 = r6
            r8 = r9
        L64:
            r7 = r17
            goto L11
        L67:
            r16 = 0
            goto L64
        L6a:
            r12 = r23
            r16 = 0
            goto L11
        L6f:
            r16 = 0
            if (r8 == 0) goto L95
            r1 = r27
            if (r7 < r1) goto L95
            int r1 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r1 >= 0) goto L95
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findPoorReadThread: ----------- minSpeed = "
            r1.<init>(r2)
            r1.append(r4)
            r1.append(r10)
            int r2 = r8.cw
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r11, r1)
            return r8
        L95:
            return r16
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.qv.jy j(com.ss.android.socialbase.downloader.qv.qv r0, boolean r1, long r2, long r4) {
            com.ss.android.socialbase.downloader.qv.jy r0 = r0.j(r1, r2, r4)
            return r0
    }

    private com.ss.android.socialbase.downloader.qv.jy j(boolean r9, long r10, long r12) {
            r8 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r8.tl
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            com.ss.android.socialbase.downloader.qv.jy r2 = (com.ss.android.socialbase.downloader.qv.jy) r2
            int r3 = r2.cw
            if (r3 != 0) goto L19
            if (r9 == 0) goto L7
        L19:
            long r3 = r2.r
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7
            long r3 = r2.up
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L7
            long r3 = r2.r
            long r3 = r10 - r3
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 <= 0) goto L7
            if (r1 != 0) goto L33
        L31:
            r1 = r2
            goto L7
        L33:
            long r3 = r2.r
            long r5 = r1.r
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L7
            goto L31
        L3c:
            return r1
    }

    private void j(com.ss.android.socialbase.downloader.ae.m r12) throws com.ss.android.socialbase.downloader.up.j {
            r11 = this;
            com.ss.android.socialbase.downloader.ae.m r0 = r11.oq
            if (r0 != 0) goto La
            com.ss.android.socialbase.downloader.ae.m r0 = r11.qv
            if (r0 != 0) goto La
            goto Lc4
        La:
            long r1 = r12.oq()
            long r3 = r0.oq()
            r5 = 1074(0x432, float:1.505E-42)
            java.lang.String r6 = "SegmentDispatcher"
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "total len not equals,len="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r8 = ",sLen="
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ",code="
            r7.append(r8)
            int r8 = r12.cw
            r7.append(r8)
            java.lang.String r8 = ",sCode="
            r7.append(r8)
            int r8 = r0.cw
            r7.append(r8)
            java.lang.String r8 = ",range="
            r7.append(r8)
            java.lang.String r8 = r12.up()
            r7.append(r8)
            java.lang.String r8 = ",sRange = "
            r7.append(r8)
            java.lang.String r8 = r0.up()
            r7.append(r8)
            java.lang.String r8 = ",url = "
            r7.append(r8)
            java.lang.String r8 = r12.j
            r7.append(r8)
            java.lang.String r8 = ",sUrl="
            r7.append(r8)
            java.lang.String r8 = r0.j
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.ss.android.socialbase.downloader.m.j.up(r6, r7)
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L84
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 > 0) goto L7e
            goto L84
        L7e:
            com.ss.android.socialbase.downloader.up.j r12 = new com.ss.android.socialbase.downloader.up.j
            r12.<init>(r5, r7)
            throw r12
        L84:
            java.lang.String r12 = r12.cw()
            java.lang.String r0 = r0.cw()
            boolean r1 = android.text.TextUtils.equals(r12, r0)
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "etag not equals with main url, etag = "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = ", mainEtag = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r6, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto Lc4
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lc4
            boolean r12 = r12.equalsIgnoreCase(r0)
            if (r12 == 0) goto Lbe
            goto Lc4
        Lbe:
            com.ss.android.socialbase.downloader.up.j r12 = new com.ss.android.socialbase.downloader.up.j
            r12.<init>(r5, r1)
            throw r12
        Lc4:
            return
    }

    private void j(com.ss.android.socialbase.downloader.qv.i r7) {
            r6 = this;
            com.ss.android.socialbase.downloader.qv.jy r0 = new com.ss.android.socialbase.downloader.qv.jy
            com.ss.android.socialbase.downloader.ae.cw r1 = r6.j
            com.ss.android.socialbase.downloader.qv.xt r3 = r6.cw
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r2 = r6.tl
            int r5 = r2.size()
            r2 = r6
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r7 = r2.tl
            r7.add(r0)
            java.util.concurrent.ExecutorService r7 = com.ss.android.socialbase.downloader.downloader.cw.av()
            java.util.concurrent.Future r7 = r7.submit(r0)
            r0.j(r7)
            return
    }

    private void j(com.ss.android.socialbase.downloader.up.j r4) {
            r3 = this;
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "onError, e = "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            com.ss.android.socialbase.downloader.m.j.up(r0, r1)
            r3.i = r4
            com.ss.android.socialbase.downloader.qv.xt r4 = r3.cw
            r4.cw()
            monitor-enter(r3)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r4 = r3.tl     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
        L1d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L2d
            com.ss.android.socialbase.downloader.qv.jy r0 = (com.ss.android.socialbase.downloader.qv.jy) r0     // Catch: java.lang.Throwable -> L2d
            r0.up()     // Catch: java.lang.Throwable -> L2d
            goto L1d
        L2d:
            r4 = move-exception
            goto L31
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.qv.g> r8, com.ss.android.socialbase.downloader.qv.g r9, boolean r10) {
            r7 = this;
            long r0 = r9.cw()
            int r2 = r8.size()
            r3 = 0
        L9:
            if (r3 >= r2) goto L1c
            java.lang.Object r4 = r8.get(r3)
            com.ss.android.socialbase.downloader.qv.g r4 = (com.ss.android.socialbase.downloader.qv.g) r4
            long r4 = r4.cw()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L1c
            int r3 = r3 + 1
            goto L9
        L1c:
            r8.add(r3, r9)
            if (r10 == 0) goto L24
            r9.j(r2)
        L24:
            return
    }

    private boolean j(long r10, long r12) {
            r9 = this;
            com.ss.android.socialbase.downloader.az.up r0 = r9.kt
            long r2 = r10 - r12
            long r0 = r0.xt(r2, r10)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r4 = r9.tl
            int r4 = r4.size()
            if (r4 <= 0) goto L12
            long r5 = (long) r4
            long r0 = r0 / r5
        L12:
            float r0 = (float) r0
            float r1 = r9.s
            float r0 = r0 * r1
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = java.lang.Math.max(r1, r0)
            long r6 = (long) r0
            int r8 = r4 / 2
            r1 = r9
            r4 = r10
            com.ss.android.socialbase.downloader.qv.jy r10 = r1.j(r2, r4, r6, r8)
            r0 = r1
            r2 = r4
            r11 = 1
            java.lang.String r6 = "SegmentDispatcher"
            if (r10 == 0) goto L47
            r9.cw(r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "handlePoorReadThread: reconnect for poor speed, threadIndex = "
            r12.<init>(r13)
            int r13 = r10.cw
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.ss.android.socialbase.downloader.m.j.r(r6, r12)
            r10.m()
            return r11
        L47:
            r1 = 1
            r4 = r12
            com.ss.android.socialbase.downloader.qv.jy r10 = r0.j(r1, r2, r4)
            if (r10 == 0) goto L69
            r9.cw(r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "handlePoorReadThread: reconnect for connect timeout, threadIndex = "
            r12.<init>(r13)
            int r13 = r10.cw
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.ss.android.socialbase.downloader.m.j.r(r6, r12)
            r10.m()
            return r11
        L69:
            r10 = 0
            return r10
    }

    private boolean j(com.ss.android.socialbase.downloader.qv.jy r7, long r8, long r10, long r12, double r14) {
            r6 = this;
            long r0 = r7.m
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L62
            com.ss.android.socialbase.downloader.az.up r0 = r6.kt
            long r0 = r0.xt(r8, r10)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r2 = r6.tl
            int r2 = r2.size()
            if (r2 <= 0) goto L1a
            long r2 = (long) r2
            long r2 = r0 / r2
            goto L1b
        L1a:
            r2 = r0
        L1b:
            long r8 = r7.j(r8, r10)
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L2b
            double r10 = (double) r8
            double r4 = (double) r2
            double r4 = r4 * r14
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 >= 0) goto L62
        L2b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "isDownloadSpeedPoor: totalSpeed = "
            r10.<init>(r11)
            r10.append(r0)
            java.lang.String r11 = ", threadAvgSpeed = "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ", poorSpeed = "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r11 = ", speed = "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = ",threadIndex = "
            r10.append(r8)
            int r7 = r7.cw
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r8 = "SegmentDispatcher"
            com.bytedance.sdk.component.utils.vl.j(r8, r7)
            r7 = 1
            return r7
        L62:
            r7 = 0
            return r7
    }

    static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.qv.qv r0) {
            boolean r0 = r0.m
            return r0
    }

    static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.qv.qv r0, com.ss.android.socialbase.downloader.qv.jy r1) {
            boolean r0 = r0.cw(r1)
            return r0
    }

    private void jy() {
            r15 = this;
            long r0 = r15.jy
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto La
            goto Lcd
        La:
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r0 = r15.az
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto L15
            goto Lcd
        L15:
            r4 = 0
            r5 = 0
            r6 = 1
        L18:
            java.lang.String r7 = "SegmentDispatcher"
            if (r6 >= r0) goto L7d
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r8 = r15.az
            java.lang.Object r8 = r8.get(r5)
            com.ss.android.socialbase.downloader.qv.g r8 = (com.ss.android.socialbase.downloader.qv.g) r8
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r9 = r15.az
            java.lang.Object r9 = r9.get(r6)
            com.ss.android.socialbase.downloader.qv.g r9 = (com.ss.android.socialbase.downloader.qv.g) r9
            long r10 = r8.up()
            long r12 = r9.cw()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L6e
            long r10 = r9.j()
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto L6e
            com.ss.android.socialbase.downloader.qv.jy r10 = r9.j
            if (r10 != 0) goto L6e
            if (r4 != 0) goto L4b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
        L4b:
            r4.add(r9)
            boolean r10 = r15.l
            if (r10 == 0) goto L6b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "clearCovered, covered = "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = ", prev = "
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.bytedance.sdk.component.utils.vl.xt(r7, r8)
        L6b:
            int r6 = r6 + 1
            goto L18
        L6e:
            long r9 = r9.up()
            long r7 = r8.up()
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 <= 0) goto L6b
            int r5 = r5 + 1
            goto L6b
        L7d:
            if (r4 == 0) goto Lcd
            java.util.Iterator r0 = r4.iterator()
        L83:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r0.next()
            com.ss.android.socialbase.downloader.qv.g r2 = (com.ss.android.socialbase.downloader.qv.g) r2
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r3 = r15.az
            r3.remove(r2)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r3 = r15.tl
            java.util.Iterator r3 = r3.iterator()
        L9a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r3.next()
            com.ss.android.socialbase.downloader.qv.jy r4 = (com.ss.android.socialbase.downloader.qv.jy) r4
            com.ss.android.socialbase.downloader.qv.g r5 = r4.j
            if (r5 != r2) goto L9a
            boolean r5 = r15.l
            if (r5 == 0) goto Lc9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "clearCoveredSegmentLocked: reconnect, segment = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = ", threadIndex = "
            r5.append(r6)
            int r6 = r4.cw
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.sdk.component.utils.vl.xt(r7, r5)
        Lc9:
            r4.j(r1)
            goto L9a
        Lcd:
            return
    }

    static /* synthetic */ java.util.List m(com.ss.android.socialbase.downloader.qv.qv r0) {
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r0.g
            return r0
    }

    private void m() {
            r5 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r5.g
            com.ss.android.socialbase.downloader.qv.i r1 = new com.ss.android.socialbase.downloader.qv.i
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.j
            java.lang.String r2 = r2.oq()
            r3 = 1
            r1.<init>(r2, r3)
            r0.add(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            java.util.List r0 = r0.ja()
            if (r0 == 0) goto L3b
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1d
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r2 = r5.g
            com.ss.android.socialbase.downloader.qv.i r3 = new com.ss.android.socialbase.downloader.qv.i
            r4 = 0
            r3.<init>(r1, r4)
            r2.add(r3)
            goto L1d
        L3b:
            com.ss.android.socialbase.downloader.qv.ws r0 = r5.xt
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r1 = r5.g
            int r1 = r1.size()
            r0.j(r1)
            return
    }

    private com.ss.android.socialbase.downloader.qv.i oq() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.av     // Catch: java.lang.Throwable -> L19
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r1 = r2.g     // Catch: java.lang.Throwable -> L19
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L19
            int r0 = r0 % r1
            com.ss.android.socialbase.downloader.qv.ws r1 = r2.xt     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.xt()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            int r1 = r2.av     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + 1
            r2.av = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L25
        L1b:
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r1 = r2.g     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L19
            com.ss.android.socialbase.downloader.qv.i r0 = (com.ss.android.socialbase.downloader.qv.i) r0     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return r0
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    private void qv() {
            r2 = this;
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "onComplete"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            com.ss.android.socialbase.downloader.qv.xt r0 = r2.cw
            r0.cw()
            java.lang.Object r0 = r2.mi
            monitor-enter(r0)
            java.lang.Object r1 = r2.mi     // Catch: java.lang.Throwable -> L16
            r1.notify()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private float r(com.ss.android.socialbase.downloader.qv.jy r8, com.ss.android.socialbase.downloader.qv.i r9) {
            r7 = this;
            long r0 = r8.xt()
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r9 = r7.tl
            int r9 = r9.size()
            r2 = 1
            if (r9 > r2) goto L13
            com.ss.android.socialbase.downloader.qv.ws r9 = r7.xt
            int r9 = r9.j()
        L13:
            r3 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto L39
            com.ss.android.socialbase.downloader.qv.ws r0 = r7.xt
            float r0 = r0.jy()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2a
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L2d
        L2a:
            float r0 = (float) r9
            float r0 = r5 / r0
        L2d:
            int r8 = r8.cw
            if (r8 != 0) goto L32
            return r0
        L32:
            if (r9 <= r2) goto L36
            float r5 = r5 - r0
            int r9 = r9 - r2
        L36:
            float r8 = (float) r9
            float r5 = r5 / r8
            return r5
        L39:
            long r2 = r7.az()
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L36
            float r8 = (float) r0
            float r9 = (float) r2
            float r8 = r8 / r9
            return r8
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.m r(com.ss.android.socialbase.downloader.qv.qv r0) {
            com.ss.android.socialbase.downloader.ae.m r0 = r0.qv
            return r0
    }

    private com.ss.android.socialbase.downloader.qv.i r(com.ss.android.socialbase.downloader.qv.jy r6) {
            r5 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r5.g
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.qv.i r3 = (com.ss.android.socialbase.downloader.qv.i) r3
            com.ss.android.socialbase.downloader.qv.i r4 = r6.xt
            if (r3 == r4) goto L8
            boolean r4 = r3.r()
            if (r4 != 0) goto L8
            if (r2 != 0) goto L21
            r2 = r3
        L21:
            int r4 = r3.j()
            if (r4 > 0) goto L8
            goto L29
        L28:
            r3 = r1
        L29:
            com.ss.android.socialbase.downloader.qv.ws r6 = r5.xt
            boolean r6 = r6.xt()
            if (r6 == 0) goto L3d
            if (r3 == 0) goto L34
            return r3
        L34:
            com.ss.android.socialbase.downloader.qv.ws r6 = r5.xt
            boolean r6 = r6.cw()
            if (r6 == 0) goto L3d
            return r1
        L3d:
            return r2
    }

    private void r() throws com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.ae r0 = r5.up     // Catch: com.ss.android.socialbase.downloader.up.j -> L8 com.ss.android.socialbase.downloader.qv.av -> La
            com.ss.android.socialbase.downloader.qv.xt r1 = r5.cw     // Catch: com.ss.android.socialbase.downloader.up.j -> L8 com.ss.android.socialbase.downloader.qv.av -> La
            r0.j(r1)     // Catch: com.ss.android.socialbase.downloader.up.j -> L8 com.ss.android.socialbase.downloader.qv.av -> La
            goto L1f
        L8:
            r0 = move-exception
            goto Lc
        La:
            goto L1f
        Lc:
            java.lang.String r1 = "SegmentDispatcher"
            java.lang.String r2 = "dispatchSegments: loopAndWrite e = "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            com.ss.android.socialbase.downloader.m.j.up(r1, r2)
            r5.j(r0)
            throw r0
        L1f:
            boolean r0 = r5.ae
            if (r0 != 0) goto L90
            boolean r0 = r5.m
            if (r0 == 0) goto L28
            goto L90
        L28:
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4d
        L29:
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r0 = r5.ws     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L44
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r0 = r5.ws     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.qv.g r0 = (com.ss.android.socialbase.downloader.qv.g) r0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L29
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r1 = r5.az     // Catch: java.lang.Throwable -> L42
            r2 = 1
            r5.j(r1, r0, r2)     // Catch: java.lang.Throwable -> L42
            goto L29
        L42:
            r0 = move-exception
            goto L4b
        L44:
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r0 = r5.az     // Catch: java.lang.Throwable -> L42
            r5.cw(r0)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L42
            goto L51
        L4b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L51:
            boolean r0 = r5.f
            if (r0 == 0) goto L72
            com.ss.android.socialbase.downloader.up.j r0 = r5.i
            if (r0 != 0) goto L5a
            goto L72
        L5a:
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dispatchSegments: loopAndWrite  failedException = "
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.up.j r2 = r5.i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r0, r1)
            com.ss.android.socialbase.downloader.up.j r0 = r5.i
            throw r0
        L72:
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            long r0 = r0.uq()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.j
            long r2 = r2.ka()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L89
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r1 = r5.az
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1)
        L89:
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "dispatchSegments::download finished"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
        L90:
            return
    }

    private void r(java.util.List<com.ss.android.socialbase.downloader.qv.g> r15) {
            r14 = this;
            r0 = 0
            java.lang.Object r0 = r15.get(r0)
            com.ss.android.socialbase.downloader.qv.g r0 = (com.ss.android.socialbase.downloader.qv.g) r0
            long r1 = r0.cw()
            r3 = 1
            java.lang.String r4 = "SegmentDispatcher"
            r5 = 1
            r7 = 0
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L38
            com.ss.android.socialbase.downloader.qv.g r9 = new com.ss.android.socialbase.downloader.qv.g
            long r1 = r1 - r5
            r9.<init>(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fixSegmentsLocked: first = "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", add new first = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.utils.vl.xt(r4, r0)
            r14.j(r15, r9, r3)
        L38:
            java.util.Iterator r0 = r15.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()
            com.ss.android.socialbase.downloader.qv.g r1 = (com.ss.android.socialbase.downloader.qv.g) r1
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r0.next()
            com.ss.android.socialbase.downloader.qv.g r2 = (com.ss.android.socialbase.downloader.qv.g) r2
            long r9 = r1.m()
            long r11 = r2.cw()
            long r11 = r11 - r5
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L87
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "fixSegment: segment = "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = ", new end = "
            r9.append(r10)
            long r10 = r2.cw()
            long r10 = r10 - r5
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.ss.android.socialbase.downloader.m.j.r(r4, r9)
            long r9 = r2.cw()
            long r9 = r9 - r5
            r1.cw(r9)
        L87:
            r1 = r2
            goto L48
        L89:
            int r0 = r15.size()
            int r0 = r0 - r3
            java.lang.Object r15 = r15.get(r0)
            com.ss.android.socialbase.downloader.qv.g r15 = (com.ss.android.socialbase.downloader.qv.g) r15
            com.ss.android.socialbase.downloader.ae.cw r0 = r14.j
            long r0 = r0.ka()
            r2 = -1
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 <= 0) goto Lb3
            long r7 = r15.m()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto Lb2
            long r7 = r15.m()
            long r0 = r0 - r5
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lb2
            goto Lb3
        Lb2:
            return
        Lb3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fixSegment: last segment = "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r1 = ", new end=-1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.socialbase.downloader.m.j.r(r4, r0)
            r15.cw(r2)
            return
    }

    private void tl() {
            r5 = this;
            long r0 = r5.x
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            long r0 = java.lang.System.currentTimeMillis()
            r5.ch = r0
            com.ss.android.socialbase.downloader.ws.up r0 = r5.tj
            com.ss.android.socialbase.downloader.ws.up$xt r1 = r5.h
            r0.j(r1, r2)
        L15:
            return
    }

    static /* synthetic */ long up(com.ss.android.socialbase.downloader.qv.qv r2) {
            long r0 = r2.v
            return r0
    }

    private void up() {
            r7 = this;
            long r0 = r7.jy
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L22
            boolean r0 = r7.vl
            if (r0 == 0) goto Le
            goto L22
        Le:
            com.ss.android.socialbase.downloader.qv.ws r0 = r7.xt
            int r0 = r0.j()
            long r1 = r7.jy
            com.ss.android.socialbase.downloader.qv.ws r3 = r7.xt
            long r5 = r3.tl()
            long r1 = r1 / r5
            int r2 = (int) r1
            if (r0 <= r2) goto L23
            r0 = r2
            goto L23
        L22:
            r0 = 1
        L23:
            java.lang.String r1 = "SegmentDispatcher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "dispatchReadThread: totalLength = "
            r2.<init>(r3)
            long r5 = r7.jy
            r2.append(r5)
            java.lang.String r3 = ", threadCount = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r1, r2)
            if (r0 > 0) goto L43
            goto L44
        L43:
            r4 = r0
        L44:
            monitor-enter(r7)
        L45:
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r7.tl     // Catch: java.lang.Throwable -> L66
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L66
            if (r0 >= r4) goto L6a
            boolean r0 = r7.ae     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L68
            boolean r0 = r7.m     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L56
            goto L68
        L56:
            com.ss.android.socialbase.downloader.qv.i r0 = r7.oq()     // Catch: java.lang.Throwable -> L66
            r7.j(r0)     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.qv.ws r0 = r7.xt     // Catch: java.lang.Throwable -> L66
            boolean r0 = r0.m()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L45
            goto L6a
        L66:
            r0 = move-exception
            goto L6c
        L68:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            return
        L6a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            return
        L6c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            throw r0
    }

    private void up(com.ss.android.socialbase.downloader.qv.jy r22, com.ss.android.socialbase.downloader.qv.g r23) throws com.ss.android.socialbase.downloader.qv.oq {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "applySegment: start "
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r4 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.m.j.cw(r4, r3)
            com.ss.android.socialbase.downloader.qv.jy r3 = r2.j
            java.lang.String r5 = "applySegment: "
            if (r3 != r1) goto L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " is already the owner of "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r4, r1)
            return
        L33:
            com.ss.android.socialbase.downloader.qv.jy r3 = r2.j
            r6 = 1
            if (r3 != 0) goto L25f
            long r7 = r1.tl()
            long r9 = r2.up()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L256
            long r7 = r2.cw()
            int r3 = r0.j(r7)
            r10 = -1
            if (r3 == r10) goto L236
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r10 = r0.az
            java.lang.Object r10 = r10.get(r3)
            com.ss.android.socialbase.downloader.qv.g r10 = (com.ss.android.socialbase.downloader.qv.g) r10
            if (r10 == 0) goto L236
            r11 = 0
            if (r10 == r2) goto L108
            long r13 = r10.cw()
            long r15 = r2.cw()
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto Le4
            long r13 = r0.j(r10)
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 <= 0) goto Le4
            com.ss.android.socialbase.downloader.qv.jy r15 = r10.j
            if (r15 == 0) goto Lac
            r16 = 524288(0x80000, double:2.590327E-318)
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 >= 0) goto L9c
            r16 = r11
            long r11 = r1.m
            r19 = r10
            long r9 = r15.m
            long r11 = r11 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            int r20 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r20 <= 0) goto L9e
            long r9 = r19.up()
            long r11 = r2.up()
            long r9 = r9 - r11
            r11 = 2
            long r13 = r13 / r11
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 >= 0) goto L9e
            goto Lb0
        L9c:
            r19 = r10
        L9e:
            java.lang.String r1 = "applySegmentLocked: has same segment, but owner is normal, abort. segmentInList = "
            java.lang.String r3 = java.lang.String.valueOf(r19)
            java.lang.String r1 = r1.concat(r3)
            com.bytedance.sdk.component.utils.vl.j(r4, r1)
            goto Le6
        Lac:
            r19 = r10
            r16 = r11
        Lb0:
            if (r15 == 0) goto Lc3
            java.lang.String r9 = "applySegmentLocked: has same segment,and owner too slow, segmentInList = "
            java.lang.String r10 = java.lang.String.valueOf(r19)
            java.lang.String r9 = r9.concat(r10)
            com.bytedance.sdk.component.utils.vl.j(r4, r9)
            r15.j(r6)
            goto Ld0
        Lc3:
            java.lang.String r9 = "applySegmentLocked: has same segment and no owner, segmentInList = "
            java.lang.String r10 = java.lang.String.valueOf(r19)
            java.lang.String r9 = r9.concat(r10)
            com.bytedance.sdk.component.utils.vl.j(r4, r9)
        Ld0:
            long r9 = r19.m()
            r2.cw(r9)
            int r9 = r19.oq()
            r2.xt(r9)
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r9 = r0.az
            r9.set(r3, r2)
            goto L10a
        Le4:
            r19 = r10
        Le6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r2 = " not exist! but has another same segment, segmentInList = "
            r1.append(r2)
            r10 = r19
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r4, r1)
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            java.lang.String r2 = "segment not exist, but has another same segment"
            r3 = 2
            r1.<init>(r3, r2)
            throw r1
        L108:
            r16 = r11
        L10a:
            long r9 = r2.j()
            int r11 = r3 + (-1)
        L110:
            if (r11 < 0) goto L1b1
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r14 = r0.az
            java.lang.Object r14 = r14.get(r11)
            com.ss.android.socialbase.downloader.qv.g r14 = (com.ss.android.socialbase.downloader.qv.g) r14
            long r18 = r14.m()
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 <= 0) goto L126
            int r15 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r15 < 0) goto L17b
        L126:
            int r15 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r15 > 0) goto L15a
            long r18 = r14.up()
            int r15 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r15 > 0) goto L133
            goto L15a
        L133:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "applySegment:prev's current has over this start, prev = "
            r1.<init>(r3)
            r1.append(r14)
            java.lang.String r3 = ", segment = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r4, r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r1 = r0.az
            r1.remove(r2)
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            r2 = 3
            java.lang.String r3 = "prev overstep"
            r1.<init>(r2, r3)
            throw r1
        L15a:
            com.ss.android.socialbase.downloader.qv.jy r15 = r14.j
            if (r15 != 0) goto L17e
            r18 = 1
            long r12 = r7 - r18
            r14.cw(r12)
            java.lang.String r12 = "applySegment: prev set end, prev = "
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r12 = r12.concat(r13)
            com.ss.android.socialbase.downloader.m.j.cw(r4, r12)
            long r12 = r14.j()
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L17b
            goto L1b3
        L17b:
            int r11 = r11 + (-1)
            goto L110
        L17e:
            r18 = 1
            com.ss.android.socialbase.downloader.qv.jy r9 = r14.j
            long r10 = r7 - r18
            boolean r9 = r9.j(r10)
            if (r9 == 0) goto L19b
            r14.cw(r10)
            java.lang.String r9 = "applySegment: adjustSegmentEndOffset succeed, prev = "
            java.lang.String r10 = java.lang.String.valueOf(r14)
            java.lang.String r9 = r9.concat(r10)
            com.ss.android.socialbase.downloader.m.j.cw(r4, r9)
            goto L1b3
        L19b:
            java.lang.String r1 = "applySegment: adjustSegmentEndOffset filed, prev = "
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r1 = r1.concat(r2)
            com.ss.android.socialbase.downloader.m.j.up(r4, r1)
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            r2 = 4
            java.lang.String r3 = "prev end adjust fail"
            r1.<init>(r2, r3)
            throw r1
        L1b1:
            r18 = 1
        L1b3:
            int r3 = r3 + r6
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r6 = r0.az
            int r6 = r6.size()
        L1ba:
            if (r3 >= r6) goto L202
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r9 = r0.az
            java.lang.Object r9 = r9.get(r3)
            com.ss.android.socialbase.downloader.qv.g r9 = (com.ss.android.socialbase.downloader.qv.g) r9
            long r10 = r9.j()
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 > 0) goto L1d4
            com.ss.android.socialbase.downloader.qv.jy r10 = r9.j
            if (r10 == 0) goto L1d1
            goto L1d4
        L1d1:
            int r3 = r3 + 1
            goto L1ba
        L1d4:
            long r10 = r2.m()
            long r12 = r9.cw()
            int r3 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r3 <= 0) goto L1e4
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 < 0) goto L202
        L1e4:
            long r12 = r12 - r18
            r2.cw(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "applySegment: segment set end:"
            r3.<init>(r6)
            r3.append(r12)
            java.lang.String r6 = ", later = "
            r3.append(r6)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r4, r3)
        L202:
            long r9 = r2.m()
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 <= 0) goto L226
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 > 0) goto L217
            long r6 = r2.up()
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 > 0) goto L217
            goto L226
        L217:
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r5.concat(r2)
            r3 = 6
            r1.<init>(r3, r2)
            throw r1
        L226:
            r2.j = r1
            java.lang.String r1 = "applySegment: OK "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r1.concat(r2)
            com.ss.android.socialbase.downloader.m.j.cw(r4, r1)
            return
        L236:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r2 = " not exist! segmentIndex = "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r4, r1)
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            java.lang.String r2 = "segment not exist"
            r3 = 2
            r1.<init>(r3, r2)
            throw r1
        L256:
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            r2 = 5
            java.lang.String r3 = "applySegment"
            r1.<init>(r2, r3)
            throw r1
        L25f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r3 = " is already has an owner:"
            r1.append(r3)
            com.ss.android.socialbase.downloader.qv.jy r2 = r2.j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.up(r4, r1)
            com.ss.android.socialbase.downloader.qv.oq r1 = new com.ss.android.socialbase.downloader.qv.oq
            java.lang.String r2 = "segment already has an owner"
            r1.<init>(r6, r2)
            throw r1
    }

    private boolean vl() {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r2.tl
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.ss.android.socialbase.downloader.qv.jy r1 = (com.ss.android.socialbase.downloader.qv.jy) r1
            boolean r1 = r1.ae()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    private long w() {
            r9 = this;
            boolean r0 = r9.m
            if (r0 != 0) goto L40
            boolean r0 = r9.ae
            if (r0 == 0) goto L9
            goto L40
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r9)
            r9.xt(r0)     // Catch: java.lang.Throwable -> L38
            com.ss.android.socialbase.downloader.qv.ws r2 = r9.xt     // Catch: java.lang.Throwable -> L38
            long r2 = r2.qv()     // Catch: java.lang.Throwable -> L38
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3a
            long r6 = r9.ch     // Catch: java.lang.Throwable -> L38
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L3a
            long r4 = r0 - r6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L3a
            boolean r2 = r9.j(r0, r2)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            r9.ch = r0     // Catch: java.lang.Throwable -> L38
            int r0 = r9.a     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + 1
            r9.a = r0     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L3e
        L3a:
            r0 = 2000(0x7d0, double:9.88E-321)
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            return r0
        L3e:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            throw r0
        L40:
            r0 = -1
            return r0
    }

    private boolean ws() {
            r8 = this;
            long r0 = r8.jy
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto Lc
            r8.w = r4
            return r4
        Lc:
            monitor-enter(r8)
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r2 = r8.az     // Catch: java.lang.Throwable -> L2b
            long r2 = com.ss.android.socialbase.downloader.qv.az.j(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = "SegmentDispatcher"
            java.lang.String r6 = "isAllContentDownloaded: firstOffset = "
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L2b
            com.ss.android.socialbase.downloader.m.j.cw(r5, r6)     // Catch: java.lang.Throwable -> L2b
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L2d
            r0 = 1
            r8.w = r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r8.w = r4     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2b
            return r4
        L31:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private com.ss.android.socialbase.downloader.qv.g xt(com.ss.android.socialbase.downloader.qv.jy r7, com.ss.android.socialbase.downloader.qv.i r8) {
            r6 = this;
        L0:
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r0 = r6.ws
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L29
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r0 = r6.ws
            java.lang.Object r0 = r0.poll()
            com.ss.android.socialbase.downloader.qv.g r0 = (com.ss.android.socialbase.downloader.qv.g) r0
            if (r0 == 0) goto L0
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r4 = r6.az
            r6.j(r4, r0, r1)
            long r4 = r6.j(r0)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L28
            long r4 = r6.jy
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L0
        L28:
            return r0
        L29:
            r6.jy()
            com.ss.android.socialbase.downloader.qv.g r7 = r6.cw(r7, r8)
            if (r7 == 0) goto L40
            long r4 = r6.j(r7)
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L40
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r8 = r6.az
            r6.j(r8, r7, r1)
            return r7
        L40:
            com.ss.android.socialbase.downloader.qv.g r7 = r6.av()
            if (r7 == 0) goto L47
            return r7
        L47:
            r7 = 0
            return r7
    }

    private void xt(long r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.az.up r0 = r3.kt
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.j
            long r1 = r1.uq()
            r0.j(r1, r4)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r3.tl
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.ss.android.socialbase.downloader.qv.jy r1 = (com.ss.android.socialbase.downloader.qv.jy) r1
            r1.xt(r4)
            goto L11
        L21:
            return
    }

    private void xt(com.ss.android.socialbase.downloader.qv.jy r10, com.ss.android.socialbase.downloader.qv.g r11, com.ss.android.socialbase.downloader.qv.i r12, com.ss.android.socialbase.downloader.ae.m r13) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r9 = this;
            com.ss.android.socialbase.downloader.qv.jy r0 = r11.j
            if (r0 == 0) goto L10
            if (r0 != r10) goto L7
            goto L10
        L7:
            com.ss.android.socialbase.downloader.qv.oq r10 = new com.ss.android.socialbase.downloader.qv.oq
            r11 = 1
            java.lang.String r12 = "segment already has an owner"
            r10.<init>(r11, r12)
            throw r10
        L10:
            long r0 = r10.tl()
            long r2 = r11.up()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L12c
            boolean r10 = r13.xt()
            r0 = 0
            if (r10 != 0) goto L8c
            long r2 = r11.up()
            r10 = 1004(0x3ec, float:1.407E-42)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L6c
            java.lang.String r2 = "SegmentDispatcher"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "parseHttpResponse: segment.getCurrentOffsetRead = "
            r3.<init>(r4)
            long r4 = r11.up()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.up(r2, r3)
            boolean r2 = r13.j()
            if (r2 == 0) goto L4c
            goto L8c
        L4c:
            com.ss.android.socialbase.downloader.up.cw r12 = new com.ss.android.socialbase.downloader.up.cw
            int r0 = r13.cw
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "2: response code error : "
            r1.<init>(r2)
            int r13 = r13.cw
            r1.append(r13)
            java.lang.String r13 = " segment="
            r1.append(r13)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r12.<init>(r10, r0, r11)
            throw r12
        L6c:
            com.ss.android.socialbase.downloader.up.cw r12 = new com.ss.android.socialbase.downloader.up.cw
            int r0 = r13.cw
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "1: response code error : "
            r1.<init>(r2)
            int r13 = r13.cw
            r1.append(r13)
            java.lang.String r13 = " segment="
            r1.append(r13)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r12.<init>(r10, r0, r11)
            throw r12
        L8c:
            boolean r10 = r12.r
            if (r10 == 0) goto Le5
            com.ss.android.socialbase.downloader.ae.m r10 = r9.oq
            if (r10 != 0) goto L12b
            r9.oq = r13
            java.lang.Object r10 = r9.mi
            monitor-enter(r10)
            java.lang.Object r2 = r9.mi     // Catch: java.lang.Throwable -> Le2
            r2.notify()     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Le2
            com.ss.android.socialbase.downloader.ws.m r10 = r9.r
            if (r10 == 0) goto Lae
            java.lang.String r12 = r12.j
            com.ss.android.socialbase.downloader.g.ae r2 = r13.xt
            long r3 = r11.up()
            r10.j(r12, r2, r3)
        Lae:
            long r10 = r13.oq()
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 <= 0) goto L12b
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r12 = r9.az
            java.util.Iterator r12 = r12.iterator()
        Lbc:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L12b
            java.lang.Object r13 = r12.next()
            com.ss.android.socialbase.downloader.qv.g r13 = (com.ss.android.socialbase.downloader.qv.g) r13
            long r2 = r13.m()
            r4 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto Ldc
            long r2 = r13.m()
            long r6 = r10 - r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lbc
        Ldc:
            long r2 = r10 - r4
            r13.cw(r2)
            goto Lbc
        Le2:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Le2
            throw r11
        Le5:
            r9.j(r13)
            com.ss.android.socialbase.downloader.ae.m r10 = r9.qv
            if (r10 != 0) goto L12b
            r9.qv = r13
            com.ss.android.socialbase.downloader.ae.cw r10 = r9.j
            long r10 = r10.ka()
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L11e
            long r10 = r13.oq()
            java.lang.String r13 = "SegmentDispatcher"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkSegmentHttpResponse:len="
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = ",url="
            r0.append(r1)
            java.lang.String r12 = r12.j
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r13, r12)
            com.ss.android.socialbase.downloader.ae.cw r12 = r9.j
            r12.ae(r10)
        L11e:
            java.lang.Object r10 = r9.mi
            monitor-enter(r10)
            java.lang.Object r11 = r9.mi     // Catch: java.lang.Throwable -> L128
            r11.notify()     // Catch: java.lang.Throwable -> L128
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L128
            return
        L128:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L128
            throw r11
        L12b:
            return
        L12c:
            com.ss.android.socialbase.downloader.qv.oq r10 = new com.ss.android.socialbase.downloader.qv.oq
            r11 = 5
            java.lang.String r12 = "applySegment"
            r10.<init>(r11, r12)
            throw r10
    }

    private void xt(java.lang.String r4, java.util.List<com.ss.android.socialbase.downloader.qv.i> r5) {
            r3 = this;
            boolean r0 = r3.l
            if (r0 == 0) goto L24
            java.util.Iterator r0 = r5.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.ss.android.socialbase.downloader.qv.i r1 = (com.ss.android.socialbase.downloader.qv.i) r1
            java.lang.String r2 = "addIpListLocked: urlRecord = "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "SegmentDispatcher"
            com.bytedance.sdk.component.utils.vl.j(r2, r1)
            goto L8
        L24:
            com.ss.android.socialbase.downloader.qv.ws r0 = r3.xt
            int r0 = r0.vl()
            r1 = 1
            if (r0 == r1) goto L30
            r2 = 3
            if (r0 != r2) goto L45
        L30:
            int r4 = r3.j(r4)
            if (r4 < 0) goto L45
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r3.g
            int r0 = r0.size()
            if (r4 >= r0) goto L45
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r0 = r3.g
            int r4 = r4 + r1
            r0.addAll(r4, r5)
            return
        L45:
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r4 = r3.g
            r4.addAll(r5)
            return
    }

    private void xt(java.util.List<com.ss.android.socialbase.downloader.qv.g> r7) {
            r6 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.j
            long r0 = r0.ka()
            r6.jy = r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2b
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.j
            long r0 = r0.wq()
            r6.jy = r0
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "initSegments: getExpectFileLength = "
            r1.<init>(r4)
            long r4 = r6.jy
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
        L2b:
            monitor-enter(r6)
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r0 = r6.ws     // Catch: java.lang.Throwable -> L56
            r0.clear()     // Catch: java.lang.Throwable -> L56
            r0 = 0
            if (r7 == 0) goto L63
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L3b
            goto L63
        L3b:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L56
        L3f:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L58
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L56
            com.ss.android.socialbase.downloader.qv.g r1 = (com.ss.android.socialbase.downloader.qv.g) r1     // Catch: java.lang.Throwable -> L56
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r2 = r6.ws     // Catch: java.lang.Throwable -> L56
            com.ss.android.socialbase.downloader.qv.g r3 = new com.ss.android.socialbase.downloader.qv.g     // Catch: java.lang.Throwable -> L56
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L56
            r6.j(r2, r3, r0)     // Catch: java.lang.Throwable -> L56
            goto L3f
        L56:
            r7 = move-exception
            goto L86
        L58:
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r7 = r6.ws     // Catch: java.lang.Throwable -> L56
            r6.r(r7)     // Catch: java.lang.Throwable -> L56
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r7 = r6.ws     // Catch: java.lang.Throwable -> L56
            r6.cw(r7)     // Catch: java.lang.Throwable -> L56
            goto L6f
        L63:
            java.util.LinkedList<com.ss.android.socialbase.downloader.qv.g> r7 = r6.ws     // Catch: java.lang.Throwable -> L56
            com.ss.android.socialbase.downloader.qv.g r1 = new com.ss.android.socialbase.downloader.qv.g     // Catch: java.lang.Throwable -> L56
            r4 = -1
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L56
            r6.j(r7, r1, r0)     // Catch: java.lang.Throwable -> L56
        L6f:
            java.lang.String r7 = "SegmentDispatcher"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "initSegments: totalLength = "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L56
            long r1 = r6.jy     // Catch: java.lang.Throwable -> L56
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L56
            com.ss.android.socialbase.downloader.m.j.cw(r7, r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            return
        L86:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r7
    }

    static /* synthetic */ boolean xt(com.ss.android.socialbase.downloader.qv.qv r0) {
            boolean r0 = r0.ae
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void cw(com.ss.android.socialbase.downloader.qv.jy r4, com.ss.android.socialbase.downloader.qv.g r5) {
            r3 = this;
            monitor-enter(r3)
            com.ss.android.socialbase.downloader.qv.jy r0 = r5.j     // Catch: java.lang.Throwable -> L22
            if (r0 != r4) goto L24
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "unApplySegment "
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)     // Catch: java.lang.Throwable -> L22
            long r0 = r4.r()     // Catch: java.lang.Throwable -> L22
            r5.r(r0)     // Catch: java.lang.Throwable -> L22
            r0 = 0
            r5.j = r0     // Catch: java.lang.Throwable -> L22
            r4.j()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r4 = move-exception
            goto L26
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public com.ss.android.socialbase.downloader.qv.g j(com.ss.android.socialbase.downloader.qv.jy r2, com.ss.android.socialbase.downloader.qv.i r3) {
            r1 = this;
            boolean r0 = r1.m
            if (r0 != 0) goto L27
            boolean r0 = r1.ae
            if (r0 == 0) goto L9
            goto L27
        L9:
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.qv.g r2 = r1.xt(r2, r3)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            r2.tl()     // Catch: java.lang.Throwable -> L21
            int r3 = r2.oq()     // Catch: java.lang.Throwable -> L21
            r0 = 1
            if (r3 <= r0) goto L23
            com.ss.android.socialbase.downloader.qv.g r3 = new com.ss.android.socialbase.downloader.qv.g     // Catch: java.lang.Throwable -> L21
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            r2 = move-exception
            goto L25
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return r2
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
        L27:
            r2 = 0
            return r2
    }

    public void j() {
            r2 = this;
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "cancel"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            r0 = 1
            r2.m = r0
            monitor-enter(r2)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r2.tl     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.qv.jy r1 = (com.ss.android.socialbase.downloader.qv.jy) r1     // Catch: java.lang.Throwable -> L21
            r1.up()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r0 = move-exception
            goto L2f
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.qv.ae r0 = r2.up
            r0.j()
            com.ss.android.socialbase.downloader.qv.xt r0 = r2.cw
            r0.cw()
            return
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void j(com.ss.android.socialbase.downloader.qv.jy r3) {
            r2 = this;
            boolean r0 = r2.l
            if (r0 == 0) goto L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReaderRun, threadIndex = "
            r0.<init>(r1)
            int r3 = r3.cw
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "SegmentDispatcher"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r3)
        L19:
            return
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void j(com.ss.android.socialbase.downloader.qv.jy r1, com.ss.android.socialbase.downloader.qv.g r2) {
            r0 = this;
            monitor-enter(r0)
            r2.g()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void j(com.ss.android.socialbase.downloader.qv.jy r3, com.ss.android.socialbase.downloader.qv.g r4, com.ss.android.socialbase.downloader.qv.i r5, com.ss.android.socialbase.downloader.ae.m r6) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L3e
            boolean r0 = r2.ae     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L3e
            r2.xt(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r3.xt(r4)     // Catch: java.lang.Throwable -> L2b
            long r3 = r2.jy     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L31
            com.ss.android.socialbase.downloader.ae.cw r3 = r2.j     // Catch: java.lang.Throwable -> L2b
            long r3 = r3.ka()     // Catch: java.lang.Throwable -> L2b
            r2.jy = r3     // Catch: java.lang.Throwable -> L2b
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L2d
            long r3 = r6.oq()     // Catch: java.lang.Throwable -> L2b
            r2.jy = r3     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L46
        L2d:
            r2.up()     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L31:
            com.ss.android.socialbase.downloader.qv.ws r3 = r2.xt     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.m()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L3c
            r2.up()     // Catch: java.lang.Throwable -> L2b
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return
        L3e:
            com.ss.android.socialbase.downloader.qv.av r3 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "connected"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void j(com.ss.android.socialbase.downloader.qv.jy r3, com.ss.android.socialbase.downloader.qv.i r4, com.ss.android.socialbase.downloader.qv.g r5, com.ss.android.socialbase.downloader.up.j r6) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r4 = "SegmentDispatcher"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "onSegmentFailed: segment = "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r0.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = ", e = "
            r0.append(r5)     // Catch: java.lang.Throwable -> L27
            r0.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L27
            com.ss.android.socialbase.downloader.m.j.up(r4, r5)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r3.xt(r4)     // Catch: java.lang.Throwable -> L27
            int r3 = r3.cw     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L29
            r2.i = r6     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r3 = move-exception
            goto L3e
        L29:
            boolean r3 = r2.vl()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L3c
            com.ss.android.socialbase.downloader.up.j r3 = r2.i     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L35
            r2.i = r6     // Catch: java.lang.Throwable -> L27
        L35:
            r2.f = r4     // Catch: java.lang.Throwable -> L27
            com.ss.android.socialbase.downloader.up.j r3 = r2.i     // Catch: java.lang.Throwable -> L27
            r2.j(r3)     // Catch: java.lang.Throwable -> L27
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            return
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void j(com.ss.android.socialbase.downloader.qv.jy r1, com.ss.android.socialbase.downloader.qv.i r2, com.ss.android.socialbase.downloader.qv.g r3, com.ss.android.socialbase.downloader.up.j r4, int r5, int r6) {
            r0 = this;
            boolean r2 = com.ss.android.socialbase.downloader.az.m.xt(r4)
            int r3 = r4.j()
            r4 = 1047(0x417, float:1.467E-42)
            if (r3 == r4) goto L14
            r4 = 1074(0x432, float:1.505E-42)
            if (r3 == r4) goto L14
            r4 = 1055(0x41f, float:1.478E-42)
            if (r3 != r4) goto L15
        L14:
            r2 = 1
        L15:
            if (r2 != 0) goto L1b
            if (r5 < r6) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            r0.cw(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.g.cw.j
    public void j(java.lang.String r2, java.util.List<java.net.InetAddress> r3) {
            r1 = this;
            boolean r0 = r1.ae
            if (r0 != 0) goto L38
            boolean r0 = r1.m
            if (r0 == 0) goto L9
            goto L38
        L9:
            java.util.List r3 = r1.cw(r2, r3)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = 0
        L13:
            monitor-enter(r1)
            if (r3 == 0) goto L1c
            r1.xt(r2, r3)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L36
        L1c:
            r2 = 0
            r1.vl = r2     // Catch: java.lang.Throwable -> L1a
            com.ss.android.socialbase.downloader.qv.ws r2 = r1.xt     // Catch: java.lang.Throwable -> L1a
            java.util.List<com.ss.android.socialbase.downloader.qv.i> r3 = r1.g     // Catch: java.lang.Throwable -> L1a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L1a
            r2.j(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "SegmentDispatcher"
            java.lang.String r3 = "onDnsResolved: dispatchReadThread"
            com.bytedance.sdk.component.utils.vl.j(r2, r3)     // Catch: java.lang.Throwable -> L1a
            r1.up()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L38
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L38:
            return
    }

    public boolean j(java.util.List<com.ss.android.socialbase.downloader.qv.g> r7) throws com.ss.android.socialbase.downloader.up.j, java.lang.InterruptedException {
            r6 = this;
            java.lang.String r0 = "finally pause"
            java.lang.String r1 = "SegmentDispatcher"
            r6.m()     // Catch: java.lang.Throwable -> L54
            r6.xt(r7)     // Catch: java.lang.Throwable -> L54
            r6.up()     // Catch: java.lang.Throwable -> L54
            r6.ae()     // Catch: java.lang.Throwable -> L54
            r6.g()     // Catch: java.lang.Throwable -> L54
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54
            r6.cw()     // Catch: java.lang.Throwable -> L5f
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r2
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j     // Catch: java.lang.Throwable -> L54
            r7.xt(r4)     // Catch: java.lang.Throwable -> L54
            com.ss.android.socialbase.downloader.ae.cw r7 = r6.j     // Catch: java.lang.Throwable -> L54
            r7.j(r4)     // Catch: java.lang.Throwable -> L54
            boolean r7 = r6.ae     // Catch: java.lang.Throwable -> L54
            r2 = 1
            if (r7 != 0) goto L56
            boolean r7 = r6.m     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L33
            goto L56
        L33:
            com.ss.android.socialbase.downloader.ws.m r7 = r6.r     // Catch: java.lang.Throwable -> L54
            long r3 = r6.jy     // Catch: java.lang.Throwable -> L54
            r7.j(r3)     // Catch: java.lang.Throwable -> L54
            r6.tl()     // Catch: java.lang.Throwable -> L54
            r6.r()     // Catch: java.lang.Throwable -> L54
            boolean r7 = r6.ae
            if (r7 != 0) goto L4e
            boolean r7 = r6.m
            if (r7 != 0) goto L4e
        L48:
            com.ss.android.socialbase.downloader.m.j.cw(r1, r0)
            r6.xt()
        L4e:
            com.ss.android.socialbase.downloader.ws.up r7 = r6.tj
            r7.xt()
            return r2
        L54:
            r7 = move-exception
            goto L70
        L56:
            boolean r7 = r6.ae
            if (r7 != 0) goto L4e
            boolean r7 = r6.m
            if (r7 != 0) goto L4e
            goto L48
        L5f:
            r7 = move-exception
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r2
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.j     // Catch: java.lang.Throwable -> L54
            r2.xt(r4)     // Catch: java.lang.Throwable -> L54
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.j     // Catch: java.lang.Throwable -> L54
            r2.j(r4)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L70:
            boolean r2 = r6.ae
            if (r2 != 0) goto L7e
            boolean r2 = r6.m
            if (r2 != 0) goto L7e
            com.ss.android.socialbase.downloader.m.j.cw(r1, r0)
            r6.xt()
        L7e:
            com.ss.android.socialbase.downloader.ws.up r0 = r6.tj
            r0.xt()
            throw r7
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public com.ss.android.socialbase.downloader.qv.up r(com.ss.android.socialbase.downloader.qv.jy r3, com.ss.android.socialbase.downloader.qv.g r4) throws com.ss.android.socialbase.downloader.up.j {
            r2 = this;
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.qv.vl r3 = new com.ss.android.socialbase.downloader.qv.vl     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.j     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.qv.xt r1 = r2.cw     // Catch: java.lang.Throwable -> L15
            r3.<init>(r0, r1, r4)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.qv.ae r4 = r2.up     // Catch: java.lang.Throwable -> L15
            r4.j(r3)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.qv.up r3 = r3.j()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public void xt() {
            r2 = this;
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.String r1 = "pause1"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            r0 = 1
            r2.ae = r0
            monitor-enter(r2)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r2.tl     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.qv.jy r1 = (com.ss.android.socialbase.downloader.qv.jy) r1     // Catch: java.lang.Throwable -> L21
            r1.up()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r0 = move-exception
            goto L2f
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.qv.ae r0 = r2.up
            r0.xt()
            com.ss.android.socialbase.downloader.qv.xt r0 = r2.cw
            r0.cw()
            return
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void xt(com.ss.android.socialbase.downloader.qv.jy r4) {
            r3 = this;
            java.lang.String r0 = "SegmentDispatcher"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onReaderExit: threadIndex = "
            r1.<init>(r2)
            int r2 = r4.cw
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            monitor-enter(r3)
            r0 = 1
            r4.cw(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r3.tl     // Catch: java.lang.Throwable -> L4d
            r0.remove(r4)     // Catch: java.lang.Throwable -> L4d
            r3.jy()     // Catch: java.lang.Throwable -> L4d
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r4 = r3.tl     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r4 != 0) goto L4f
            boolean r4 = r3.ws()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L52
            java.lang.String r4 = "SegmentDispatcher"
            java.lang.String r0 = "onReaderExit: allContentDownloaded"
            com.bytedance.sdk.component.utils.vl.j(r4, r0)     // Catch: java.lang.Throwable -> L4d
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r4 = r3.tl     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4d
        L3d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L4d
            com.ss.android.socialbase.downloader.qv.jy r0 = (com.ss.android.socialbase.downloader.qv.jy) r0     // Catch: java.lang.Throwable -> L4d
            r0.up()     // Catch: java.lang.Throwable -> L4d
            goto L3d
        L4d:
            r4 = move-exception
            goto L54
        L4f:
            r3.qv()     // Catch: java.lang.Throwable -> L4d
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            return
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r4
    }

    @Override // com.ss.android.socialbase.downloader.qv.m
    public void xt(com.ss.android.socialbase.downloader.qv.jy r1, com.ss.android.socialbase.downloader.qv.g r2) throws com.ss.android.socialbase.downloader.up.j {
            r0 = this;
            monitor-enter(r0)
            r0.up(r1, r2)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }
}
