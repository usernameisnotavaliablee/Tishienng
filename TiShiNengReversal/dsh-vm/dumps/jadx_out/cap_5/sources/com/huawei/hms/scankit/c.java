package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class c extends android.os.Handler {
    private static com.huawei.hms.scankit.c.a j;
    private static long k;
    private final android.content.Context a;
    private final com.huawei.hms.scankit.p.j0 b;
    private final com.huawei.hms.scankit.a c;
    private boolean d;
    private int e;
    private android.graphics.Rect f;
    private int g;
    private com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate h;
    private boolean i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends android.os.AsyncTask<java.lang.Object, java.lang.Object, java.lang.Object> {
        private java.lang.ref.WeakReference<com.huawei.hms.scankit.c> a;
        private boolean b;
        private boolean c;
        private int d;
        private java.util.List<com.huawei.hms.scankit.p.k0.a> e;
        private java.util.List<com.huawei.hms.scankit.p.k0.a> f;
        private int g;
        private int h;

        public a(com.huawei.hms.scankit.c r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.b = r0
                r0 = 0
                r1.c = r0
                r1.d = r0
                r1.g = r0
                r1.h = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        private void a() {
                r1 = this;
                r0 = 0
                r1.d = r0
                r1.g = r0
                return
        }

        static /* synthetic */ boolean a(com.huawei.hms.scankit.c.a r0, boolean r1) {
                r0.c = r1
                return r1
        }

        public void a(int r2) {
                r1 = this;
                int r0 = r1.d
                int r0 = r0 + r2
                r1.d = r0
                int r2 = r1.g
                int r2 = r2 + 1
                r1.g = r2
                return
        }

        public void a(java.util.List<android.graphics.Rect> r11, int r12, int r13, boolean r14) {
                r10 = this;
                if (r11 != 0) goto La
                java.lang.String r11 = "ScankitDecode"
                java.lang.String r12 = "areas is null"
                com.huawei.hms.scankit.p.o4.a(r11, r12)
                return
            La:
                int r14 = r11.size()
                r0 = 1000(0x3e8, float:1.401E-42)
                if (r14 != 0) goto L27
                com.huawei.hms.scankit.p.k0$a r11 = new com.huawei.hms.scankit.p.k0$a
                android.graphics.Rect r12 = new android.graphics.Rect
                r13 = -100
                r14 = 100
                r12.<init>(r13, r13, r14, r14)
                r11.<init>(r12, r0)
                java.util.List r11 = java.util.Collections.singletonList(r11)
                r10.f = r11
                return
            L27:
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                r10.f = r14
                java.util.Iterator r14 = r11.iterator()
            L32:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L80
                java.lang.Object r1 = r14.next()
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                int r2 = r1.centerX()
                int r2 = r2 * 2000
                int r2 = r2 / r12
                int r2 = r2 - r0
                int r3 = r1.centerY()
                int r3 = r3 * 2000
                int r3 = r3 / r13
                int r3 = r3 - r0
                int r4 = r1.width()
                int r4 = r4 * 2000
                int r4 = r4 / r12
                int r4 = r4 / 2
                int r1 = r1.height()
                int r1 = r1 * 2000
                int r1 = r1 / r13
                int r1 = r1 / 2
                java.util.List<com.huawei.hms.scankit.p.k0$a> r5 = r10.f
                com.huawei.hms.scankit.p.k0$a r6 = new com.huawei.hms.scankit.p.k0$a
                android.graphics.Rect r7 = new android.graphics.Rect
                int r8 = r4 / 2
                int r8 = r2 - r8
                int r9 = r1 / 2
                int r9 = r3 - r9
                int r2 = r2 + r4
                int r3 = r3 + r1
                r7.<init>(r8, r9, r2, r3)
                int r1 = r11.size()
                int r1 = r0 / r1
                r6.<init>(r7, r1)
                r5.add(r6)
                goto L32
            L80:
                r11.clear()
                return
        }

        public void b(int r4) {
                r3 = this;
                java.lang.String r0 = "DecodeHandler"
                r3.h = r4
                java.lang.ref.WeakReference<com.huawei.hms.scankit.c> r4 = r3.a
                java.lang.Object r4 = r4.get()
                com.huawei.hms.scankit.c r4 = (com.huawei.hms.scankit.c) r4
                if (r4 == 0) goto L4c
                int r1 = r3.h     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                java.util.List<com.huawei.hms.scankit.p.k0$a> r2 = r3.f     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                r4.a(r1, r2)     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                r4.<init>()     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                java.lang.String r1 = "ScanCode handle global value"
                r4.append(r1)     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                int r1 = r3.h     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                r4.append(r1)     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                java.lang.String r4 = r4.toString()     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                com.huawei.hms.scankit.p.o4.d(r0, r4)     // Catch: java.lang.RuntimeException -> L2c java.lang.Exception -> L2e
                return
            L2c:
                r4 = move-exception
                goto L34
            L2e:
                java.lang.String r4 = "Exception"
                com.huawei.hms.scankit.p.o4.b(r0, r4)
                goto L4c
            L34:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "RuntimeException: "
                r1.append(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.huawei.hms.scankit.p.o4.b(r0, r4)
            L4c:
                return
        }

        public void b(java.util.List<android.graphics.Rect> r12, int r13, int r14, boolean r15) {
                r11 = this;
                if (r12 != 0) goto La
                java.lang.String r12 = "ScankitDecode"
                java.lang.String r13 = "areas is null"
                com.huawei.hms.scankit.p.o4.a(r12, r13)
                return
            La:
                int r0 = r12.size()
                r1 = 1000(0x3e8, float:1.401E-42)
                if (r0 != 0) goto L27
                com.huawei.hms.scankit.p.k0$a r12 = new com.huawei.hms.scankit.p.k0$a
                android.graphics.Rect r13 = new android.graphics.Rect
                r14 = -100
                r15 = 100
                r13.<init>(r14, r14, r15, r15)
                r12.<init>(r13, r1)
                java.util.List r12 = java.util.Collections.singletonList(r12)
                r11.e = r12
                return
            L27:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r11.e = r0
                if (r15 == 0) goto L8d
                if (r14 <= r13) goto L35
                int r15 = r14 - r13
                goto L37
            L35:
                int r15 = r13 - r14
            L37:
                int r15 = r15 >> 1
                java.util.Iterator r0 = r12.iterator()
            L3d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L8c
                java.lang.Object r2 = r0.next()
                android.graphics.Rect r2 = (android.graphics.Rect) r2
                int r3 = r2.centerY()
                int r3 = r3 + r15
                int r3 = r3 * 2000
                int r3 = r3 / r13
                int r3 = r3 - r1
                int r4 = r2.centerX()
                int r4 = r4 * 2000
                int r4 = r4 / r14
                int r4 = r4 - r1
                int r5 = r2.height()
                int r5 = r5 * 2000
                int r5 = r5 / r13
                int r5 = r5 / 2
                int r2 = r2.width()
                int r2 = r2 * 2000
                int r2 = r2 / r14
                int r2 = r2 / 2
                java.util.List<com.huawei.hms.scankit.p.k0$a> r6 = r11.e
                com.huawei.hms.scankit.p.k0$a r7 = new com.huawei.hms.scankit.p.k0$a
                android.graphics.Rect r8 = new android.graphics.Rect
                int r9 = r5 / 2
                int r9 = r3 - r9
                int r10 = r2 / 2
                int r10 = r4 - r10
                int r3 = r3 + r5
                int r4 = r4 + r2
                r8.<init>(r9, r10, r3, r4)
                int r2 = r12.size()
                int r2 = r1 / r2
                r7.<init>(r8, r2)
                r6.add(r7)
                goto L3d
            L8c:
                return
            L8d:
                java.util.Iterator r15 = r12.iterator()
            L91:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto Ldf
                java.lang.Object r0 = r15.next()
                android.graphics.Rect r0 = (android.graphics.Rect) r0
                int r2 = r0.centerX()
                int r2 = r2 * 2000
                int r2 = r2 / r13
                int r2 = r2 - r1
                int r3 = r0.centerY()
                int r3 = r3 * 2000
                int r3 = r3 / r14
                int r3 = r3 - r1
                int r4 = r0.width()
                int r4 = r4 * 2000
                int r4 = r4 / r13
                int r4 = r4 / 2
                int r0 = r0.height()
                int r0 = r0 * 2000
                int r0 = r0 / r14
                int r0 = r0 / 2
                java.util.List<com.huawei.hms.scankit.p.k0$a> r5 = r11.e
                com.huawei.hms.scankit.p.k0$a r6 = new com.huawei.hms.scankit.p.k0$a
                android.graphics.Rect r7 = new android.graphics.Rect
                int r8 = r4 / 2
                int r8 = r2 - r8
                int r9 = r0 / 2
                int r9 = r3 - r9
                int r2 = r2 + r4
                int r3 = r3 + r0
                r7.<init>(r8, r9, r2, r3)
                int r0 = r12.size()
                int r0 = r1 / r0
                r6.<init>(r7, r0)
                r5.add(r6)
                goto L91
            Ldf:
                r12.clear()
                return
        }

        @Override // android.os.AsyncTask
        protected java.lang.Object doInBackground(java.lang.Object... r6) {
                r5 = this;
                java.lang.String r6 = "DecodeHandler"
                com.huawei.hms.scankit.c$a r0 = com.huawei.hms.scankit.c.a()
                boolean r0 = r0.isCancelled()
                r1 = 0
                if (r0 == 0) goto Le
                return r1
            Le:
                boolean r0 = r5.c
                if (r0 == 0) goto L13
                return r1
            L13:
                boolean r0 = r5.b
                if (r0 == 0) goto L28
                r2 = 400(0x190, double:1.976E-321)
                java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L1d
                goto L24
            L1d:
                java.lang.String r0 = "ScankitDecode"
                java.lang.String r2 = "doInBackground  get InterruptedException  error!!!"
                com.huawei.hms.scankit.p.o4.d(r0, r2)
            L24:
                r0 = 0
                r5.b = r0
                goto Le
            L28:
                java.lang.ref.WeakReference<com.huawei.hms.scankit.c> r0 = r5.a
                java.lang.Object r0 = r0.get()
                com.huawei.hms.scankit.c r0 = (com.huawei.hms.scankit.c) r0
                int r2 = r5.g
                r3 = 1
                if (r2 != 0) goto L38
                r5.b = r3
                goto Le
            L38:
                if (r0 == 0) goto Le
                int r4 = r5.d     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                int r4 = r4 / r2
                java.util.List<com.huawei.hms.scankit.p.k0$a> r2 = r5.e     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                r0.a(r4, r2)     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                r0.<init>()     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                java.lang.String r2 = "ScanCode handle auto value"
                r0.append(r2)     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                int r2 = r5.d     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                int r4 = r5.g     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                int r2 = r2 / r4
                r0.append(r2)     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                com.huawei.hms.scankit.p.o4.d(r6, r0)     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                r5.a()     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                r5.b = r3     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
                goto Le
            L61:
                r0 = move-exception
                goto L69
            L63:
                java.lang.String r0 = "Exception"
                com.huawei.hms.scankit.p.o4.b(r6, r0)
                goto Le
            L69:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "RuntimeException: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.huawei.hms.scankit.p.o4.b(r6, r0)
                goto Le
        }
    }

    static {
            return
    }

    c(android.content.Context r1, com.huawei.hms.scankit.p.j0 r2, com.huawei.hms.scankit.a r3, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r4, android.graphics.Rect r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r4 = 1
            r0.d = r4
            r4 = 50
            r0.e = r4
            r4 = 0
            r0.i = r4
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.f = r5
            com.huawei.hms.scankit.c$a r2 = com.huawei.hms.scankit.c.j
            if (r2 != 0) goto L27
            com.huawei.hms.scankit.c$a r2 = new com.huawei.hms.scankit.c$a
            r2.<init>(r0)
            com.huawei.hms.scankit.c.j = r2
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r2.executeOnExecutor(r3, r5)
        L27:
            r0.g = r4
            r0.i = r6
            r0.a(r1)
            return
    }

    static /* synthetic */ com.huawei.hms.scankit.c.a a() {
            com.huawei.hms.scankit.c$a r0 = com.huawei.hms.scankit.c.j
            return r0
    }

    private void a(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "ScankitDecode"
            boolean r1 = r3.i     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            if (r1 == 0) goto Ld
            java.lang.Class<com.huawei.hms.scankit.DecoderCreator> r4 = com.huawei.hms.scankit.DecoderCreator.class
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            goto L3b
        Ld:
            android.content.Context r4 = com.huawei.hms.hmsscankit.g.e(r4)     // Catch: java.lang.Throwable -> L11 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
        L11:
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            java.lang.String r2 = "com.huawei.hms.scankit.DecoderCreator"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            java.lang.String r2 = "com.huawei.hms.scankit.aiscan.common.BarcodeFormat"
            r4.loadClass(r2)     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            java.lang.Object r4 = r1.newInstance()     // Catch: java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L2f java.lang.IllegalAccessException -> L35
            goto L3b
        L29:
            java.lang.String r4 = "InstantiationException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
            goto L3a
        L2f:
            java.lang.String r4 = "ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
            goto L3a
        L35:
            java.lang.String r4 = "IllegalAccessException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
        L3a:
            r4 = 0
        L3b:
            boolean r1 = r4 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L57
            if (r1 == 0) goto L4c
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch: android.os.RemoteException -> L57
            com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r4 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.asInterface(r4)     // Catch: android.os.RemoteException -> L57
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r4 = r4.newRemoteFrameDecoderDelegate()     // Catch: android.os.RemoteException -> L57
            r3.h = r4     // Catch: android.os.RemoteException -> L57
            goto L5c
        L4c:
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r4 = r3.h     // Catch: android.os.RemoteException -> L57
            if (r4 != 0) goto L5c
            com.huawei.hms.scankit.p.h4 r4 = com.huawei.hms.scankit.p.h4.a()     // Catch: android.os.RemoteException -> L57
            r3.h = r4     // Catch: android.os.RemoteException -> L57
            goto L5c
        L57:
            java.lang.String r4 = "RemoteException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
        L5c:
            return
    }

    private static void a(byte[] r7, int r8, int r9, android.os.Bundle r10) {
            if (r7 == 0) goto L34
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L34
        L6:
            android.graphics.YuvImage r1 = new android.graphics.YuvImage
            r3 = 17
            r6 = 0
            r2 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            android.graphics.Rect r8 = new android.graphics.Rect
            r9 = 0
            r8.<init>(r9, r9, r4, r5)
            r9 = 100
            r1.compressToJpeg(r8, r9, r7)
            byte[] r8 = r7.toByteArray()
            java.lang.String r9 = "barcode_bitmap"
            r10.putByteArray(r9, r8)
            java.lang.String r8 = "barcode_scaled_factor"
            r9 = 1065353216(0x3f800000, float:1.0)
            r10.putFloat(r8, r9)
            r7.close()     // Catch: java.io.IOException -> L34
        L34:
            return
    }

    private void a(byte[] r12, boolean r13) {
            r11 = this;
            com.huawei.hms.scankit.p.j0 r0 = r11.b
            android.graphics.Point r0 = r0.e()
            int r3 = r0.x
            com.huawei.hms.scankit.p.j0 r0 = r11.b
            android.graphics.Point r0 = r0.e()
            int r4 = r0.y
            android.content.Context r0 = r11.a
            r8 = 0
            if (r0 == 0) goto L29
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L29
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r5 = r0
            goto L2a
        L29:
            r5 = 0
        L2a:
            com.huawei.hms.scankit.a r0 = r11.c
            if (r0 == 0) goto L1b1
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J
            r9 = 0
            if (r0 == 0) goto L3c
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J
            int r1 = r3 * r4
            com.huawei.hms.scankit.p.w3$c r0 = r0.a(r8, r1)
            goto L3d
        L3c:
            r0 = r9
        L3d:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            android.graphics.Rect r1 = r11.f
            java.lang.String r2 = "Rect"
            r10.putParcelable(r2, r1)
            android.content.Context r1 = r11.a
            android.graphics.Point r1 = com.huawei.hms.scankit.p.i8.b(r1)
            if (r1 == 0) goto L56
            java.lang.String r2 = "Screen"
            r10.putParcelable(r2, r1)
        L56:
            boolean r1 = com.huawei.hms.hmsscankit.g.c
            java.lang.String r2 = "ROLLBACK"
            r10.putBoolean(r2, r1)
            boolean r1 = com.huawei.hms.hmsscankit.g.a
            java.lang.String r2 = "USEAPK"
            r10.putBoolean(r2, r1)
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: android.os.RemoteException -> La9
            if (r1 == 0) goto L75
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: android.os.RemoteException -> L72
            long r6 = java.lang.System.currentTimeMillis()     // Catch: android.os.RemoteException -> L72
            r1.a(r6)     // Catch: android.os.RemoteException -> L72
            goto L75
        L72:
            r2 = r12
            goto Lab
        L75:
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r1 = r11.h     // Catch: android.os.RemoteException -> La9
            com.huawei.hms.scankit.a r2 = r11.c     // Catch: android.os.RemoteException -> La9
            int r6 = r2.b()     // Catch: android.os.RemoteException -> La9
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> La9
            r2 = r12
            com.huawei.hms.scankit.p.s6[] r12 = r1.decode(r2, r3, r4, r5, r6, r7)     // Catch: android.os.RemoteException -> La7
            com.huawei.hms.hmsscankit.f.a(r12)     // Catch: android.os.RemoteException -> La5
            boolean r1 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> La5
            if (r1 == 0) goto Lac
            android.content.Context r1 = r11.a     // Catch: android.os.RemoteException -> La5
            r11.a(r1)     // Catch: android.os.RemoteException -> La5
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r1 = r11.h     // Catch: android.os.RemoteException -> La5
            com.huawei.hms.scankit.a r6 = r11.c     // Catch: android.os.RemoteException -> La5
            int r6 = r6.b()     // Catch: android.os.RemoteException -> La5
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> La5
            com.huawei.hms.scankit.p.s6[] r12 = r1.decode(r2, r3, r4, r5, r6, r7)     // Catch: android.os.RemoteException -> La5
            goto Lac
        La5:
            goto Lac
        La7:
            goto Lab
        La9:
            r2 = r12
            goto La7
        Lab:
            r12 = r9
        Lac:
            if (r12 == 0) goto L19e
            int r1 = r12.length
            if (r1 <= 0) goto L19e
            r1 = r12[r8]
            if (r1 == 0) goto L19e
            com.huawei.hms.scankit.a r1 = r11.c
            boolean r1 = r1.d()
            java.lang.String r5 = "ScankitDecode"
            if (r1 == 0) goto L105
            r1 = r12[r8]
            float r1 = r1.l()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L105
            long r6 = java.lang.System.currentTimeMillis()
            long r9 = com.huawei.hms.scankit.c.k
            long r6 = r6 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 <= 0) goto L105
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "need to zoom"
            r1.append(r6)
            r6 = r12[r8]
            float r6 = r6.l()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.scankit.p.o4.d(r5, r1)
            r1 = r12[r8]
            float r1 = r1.l()
            boolean r1 = r11.a(r1, r12, r0)
            if (r1 == 0) goto L105
            long r12 = java.lang.System.currentTimeMillis()
            com.huawei.hms.scankit.c.k = r12
            return
        L105:
            r1 = r12[r8]
            java.lang.String r1 = r1.k()
            if (r1 != 0) goto L129
            r1 = r12[r8]
            boolean r1 = r1.o()
            if (r1 == 0) goto L130
            java.lang.String r1 = "ScanCode need to focus area"
            com.huawei.hms.scankit.p.o4.d(r5, r1)
            r1 = r12[r8]
            java.util.List r1 = r1.d()
            java.lang.Object r1 = r1.get(r8)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r11.a(r1, r13)
        L129:
            r1 = r11
            r6 = r0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r12
            goto L19a
        L130:
            r1 = r12[r8]
            boolean r1 = r1.n()
            if (r1 == 0) goto L169
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "ScanCode need to globalexposure"
            r13.append(r1)
            r1 = r12[r8]
            int r1 = r1.h()
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.huawei.hms.scankit.p.o4.d(r5, r13)
            com.huawei.hms.scankit.c$a r13 = com.huawei.hms.scankit.c.j
            r1 = r12[r8]
            java.util.List r1 = r1.g()
            r13.a(r1, r3, r4, r8)
            com.huawei.hms.scankit.c$a r13 = com.huawei.hms.scankit.c.j
            r1 = r12[r8]
            int r1 = r1.h()
            r13.b(r1)
            goto L129
        L169:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "ScanCode need to exposure"
            r1.append(r6)
            r6 = r12[r8]
            int r6 = r6.f()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.scankit.p.o4.d(r5, r1)
            com.huawei.hms.scankit.c$a r1 = com.huawei.hms.scankit.c.j
            r5 = r12[r8]
            int r5 = r5.f()
            r1.a(r5)
            com.huawei.hms.scankit.c$a r1 = com.huawei.hms.scankit.c.j
            r5 = r12[r8]
            java.util.List r5 = r5.d()
            r1.b(r5, r3, r4, r13)
            goto L129
        L19a:
            r1.a(r2, r3, r4, r5, r6)
            goto L1b2
        L19e:
            r1 = r11
            r6 = r0
            com.huawei.hms.scankit.a r12 = r1.c
            int r13 = com.huawei.hms.scankit.R.id.scankit_decode_failed
            r12.sendEmptyMessage(r13)
            com.huawei.hms.scankit.p.w3 r12 = com.huawei.hms.scankit.b.J
            if (r12 == 0) goto L1b2
            com.huawei.hms.scankit.p.w3 r12 = com.huawei.hms.scankit.b.J
            r12.a(r9, r6)
            goto L1b2
        L1b1:
            r1 = r11
        L1b2:
            return
    }

    private void a(com.huawei.hms.scankit.p.s6[] r8, byte[] r9, int r10, int r11, com.huawei.hms.scankit.p.w3.c r12) {
            r7 = this;
            com.huawei.hms.scankit.a r12 = r7.c
            if (r12 == 0) goto L44
            com.huawei.hms.ml.scan.HmsScan[] r12 = com.huawei.hms.scankit.p.y6.a(r8)
            com.huawei.hms.scankit.a r0 = r7.c
            int r1 = com.huawei.hms.scankit.R.id.scankit_decode_succeeded
            android.os.Message r12 = android.os.Message.obtain(r0, r1, r12)
            com.huawei.hms.scankit.p.v3 r0 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2e
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2d
            r0 = 0
            r2 = r8[r0]     // Catch: java.lang.Exception -> L2d
            long r2 = r2.e()     // Catch: java.lang.Exception -> L2d
            r4 = r8[r0]     // Catch: java.lang.Exception -> L2d
            long r4 = r4.b()     // Catch: java.lang.Exception -> L2d
            r8 = r8[r0]     // Catch: java.lang.Exception -> L2d
            boolean r6 = r8.m()     // Catch: java.lang.Exception -> L2d
            r1.a(r2, r4, r6)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
        L2e:
            com.huawei.hms.scankit.a r8 = r7.c
            boolean r8 = r8.c()
            if (r8 == 0) goto L41
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            a(r9, r10, r11, r8)
            r12.setData(r8)
        L41:
            r12.sendToTarget()
        L44:
            return
    }

    private boolean a(float r2, com.huawei.hms.scankit.p.s6[] r3, com.huawei.hms.scankit.p.w3.c r4) {
            r1 = this;
            boolean r2 = r1.b(r2)
            if (r2 == 0) goto L24
            android.os.Message r2 = android.os.Message.obtain()
            int r0 = com.huawei.hms.scankit.R.id.scankit_decode_succeeded
            r2.what = r0
            com.huawei.hms.ml.scan.HmsScan[] r3 = com.huawei.hms.scankit.p.y6.a(r3)
            r2.obj = r3
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J
            if (r0 == 0) goto L1d
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J
            r0.a(r3, r4)
        L1d:
            com.huawei.hms.scankit.a r3 = r1.c
            r3.sendMessage(r2)
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    private boolean d() {
            r3 = this;
            android.content.Context r0 = r3.a
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.view.WindowManager
            if (r2 == 0) goto L27
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            if (r0 >= r2) goto L25
            return r1
        L25:
            r0 = 0
            return r0
        L27:
            java.lang.String r0 = "ScankitDecode"
            java.lang.String r2 = "isScreenPortrait  getSystemService  WINDOW_SERVICE  error!!!"
            com.huawei.hms.scankit.p.o4.d(r0, r2)
            return r1
    }

    public int a(float r5) {
            r4 = this;
            java.util.List r0 = r4.b()
            if (r0 != 0) goto L8
            r5 = -3
            return r5
        L8:
            int r1 = r0.size()
            if (r1 > 0) goto L10
            r5 = -4
            return r5
        L10:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r5 - r1
            float r1 = java.lang.Math.abs(r1)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L21
            r5 = 0
            return r5
        L21:
            float r1 = r4.c()
            r2 = 1
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L30
            int r5 = r0.size()
            int r5 = r5 - r2
            return r5
        L30:
            int r1 = r0.size()
            if (r2 >= r1) goto L5e
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L5b
            int r1 = r2 + (-1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L5b
            return r2
        L5b:
            int r2 = r2 + 1
            goto L30
        L5e:
            r5 = -1
            return r5
    }

    public void a(int r8, java.util.List<com.huawei.hms.scankit.p.k0.a> r9) {
            r7 = this;
            com.huawei.hms.scankit.p.j0 r0 = r7.b
            com.huawei.hms.scankit.p.g0 r0 = r0.b()
            int r1 = r0.b()
            int r2 = r0.c()
            int r0 = r0.a()
            if (r8 != 0) goto L16
            goto Lac
        L16:
            int r0 = r0 + r8
            if (r0 <= r1) goto L1a
            goto L1f
        L1a:
            if (r0 >= r2) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r0
        L1f:
            com.huawei.hms.scankit.p.j0 r8 = r7.b
            r8.c(r1)
            com.huawei.hms.scankit.p.j0 r8 = r7.b
            com.huawei.hms.scankit.p.k0 r8 = r8.c()
            android.graphics.Rect r0 = r8.b()
            int r1 = r8.a()
            if (r1 <= 0) goto Lac
            int r8 = r8.a()
            r1 = 1
            if (r8 != r1) goto La7
            int r8 = r0.centerX()
            int r0 = r0.centerY()
            r2 = 0
            java.lang.Object r3 = r9.get(r2)
            com.huawei.hms.scankit.p.k0$a r3 = (com.huawei.hms.scankit.p.k0.a) r3
            android.graphics.Rect r3 = r3.a
            int r3 = r3.centerX()
            int r3 = r8 - r3
            java.lang.Object r4 = r9.get(r2)
            com.huawei.hms.scankit.p.k0$a r4 = (com.huawei.hms.scankit.p.k0.a) r4
            android.graphics.Rect r4 = r4.a
            int r4 = r4.centerX()
            int r8 = r8 - r4
            int r3 = r3 * r8
            java.lang.Object r8 = r9.get(r2)
            com.huawei.hms.scankit.p.k0$a r8 = (com.huawei.hms.scankit.p.k0.a) r8
            android.graphics.Rect r8 = r8.a
            int r8 = r8.centerY()
            int r8 = r0 - r8
            java.lang.Object r4 = r9.get(r2)
            com.huawei.hms.scankit.p.k0$a r4 = (com.huawei.hms.scankit.p.k0.a) r4
            android.graphics.Rect r4 = r4.a
            int r4 = r4.centerY()
            int r0 = r0 - r4
            int r8 = r8 + r0
            int r3 = r3 + r8
            float r8 = (float) r3
            double r3 = (double) r8
            double r3 = java.lang.Math.sqrt(r3)
            int r8 = r7.e
            double r5 = (double) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto Lac
            com.huawei.hms.scankit.p.k0$a r8 = new com.huawei.hms.scankit.p.k0$a
            java.lang.Object r0 = r9.get(r2)
            com.huawei.hms.scankit.p.k0$a r0 = (com.huawei.hms.scankit.p.k0.a) r0
            android.graphics.Rect r0 = r0.a
            r3 = 1000(0x3e8, float:1.401E-42)
            r8.<init>(r0, r3)
            r9.set(r2, r8)
            com.huawei.hms.scankit.p.j0 r8 = r7.b
            java.util.List r9 = r9.subList(r2, r1)
            r8.a(r9)
            return
        La7:
            com.huawei.hms.scankit.p.j0 r8 = r7.b
            r8.a(r9)
        Lac:
            return
    }

    public void a(android.graphics.Rect r2, boolean r3) {
            r1 = this;
            com.huawei.hms.scankit.a r0 = r1.c
            if (r0 == 0) goto Lb
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            return
        Lb:
            com.huawei.hms.scankit.p.j0 r0 = r1.b
            r0.a(r2, r3)
            return
    }

    public java.util.List<java.lang.Integer> b() {
            r1 = this;
            com.huawei.hms.scankit.p.j0 r0 = r1.b
            com.huawei.hms.scankit.p.m0 r0 = r0.g()
            java.util.List r0 = r0.a()
            return r0
    }

    public boolean b(float r9) {
            r8 = this;
            java.lang.String r0 = "ScankitDecode"
            com.huawei.hms.scankit.a r1 = r8.c
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r1.a()
            if (r1 == 0) goto Le
            return r2
        Le:
            com.huawei.hms.scankit.p.j0 r1 = r8.b     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            com.huawei.hms.scankit.p.m0 r1 = r1.g()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            if (r1 != 0) goto L1c
            java.lang.String r9 = "Zoom not supported,data is null"
            com.huawei.hms.scankit.p.o4.d(r0, r9)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            return r2
        L1c:
            int r3 = r1.c()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            int r4 = r1.b()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.util.List r1 = r1.a()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            float r5 = (float) r5     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            r7 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r7
            float r5 = r5 * r9
            float r9 = r5 * r7
            int r9 = (int) r9     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            if (r9 <= r1) goto L50
            float r9 = (float) r3     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            float r9 = r9 * r6
            float r5 = r9 / r7
        L50:
            com.huawei.hms.scankit.p.j0 r9 = r8.b     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            boolean r9 = r9.j()     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            if (r9 == 0) goto L85
            int r9 = r8.a(r5)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            if (r9 <= r4) goto L65
            com.huawei.hms.scankit.p.j0 r1 = r8.b     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r1.d(r9)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r9 = 1
            goto L6b
        L65:
            com.huawei.hms.scankit.p.j0 r9 = r8.b     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r9.d(r4)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r9 = 0
        L6b:
            com.huawei.hms.scankit.p.j0 r1 = r8.b     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            com.huawei.hms.scankit.p.k0$a r3 = new com.huawei.hms.scankit.p.k0$a     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r5 = 150(0x96, float:2.1E-43)
            r6 = -150(0xffffffffffffff6a, float:NaN)
            r4.<init>(r6, r6, r5, r5)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r5 = 1000(0x3e8, float:1.401E-42)
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            r1.a(r3)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            return r9
        L85:
            java.lang.String r9 = "Zoom not supported"
            com.huawei.hms.scankit.p.o4.d(r0, r9)     // Catch: java.lang.Exception -> L8b java.lang.RuntimeException -> L91
            return r2
        L8b:
            java.lang.String r9 = "Zoom not supported,Exception happen"
            com.huawei.hms.scankit.p.o4.b(r0, r9)
            goto L96
        L91:
            java.lang.String r9 = "Zoom not supported,RuntimeException happen"
            com.huawei.hms.scankit.p.o4.b(r0, r9)
        L96:
            return r2
    }

    public float c() {
            r2 = this;
            java.util.List r0 = r2.b()
            if (r0 != 0) goto L9
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L9:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            return r0
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r4) {
            r3 = this;
            if (r4 == 0) goto L60
            boolean r0 = r3.d
            if (r0 != 0) goto L7
            goto L60
        L7:
            int r0 = r4.what
            int r1 = com.huawei.hms.scankit.R.id.scankit_decode
            r2 = 1
            if (r0 != r1) goto L2d
            int r0 = r3.g
            if (r0 > r2) goto L1d
            int r0 = r0 + r2
            r3.g = r0
            com.huawei.hms.scankit.a r4 = r3.c
            int r0 = com.huawei.hms.scankit.R.id.scankit_decode_failed
            r4.sendEmptyMessage(r0)
            return
        L1d:
            java.lang.Object r4 = r4.obj
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L60
            byte[] r4 = (byte[]) r4
            boolean r0 = r3.d()
            r3.a(r4, r0)
            return
        L2d:
            int r1 = com.huawei.hms.scankit.R.id.scankit_quit
            if (r0 != r1) goto L48
            r4 = 0
            r3.d = r4
            com.huawei.hms.scankit.c$a r4 = com.huawei.hms.scankit.c.j
            if (r4 == 0) goto L40
            com.huawei.hms.scankit.c.a.a(r4, r2)
            com.huawei.hms.scankit.c$a r4 = com.huawei.hms.scankit.c.j
            r4.cancel(r2)
        L40:
            android.os.Looper r4 = android.os.Looper.myLooper()
            r4.quit()
            return
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleMessage  message.what:"
            r0.append(r1)
            int r4 = r4.what
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ScankitDecode"
            com.huawei.hms.scankit.p.o4.d(r0, r4)
        L60:
            return
    }
}
