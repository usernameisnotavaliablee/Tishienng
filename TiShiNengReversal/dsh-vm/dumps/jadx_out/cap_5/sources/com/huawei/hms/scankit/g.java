package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g extends com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub {
    private static volatile com.huawei.hms.scankit.g b;
    private volatile com.huawei.hms.scankit.p.w3 a;

    static {
            com.huawei.hms.scankit.g r0 = new com.huawei.hms.scankit.g
            r0.<init>()
            com.huawei.hms.scankit.g.b = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    private android.os.Bundle a(com.huawei.hms.feature.dynamic.IObjectWrapper r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r2)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L11
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
        L11:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
    }

    static com.huawei.hms.scankit.g a() {
            com.huawei.hms.scankit.g r0 = com.huawei.hms.scankit.g.b
            return r0
    }

    private com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.feature.dynamic.IObjectWrapper r9, com.huawei.hms.feature.dynamic.IObjectWrapper r10) {
            r8 = this;
            java.lang.String r0 = "start getHmsMLVisionScanResultByBitmap"
            java.lang.String r1 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            r0 = 0
            if (r9 != 0) goto L14
            java.lang.String r9 = "ScankitRemote"
            java.lang.String r10 = "bitmap is null"
            com.huawei.hms.scankit.p.o4.b(r9, r10)
            com.huawei.hms.ml.scan.HmsScan[] r9 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r9
        L14:
            java.lang.Object r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r9)
            r2 = 1
            if (r10 == 0) goto L6f
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            boolean r3 = r3 instanceof android.os.Bundle
            if (r3 == 0) goto L6f
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "PhotoMode"
            boolean r3 = r3.getBoolean(r4, r0)
            com.huawei.hms.scankit.p.r3.c = r3
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "FormatValue"
            int r4 = r4.getInt(r5)
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "ParseResult"
            boolean r5 = r5.getBoolean(r6, r2)
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r7 = (android.os.Bundle) r7
            boolean r6 = r7.getBoolean(r6, r0)
            java.lang.Object r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r7 = "TransType"
            int r10 = r10.getInt(r7, r0)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r10
            r7 = 2
            if (r10 < r7) goto L65
            goto L66
        L65:
            r2 = 0
        L66:
            if (r2 == 0) goto L6c
            int r4 = com.huawei.hms.scankit.p.w7.b(r4)
        L6c:
            r10 = r2
            r2 = r5
            goto L73
        L6f:
            r10 = 0
            r3 = 0
            r4 = 0
            r6 = 0
        L73:
            com.huawei.hms.scankit.p.r3.f = r2
            com.huawei.hms.scankit.p.r3.g = r6
            boolean r2 = r9 instanceof android.graphics.Bitmap
            if (r2 == 0) goto L93
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.String r0 = "end getHmsMLVisionScanResultByBitmap"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            com.huawei.hms.scankit.p.r6 r0 = com.huawei.hms.scankit.p.r6.a()
            com.huawei.hms.scankit.p.w3 r1 = r8.a
            com.huawei.hms.ml.scan.HmsScan[] r9 = r0.a(r9, r4, r3, r1)
            if (r10 != 0) goto L92
            com.huawei.hms.ml.scan.HmsScan[] r9 = com.huawei.hms.scankit.p.w7.a(r9)
        L92:
            return r9
        L93:
            com.huawei.hms.ml.scan.HmsScan[] r9 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r9
    }

    private com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.hmsscankit.DetailRect r11, com.huawei.hms.feature.dynamic.IObjectWrapper r12, com.huawei.hms.feature.dynamic.IObjectWrapper r13) {
            r10 = this;
            r0 = 0
            if (r12 != 0) goto Ld
            java.lang.String r11 = "ScankitRemoteS"
            java.lang.String r12 = "bytebuffer is null"
            com.huawei.hms.scankit.p.o4.b(r11, r12)
            com.huawei.hms.ml.scan.HmsScan[] r11 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r11
        Ld:
            java.lang.Object r12 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r12)
            r1 = 1
            if (r13 == 0) goto L6a
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto L6a
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "FormatValue"
            int r2 = r2.getInt(r3)
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "PhotoMode"
            boolean r3 = r3.getBoolean(r4, r0)
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "TransType"
            int r4 = r4.getInt(r5, r0)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r4
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "ParseResult"
            boolean r5 = r5.getBoolean(r6, r1)
            java.lang.Object r13 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r13)
            android.os.Bundle r13 = (android.os.Bundle) r13
            java.lang.String r6 = "NewVersion"
            boolean r13 = r13.getBoolean(r6, r0)
            r6 = 2
            if (r4 < r6) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L65
            int r2 = com.huawei.hms.scankit.p.w7.b(r2)
        L65:
            r7 = r2
            r8 = r3
            r2 = r1
            r1 = r5
            goto L6e
        L6a:
            r13 = 0
            r2 = 0
            r7 = 0
            r8 = 0
        L6e:
            com.huawei.hms.scankit.p.r3.f = r1
            com.huawei.hms.scankit.p.r3.g = r13
            boolean r13 = r12 instanceof java.nio.ByteBuffer
            if (r13 == 0) goto L9c
            r4 = r12
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            com.huawei.hms.scankit.p.r6 r3 = com.huawei.hms.scankit.p.r6.a()
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r11 != 0) goto L84
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L87
        L84:
            int r13 = r11.width
            r5 = r13
        L87:
            if (r11 != 0) goto L8c
            r6 = 1000(0x3e8, float:1.401E-42)
            goto L8f
        L8c:
            int r12 = r11.height
            r6 = r12
        L8f:
            com.huawei.hms.scankit.p.w3 r9 = r10.a
            com.huawei.hms.ml.scan.HmsScan[] r11 = r3.a(r4, r5, r6, r7, r8, r9)
            if (r2 != 0) goto L9b
            com.huawei.hms.ml.scan.HmsScan[] r11 = com.huawei.hms.scankit.p.w7.a(r11)
        L9b:
            return r11
        L9c:
            com.huawei.hms.ml.scan.HmsScan[] r11 = new com.huawei.hms.ml.scan.HmsScan[r0]
            return r11
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public com.huawei.hms.ml.scan.HmsScan[] decodeInBitmap(com.huawei.hms.hmsscankit.DetailRect r8, com.huawei.hms.feature.dynamic.IObjectWrapper r9, com.huawei.hms.feature.dynamic.IObjectWrapper r10) throws android.os.RemoteException {
            r7 = this;
            java.lang.String r8 = "Ha error"
            java.lang.String r0 = "IRemoteDecoderDelegateImpl"
            boolean r1 = com.huawei.hms.scankit.p.r3.A
            if (r1 != 0) goto Lb
            com.huawei.hms.scankit.util.OpencvJNI.init()
        Lb:
            java.lang.String r1 = "Scankit"
            java.lang.String r2 = "start decodeInBitmap"
            com.huawei.hms.scankit.p.o4.d(r1, r2)
            android.os.Bundle r1 = r7.a(r10)
            java.lang.String r2 = ""
            r3 = 0
            if (r10 == 0) goto L48
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            boolean r4 = r4 instanceof android.os.Bundle
            if (r4 == 0) goto L48
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "PackageName"
            java.lang.String r2 = r4.getString(r5, r2)
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "USEAPK"
            boolean r4 = r4.getBoolean(r5, r3)
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r10)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "ROLLBACK"
            boolean r5 = r5.getBoolean(r6, r3)
            goto L4a
        L48:
            r4 = 0
            r5 = 0
        L4a:
            if (r5 == 0) goto L5c
            boolean r5 = com.huawei.hms.scankit.p.r3.a
            if (r5 != 0) goto L5c
            if (r4 == 0) goto L5c
            com.huawei.hms.ml.scan.HmsScan r8 = com.huawei.hms.scankit.p.r6.b()
            r9 = 1
            com.huawei.hms.ml.scan.HmsScan[] r9 = new com.huawei.hms.ml.scan.HmsScan[r9]
            r9[r3] = r8
            return r9
        L5c:
            com.huawei.hms.scankit.p.w3 r3 = r7.a
            if (r3 != 0) goto L7b
            java.util.HashSet r3 = com.huawei.hms.scankit.p.y3.a()
            boolean r2 = com.huawei.hms.scankit.p.y3.a(r2, r3)
            if (r2 == 0) goto L7b
            com.huawei.hms.scankit.p.w3 r2 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L74 java.lang.RuntimeException -> L78
            java.lang.String r3 = "MultiProcessor"
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L74 java.lang.RuntimeException -> L78
            r7.a = r2     // Catch: java.lang.Exception -> L74 java.lang.RuntimeException -> L78
            goto L7b
        L74:
            com.huawei.hms.scankit.p.o4.b(r0, r8)
            goto L7b
        L78:
            com.huawei.hms.scankit.p.o4.b(r0, r8)
        L7b:
            java.lang.String r8 = "scankit mul"
            java.lang.String r0 = "end decodeInBitmap"
            com.huawei.hms.scankit.p.o4.d(r8, r0)
            com.huawei.hms.ml.scan.HmsScan[] r8 = r7.a(r9, r10)
            return r8
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public com.huawei.hms.ml.scan.HmsScan[] detectWithByteBuffer(com.huawei.hms.hmsscankit.DetailRect r9, com.huawei.hms.feature.dynamic.IObjectWrapper r10, com.huawei.hms.feature.dynamic.IObjectWrapper r11) throws android.os.RemoteException {
            r8 = this;
            java.lang.String r0 = "Ha error"
            java.lang.String r1 = "IRemoteDecoderDelegateImpl"
            boolean r2 = com.huawei.hms.scankit.p.r3.A
            if (r2 != 0) goto Lb
            com.huawei.hms.scankit.util.OpencvJNI.init()
        Lb:
            android.os.Bundle r2 = r8.a(r11)
            java.lang.String r3 = ""
            r4 = 0
            if (r11 == 0) goto L41
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            boolean r5 = r5 instanceof android.os.Bundle
            if (r5 == 0) goto L41
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "PackageName"
            java.lang.String r3 = r5.getString(r6, r3)
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "USEAPK"
            boolean r5 = r5.getBoolean(r6, r4)
            java.lang.Object r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "ROLLBACK"
            boolean r6 = r6.getBoolean(r7, r4)
            goto L43
        L41:
            r5 = 0
            r6 = 0
        L43:
            if (r6 == 0) goto L55
            boolean r6 = com.huawei.hms.scankit.p.r3.a
            if (r6 != 0) goto L55
            if (r5 == 0) goto L55
            com.huawei.hms.ml.scan.HmsScan r9 = com.huawei.hms.scankit.p.r6.b()
            r10 = 1
            com.huawei.hms.ml.scan.HmsScan[] r10 = new com.huawei.hms.ml.scan.HmsScan[r10]
            r10[r4] = r9
            return r10
        L55:
            com.huawei.hms.scankit.p.w3 r4 = r8.a
            if (r4 != 0) goto L74
            java.util.HashSet r4 = com.huawei.hms.scankit.p.y3.a()
            boolean r3 = com.huawei.hms.scankit.p.y3.a(r3, r4)
            if (r3 == 0) goto L74
            com.huawei.hms.scankit.p.w3 r3 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L6d java.lang.RuntimeException -> L71
            java.lang.String r4 = "MultiProcessor"
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L6d java.lang.RuntimeException -> L71
            r8.a = r3     // Catch: java.lang.Exception -> L6d java.lang.RuntimeException -> L71
            goto L74
        L6d:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            goto L74
        L71:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
        L74:
            com.huawei.hms.ml.scan.HmsScan[] r9 = r8.a(r9, r10, r11)
            return r9
    }
}
