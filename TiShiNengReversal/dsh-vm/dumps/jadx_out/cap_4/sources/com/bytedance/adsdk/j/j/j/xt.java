package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.j.j.j.g<com.bytedance.adsdk.j.j.xt.j, com.bytedance.adsdk.j.j.xt.xt> {
    private com.bytedance.adsdk.j.j.xt.xt ae;
    private final android.graphics.Paint g;
    private final com.bytedance.adsdk.j.j.j.xt.j oq;
    private int tl;

    /* renamed from: com.bytedance.adsdk.j.j.j.xt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class j {
        java.nio.ByteBuffer cw;
        byte j;
        android.graphics.Rect xt;

        private j() {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.xt = r0
                return
        }

        /* synthetic */ j(com.bytedance.adsdk.j.j.j.xt.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public xt(com.bytedance.adsdk.j.j.cw.xt r2, com.bytedance.adsdk.j.j.j.g.j r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.g = r2
            com.bytedance.adsdk.j.j.j.xt$j r3 = new com.bytedance.adsdk.j.j.j.xt$j
            r0 = 0
            r3.<init>(r0)
            r1.oq = r3
            r3 = 1
            r2.setAntiAlias(r3)
            return
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected /* synthetic */ com.bytedance.adsdk.j.j.xt.j cw(com.bytedance.adsdk.j.j.xt.m r1) {
            r0 = this;
            com.bytedance.adsdk.j.j.xt.j r1 = r0.j(r1)
            return r1
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected void cw() {
            r2 = this;
            com.bytedance.adsdk.j.j.j.xt$j r0 = r2.oq
            r1 = 0
            r0.cw = r1
            r2.ae = r1
            return
    }

    protected android.graphics.Rect j(com.bytedance.adsdk.j.j.xt.j r12) throws java.io.IOException {
            r11 = this;
            java.util.List r0 = com.bytedance.adsdk.j.j.j.r.j(r12)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            byte[] r3 = new byte[r2]
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L14:
            boolean r8 = r0.hasNext()
            r9 = 1
            if (r8 == 0) goto L82
            java.lang.Object r8 = r0.next()
            com.bytedance.adsdk.j.j.j.up r8 = (com.bytedance.adsdk.j.j.j.up) r8
            boolean r10 = r8 instanceof com.bytedance.adsdk.j.j.j.j
            if (r10 == 0) goto L2d
            com.bytedance.adsdk.j.j.j.j r8 = (com.bytedance.adsdk.j.j.j.j) r8
            int r5 = r8.cw
            r11.tl = r5
            r5 = 1
            goto L14
        L2d:
            boolean r10 = r8 instanceof com.bytedance.adsdk.j.j.j.m
            if (r10 == 0) goto L42
            com.bytedance.adsdk.j.j.j.cw r4 = new com.bytedance.adsdk.j.j.j.cw
            com.bytedance.adsdk.j.j.j.m r8 = (com.bytedance.adsdk.j.j.j.m) r8
            r4.<init>(r12, r8)
            r4.up = r1
            r4.cw = r3
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r8 = r11.j
            r8.add(r4)
            goto L14
        L42:
            boolean r10 = r8 instanceof com.bytedance.adsdk.j.j.j.ae
            if (r10 == 0) goto L4e
            if (r4 == 0) goto L14
            java.util.List<com.bytedance.adsdk.j.j.j.up> r9 = r4.f1739r
            r9.add(r8)
            goto L14
        L4e:
            boolean r10 = r8 instanceof com.bytedance.adsdk.j.j.j.oq
            if (r10 == 0) goto L6d
            if (r5 != 0) goto L65
            com.bytedance.adsdk.j.j.j.jy r0 = new com.bytedance.adsdk.j.j.j.jy
            r0.<init>(r12)
            r0.tl = r6
            r0.g = r7
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r12 = r11.j
            r12.add(r0)
            r11.tl = r9
            goto L82
        L65:
            if (r4 == 0) goto L14
            java.util.List<com.bytedance.adsdk.j.j.j.up> r9 = r4.f1739r
            r9.add(r8)
            goto L14
        L6d:
            boolean r9 = r8 instanceof com.bytedance.adsdk.j.j.j.vl
            if (r9 == 0) goto L7a
            com.bytedance.adsdk.j.j.j.vl r8 = (com.bytedance.adsdk.j.j.j.vl) r8
            int r6 = r8.xt
            int r7 = r8.cw
            byte[] r3 = r8.tl
            goto L14
        L7a:
            boolean r9 = r8 instanceof com.bytedance.adsdk.j.j.j.qv
            if (r9 != 0) goto L14
            r1.add(r8)
            goto L14
        L82:
            int r12 = r6 * r7
            int r0 = r11.cw
            int r0 = r0 * r0
            int r0 = r12 / r0
            int r0 = r0 + r9
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r11.up = r0
            com.bytedance.adsdk.j.j.j.xt$j r0 = r11.oq
            int r1 = r11.cw
            int r1 = r1 * r1
            int r12 = r12 / r1
            int r12 = r12 + r9
            int r12 = r12 * 4
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
            r0.cw = r12
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>(r2, r2, r6, r7)
            return r12
    }

    protected com.bytedance.adsdk.j.j.xt.j j(com.bytedance.adsdk.j.j.xt.m r2) {
            r1 = this;
            com.bytedance.adsdk.j.j.xt.j r0 = new com.bytedance.adsdk.j.j.xt.j
            r0.<init>(r2)
            return r0
    }

    protected com.bytedance.adsdk.j.j.xt.xt j() {
            r1 = this;
            com.bytedance.adsdk.j.j.xt.xt r0 = r1.ae
            if (r0 != 0) goto Lb
            com.bytedance.adsdk.j.j.xt.xt r0 = new com.bytedance.adsdk.j.j.xt.xt
            r0.<init>()
            r1.ae = r0
        Lb:
            com.bytedance.adsdk.j.j.xt.xt r0 = r1.ae
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected void j(com.bytedance.adsdk.j.j.j.tl<com.bytedance.adsdk.j.j.xt.j, com.bytedance.adsdk.j.j.xt.xt> r10) {
            r9 = this;
            if (r10 == 0) goto L109
            android.graphics.Rect r0 = r9.f1740m
            if (r0 != 0) goto L8
            goto L109
        L8:
            android.graphics.Rect r0 = r9.f1740m     // Catch: java.lang.Exception -> L34
            int r0 = r0.width()     // Catch: java.lang.Exception -> L34
            int r1 = r9.cw     // Catch: java.lang.Exception -> L34
            int r0 = r0 / r1
            android.graphics.Rect r1 = r9.f1740m     // Catch: java.lang.Exception -> L34
            int r1 = r1.height()     // Catch: java.lang.Exception -> L34
            int r2 = r9.cw     // Catch: java.lang.Exception -> L34
            int r1 = r1 / r2
            android.graphics.Bitmap r0 = r9.j(r0, r1)     // Catch: java.lang.Exception -> L34
            java.util.Map<android.graphics.Bitmap, android.graphics.Canvas> r1 = r9.f1741r     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L34
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto L32
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L34
            r1.<init>(r0)     // Catch: java.lang.Exception -> L34
            java.util.Map<android.graphics.Bitmap, android.graphics.Canvas> r2 = r9.f1741r     // Catch: java.lang.Exception -> L34
            r2.put(r0, r1)     // Catch: java.lang.Exception -> L34
        L32:
            r2 = r1
            goto L38
        L34:
            r0 = move-exception
            r10 = r0
            goto L106
        L38:
            boolean r1 = r10 instanceof com.bytedance.adsdk.j.j.j.cw     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto Ldd
            java.nio.ByteBuffer r1 = r9.up     // Catch: java.lang.Exception -> L34
            r1.rewind()     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r1 = r9.up     // Catch: java.lang.Exception -> L34
            r0.copyPixelsFromBuffer(r1)     // Catch: java.lang.Exception -> L34
            int r1 = r9.xt     // Catch: java.lang.Exception -> L34
            r3 = 2
            r4 = 0
            if (r1 != 0) goto L52
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Exception -> L34
            r2.drawColor(r4, r1)     // Catch: java.lang.Exception -> L34
            goto L7b
        L52:
            r2.save()     // Catch: java.lang.Exception -> L34
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            android.graphics.Rect r1 = r1.xt     // Catch: java.lang.Exception -> L34
            r2.clipRect(r1)     // Catch: java.lang.Exception -> L34
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            byte r5 = r1.j     // Catch: java.lang.Exception -> L34
            r6 = 1
            if (r5 == r6) goto L73
            if (r5 == r3) goto L66
            goto L78
        L66:
            java.nio.ByteBuffer r1 = r1.cw     // Catch: java.lang.Exception -> L34
            r1.rewind()     // Catch: java.lang.Exception -> L34
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r1 = r1.cw     // Catch: java.lang.Exception -> L34
            r0.copyPixelsFromBuffer(r1)     // Catch: java.lang.Exception -> L34
            goto L78
        L73:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Exception -> L34
            r2.drawColor(r4, r1)     // Catch: java.lang.Exception -> L34
        L78:
            r2.restore()     // Catch: java.lang.Exception -> L34
        L7b:
            r1 = r10
            com.bytedance.adsdk.j.j.j.cw r1 = (com.bytedance.adsdk.j.j.j.cw) r1     // Catch: java.lang.Exception -> L34
            byte r1 = r1.xt     // Catch: java.lang.Exception -> L34
            if (r1 != r3) goto L94
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            byte r5 = r1.j     // Catch: java.lang.Exception -> L34
            if (r5 == r3) goto L94
            java.nio.ByteBuffer r1 = r1.cw     // Catch: java.lang.Exception -> L34
            r1.rewind()     // Catch: java.lang.Exception -> L34
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r1 = r1.cw     // Catch: java.lang.Exception -> L34
            r0.copyPixelsToBuffer(r1)     // Catch: java.lang.Exception -> L34
        L94:
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            r3 = r10
            com.bytedance.adsdk.j.j.j.cw r3 = (com.bytedance.adsdk.j.j.j.cw) r3     // Catch: java.lang.Exception -> L34
            byte r3 = r3.xt     // Catch: java.lang.Exception -> L34
            r1.j = r3     // Catch: java.lang.Exception -> L34
            r2.save()     // Catch: java.lang.Exception -> L34
            r1 = r10
            com.bytedance.adsdk.j.j.j.cw r1 = (com.bytedance.adsdk.j.j.j.cw) r1     // Catch: java.lang.Exception -> L34
            byte r1 = r1.j     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto Lc1
            int r1 = r10.oq     // Catch: java.lang.Exception -> L34
            int r3 = r9.cw     // Catch: java.lang.Exception -> L34
            int r5 = r1 / r3
            int r6 = r10.qv     // Catch: java.lang.Exception -> L34
            int r7 = r6 / r3
            int r8 = r10.tl     // Catch: java.lang.Exception -> L34
            int r1 = r1 + r8
            int r1 = r1 / r3
            int r8 = r10.g     // Catch: java.lang.Exception -> L34
            int r6 = r6 + r8
            int r6 = r6 / r3
            r2.clipRect(r5, r7, r1, r6)     // Catch: java.lang.Exception -> L34
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Exception -> L34
            r2.drawColor(r4, r1)     // Catch: java.lang.Exception -> L34
        Lc1:
            com.bytedance.adsdk.j.j.j.xt$j r1 = r9.oq     // Catch: java.lang.Exception -> L34
            android.graphics.Rect r1 = r1.xt     // Catch: java.lang.Exception -> L34
            int r3 = r10.oq     // Catch: java.lang.Exception -> L34
            int r4 = r9.cw     // Catch: java.lang.Exception -> L34
            int r5 = r3 / r4
            int r6 = r10.qv     // Catch: java.lang.Exception -> L34
            int r7 = r6 / r4
            int r8 = r10.tl     // Catch: java.lang.Exception -> L34
            int r3 = r3 + r8
            int r3 = r3 / r4
            int r8 = r10.g     // Catch: java.lang.Exception -> L34
            int r6 = r6 + r8
            int r6 = r6 / r4
            r1.set(r5, r7, r3, r6)     // Catch: java.lang.Exception -> L34
            r2.restore()     // Catch: java.lang.Exception -> L34
        Ldd:
            int r1 = r10.tl     // Catch: java.lang.Exception -> L34
            int r3 = r10.g     // Catch: java.lang.Exception -> L34
            android.graphics.Bitmap r5 = r9.j(r1, r3)     // Catch: java.lang.Exception -> L34
            android.graphics.Paint r3 = r9.g     // Catch: java.lang.Exception -> L34
            int r4 = r9.cw     // Catch: java.lang.Exception -> L34
            com.bytedance.adsdk.j.j.xt.xt r6 = r9.j()     // Catch: java.lang.Exception -> L34
            r1 = r10
            android.graphics.Bitmap r10 = r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L34
            r9.j(r10)     // Catch: java.lang.Exception -> L34
            r9.j(r5)     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r10 = r9.up     // Catch: java.lang.Exception -> L34
            r10.rewind()     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r10 = r9.up     // Catch: java.lang.Exception -> L34
            r0.copyPixelsToBuffer(r10)     // Catch: java.lang.Exception -> L34
            r9.j(r0)     // Catch: java.lang.Exception -> L34
            return
        L106:
            com.bytedance.sdk.component.utils.vl.j(r10)
        L109:
            return
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected /* synthetic */ com.bytedance.adsdk.j.j.xt.xt r() {
            r1 = this;
            com.bytedance.adsdk.j.j.xt.xt r0 = r1.j()
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected int xt() {
            r1 = this;
            int r0 = r1.tl
            return r0
    }

    @Override // com.bytedance.adsdk.j.j.j.g
    protected /* synthetic */ android.graphics.Rect xt(com.bytedance.adsdk.j.j.xt.j r1) throws java.io.IOException {
            r0 = this;
            com.bytedance.adsdk.j.j.xt.j r1 = (com.bytedance.adsdk.j.j.xt.j) r1
            android.graphics.Rect r1 = r0.j(r1)
            return r1
    }
}
