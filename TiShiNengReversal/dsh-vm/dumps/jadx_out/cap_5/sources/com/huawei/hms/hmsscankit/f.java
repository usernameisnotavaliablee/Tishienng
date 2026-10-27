package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static volatile com.huawei.hms.scankit.p.x3 a;
    private static volatile com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate b;
    private static volatile com.huawei.hms.scankit.p.w3 c;
    private static volatile com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.text.SimpleDateFormat {
        a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                return
        }
    }

    static {
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(java.lang.String r2, int r3, int r4, int r5, com.huawei.hms.ml.scan.HmsBuildBitmapOption r6) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r2 != 0) goto L9
            r2 = -1
            goto Ld
        L9:
            int r2 = r2.length()
        Ld:
            java.lang.String r1 = "contentLength"
            r0.putInt(r1, r2)
            java.lang.String r2 = "scanType"
            r0.putInt(r2, r3)
            java.lang.String r2 = "reqWidth"
            r0.putInt(r2, r4)
            java.lang.String r2 = "reqHeight"
            r0.putInt(r2, r5)
            if (r6 != 0) goto L26
            java.lang.String r2 = "null"
            goto L2a
        L26:
            java.lang.String r2 = r6.toString()
        L2a:
            java.lang.String r3 = "buildBitmapOption"
            r0.putString(r3, r2)
            java.lang.String r2 = "apiName"
            java.lang.String r3 = "BuildBitmap"
            r0.putString(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "callTime"
            r0.putLong(r4, r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "transId"
            r0.putString(r3, r2)
            return r0
    }

    static com.huawei.hms.ml.scan.HmsScanResult a(android.content.Context r12, com.huawei.hms.ml.scan.HmsScanFrame r13, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r14) {
            com.huawei.hms.ml.scan.HmsScanResult r0 = new com.huawei.hms.ml.scan.HmsScanResult
            r1 = 0
            com.huawei.hms.ml.scan.HmsScan[] r2 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r3 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r3, r2)
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = com.huawei.hms.hmsscankit.f.d
            if (r0 != 0) goto L11
            a(r12)
        L11:
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r0 = com.huawei.hms.hmsscankit.f.d
            if (r0 == 0) goto L106
            android.os.Bundle r0 = new android.os.Bundle     // Catch: android.os.RemoteException -> L106
            r0.<init>()     // Catch: android.os.RemoteException -> L106
            java.lang.String r2 = "Screen"
            android.graphics.Point r4 = new android.graphics.Point     // Catch: android.os.RemoteException -> L106
            int r5 = r13.getWidth()     // Catch: android.os.RemoteException -> L106
            int r6 = r13.getHeight()     // Catch: android.os.RemoteException -> L106
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L106
            r0.putParcelable(r2, r4)     // Catch: android.os.RemoteException -> L106
            java.lang.String r2 = "Rect"
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch: android.os.RemoteException -> L106
            int r5 = r13.getWidth()     // Catch: android.os.RemoteException -> L106
            int r6 = r13.getHeight()     // Catch: android.os.RemoteException -> L106
            r4.<init>(r1, r1, r5, r6)     // Catch: android.os.RemoteException -> L106
            r0.putParcelable(r2, r4)     // Catch: android.os.RemoteException -> L106
            java.lang.String r2 = "ROLLBACK"
            boolean r4 = com.huawei.hms.hmsscankit.g.c     // Catch: android.os.RemoteException -> L106
            r0.putBoolean(r2, r4)     // Catch: android.os.RemoteException -> L106
            java.lang.String r2 = "USEAPK"
            boolean r4 = com.huawei.hms.hmsscankit.g.a     // Catch: android.os.RemoteException -> L106
            r0.putBoolean(r2, r4)     // Catch: android.os.RemoteException -> L106
            com.huawei.hms.scankit.p.w3 r2 = com.huawei.hms.hmsscankit.f.c     // Catch: android.os.RemoteException -> L106
            java.lang.String r4 = "ScankitRemoteDecoder"
            if (r2 != 0) goto L7e
            com.huawei.hms.scankit.p.w3 r2 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            java.lang.String r5 = "PhotoMode"
            r2.<init>(r0, r5)     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            com.huawei.hms.hmsscankit.f.c = r2     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            com.huawei.hms.scankit.p.w3 r2 = com.huawei.hms.hmsscankit.f.c     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            java.lang.String r5 = "single"
            r2.a(r5)     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            com.huawei.hms.scankit.p.w3 r2 = com.huawei.hms.hmsscankit.f.c     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            int r5 = r13.getHeight()     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            int r6 = r13.getWidth()     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            int r5 = r5 * r6
            com.huawei.hms.scankit.p.w3$c r2 = r2.a(r1, r5)     // Catch: java.lang.Exception -> L73 java.lang.RuntimeException -> L79
            goto L7f
        L73:
            java.lang.String r2 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r4, r2)     // Catch: android.os.RemoteException -> L106
            goto L7e
        L79:
            java.lang.String r2 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r4, r2)     // Catch: android.os.RemoteException -> L106
        L7e:
            r2 = 0
        L7f:
            if (r14 == 0) goto L89
            int r14 = r14.mode     // Catch: android.os.RemoteException -> L106
            int r14 = com.huawei.hms.scankit.p.w7.b(r14)     // Catch: android.os.RemoteException -> L106
            r10 = r14
            goto L8d
        L89:
            r14 = 8191(0x1fff, float:1.1478E-41)
            r10 = 8191(0x1fff, float:1.1478E-41)
        L8d:
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r5 = com.huawei.hms.hmsscankit.f.d     // Catch: android.os.RemoteException -> L106
            android.graphics.YuvImage r14 = r13.getYuvImage()     // Catch: android.os.RemoteException -> L106
            byte[] r6 = r14.getYuvData()     // Catch: android.os.RemoteException -> L106
            int r7 = r13.getWidth()     // Catch: android.os.RemoteException -> L106
            int r8 = r13.getHeight()     // Catch: android.os.RemoteException -> L106
            com.huawei.hms.feature.dynamic.IObjectWrapper r11 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L106
            r9 = 0
            com.huawei.hms.scankit.p.s6[] r14 = r5.decode(r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L106
            a(r14)     // Catch: android.os.RemoteException -> L106
            boolean r5 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> L106
            if (r5 == 0) goto Ld4
            java.lang.String r14 = "iRemoteFrameDecoderDelegate decode rollback"
            com.huawei.hms.scankit.p.o4.b(r4, r14)     // Catch: android.os.RemoteException -> L106
            a(r12)     // Catch: android.os.RemoteException -> L106
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r5 = com.huawei.hms.hmsscankit.f.d     // Catch: android.os.RemoteException -> L106
            android.graphics.YuvImage r12 = r13.getYuvImage()     // Catch: android.os.RemoteException -> L106
            byte[] r6 = r12.getYuvData()     // Catch: android.os.RemoteException -> L106
            int r7 = r13.getWidth()     // Catch: android.os.RemoteException -> L106
            int r8 = r13.getHeight()     // Catch: android.os.RemoteException -> L106
            com.huawei.hms.feature.dynamic.IObjectWrapper r11 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L106
            r9 = 0
            com.huawei.hms.scankit.p.s6[] r14 = r5.decode(r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L106
        Ld4:
            com.huawei.hms.ml.scan.HmsScan[] r12 = com.huawei.hms.scankit.p.y6.a(r14)     // Catch: android.os.RemoteException -> L106
            com.huawei.hms.scankit.p.w3 r13 = com.huawei.hms.hmsscankit.f.c     // Catch: android.os.RemoteException -> L106
            if (r13 == 0) goto Le1
            com.huawei.hms.scankit.p.w3 r13 = com.huawei.hms.hmsscankit.f.c     // Catch: android.os.RemoteException -> L106
            r13.a(r12, r2)     // Catch: android.os.RemoteException -> L106
        Le1:
            int r13 = r12.length     // Catch: android.os.RemoteException -> L106
            if (r13 == 0) goto L100
            r13 = r12[r1]     // Catch: android.os.RemoteException -> L106
            if (r13 == 0) goto L100
            java.lang.String r13 = r13.getOriginalValue()     // Catch: android.os.RemoteException -> L106
            if (r13 == 0) goto L100
            r13 = r12[r1]     // Catch: android.os.RemoteException -> L106
            java.lang.String r13 = r13.getOriginalValue()     // Catch: android.os.RemoteException -> L106
            int r13 = r13.length()     // Catch: android.os.RemoteException -> L106
            if (r13 == 0) goto L100
            com.huawei.hms.ml.scan.HmsScanResult r13 = new com.huawei.hms.ml.scan.HmsScanResult     // Catch: android.os.RemoteException -> L106
            r13.<init>(r1, r12)     // Catch: android.os.RemoteException -> L106
            return r13
        L100:
            com.huawei.hms.ml.scan.HmsScanResult r13 = new com.huawei.hms.ml.scan.HmsScanResult     // Catch: android.os.RemoteException -> L106
            r13.<init>(r3, r12)     // Catch: android.os.RemoteException -> L106
            return r13
        L106:
            com.huawei.hms.ml.scan.HmsScanResult r12 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r13 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r12.<init>(r3, r13)
            return r12
    }

    static com.huawei.hms.ml.scan.HmsScanResult a(android.content.Context r6, byte[] r7, int r8, int r9, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r10) {
            com.huawei.hms.ml.scan.HmsScanResult r0 = new com.huawei.hms.ml.scan.HmsScanResult
            r1 = 0
            com.huawei.hms.ml.scan.HmsScan[] r1 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r2 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r2, r1)
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = com.huawei.hms.hmsscankit.f.b
            java.lang.String r2 = "RemoteException"
            java.lang.String r3 = "ScankitRemoteDecoder"
            if (r1 != 0) goto L24
            com.huawei.hms.hmsscankit.api.IRemoteCreator r1 = com.huawei.hms.hmsscankit.g.c(r6)
            if (r1 != 0) goto L1a
            goto L92
        L1a:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = r1.newRemoteDecoderDelegate()     // Catch: android.os.RemoteException -> L21
            com.huawei.hms.hmsscankit.f.b = r1     // Catch: android.os.RemoteException -> L21
            goto L24
        L21:
            com.huawei.hms.scankit.p.o4.b(r3, r2)
        L24:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = com.huawei.hms.hmsscankit.f.b
            if (r1 == 0) goto Lae
            android.os.Bundle r1 = new android.os.Bundle     // Catch: android.os.RemoteException -> Lab
            r1.<init>()     // Catch: android.os.RemoteException -> Lab
            if (r10 == 0) goto L44
            java.lang.String r4 = "FormatValue"
            int r5 = r10.mode     // Catch: android.os.RemoteException -> Lab
            r1.putInt(r4, r5)     // Catch: android.os.RemoteException -> Lab
            java.lang.String r4 = "PhotoMode"
            boolean r5 = r10.photoMode     // Catch: android.os.RemoteException -> Lab
            r1.putBoolean(r4, r5)     // Catch: android.os.RemoteException -> Lab
            java.lang.String r4 = "ParseResult"
            boolean r10 = r10.parseResult     // Catch: android.os.RemoteException -> Lab
            r1.putBoolean(r4, r10)     // Catch: android.os.RemoteException -> Lab
        L44:
            java.lang.String r10 = "ROLLBACK"
            boolean r4 = com.huawei.hms.hmsscankit.g.c     // Catch: android.os.RemoteException -> Lab
            r1.putBoolean(r10, r4)     // Catch: android.os.RemoteException -> Lab
            java.lang.String r10 = "USEAPK"
            boolean r4 = com.huawei.hms.hmsscankit.g.a     // Catch: android.os.RemoteException -> Lab
            r1.putBoolean(r10, r4)     // Catch: android.os.RemoteException -> Lab
            java.lang.String r10 = "TransType"
            r4 = 3
            r1.putInt(r10, r4)     // Catch: android.os.RemoteException -> Lab
            java.lang.String r10 = "PackageName"
            java.lang.String r4 = com.huawei.hms.scankit.p.y3.b(r6)     // Catch: android.os.RemoteException -> Lab
            r1.putString(r10, r4)     // Catch: android.os.RemoteException -> Lab
            android.os.Bundle r10 = com.huawei.hms.scankit.p.y3.a(r6)     // Catch: android.os.RemoteException -> Lab
            r1.putAll(r10)     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r10 = com.huawei.hms.hmsscankit.f.b     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.ml.scan.HmsScanResult r10 = r10.decodeWithBuffer(r7, r8, r9, r4)     // Catch: android.os.RemoteException -> Lab
            if (r10 == 0) goto La7
            com.huawei.hms.ml.scan.HmsScan[] r4 = r10.getHmsScans()     // Catch: android.os.RemoteException -> Lab
            if (r4 == 0) goto La7
            com.huawei.hms.ml.scan.HmsScan[] r4 = r10.getHmsScans()     // Catch: android.os.RemoteException -> Lab
            a(r4)     // Catch: android.os.RemoteException -> Lab
            boolean r4 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> Lab
            if (r4 == 0) goto La7
            java.lang.String r10 = "iRemoteDecoderDelegate decodeWithBuffer rollback"
            com.huawei.hms.scankit.p.o4.d(r3, r10)     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.hmsscankit.api.IRemoteCreator r6 = com.huawei.hms.hmsscankit.g.c(r6)     // Catch: android.os.RemoteException -> Lab
            if (r6 != 0) goto L93
        L92:
            return r0
        L93:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r6 = r6.newRemoteDecoderDelegate()     // Catch: android.os.RemoteException -> L9a
            com.huawei.hms.hmsscankit.f.b = r6     // Catch: android.os.RemoteException -> L9a
            goto L9d
        L9a:
            com.huawei.hms.scankit.p.o4.b(r3, r2)     // Catch: android.os.RemoteException -> Lab
        L9d:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r6 = com.huawei.hms.hmsscankit.f.b     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> Lab
            com.huawei.hms.ml.scan.HmsScanResult r10 = r6.decodeWithBuffer(r7, r8, r9, r10)     // Catch: android.os.RemoteException -> Lab
        La7:
            if (r10 == 0) goto Lae
            r0 = r10
            goto Lae
        Lab:
            com.huawei.hms.scankit.p.o4.b(r3, r2)
        Lae:
            return r0
    }

    public static void a(int r4, android.graphics.Bitmap r5, android.os.Bundle r6) {
            if (r6 == 0) goto L46
            java.lang.String r0 = "result"
            r6.putInt(r0, r4)
            r4 = -1
            if (r5 != 0) goto Lc
            r0 = -1
            goto L10
        Lc:
            int r0 = r5.getWidth()
        L10:
            java.lang.String r1 = "outputWidth"
            r6.putInt(r1, r0)
            if (r5 != 0) goto L18
            goto L1c
        L18:
            int r4 = r5.getHeight()
        L1c:
            java.lang.String r5 = "outputHeight"
            r6.putInt(r5, r4)
            java.lang.String r4 = "callTime"
            long r0 = r6.getLong(r4)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.String r5 = "costTime"
            r6.putLong(r5, r2)
            com.huawei.hms.hmsscankit.f$a r5 = new com.huawei.hms.hmsscankit.f$a
            java.lang.String r2 = "yyyyMMddHHmmss.SSS"
            r5.<init>(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r5 = r5.format(r0)
            r6.putString(r4, r5)
            a(r6)
        L46:
            return
    }

    static void a(android.content.Context r3) {
            java.lang.String r0 = "ScankitRemoteDecoder"
            android.content.Context r3 = com.huawei.hms.hmsscankit.g.e(r3)     // Catch: java.lang.Throwable -> L6 java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
        L6:
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch: java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
            java.lang.String r2 = "com.huawei.hms.scankit.DecoderCreator"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
            java.lang.String r2 = "com.huawei.hms.scankit.aiscan.common.BarcodeFormat"
            r3.loadClass(r2)     // Catch: java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
            java.lang.Object r3 = r1.newInstance()     // Catch: java.lang.InstantiationException -> L1e java.lang.ClassNotFoundException -> L24 java.lang.IllegalAccessException -> L2a
            goto L30
        L1e:
            java.lang.String r3 = "InstantiationException"
            com.huawei.hms.scankit.p.o4.a(r0, r3)
            goto L2f
        L24:
            java.lang.String r3 = "ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.a(r0, r3)
            goto L2f
        L2a:
            java.lang.String r3 = "IllegalAccessException"
            com.huawei.hms.scankit.p.o4.a(r0, r3)
        L2f:
            r3 = 0
        L30:
            boolean r1 = r3 instanceof android.os.IBinder
            if (r1 == 0) goto L46
            android.os.IBinder r3 = (android.os.IBinder) r3
            com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r3 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.asInterface(r3)
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r3 = r3.newRemoteFrameDecoderDelegate()     // Catch: java.lang.Exception -> L41
            com.huawei.hms.hmsscankit.f.d = r3     // Catch: java.lang.Exception -> L41
            goto L46
        L41:
            java.lang.String r3 = "remoteception"
            com.huawei.hms.scankit.p.o4.a(r0, r3)
        L46:
            return
    }

    private static void a(android.os.Bundle r3) {
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            java.lang.String r1 = "buildBitmapLog Exception"
            java.lang.String r2 = "ScankitRemoteDecoder"
            if (r0 != 0) goto L37
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()     // Catch: java.lang.NoClassDefFoundError -> L16 java.lang.Exception -> L1c java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.ClassNotFoundException -> L32
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.NoClassDefFoundError -> L16 java.lang.Exception -> L1c java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.ClassNotFoundException -> L32
            com.huawei.hms.hmsscankit.g.b(r0)     // Catch: java.lang.NoClassDefFoundError -> L16 java.lang.Exception -> L1c java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.ClassNotFoundException -> L32
            goto L37
        L16:
            java.lang.String r3 = "buildBitmapLog NoClassDefFoundError"
            com.huawei.hms.scankit.p.o4.b(r2, r3)
            return
        L1c:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
            goto L37
        L20:
            java.lang.String r0 = "buildBitmapLog IllegalAccessException"
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            goto L37
        L26:
            java.lang.String r0 = "buildBitmapLog InvocationTargetException"
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            goto L37
        L2c:
            java.lang.String r0 = "buildBitmapLog NoSuchMethodException"
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            goto L37
        L32:
            java.lang.String r0 = "buildBitmapLog ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r2, r0)
        L37:
            com.huawei.hms.scankit.p.x3 r0 = com.huawei.hms.hmsscankit.f.a
            if (r0 != 0) goto L51
            com.huawei.hms.scankit.p.x3 r0 = new com.huawei.hms.scankit.p.x3     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L4c
            r0.<init>()     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L4c
            com.huawei.hms.hmsscankit.f.a = r0     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L4c
            com.huawei.hms.scankit.p.x3 r0 = com.huawei.hms.hmsscankit.f.a     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L4c
            r0.c(r3)     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L4c
            goto L51
        L48:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
            goto L51
        L4c:
            java.lang.String r3 = "buildBitmapLog RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r2, r3)
        L51:
            return
    }

    public static void a(com.huawei.hms.ml.scan.HmsScan[] r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L14
            r3 = r3[r1]
            android.graphics.Point[] r3 = r3.getCornerPoints()
            boolean r3 = a(r3)
            if (r3 == 0) goto L14
            com.huawei.hms.hmsscankit.g.b = r2
            return
        L14:
            com.huawei.hms.hmsscankit.g.b = r1
            return
    }

    public static void a(com.huawei.hms.scankit.p.s6[] r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L14
            r3 = r3[r1]
            com.huawei.hms.scankit.p.u6[] r3 = r3.j()
            boolean r3 = a(r3)
            if (r3 == 0) goto L14
            com.huawei.hms.hmsscankit.g.b = r2
            return
        L14:
            com.huawei.hms.hmsscankit.g.b = r1
            return
    }

    private static boolean a(android.graphics.Point[] r6) {
            r0 = 0
            if (r6 == 0) goto L1b
            int r1 = r6.length
            if (r1 == 0) goto L1b
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r6[r2]
            int r4 = r3.x
            r5 = -2
            if (r4 == r5) goto L16
            int r3 = r3.y
            if (r3 == r5) goto L16
            return r0
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            r6 = 1
            return r6
        L1b:
            return r0
    }

    private static boolean a(com.huawei.hms.scankit.p.u6[] r10) {
            r0 = 0
            if (r10 == 0) goto L2d
            int r1 = r10.length
            if (r1 == 0) goto L2d
            int r1 = r10.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L2b
            r3 = r10[r2]
            float r4 = r3.b()
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r4 = r4 - r5
            double r6 = (double) r4
            r8 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L28
            float r3 = r3.c()
            float r3 = r3 - r5
            double r3 = (double) r3
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L28
            return r0
        L28:
            int r2 = r2 + 1
            goto L8
        L2b:
            r10 = 1
            return r10
        L2d:
            return r0
    }

    static com.huawei.hms.ml.scan.HmsScan[] a(android.content.Context r1, android.graphics.Bitmap r2, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r3) {
            int r0 = r3.mode
            com.huawei.hms.ml.scan.HmsScan[] r1 = a(r1, r2, r3, r0)
            return r1
    }

    static com.huawei.hms.ml.scan.HmsScan[] a(android.content.Context r5, android.graphics.Bitmap r6, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r7, int r8) {
            r0 = 0
            com.huawei.hms.ml.scan.HmsScan[] r0 = new com.huawei.hms.ml.scan.HmsScan[r0]
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = com.huawei.hms.hmsscankit.f.b
            java.lang.String r2 = "RemoteException"
            java.lang.String r3 = "ScankitRemoteDecoder"
            if (r1 != 0) goto L1c
            com.huawei.hms.hmsscankit.api.IRemoteCreator r1 = com.huawei.hms.hmsscankit.g.c(r5)
            if (r1 != 0) goto L12
            goto L80
        L12:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = r1.newRemoteDecoderDelegate()     // Catch: android.os.RemoteException -> L19
            com.huawei.hms.hmsscankit.f.b = r1     // Catch: android.os.RemoteException -> L19
            goto L1c
        L19:
            com.huawei.hms.scankit.p.o4.b(r3, r2)
        L1c:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r1 = com.huawei.hms.hmsscankit.f.b
            if (r1 == 0) goto La0
            android.os.Bundle r1 = new android.os.Bundle     // Catch: android.os.RemoteException -> L9d
            r1.<init>()     // Catch: android.os.RemoteException -> L9d
            if (r7 == 0) goto L3a
            java.lang.String r4 = "FormatValue"
            r1.putInt(r4, r8)     // Catch: android.os.RemoteException -> L9d
            java.lang.String r8 = "PhotoMode"
            boolean r4 = r7.photoMode     // Catch: android.os.RemoteException -> L9d
            r1.putBoolean(r8, r4)     // Catch: android.os.RemoteException -> L9d
            java.lang.String r8 = "ParseResult"
            boolean r7 = r7.parseResult     // Catch: android.os.RemoteException -> L9d
            r1.putBoolean(r8, r7)     // Catch: android.os.RemoteException -> L9d
        L3a:
            java.lang.String r7 = "TransType"
            r8 = 3
            r1.putInt(r7, r8)     // Catch: android.os.RemoteException -> L9d
            java.lang.String r7 = "PackageName"
            java.lang.String r8 = com.huawei.hms.scankit.p.y3.b(r5)     // Catch: android.os.RemoteException -> L9d
            r1.putString(r7, r8)     // Catch: android.os.RemoteException -> L9d
            java.lang.String r7 = "ROLLBACK"
            boolean r8 = com.huawei.hms.hmsscankit.g.c     // Catch: android.os.RemoteException -> L9d
            r1.putBoolean(r7, r8)     // Catch: android.os.RemoteException -> L9d
            java.lang.String r7 = "USEAPK"
            boolean r8 = com.huawei.hms.hmsscankit.g.a     // Catch: android.os.RemoteException -> L9d
            r1.putBoolean(r7, r8)     // Catch: android.os.RemoteException -> L9d
            android.os.Bundle r7 = com.huawei.hms.scankit.p.y3.a(r5)     // Catch: android.os.RemoteException -> L9d
            r1.putAll(r7)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r7 = com.huawei.hms.hmsscankit.f.b     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.feature.dynamic.IObjectWrapper r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r6)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.ml.scan.HmsScan[] r7 = r7.decodeWithBitmap(r8, r4)     // Catch: android.os.RemoteException -> L9d
            a(r7)     // Catch: android.os.RemoteException -> L9d
            boolean r8 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> L9d
            if (r8 == 0) goto L99
            java.lang.String r7 = "iRemoteDecoderDelegate decodeWithBitmap rollback"
            com.huawei.hms.scankit.p.o4.d(r3, r7)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.hmsscankit.api.IRemoteCreator r5 = com.huawei.hms.hmsscankit.g.c(r5)     // Catch: android.os.RemoteException -> L9d
            if (r5 != 0) goto L81
        L80:
            return r0
        L81:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r5 = r5.newRemoteDecoderDelegate()     // Catch: android.os.RemoteException -> L88
            com.huawei.hms.hmsscankit.f.b = r5     // Catch: android.os.RemoteException -> L88
            goto L8b
        L88:
            com.huawei.hms.scankit.p.o4.b(r3, r2)     // Catch: android.os.RemoteException -> L9d
        L8b:
            com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate r5 = com.huawei.hms.hmsscankit.f.b     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r6)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L9d
            com.huawei.hms.ml.scan.HmsScan[] r7 = r5.decodeWithBitmap(r6, r7)     // Catch: android.os.RemoteException -> L9d
        L99:
            if (r7 == 0) goto La0
            r0 = r7
            goto La0
        L9d:
            com.huawei.hms.scankit.p.o4.b(r3, r2)
        La0:
            return r0
    }
}
