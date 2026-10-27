package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class xt implements java.lang.Runnable {
    private static final java.lang.String j = "xt";
    private final com.ss.android.socialbase.downloader.ws.m ae;
    private com.ss.android.socialbase.downloader.ae.xt cw;
    private com.ss.android.socialbase.downloader.downloader.vl g;
    private com.ss.android.socialbase.downloader.ae.cw m;
    private volatile boolean oq;
    private volatile boolean qv;
    private com.ss.android.socialbase.downloader.downloader.up r;
    private com.ss.android.socialbase.downloader.g.g tl;
    private final com.ss.android.socialbase.downloader.ae.r up;
    private boolean vl;
    private com.ss.android.socialbase.downloader.ae.xt xt;

    static {
            return
    }

    public xt(com.ss.android.socialbase.downloader.ae.xt r1, com.ss.android.socialbase.downloader.ae.r r2, com.ss.android.socialbase.downloader.g.g r3, com.ss.android.socialbase.downloader.ws.m r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            r0.tl = r3
            return
    }

    public xt(com.ss.android.socialbase.downloader.ae.xt r2, com.ss.android.socialbase.downloader.ae.r r3, com.ss.android.socialbase.downloader.ws.m r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.vl = r0
            r1.cw = r2
            r1.up = r3
            if (r3 == 0) goto L12
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.j()
            r1.m = r2
        L12:
            r1.ae = r4
            com.ss.android.socialbase.downloader.downloader.vl r2 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r1.g = r2
            com.ss.android.socialbase.downloader.ae.xt r2 = r1.cw
            r2.j(r1)
            return
    }

    private java.lang.String cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.m
            java.lang.String r0 = r0.ol()
            return r0
    }

    private void j(com.ss.android.socialbase.downloader.ae.xt r10, long r11) {
            r9 = this;
            boolean r0 = r10.r()
            if (r0 == 0) goto Lb
            com.ss.android.socialbase.downloader.ae.xt r0 = r10.up()
            goto Lc
        Lb:
            r0 = r10
        Lc:
            if (r0 == 0) goto L37
            boolean r10 = r0.tl()
            if (r10 == 0) goto L21
            com.ss.android.socialbase.downloader.downloader.vl r10 = r9.g
            int r1 = r0.qv()
            int r2 = r0.xt()
            r10.j(r1, r2, r11)
        L21:
            r0.xt(r11)
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.g
            int r4 = r0.qv()
            int r5 = r0.mi()
            int r6 = r0.xt()
            r7 = r11
            r3.j(r4, r5, r6, r7)
            return
        L37:
            r7 = r11
            boolean r11 = r10.r()
            if (r11 == 0) goto L4b
            com.ss.android.socialbase.downloader.downloader.vl r11 = r9.g
            int r12 = r10.qv()
            int r10 = r10.mi()
            r11.j(r12, r10, r7)
        L4b:
            return
    }

    private boolean j(com.ss.android.socialbase.downloader.ae.xt r28) {
            r27 = this;
            r1 = r27
            r6 = r28
        L4:
            boolean r0 = r6.r()
            if (r0 == 0) goto L22
            boolean r0 = r6.m()
            if (r0 == 0) goto L22
            com.ss.android.socialbase.downloader.ae.xt r0 = r6.up()
            if (r0 == 0) goto L22
            int r2 = r0.mi()
            int r3 = r6.mi()
            if (r2 != r3) goto L22
        L20:
            r8 = r0
            goto L24
        L22:
            r0 = 0
            goto L20
        L24:
            r9 = 1
            if (r8 == 0) goto L2e
            boolean r0 = r8.g()
            if (r0 == 0) goto L2e
            return r9
        L2e:
            long r2 = r6.ws()
            long r4 = r6.av()
            long r10 = r6.ws()
            if (r8 == 0) goto L48
            long r10 = r8.ws()
            long r2 = r8.ws()
            long r4 = r8.av()
        L48:
            r14 = r2
            r16 = r4
            r18 = 0
            r2 = 0
            boolean r0 = r1.up()     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r0 == 0) goto L58
            r1.r()
            return r2
        L58:
            java.lang.String r4 = r1.cw()     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            r1.vl = r0     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            r6.xt(r0)     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            r3 = 300(0x12c, float:4.2E-43)
            r5 = 200(0xc8, float:2.8E-43)
            boolean r0 = r1.vl     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            if (r0 != 0) goto Lb5
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            java.util.List r12 = r0.uf()     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            java.lang.String r13 = r0.u()     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            java.util.List r0 = com.ss.android.socialbase.downloader.az.m.j(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.up r7 = new com.ss.android.socialbase.downloader.ae.up     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            java.lang.String r12 = "Chunk-Index"
            int r13 = r6.mi()     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            r7.<init>(r12, r13)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            r0.add(r7)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.cw r7 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.az.m.j(r0, r7)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.cw r7 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.az.m.xt(r0, r7)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.cw r7 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            boolean r7 = r7.az()     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.ae.cw r12 = r1.m     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            int r12 = r12.ed()     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            com.ss.android.socialbase.downloader.g.g r0 = com.ss.android.socialbase.downloader.downloader.cw.j(r7, r12, r4, r0)     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            r1.tl = r0     // Catch: java.lang.Throwable -> Laf com.ss.android.socialbase.downloader.up.j -> Lb1
            goto Lb5
        Laf:
            r0 = move-exception
            goto Lda
        Lb1:
            r0 = move-exception
            r12 = 0
            goto L191
        Lb5:
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
            if (r0 == 0) goto Lf4
            com.ss.android.socialbase.downloader.ws.m r7 = r1.ae     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
            if (r7 == 0) goto Lf4
            int r0 = r0.xt()     // Catch: java.lang.Throwable -> Lcd
            if (r0 < r5) goto Lc5
            if (r0 < r3) goto Lf4
        Lc5:
            com.ss.android.socialbase.downloader.ws.m r0 = r1.ae     // Catch: java.lang.Throwable -> Lcd
            com.ss.android.socialbase.downloader.g.g r3 = r1.tl     // Catch: java.lang.Throwable -> Lcd
        Lc9:
            r0.j(r3)     // Catch: java.lang.Throwable -> Lcd
            goto Lf4
        Lcd:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
            goto Lf4
        Ld2:
            r0 = move-exception
            r12 = 0
            goto L1b1
        Ld6:
            r0 = move-exception
            r12 = 0
            goto L1ce
        Lda:
            java.lang.String r7 = "ChunkRunnableConnection"
            com.ss.android.socialbase.downloader.az.m.j(r0, r7)     // Catch: java.lang.Throwable -> L18d
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r0 == 0) goto Lf4
            com.ss.android.socialbase.downloader.ws.m r7 = r1.ae     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
            if (r7 == 0) goto Lf4
            int r0 = r0.xt()     // Catch: java.lang.Throwable -> Lcd
            if (r0 < r5) goto Lef
            if (r0 < r3) goto Lf4
        Lef:
            com.ss.android.socialbase.downloader.ws.m r0 = r1.ae     // Catch: java.lang.Throwable -> Lcd
            com.ss.android.socialbase.downloader.g.g r3 = r1.tl     // Catch: java.lang.Throwable -> Lcd
            goto Lc9
        Lf4:
            boolean r0 = r1.up()     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r0 == 0) goto Lfe
            r1.r()
            return r2
        Lfe:
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r0 == 0) goto L17d
            boolean r3 = r1.vl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            if (r3 != 0) goto L110
            int r0 = r0.xt()     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            boolean r3 = com.ss.android.socialbase.downloader.az.m.r(r0)     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            if (r3 == 0) goto L112
        L110:
            r3 = 0
            goto L133
        L112:
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            java.lang.String r5 = "Http response error , code is : %s "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            r7[r2] = r0     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            r5 = 1002(0x3ea, float:1.404E-42)
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
            throw r3     // Catch: java.lang.Throwable -> L128 com.ss.android.socialbase.downloader.up.j -> L12a
        L128:
            r0 = move-exception
            goto L12c
        L12a:
            r0 = move-exception
            goto L132
        L12c:
            java.lang.String r3 = "ChunkRunnableGetResponseCode"
            com.ss.android.socialbase.downloader.az.m.j(r0, r3)     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
            goto L110
        L132:
            throw r0     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> Ld6
        L133:
            com.ss.android.socialbase.downloader.downloader.up r2 = new com.ss.android.socialbase.downloader.downloader.up     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            r5 = 0
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.m     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            r7 = 0
            com.ss.android.socialbase.downloader.g.g r5 = r1.tl     // Catch: java.lang.Throwable -> Ld2 com.ss.android.socialbase.downloader.up.j -> L17a
            r12 = 0
            com.ss.android.socialbase.downloader.ws.m r7 = r1.ae     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            r1.r = r2     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            if (r8 == 0) goto L16e
            long r2 = r8.cw(r12)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L157
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L157
            long r16 = r16 - r14
            r2 = 1
            long r2 = r16 + r2
        L157:
            r25 = r2
            com.ss.android.socialbase.downloader.downloader.up r0 = r1.r     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            long r21 = r8.ws()     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            long r23 = r8.av()     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            r20 = r0
            r20.j(r21, r23, r25)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            goto L16e
        L169:
            r0 = move-exception
            goto L1b1
        L16b:
            r0 = move-exception
        L16c:
            r2 = 0
            goto L1ce
        L16e:
            com.ss.android.socialbase.downloader.downloader.up r0 = r1.r     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L177
            r0.r()     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L177
            r1.r()
            return r9
        L177:
            r0 = move-exception
            r2 = 1
            goto L1ce
        L17a:
            r0 = move-exception
            r12 = 0
            goto L16c
        L17d:
            r12 = 0
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            java.lang.String r3 = "download can't continue, chunk connection is null"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            r3 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            throw r0     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
        L18d:
            r0 = move-exception
            r12 = 0
        L18f:
            r2 = r0
            goto L194
        L191:
            throw r0     // Catch: java.lang.Throwable -> L192
        L192:
            r0 = move-exception
            goto L18f
        L194:
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            if (r0 == 0) goto L1b0
            com.ss.android.socialbase.downloader.ws.m r4 = r1.ae     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
            if (r4 == 0) goto L1b0
            int r0 = r0.xt()     // Catch: java.lang.Throwable -> L1ac
            if (r0 < r5) goto L1a4
            if (r0 < r3) goto L1b0
        L1a4:
            com.ss.android.socialbase.downloader.ws.m r0 = r1.ae     // Catch: java.lang.Throwable -> L1ac
            com.ss.android.socialbase.downloader.g.g r3 = r1.tl     // Catch: java.lang.Throwable -> L1ac
            r0.j(r3)     // Catch: java.lang.Throwable -> L1ac
            goto L1b0
        L1ac:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
        L1b0:
            throw r2     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16b
        L1b1:
            boolean r2 = r1.up()     // Catch: java.lang.Throwable -> L1c1
            if (r2 == 0) goto L1bb
            r1.r()
            return r9
        L1bb:
            java.lang.String r2 = "downloadChunkInner"
            com.ss.android.socialbase.downloader.az.m.j(r0, r2)     // Catch: java.lang.Throwable -> L1c1 com.ss.android.socialbase.downloader.up.j -> L1c4
            goto L1ca
        L1c1:
            r0 = move-exception
            goto L29b
        L1c4:
            r0 = move-exception
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.xt(r0)     // Catch: java.lang.Throwable -> L1c1
        L1ca:
            r1.r()
            return r12
        L1ce:
            boolean r3 = r1.up()     // Catch: java.lang.Throwable -> L1c1
            if (r3 == 0) goto L1d8
            r1.r()
            return r9
        L1d8:
            boolean r3 = com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Throwable -> L1c1
            if (r3 == 0) goto L1e7
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.j(r0, r12)     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            return r12
        L1e7:
            com.ss.android.socialbase.downloader.ws.m r3 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            boolean r3 = r3.j(r0)     // Catch: java.lang.Throwable -> L1c1
            if (r3 == 0) goto L269
            boolean r3 = com.ss.android.socialbase.downloader.az.m.j(r0)     // Catch: java.lang.Throwable -> L1c1
            if (r3 == 0) goto L1fe
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.j(r0, r9)     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            return r12
        L1fe:
            if (r2 == 0) goto L229
            com.ss.android.socialbase.downloader.downloader.up r2 = r1.r     // Catch: java.lang.Throwable -> L1c1
            if (r2 == 0) goto L238
            r2 = 32
            boolean r2 = com.ss.android.socialbase.downloader.az.j.j(r2)     // Catch: java.lang.Throwable -> L1c1
            if (r2 == 0) goto L22c
            com.ss.android.socialbase.downloader.downloader.up r2 = r1.r     // Catch: java.lang.Throwable -> L1c1
            long r2 = r2.j()     // Catch: java.lang.Throwable -> L1c1
            com.ss.android.socialbase.downloader.downloader.up r4 = r1.r     // Catch: java.lang.Throwable -> L1c1
            long r4 = r4.up()     // Catch: java.lang.Throwable -> L1c1
            long r2 = r2 - r4
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 <= 0) goto L227
            com.ss.android.socialbase.downloader.downloader.up r4 = r1.r     // Catch: java.lang.Throwable -> L1c1
            long r4 = r4.up()     // Catch: java.lang.Throwable -> L1c1
            r1.j(r6, r4)     // Catch: java.lang.Throwable -> L1c1
            goto L241
        L227:
            if (r4 >= 0) goto L241
        L229:
            r2 = r18
            goto L241
        L22c:
            com.ss.android.socialbase.downloader.downloader.up r2 = r1.r     // Catch: java.lang.Throwable -> L1c1
            long r2 = r2.j()     // Catch: java.lang.Throwable -> L1c1
            long r18 = r2 - r10
            r1.j(r6, r10)     // Catch: java.lang.Throwable -> L1c1
            goto L229
        L238:
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.xt(r0)     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            return r12
        L241:
            r4 = 16
            boolean r4 = com.ss.android.socialbase.downloader.az.j.j(r4)     // Catch: java.lang.Throwable -> L1c1
            if (r4 == 0) goto L250
            com.ss.android.socialbase.downloader.ws.m r4 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            com.ss.android.socialbase.downloader.up.g r0 = r4.j(r6, r0, r2)     // Catch: java.lang.Throwable -> L1c1
            goto L256
        L250:
            com.ss.android.socialbase.downloader.ws.m r4 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            com.ss.android.socialbase.downloader.up.g r0 = r4.j(r0, r2)     // Catch: java.lang.Throwable -> L1c1
        L256:
            com.ss.android.socialbase.downloader.up.g r2 = com.ss.android.socialbase.downloader.up.g.j     // Catch: java.lang.Throwable -> L1c1
            if (r0 != r2) goto L25e
            r1.r()
            return r12
        L25e:
            r6.xt(r12)     // Catch: java.lang.Throwable -> L1c1
            r1.r()     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            goto L4
        L269:
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.m     // Catch: java.lang.Throwable -> L1c1
            boolean r2 = r2.zs()     // Catch: java.lang.Throwable -> L1c1
            if (r2 == 0) goto L292
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.m     // Catch: java.lang.Throwable -> L1c1
            boolean r2 = r2.qg()     // Catch: java.lang.Throwable -> L1c1
            if (r2 != 0) goto L292
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.m     // Catch: java.lang.Throwable -> L1c1
            int r2 = r2.kj()     // Catch: java.lang.Throwable -> L1c1
            if (r2 <= r9) goto L292
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.m     // Catch: java.lang.Throwable -> L1c1
            boolean r2 = com.ss.android.socialbase.downloader.az.m.j(r0, r2)     // Catch: java.lang.Throwable -> L1c1
            if (r2 == 0) goto L292
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.cw(r0)     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            return r12
        L292:
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ae     // Catch: java.lang.Throwable -> L1c1
            r2.xt(r0)     // Catch: java.lang.Throwable -> L1c1
            r1.r()
            return r12
        L29b:
            r1.r()
            throw r0
    }

    private void r() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.tl
            if (r0 == 0) goto La
            r0.r()
            r0 = 0
            r1.tl = r0
        La:
            return
    }

    private boolean up() {
            r1 = this;
            boolean r0 = r1.oq
            if (r0 != 0) goto Lb
            boolean r0 = r1.qv
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public void j() {
            r1 = this;
            r0 = 1
            r1.oq = r0
            com.ss.android.socialbase.downloader.downloader.up r0 = r1.r
            if (r0 == 0) goto La
            r0.xt()
        La:
            return
    }

    public void j(long r2, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.up r0 = r1.r
            if (r0 != 0) goto L5
            return
        L5:
            r0.j(r2, r4)
            return
    }

    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"DefaultLocale"})
    public void run() {
            r3 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.ss.android.socialbase.downloader.ae.xt r0 = r3.cw
            r3.xt = r0
        L9:
            r0 = 0
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            r1.j(r3)     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r3.j(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            r1.j(r0)     // Catch: java.lang.Throwable -> L1d
            goto L4d
        L1d:
            r1 = move-exception
            goto L5d
        L1f:
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            r1.j(r0)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r3.up()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L4d
            com.ss.android.socialbase.downloader.ws.m r1 = r3.ae     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.ae.xt r2 = r3.xt     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.mi()     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.ae.xt r1 = r1.j(r2)     // Catch: java.lang.Throwable -> L1d
            r3.xt = r1     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r3.up()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L4d
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L4d
            r1 = 50
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L48
            goto L9
        L48:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L1d
            goto L9
        L4d:
            com.ss.android.socialbase.downloader.ae.xt r1 = r3.xt
            if (r1 == 0) goto L54
            r1.j(r0)
        L54:
            r3.r()
            com.ss.android.socialbase.downloader.ws.m r0 = r3.ae
            r0.j(r3)
            return
        L5d:
            com.ss.android.socialbase.downloader.ae.xt r2 = r3.xt
            if (r2 == 0) goto L64
            r2.j(r0)
        L64:
            r3.r()
            com.ss.android.socialbase.downloader.ws.m r0 = r3.ae
            r0.j(r3)
            throw r1
    }

    public void xt() {
            r1 = this;
            r0 = 1
            r1.qv = r0
            com.ss.android.socialbase.downloader.downloader.up r0 = r1.r
            if (r0 == 0) goto La
            r0.cw()
        La:
            return
    }
}
