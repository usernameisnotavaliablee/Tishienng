package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f extends com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate.Stub {
    private static volatile com.huawei.hms.scankit.f c;
    private volatile com.huawei.hms.scankit.p.w3 a;
    private volatile com.huawei.hms.scankit.p.x3 b;

    static {
            com.huawei.hms.scankit.f r0 = new com.huawei.hms.scankit.f
            r0.<init>()
            com.huawei.hms.scankit.f.c = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    static com.huawei.hms.scankit.f a() {
            com.huawei.hms.scankit.f r0 = com.huawei.hms.scankit.f.c
            return r0
    }

    private com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.feature.dynamic.IObjectWrapper r8, com.huawei.hms.feature.dynamic.IObjectWrapper r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto Ld
            java.lang.String r8 = "IRemoteDecoder"
            java.lang.String r9 = "bitmap is null"
            com.huawei.hms.scankit.p.o4.b(r8, r9)
            com.huawei.hms.ml.scan.HmsScan[] r8 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r8
        Ld:
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r8)
            r1 = 1
            if (r9 == 0) goto L5d
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto L5d
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "FormatValue"
            int r2 = r2.getInt(r3)
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "PhotoMode"
            boolean r3 = r3.getBoolean(r4, r0)
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "TransType"
            int r4 = r4.getInt(r5, r0)
            java.lang.Object r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r5 = "ParseResult"
            boolean r9 = r9.getBoolean(r5, r1)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r4
            r5 = 2
            if (r4 < r5) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            if (r1 == 0) goto L59
            int r2 = com.huawei.hms.scankit.p.w7.b(r2)
        L59:
            r6 = r1
            r1 = r9
            r9 = r6
            goto L60
        L5d:
            r9 = 0
            r2 = 0
            r3 = 1
        L60:
            com.huawei.hms.scankit.p.r3.f = r1
            boolean r1 = r8 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L79
            com.huawei.hms.scankit.p.r6 r0 = com.huawei.hms.scankit.p.r6.a()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            com.huawei.hms.scankit.p.w3 r1 = r7.a
            com.huawei.hms.ml.scan.HmsScan[] r8 = r0.b(r8, r2, r3, r1)
            if (r9 != 0) goto L78
            com.huawei.hms.ml.scan.HmsScan[] r8 = com.huawei.hms.scankit.p.w7.a(r8)
        L78:
            return r8
        L79:
            com.huawei.hms.ml.scan.HmsScan[] r8 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r8
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public com.huawei.hms.feature.dynamic.IObjectWrapper buildBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r9) throws android.os.RemoteException {
            r8 = this;
            if (r9 == 0) goto L77
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L77
            java.lang.Object r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r0 = "BitmapContent"
            java.lang.String r2 = r9.getString(r0)
            java.lang.String r0 = "BitmapFormat"
            int r3 = r9.getInt(r0)
            java.lang.String r0 = "BitmapWidth"
            int r4 = r9.getInt(r0)
            java.lang.String r0 = "BitmapHeight"
            int r5 = r9.getInt(r0)
            java.lang.String r0 = "BitmapMargin"
            r1 = 1
            int r0 = r9.getInt(r0, r1)
            java.lang.String r1 = "BitmapColor"
            r6 = -1
            int r1 = r9.getInt(r1, r6)
            java.lang.String r7 = "BitmapBackColor"
            int r9 = r9.getInt(r7, r6)
            r6 = r1
            com.huawei.hms.scankit.p.c5 r1 = new com.huawei.hms.scankit.p.c5     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            r1.<init>()     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r7 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            r7.<init>()     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r0 = r7.setBitmapMargin(r0)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r0 = r0.setBitmapColor(r6)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r9 = r0.setBitmapBackgroundColor(r9)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r6 = r9.create()     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            android.graphics.Bitmap r9 = r1.a(r2, r3, r4, r5, r6)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            if (r9 == 0) goto L65
            com.huawei.hms.feature.dynamic.IObjectWrapper r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r9)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            return r9
        L62:
            r0 = move-exception
            r9 = r0
            goto L6d
        L65:
            android.os.RemoteException r9 = new android.os.RemoteException     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            java.lang.String r0 = "Bitmap is Null"
            r9.<init>(r0)     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
            throw r9     // Catch: com.huawei.hms.hmsscankit.WriterException -> L62
        L6d:
            android.os.RemoteException r0 = new android.os.RemoteException
            java.lang.String r9 = r9.getMessage()
            r0.<init>(r9)
            throw r0
        L77:
            android.os.RemoteException r9 = new android.os.RemoteException
            java.lang.String r0 = "Bundle is Null"
            r9.<init>(r0)
            throw r9
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public void buildBitmapLog(com.huawei.hms.feature.dynamic.IObjectWrapper r3) {
            r2 = this;
            java.lang.String r0 = "IRemoteDecoderDelegateImpl"
            if (r3 == 0) goto L2f
            java.lang.Object r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r3)
            boolean r1 = r1 instanceof android.os.Bundle
            if (r1 != 0) goto Ld
            goto L2f
        Ld:
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.huawei.hms.scankit.p.x3 r1 = r2.b
            if (r1 != 0) goto L2f
            com.huawei.hms.scankit.p.x3 r1 = new com.huawei.hms.scankit.p.x3     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L2a
            r1.<init>()     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L2a
            r2.b = r1     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L2a
            com.huawei.hms.scankit.p.x3 r1 = r2.b     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L2a
            r1.c(r3)     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L2a
            return
        L24:
            java.lang.String r3 = "buildBitmapLog Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L2f
        L2a:
            java.lang.String r3 = "buildBitmapLog RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
        L2f:
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r11, com.huawei.hms.feature.dynamic.IObjectWrapper r12) throws android.os.RemoteException {
            r10 = this;
            java.lang.String r0 = "Ha error"
            java.lang.String r1 = "IRemoteDecoderDelegateImpl"
            boolean r2 = com.huawei.hms.scankit.p.r3.A
            if (r2 != 0) goto Lb
            com.huawei.hms.scankit.util.OpencvJNI.init()
        Lb:
            if (r12 == 0) goto L1c
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto L1c
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            android.os.Bundle r2 = (android.os.Bundle) r2
            goto L21
        L1c:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L21:
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r12 == 0) goto L60
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            boolean r6 = r6 instanceof android.os.Bundle
            if (r6 == 0) goto L60
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "PackageName"
            java.lang.String r4 = r6.getString(r7, r4)
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "USEAPK"
            boolean r6 = r6.getBoolean(r7, r5)
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r8 = "ROLLBACK"
            boolean r7 = r7.getBoolean(r8, r5)
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = "ParseResult"
            boolean r8 = r8.getBoolean(r9, r3)
            goto L63
        L60:
            r6 = 0
            r7 = 0
            r8 = 1
        L63:
            com.huawei.hms.scankit.p.r3.f = r8
            if (r7 == 0) goto L76
            boolean r7 = com.huawei.hms.scankit.p.r3.a
            if (r7 != 0) goto L76
            if (r6 == 0) goto L76
            com.huawei.hms.ml.scan.HmsScan r11 = com.huawei.hms.scankit.p.r6.b()
            com.huawei.hms.ml.scan.HmsScan[] r12 = new com.huawei.hms.ml.scan.HmsScan[r3]
            r12[r5] = r11
            return r12
        L76:
            com.huawei.hms.scankit.p.w3 r3 = r10.a
            if (r3 != 0) goto L95
            java.util.HashSet r3 = com.huawei.hms.scankit.p.y3.a()
            boolean r3 = com.huawei.hms.scankit.p.y3.a(r4, r3)
            if (r3 == 0) goto L95
            com.huawei.hms.scankit.p.w3 r3 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L8e java.lang.RuntimeException -> L92
            java.lang.String r4 = "Bitmap"
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L8e java.lang.RuntimeException -> L92
            r10.a = r3     // Catch: java.lang.Exception -> L8e java.lang.RuntimeException -> L92
            goto L95
        L8e:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            goto L95
        L92:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
        L95:
            com.huawei.hms.ml.scan.HmsScan[] r11 = r10.a(r11, r12)
            return r11
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public com.huawei.hms.ml.scan.HmsScanResult decodeWithBuffer(byte[] r19, int r20, int r21, com.huawei.hms.feature.dynamic.IObjectWrapper r22) throws android.os.RemoteException {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "Ha error"
            java.lang.String r2 = "IRemoteDecoderDelegateImpl"
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            if (r19 != 0) goto L1a
            java.lang.String r1 = "IRemoteDecoder"
            java.lang.String r2 = "buffer is null"
            com.huawei.hms.scankit.p.o4.b(r1, r2)
            com.huawei.hms.ml.scan.HmsScanResult r1 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r2 = new com.huawei.hms.ml.scan.HmsScan[r4]
            r1.<init>(r3, r2)
            return r1
        L1a:
            boolean r5 = com.huawei.hms.scankit.p.r3.A
            if (r5 != 0) goto L21
            com.huawei.hms.scankit.util.OpencvJNI.init()
        L21:
            r5 = 1
            if (r22 == 0) goto L71
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            boolean r6 = r6 instanceof android.os.Bundle
            if (r6 == 0) goto L71
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "FormatValue"
            int r6 = r6.getInt(r7)
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r8 = "PhotoMode"
            boolean r7 = r7.getBoolean(r8, r4)
            com.huawei.hms.scankit.p.r3.c = r7
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = "TransType"
            int r8 = r8.getInt(r9, r4)
            java.lang.Object r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.String r10 = "ParseResult"
            boolean r9 = r9.getBoolean(r10, r5)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r8
            r10 = 2
            if (r8 < r10) goto L65
            r8 = 1
            goto L66
        L65:
            r8 = 0
        L66:
            if (r8 == 0) goto L6c
            int r6 = com.huawei.hms.scankit.p.w7.b(r6)
        L6c:
            r14 = r6
            r15 = r7
            r16 = r8
            goto L76
        L71:
            r9 = 1
            r14 = 0
            r15 = 1
            r16 = 0
        L76:
            if (r22 == 0) goto L87
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            boolean r6 = r6 instanceof android.os.Bundle
            if (r6 == 0) goto L87
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r6 = (android.os.Bundle) r6
            goto L8c
        L87:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L8c:
            java.lang.String r7 = ""
            if (r22 == 0) goto Lbd
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            boolean r8 = r8 instanceof android.os.Bundle
            if (r8 == 0) goto Lbd
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r10 = "PackageName"
            java.lang.String r7 = r8.getString(r10, r7)
            java.lang.Object r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r10 = "USEAPK"
            boolean r8 = r8.getBoolean(r10, r4)
            java.lang.Object r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r22)
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r11 = "ROLLBACK"
            boolean r10 = r10.getBoolean(r11, r4)
            goto Lbf
        Lbd:
            r8 = 0
            r10 = 0
        Lbf:
            if (r10 == 0) goto Ld5
            boolean r10 = com.huawei.hms.scankit.p.r3.a
            if (r10 != 0) goto Ld5
            if (r8 == 0) goto Ld5
            com.huawei.hms.ml.scan.HmsScan r1 = com.huawei.hms.scankit.p.r6.b()
            com.huawei.hms.ml.scan.HmsScanResult r2 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r5 = new com.huawei.hms.ml.scan.HmsScan[r5]
            r5[r4] = r1
            r2.<init>(r3, r5)
            return r2
        Ld5:
            com.huawei.hms.scankit.p.w3 r3 = r0.a
            if (r3 != 0) goto Lf4
            java.util.HashSet r3 = com.huawei.hms.scankit.p.y3.a()
            boolean r3 = com.huawei.hms.scankit.p.y3.a(r7, r3)
            if (r3 == 0) goto Lf4
            com.huawei.hms.scankit.p.w3 r3 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> Led java.lang.RuntimeException -> Lf1
            java.lang.String r4 = "Bitmap"
            r3.<init>(r6, r4)     // Catch: java.lang.Exception -> Led java.lang.RuntimeException -> Lf1
            r0.a = r3     // Catch: java.lang.Exception -> Led java.lang.RuntimeException -> Lf1
            goto Lf4
        Led:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
            goto Lf4
        Lf1:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
        Lf4:
            com.huawei.hms.scankit.p.r3.f = r9
            com.huawei.hms.scankit.p.r6 r10 = com.huawei.hms.scankit.p.r6.a()
            com.huawei.hms.scankit.p.w3 r1 = r0.a
            r11 = r19
            r12 = r20
            r13 = r21
            r17 = r1
            com.huawei.hms.ml.scan.HmsScanResult r1 = r10.a(r11, r12, r13, r14, r15, r16, r17)
            return r1
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public com.huawei.hms.feature.dynamic.IObjectWrapper queryDeepLinkInfo(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            return r1
    }
}
