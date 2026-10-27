package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends android.os.Handler implements com.huawei.hms.scankit.p.v6 {
    private final com.huawei.hms.scankit.p.f5 a;
    private com.huawei.hms.scankit.d b;
    private final int c;
    private com.huawei.hms.scankit.a.EnumC0003a d;
    private android.content.Context e;
    private final com.huawei.hms.scankit.p.j0 f;
    private final com.huawei.hms.scankit.ViewfinderView g;
    private boolean h;
    private boolean i;
    private boolean j;
    private com.huawei.hms.scankit.p.e5 k;
    private boolean l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.scankit.a$a, reason: collision with other inner class name */
    private enum EnumC0003a extends java.lang.Enum<com.huawei.hms.scankit.a.EnumC0003a> {
        public static final com.huawei.hms.scankit.a.EnumC0003a a = null;
        public static final com.huawei.hms.scankit.a.EnumC0003a b = null;
        public static final com.huawei.hms.scankit.a.EnumC0003a c = null;
        private static final /* synthetic */ com.huawei.hms.scankit.a.EnumC0003a[] d = null;

        static {
                com.huawei.hms.scankit.a$a r0 = new com.huawei.hms.scankit.a$a
                java.lang.String r1 = "PREVIEW"
                r2 = 0
                r0.<init>(r1, r2)
                com.huawei.hms.scankit.a.EnumC0003a.a = r0
                com.huawei.hms.scankit.a$a r1 = new com.huawei.hms.scankit.a$a
                java.lang.String r3 = "SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                com.huawei.hms.scankit.a.EnumC0003a.b = r1
                com.huawei.hms.scankit.a$a r3 = new com.huawei.hms.scankit.a$a
                java.lang.String r5 = "DONE"
                r6 = 2
                r3.<init>(r5, r6)
                com.huawei.hms.scankit.a.EnumC0003a.c = r3
                r5 = 3
                com.huawei.hms.scankit.a$a[] r5 = new com.huawei.hms.scankit.a.EnumC0003a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.huawei.hms.scankit.a.EnumC0003a.d = r5
                return
        }

        EnumC0003a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.huawei.hms.scankit.a.EnumC0003a valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.scankit.a$a> r0 = com.huawei.hms.scankit.a.EnumC0003a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.scankit.a$a r1 = (com.huawei.hms.scankit.a.EnumC0003a) r1
                return r1
        }

        public static com.huawei.hms.scankit.a.EnumC0003a[] values() {
                com.huawei.hms.scankit.a$a[] r0 = com.huawei.hms.scankit.a.EnumC0003a.d
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.scankit.a$a[] r0 = (com.huawei.hms.scankit.a.EnumC0003a[]) r0
                return r0
        }
    }

    a(android.content.Context r9, com.huawei.hms.scankit.ViewfinderView r10, com.huawei.hms.scankit.p.f5 r11, java.util.Collection<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r12, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r13, java.lang.String r14, com.huawei.hms.scankit.p.j0 r15, android.graphics.Rect r16, int r17, boolean r18, boolean r19) {
            r8 = this;
            r8.<init>()
            r8.g = r10
            r8.a = r11
            r10 = r17
            r8.c = r10
            r8.e = r9
            com.huawei.hms.scankit.d r0 = new com.huawei.hms.scankit.d
            r7 = r8
            r3 = r8
            r1 = r9
            r4 = r12
            r5 = r13
            r6 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.b = r0
            r9 = r16
            r0.a(r9)
            com.huawei.hms.scankit.d r9 = r8.b
            r10 = r19
            r9.a(r10)
            com.huawei.hms.scankit.d r9 = r8.b
            r9.start()
            r9 = r18
            r8.l = r9
            com.huawei.hms.scankit.j r9 = new com.huawei.hms.scankit.j
            com.huawei.hms.scankit.d r10 = r8.b
            r9.<init>(r10)
            r15.a(r9)
            com.huawei.hms.scankit.a$a r9 = com.huawei.hms.scankit.a.EnumC0003a.b
            r8.d = r9
            r8.f = r15
            r15.p()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "start preview time:"
            r9.append(r10)
            long r10 = java.lang.System.currentTimeMillis()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "scan-time"
            com.huawei.hms.scankit.p.o4.a(r10, r9)
            r8.f()
            r9 = 0
            com.huawei.hms.scankit.p.v5.a(r9)
            return
    }

    private com.huawei.hms.scankit.p.u6 b(com.huawei.hms.scankit.p.u6 r8) {
            r7 = this;
            android.content.Context r0 = r7.e
            android.graphics.Point r0 = com.huawei.hms.scankit.p.i8.b(r0)
            com.huawei.hms.scankit.p.j0 r1 = r7.f
            android.graphics.Point r1 = r1.e()
            int r2 = r0.x
            int r3 = r0.y
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= r3) goto L47
            float r2 = (float) r2
            float r2 = r2 * r5
            int r6 = r1.y
            float r6 = (float) r6
            float r2 = r2 / r6
            float r3 = (float) r3
            float r3 = r3 * r5
            int r5 = r1.x
            float r5 = (float) r5
            float r3 = r3 / r5
            float r5 = r8.b()
            float r5 = r5 * r2
            int r2 = r0.x
            int r6 = r1.y
            int r2 = java.lang.Math.max(r2, r6)
            float r2 = (float) r2
            float r2 = r2 / r4
            float r5 = r5 - r2
            float r8 = r8.c()
            float r8 = r8 * r3
            int r0 = r0.y
            int r1 = r1.x
            int r0 = java.lang.Math.min(r0, r1)
        L43:
            float r0 = (float) r0
            float r0 = r0 / r4
            float r8 = r8 - r0
            goto L75
        L47:
            float r2 = (float) r2
            float r2 = r2 * r5
            int r6 = r1.x
            float r6 = (float) r6
            float r2 = r2 / r6
            float r3 = (float) r3
            float r3 = r3 * r5
            int r5 = r1.y
            float r5 = (float) r5
            float r3 = r3 / r5
            float r5 = r8.b()
            float r5 = r5 * r2
            int r2 = r0.y
            int r6 = r1.y
            int r2 = java.lang.Math.min(r2, r6)
            float r2 = (float) r2
            float r2 = r2 / r4
            float r5 = r5 - r2
            float r8 = r8.c()
            float r8 = r8 * r3
            int r0 = r0.x
            int r1 = r1.x
            int r0 = java.lang.Math.max(r0, r1)
            goto L43
        L75:
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            r0.<init>(r5, r8)
            return r0
    }

    public void a(com.huawei.hms.scankit.p.e5 r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // com.huawei.hms.scankit.p.v6
    public void a(com.huawei.hms.scankit.p.u6 r2) {
            r1 = this;
            com.huawei.hms.scankit.ViewfinderView r0 = r1.g
            if (r0 == 0) goto Ld
            com.huawei.hms.scankit.p.u6 r2 = r1.b(r2)
            com.huawei.hms.scankit.ViewfinderView r0 = r1.g
            r0.a(r2)
        Ld:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public boolean a() {
            r1 = this;
            com.huawei.hms.scankit.p.e5 r0 = r1.k
            if (r0 == 0) goto L9
            boolean r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public void b(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    public void e() {
            r3 = this;
            com.huawei.hms.scankit.a$a r0 = com.huawei.hms.scankit.a.EnumC0003a.c
            r3.d = r0
            com.huawei.hms.scankit.p.j0 r0 = r3.f
            r0.q()
            com.huawei.hms.scankit.d r0 = r3.b
            android.os.Handler r0 = r0.a()
            int r1 = com.huawei.hms.scankit.R.id.scankit_quit
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
            r0.sendToTarget()
            com.huawei.hms.scankit.d r0 = r3.b     // Catch: java.lang.InterruptedException -> L25
            r0.b()     // Catch: java.lang.InterruptedException -> L25
            com.huawei.hms.scankit.d r0 = r3.b     // Catch: java.lang.InterruptedException -> L25
            r1 = 50
            r0.join(r1)     // Catch: java.lang.InterruptedException -> L25
            goto L2c
        L25:
            java.lang.String r0 = "CaptureHandler"
            java.lang.String r1 = "quitSynchronously   wait interrupt"
            com.huawei.hms.scankit.p.o4.e(r0, r1)
        L2c:
            r0 = 0
            r3.b = r0
            int r0 = com.huawei.hms.scankit.R.id.scankit_decode_succeeded
            r3.removeMessages(r0)
            int r0 = com.huawei.hms.scankit.R.id.scankit_decode_failed
            r3.removeMessages(r0)
            return
    }

    public void f() {
            r2 = this;
            com.huawei.hms.scankit.a$a r0 = r2.d
            com.huawei.hms.scankit.a$a r1 = com.huawei.hms.scankit.a.EnumC0003a.b
            if (r0 != r1) goto Lf
            com.huawei.hms.scankit.a$a r0 = com.huawei.hms.scankit.a.EnumC0003a.a
            r2.d = r0
            com.huawei.hms.scankit.p.j0 r0 = r2.f
            r0.o()
        Lf:
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r7) {
            r6 = this;
            int r0 = r7.what
            int r1 = com.huawei.hms.scankit.R.id.scankit_restart_preview
            if (r0 != r1) goto La
            r6.f()
            return
        La:
            int r1 = com.huawei.hms.scankit.R.id.scankit_decode_succeeded
            if (r0 != r1) goto L71
            com.huawei.hms.scankit.a$a r0 = com.huawei.hms.scankit.a.EnumC0003a.b
            r6.d = r0
            java.lang.Object r0 = r7.obj
            boolean r1 = r0 instanceof com.huawei.hms.ml.scan.HmsScan[]
            if (r1 == 0) goto L7e
            com.huawei.hms.ml.scan.HmsScan[] r0 = (com.huawei.hms.ml.scan.HmsScan[]) r0
            int r1 = r0.length
            java.lang.String r2 = "CaptureHandler"
            if (r1 <= 0) goto L68
            r1 = 0
            r3 = r0[r1]
            if (r3 == 0) goto L68
            java.lang.String r3 = r3.originalValue
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L68
            java.lang.String r3 = "scan successful"
            com.huawei.hms.scankit.p.o4.d(r2, r3)
            boolean r3 = r6.i
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L5e
            java.lang.String r3 = "scan successful & return bitmap"
            com.huawei.hms.scankit.p.o4.d(r2, r3)
            android.os.Bundle r7 = r7.getData()
            if (r7 == 0) goto L58
            java.lang.String r2 = "barcode_bitmap"
            byte[] r2 = r7.getByteArray(r2)
            java.lang.String r3 = "barcode_scaled_factor"
            float r5 = r7.getFloat(r3, r5)
            if (r2 == 0) goto L58
            int r7 = r2.length
            if (r7 <= 0) goto L58
            int r7 = r2.length
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r7)
        L58:
            com.huawei.hms.scankit.p.f5 r7 = r6.a
            r7.a(r0, r4, r5)
            goto L63
        L5e:
            com.huawei.hms.scankit.p.f5 r7 = r6.a
            r7.a(r0, r4, r5)
        L63:
            boolean r7 = r6.l
            if (r7 != 0) goto L6d
            goto L7e
        L68:
            java.lang.String r7 = "retrieve  HmsScan lenth is 0"
            com.huawei.hms.scankit.p.o4.d(r2, r7)
        L6d:
            r6.f()
            return
        L71:
            int r7 = com.huawei.hms.scankit.R.id.scankit_decode_failed
            if (r0 != r7) goto L7e
            com.huawei.hms.scankit.a$a r7 = com.huawei.hms.scankit.a.EnumC0003a.a
            r6.d = r7
            com.huawei.hms.scankit.p.j0 r7 = r6.f
            r7.o()
        L7e:
            return
    }
}
