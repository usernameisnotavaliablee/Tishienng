package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bytedance.adsdk.j.j.j.tl<com.bytedance.adsdk.j.j.xt.j, com.bytedance.adsdk.j.j.xt.xt> {
    private static final byte[] av = null;
    private static final byte[] az = null;
    private static final java.lang.ThreadLocal<java.util.zip.CRC32> i = null;

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f1738m = true;
    byte[] cw;
    public final byte j;

    /* renamed from: r, reason: collision with root package name */
    java.util.List<com.bytedance.adsdk.j.j.j.up> f1739r;
    java.util.List<com.bytedance.adsdk.j.j.j.up> up;
    public final byte xt;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            com.bytedance.adsdk.j.j.j.cw.az = r0
            r0 = 12
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126} // fill-array
            com.bytedance.adsdk.j.j.j.cw.av = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.bytedance.adsdk.j.j.j.cw.i = r0
            return
    }

    public cw(com.bytedance.adsdk.j.j.xt.j r3, com.bytedance.adsdk.j.j.j.m r4) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f1739r = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.up = r3
            byte r3 = r4.ws
            r2.j = r3
            byte r3 = r4.jy
            r2.xt = r3
            short r3 = r4.qv
            int r3 = r3 * 1000
            short r0 = r4.vl
            r1 = 100
            if (r0 != 0) goto L25
            r0 = 100
        L25:
            int r3 = r3 / r0
            r2.vl = r3
            r0 = 10
            if (r3 >= r0) goto L2e
            r2.vl = r1
        L2e:
            int r3 = r4.cw
            r2.tl = r3
            int r3 = r4.tl
            r2.g = r3
            int r3 = r4.g
            r2.oq = r3
            int r3 = r4.oq
            r2.qv = r3
            return
    }

    private int j(com.bytedance.adsdk.j.j.xt.xt r10) throws java.io.IOException {
            r9 = this;
            java.util.List<com.bytedance.adsdk.j.j.j.up> r0 = r9.up
            java.util.Iterator r0 = r0.iterator()
            r1 = 33
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r0.next()
            com.bytedance.adsdk.j.j.j.up r2 = (com.bytedance.adsdk.j.j.j.up) r2
            int r2 = r2.f1745r
            int r2 = r2 + 12
            int r1 = r1 + r2
            goto L8
        L1a:
            java.util.List<com.bytedance.adsdk.j.j.j.up> r0 = r9.f1739r
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            com.bytedance.adsdk.j.j.j.up r2 = (com.bytedance.adsdk.j.j.j.up) r2
            boolean r3 = r2 instanceof com.bytedance.adsdk.j.j.j.oq
            if (r3 == 0) goto L36
            int r2 = r2.f1745r
            int r2 = r2 + 12
        L34:
            int r1 = r1 + r2
            goto L20
        L36:
            boolean r3 = r2 instanceof com.bytedance.adsdk.j.j.j.ae
            if (r3 == 0) goto L20
            int r2 = r2.f1745r
            int r2 = r2 + 8
            goto L34
        L3f:
            byte[] r0 = com.bytedance.adsdk.j.j.j.cw.av
            int r0 = r0.length
            int r1 = r1 + r0
            r10.cw(r1)
            byte[] r0 = com.bytedance.adsdk.j.j.j.cw.az
            r10.j(r0)
            r0 = 13
            r10.xt(r0)
            int r0 = r10.j()
            int r2 = com.bytedance.adsdk.j.j.j.vl.j
            r10.j(r2)
            int r2 = r9.tl
            r10.xt(r2)
            int r2 = r9.g
            r10.xt(r2)
            byte[] r2 = r9.cw
            r10.j(r2)
            java.util.zip.CRC32 r2 = r9.j()
            r2.reset()
            byte[] r3 = r10.xt()
            r4 = 17
            r2.update(r3, r0, r4)
            long r3 = r2.getValue()
            int r0 = (int) r3
            r10.xt(r0)
            java.util.List<com.bytedance.adsdk.j.j.j.up> r0 = r9.up
            java.util.Iterator r0 = r0.iterator()
        L86:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lc2
            java.lang.Object r3 = r0.next()
            com.bytedance.adsdk.j.j.j.up r3 = (com.bytedance.adsdk.j.j.j.up) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.j.j.j.qv
            if (r4 != 0) goto L86
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            r4.d_()
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            int r5 = r3.ae
            long r5 = (long) r5
            r4.j(r5)
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            byte[] r5 = r10.xt()
            int r6 = r10.j()
            int r7 = r3.f1745r
            int r7 = r7 + 12
            r4.j(r5, r6, r7)
            int r3 = r3.f1745r
            int r3 = r3 + 12
            r10.r(r3)
            goto L86
        Lc2:
            java.util.List<com.bytedance.adsdk.j.j.j.up> r0 = r9.f1739r
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L15b
            java.lang.Object r3 = r0.next()
            com.bytedance.adsdk.j.j.j.up r3 = (com.bytedance.adsdk.j.j.j.up) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.j.j.j.oq
            if (r4 == 0) goto L104
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            r4.d_()
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            int r5 = r3.ae
            long r5 = (long) r5
            r4.j(r5)
            R extends com.bytedance.adsdk.j.j.xt.m r4 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r4 = (com.bytedance.adsdk.j.j.xt.j) r4
            byte[] r5 = r10.xt()
            int r6 = r10.j()
            int r7 = r3.f1745r
            int r7 = r7 + 12
            r4.j(r5, r6, r7)
            int r3 = r3.f1745r
            int r3 = r3 + 12
            r10.r(r3)
            goto Lc8
        L104:
            boolean r4 = r3 instanceof com.bytedance.adsdk.j.j.j.ae
            if (r4 == 0) goto Lc8
            int r4 = r3.f1745r
            int r4 = r4 + (-4)
            r10.xt(r4)
            int r4 = r10.j()
            int r5 = com.bytedance.adsdk.j.j.j.oq.j
            r10.j(r5)
            R extends com.bytedance.adsdk.j.j.xt.m r5 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r5 = (com.bytedance.adsdk.j.j.xt.j) r5
            r5.d_()
            R extends com.bytedance.adsdk.j.j.xt.m r5 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r5 = (com.bytedance.adsdk.j.j.xt.j) r5
            int r6 = r3.ae
            int r6 = r6 + 12
            long r6 = (long) r6
            r5.j(r6)
            R extends com.bytedance.adsdk.j.j.xt.m r5 = r9.ae
            com.bytedance.adsdk.j.j.xt.j r5 = (com.bytedance.adsdk.j.j.xt.j) r5
            byte[] r6 = r10.xt()
            int r7 = r10.j()
            int r8 = r3.f1745r
            int r8 = r8 + (-4)
            r5.j(r6, r7, r8)
            int r5 = r3.f1745r
            int r5 = r5 + (-4)
            r10.r(r5)
            r2.reset()
            byte[] r5 = r10.xt()
            int r3 = r3.f1745r
            r2.update(r5, r4, r3)
            long r3 = r2.getValue()
            int r4 = (int) r3
            r10.xt(r4)
            goto Lc8
        L15b:
            byte[] r0 = com.bytedance.adsdk.j.j.j.cw.av
            r10.j(r0)
            return r1
    }

    private java.util.zip.CRC32 j() {
            r2 = this;
            java.lang.ThreadLocal<java.util.zip.CRC32> r0 = com.bytedance.adsdk.j.j.j.cw.i
            java.lang.Object r1 = r0.get()
            java.util.zip.CRC32 r1 = (java.util.zip.CRC32) r1
            if (r1 != 0) goto L12
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    @Override // com.bytedance.adsdk.j.j.j.tl
    public /* bridge */ /* synthetic */ android.graphics.Bitmap j(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, android.graphics.Bitmap r4, com.bytedance.adsdk.j.j.xt.xt r5) {
            r0 = this;
            com.bytedance.adsdk.j.j.xt.xt r5 = (com.bytedance.adsdk.j.j.xt.xt) r5
            android.graphics.Bitmap r1 = r0.j2(r1, r2, r3, r4, r5)
            return r1
    }

    /* renamed from: j, reason: avoid collision after fix types in other method */
    public android.graphics.Bitmap j2(android.graphics.Canvas r5, android.graphics.Paint r6, int r7, android.graphics.Bitmap r8, com.bytedance.adsdk.j.j.xt.xt r9) {
            r4 = this;
            int r0 = r4.j(r9)     // Catch: java.io.IOException -> L1c
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L1c
            r1.<init>()     // Catch: java.io.IOException -> L1c
            r2 = 0
            r1.inJustDecodeBounds = r2     // Catch: java.io.IOException -> L1c
            r1.inSampleSize = r7     // Catch: java.io.IOException -> L1c
            r3 = 1
            r1.inMutable = r3     // Catch: java.io.IOException -> L1c
            r1.inBitmap = r8     // Catch: java.io.IOException -> L1c
            byte[] r8 = r9.xt()     // Catch: java.io.IOException -> L1c
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r2, r0, r1)     // Catch: java.io.IOException -> L1c java.lang.IllegalArgumentException -> L1e
            goto L2d
        L1c:
            r5 = move-exception
            goto L81
        L1e:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L1c
            r9.<init>()     // Catch: java.io.IOException -> L1c
            r9.inJustDecodeBounds = r2     // Catch: java.io.IOException -> L1c
            r9.inSampleSize = r7     // Catch: java.io.IOException -> L1c
            r9.inMutable = r3     // Catch: java.io.IOException -> L1c
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r2, r0, r9)     // Catch: java.io.IOException -> L1c
        L2d:
            boolean r9 = com.bytedance.adsdk.j.j.j.cw.f1738m     // Catch: java.io.IOException -> L1c
            if (r9 != 0) goto L3a
            if (r8 == 0) goto L34
            goto L3a
        L34:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.io.IOException -> L1c
            r5.<init>()     // Catch: java.io.IOException -> L1c
            throw r5     // Catch: java.io.IOException -> L1c
        L3a:
            android.graphics.Rect r9 = r4.jy     // Catch: java.io.IOException -> L1c
            r9.left = r2     // Catch: java.io.IOException -> L1c
            r9.top = r2     // Catch: java.io.IOException -> L1c
            int r0 = r8.getWidth()     // Catch: java.io.IOException -> L1c
            r9.right = r0     // Catch: java.io.IOException -> L1c
            android.graphics.Rect r9 = r4.jy     // Catch: java.io.IOException -> L1c
            int r0 = r8.getHeight()     // Catch: java.io.IOException -> L1c
            r9.bottom = r0     // Catch: java.io.IOException -> L1c
            android.graphics.Rect r9 = r4.ws     // Catch: java.io.IOException -> L1c
            int r0 = r4.oq     // Catch: java.io.IOException -> L1c
            float r1 = (float) r0     // Catch: java.io.IOException -> L1c
            float r7 = (float) r7     // Catch: java.io.IOException -> L1c
            float r1 = r1 / r7
            int r1 = (int) r1     // Catch: java.io.IOException -> L1c
            r9.left = r1     // Catch: java.io.IOException -> L1c
            int r1 = r4.qv     // Catch: java.io.IOException -> L1c
            float r1 = (float) r1     // Catch: java.io.IOException -> L1c
            float r1 = r1 / r7
            int r1 = (int) r1     // Catch: java.io.IOException -> L1c
            r9.top = r1     // Catch: java.io.IOException -> L1c
            float r0 = (float) r0     // Catch: java.io.IOException -> L1c
            float r0 = r0 / r7
            int r1 = r8.getWidth()     // Catch: java.io.IOException -> L1c
            float r1 = (float) r1     // Catch: java.io.IOException -> L1c
            float r0 = r0 + r1
            int r0 = (int) r0     // Catch: java.io.IOException -> L1c
            r9.right = r0     // Catch: java.io.IOException -> L1c
            android.graphics.Rect r9 = r4.ws     // Catch: java.io.IOException -> L1c
            int r0 = r4.qv     // Catch: java.io.IOException -> L1c
            float r0 = (float) r0     // Catch: java.io.IOException -> L1c
            float r0 = r0 / r7
            int r7 = r8.getHeight()     // Catch: java.io.IOException -> L1c
            float r7 = (float) r7     // Catch: java.io.IOException -> L1c
            float r0 = r0 + r7
            int r7 = (int) r0     // Catch: java.io.IOException -> L1c
            r9.bottom = r7     // Catch: java.io.IOException -> L1c
            android.graphics.Rect r7 = r4.jy     // Catch: java.io.IOException -> L1c
            android.graphics.Rect r9 = r4.ws     // Catch: java.io.IOException -> L1c
            r5.drawBitmap(r8, r7, r9, r6)     // Catch: java.io.IOException -> L1c
            return r8
        L81:
            com.bytedance.sdk.component.utils.vl.j(r5)
            r5 = 0
            return r5
    }
}
