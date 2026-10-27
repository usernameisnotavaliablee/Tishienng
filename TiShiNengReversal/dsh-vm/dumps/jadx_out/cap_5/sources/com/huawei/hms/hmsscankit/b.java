package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class b {
    private static volatile com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate a = null;
    private static final java.lang.String b = "b";

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.huawei.hms.ml.scan.HmsScan[] a(android.content.Context r8, com.huawei.hms.ml.scan.HmsScanFrame r9, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r10) {
            java.lang.String r0 = "start detectForHmsDector"
            java.lang.String r1 = "scankit mul"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            r0 = 0
            com.huawei.hms.ml.scan.HmsScan[] r0 = new com.huawei.hms.ml.scan.HmsScan[r0]
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.b.a
            java.lang.String r3 = "exception"
            java.lang.String r4 = "RemoteException"
            if (r2 != 0) goto L24
            com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.g.c(r8)
            if (r2 != 0) goto L1a
            goto L10f
        L1a:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = r2.newRemoteHmsDecoderDelegate()     // Catch: android.os.RemoteException -> L21
            com.huawei.hms.hmsscankit.b.a = r2     // Catch: android.os.RemoteException -> L21
            goto L24
        L21:
            com.huawei.hms.scankit.p.o4.b(r3, r4)
        L24:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.b.a
            if (r2 == 0) goto L10f
            com.huawei.hms.hmsscankit.DetailRect r2 = new com.huawei.hms.hmsscankit.DetailRect     // Catch: android.os.RemoteException -> L10c
            int r5 = r9.getWidth()     // Catch: android.os.RemoteException -> L10c
            int r6 = r9.getHeight()     // Catch: android.os.RemoteException -> L10c
            r2.<init>(r5, r6)     // Catch: android.os.RemoteException -> L10c
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L10c
            r5.<init>()     // Catch: android.os.RemoteException -> L10c
            if (r10 == 0) goto L51
            java.lang.String r6 = "FormatValue"
            int r7 = r10.mode     // Catch: android.os.RemoteException -> L10c
            r5.putInt(r6, r7)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r6 = "ParseResult"
            boolean r7 = r10.parseResult     // Catch: android.os.RemoteException -> L10c
            r5.putBoolean(r6, r7)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r6 = "PhotoMode"
            boolean r10 = r10.photoMode     // Catch: android.os.RemoteException -> L10c
            r5.putBoolean(r6, r10)     // Catch: android.os.RemoteException -> L10c
        L51:
            java.lang.String r10 = "ROLLBACK"
            boolean r6 = com.huawei.hms.hmsscankit.g.c     // Catch: android.os.RemoteException -> L10c
            r5.putBoolean(r10, r6)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r10 = "USEAPK"
            boolean r6 = com.huawei.hms.hmsscankit.g.a     // Catch: android.os.RemoteException -> L10c
            r5.putBoolean(r10, r6)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r10 = "TransType"
            r6 = 3
            r5.putInt(r10, r6)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r10 = "NewVersion"
            r6 = 1
            r5.putBoolean(r10, r6)     // Catch: android.os.RemoteException -> L10c
            java.lang.String r10 = "PackageName"
            java.lang.String r6 = com.huawei.hms.scankit.p.y3.b(r8)     // Catch: android.os.RemoteException -> L10c
            r5.putString(r10, r6)     // Catch: android.os.RemoteException -> L10c
            android.os.Bundle r10 = com.huawei.hms.scankit.p.y3.a(r8)     // Catch: android.os.RemoteException -> L10c
            r5.putAll(r10)     // Catch: android.os.RemoteException -> L10c
            android.graphics.Bitmap r10 = r9.getBitmap()     // Catch: android.os.RemoteException -> L10c
            if (r10 == 0) goto L99
            java.lang.String r10 = "end detectForHmsDector"
            com.huawei.hms.scankit.p.o4.d(r1, r10)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r10 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L10c
            android.graphics.Bitmap r6 = r9.getBitmap()     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r6)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.ml.scan.HmsScan[] r10 = r10.decodeInBitmap(r2, r6, r7)     // Catch: android.os.RemoteException -> L10c
            goto Lb3
        L99:
            android.graphics.YuvImage r10 = r9.getYuvImage()     // Catch: android.os.RemoteException -> L10c
            byte[] r10 = r10.getYuvData()     // Catch: android.os.RemoteException -> L10c
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r6 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.ml.scan.HmsScan[] r10 = r6.detectWithByteBuffer(r2, r10, r7)     // Catch: android.os.RemoteException -> L10c
        Lb3:
            com.huawei.hms.hmsscankit.f.a(r10)     // Catch: android.os.RemoteException -> L10c
            boolean r6 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> L10c
            if (r6 == 0) goto L109
            com.huawei.hms.hmsscankit.api.IRemoteCreator r8 = com.huawei.hms.hmsscankit.g.c(r8)     // Catch: android.os.RemoteException -> L10c
            if (r8 != 0) goto Lc3
            goto L10f
        Lc3:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r8 = r8.newRemoteHmsDecoderDelegate()     // Catch: android.os.RemoteException -> Lca
            com.huawei.hms.hmsscankit.b.a = r8     // Catch: android.os.RemoteException -> Lca
            goto Lcf
        Lca:
            java.lang.String r8 = com.huawei.hms.hmsscankit.b.b     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.scankit.p.o4.b(r8, r4)     // Catch: android.os.RemoteException -> L10c
        Lcf:
            java.lang.String r8 = "iRemoteDecoderDelegate rollback"
            com.huawei.hms.scankit.p.o4.d(r1, r8)     // Catch: android.os.RemoteException -> L10c
            android.graphics.Bitmap r8 = r9.getBitmap()     // Catch: android.os.RemoteException -> L10c
            if (r8 == 0) goto Lee
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r8 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L10c
            android.graphics.Bitmap r9 = r9.getBitmap()     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.ml.scan.HmsScan[] r8 = r8.decodeInBitmap(r2, r9, r10)     // Catch: android.os.RemoteException -> L10c
        Lec:
            r10 = r8
            goto L109
        Lee:
            android.graphics.YuvImage r8 = r9.getYuvImage()     // Catch: android.os.RemoteException -> L10c
            byte[] r8 = r8.getYuvData()     // Catch: android.os.RemoteException -> L10c
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r8)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r9 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L10c
            com.huawei.hms.ml.scan.HmsScan[] r8 = r9.detectWithByteBuffer(r2, r8, r10)     // Catch: android.os.RemoteException -> L10c
            goto Lec
        L109:
            if (r10 == 0) goto L10f
            return r10
        L10c:
            com.huawei.hms.scankit.p.o4.b(r3, r4)
        L10f:
            return r0
    }

    static com.huawei.hms.ml.scan.HmsScan[] a(android.content.Context r8, com.huawei.hms.mlsdk.common.MLFrame r9, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r10) {
            java.lang.String r0 = "start detectForHmsDector"
            java.lang.String r1 = "scankit mul"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            r0 = 0
            com.huawei.hms.ml.scan.HmsScan[] r0 = new com.huawei.hms.ml.scan.HmsScan[r0]
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.b.a
            java.lang.String r3 = "exception"
            java.lang.String r4 = "RemoteException"
            if (r2 != 0) goto L24
            com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.g.c(r8)
            if (r2 != 0) goto L1a
            goto L106
        L1a:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = r2.newRemoteHmsDecoderDelegate()     // Catch: android.os.RemoteException -> L21
            com.huawei.hms.hmsscankit.b.a = r2     // Catch: android.os.RemoteException -> L21
            goto L24
        L21:
            com.huawei.hms.scankit.p.o4.b(r3, r4)
        L24:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.b.a
            if (r2 == 0) goto L106
            com.huawei.hms.mlsdk.common.MLFrame$Property r2 = r9.acquireProperty()     // Catch: android.os.RemoteException -> L103
            if (r2 == 0) goto L44
            com.huawei.hms.hmsscankit.DetailRect r2 = new com.huawei.hms.hmsscankit.DetailRect     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.mlsdk.common.MLFrame$Property r5 = r9.acquireProperty()     // Catch: android.os.RemoteException -> L103
            int r5 = r5.getWidth()     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.mlsdk.common.MLFrame$Property r6 = r9.acquireProperty()     // Catch: android.os.RemoteException -> L103
            int r6 = r6.getHeight()     // Catch: android.os.RemoteException -> L103
            r2.<init>(r5, r6)     // Catch: android.os.RemoteException -> L103
            goto L49
        L44:
            com.huawei.hms.hmsscankit.DetailRect r2 = new com.huawei.hms.hmsscankit.DetailRect     // Catch: android.os.RemoteException -> L103
            r2.<init>()     // Catch: android.os.RemoteException -> L103
        L49:
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L103
            r5.<init>()     // Catch: android.os.RemoteException -> L103
            if (r10 == 0) goto L60
            int r6 = r10.mode     // Catch: android.os.RemoteException -> L103
            if (r6 == 0) goto L60
            java.lang.String r7 = "FormatValue"
            r5.putInt(r7, r6)     // Catch: android.os.RemoteException -> L103
            java.lang.String r6 = "PhotoMode"
            boolean r7 = r10.photoMode     // Catch: android.os.RemoteException -> L103
            r5.putBoolean(r6, r7)     // Catch: android.os.RemoteException -> L103
        L60:
            java.lang.String r6 = "ParseResult"
            boolean r10 = r10.parseResult     // Catch: android.os.RemoteException -> L103
            r5.putBoolean(r6, r10)     // Catch: android.os.RemoteException -> L103
            java.lang.String r10 = "TransType"
            r6 = 3
            r5.putInt(r10, r6)     // Catch: android.os.RemoteException -> L103
            java.lang.String r10 = "ROLLBACK"
            boolean r6 = com.huawei.hms.hmsscankit.g.c     // Catch: android.os.RemoteException -> L103
            r5.putBoolean(r10, r6)     // Catch: android.os.RemoteException -> L103
            java.lang.String r10 = "USEAPK"
            boolean r6 = com.huawei.hms.hmsscankit.g.a     // Catch: android.os.RemoteException -> L103
            r5.putBoolean(r10, r6)     // Catch: android.os.RemoteException -> L103
            android.os.Bundle r10 = com.huawei.hms.scankit.p.y3.a(r8)     // Catch: android.os.RemoteException -> L103
            r5.putAll(r10)     // Catch: android.os.RemoteException -> L103
            android.graphics.Bitmap r10 = r9.readBitmap()     // Catch: android.os.RemoteException -> L103
            if (r10 == 0) goto La0
            java.lang.String r10 = "end detectForHmsDector"
            com.huawei.hms.scankit.p.o4.d(r1, r10)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r10 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L103
            android.graphics.Bitmap r6 = r9.readBitmap()     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r6)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.ml.scan.HmsScan[] r10 = r10.decodeInBitmap(r2, r6, r7)     // Catch: android.os.RemoteException -> L103
            goto Lb2
        La0:
            java.nio.ByteBuffer r10 = r9.acquireGrayByteBuffer()     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r6 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.ml.scan.HmsScan[] r10 = r6.detectWithByteBuffer(r2, r10, r7)     // Catch: android.os.RemoteException -> L103
        Lb2:
            com.huawei.hms.hmsscankit.f.a(r10)     // Catch: android.os.RemoteException -> L103
            boolean r6 = com.huawei.hms.hmsscankit.g.a()     // Catch: android.os.RemoteException -> L103
            if (r6 == 0) goto L100
            com.huawei.hms.hmsscankit.api.IRemoteCreator r8 = com.huawei.hms.hmsscankit.g.c(r8)     // Catch: android.os.RemoteException -> L103
            if (r8 != 0) goto Lc2
            goto L106
        Lc2:
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r8 = r8.newRemoteHmsDecoderDelegate()     // Catch: android.os.RemoteException -> Lc9
            com.huawei.hms.hmsscankit.b.a = r8     // Catch: android.os.RemoteException -> Lc9
            goto Lce
        Lc9:
            java.lang.String r8 = com.huawei.hms.hmsscankit.b.b     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.scankit.p.o4.b(r8, r4)     // Catch: android.os.RemoteException -> L103
        Lce:
            java.lang.String r8 = "iRemoteDecoderDelegate rollback"
            com.huawei.hms.scankit.p.o4.d(r1, r8)     // Catch: android.os.RemoteException -> L103
            android.graphics.Bitmap r8 = r9.readBitmap()     // Catch: android.os.RemoteException -> L103
            if (r8 == 0) goto Led
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r8 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L103
            android.graphics.Bitmap r9 = r9.readBitmap()     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r9 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.ml.scan.HmsScan[] r8 = r8.decodeInBitmap(r2, r9, r10)     // Catch: android.os.RemoteException -> L103
        Leb:
            r10 = r8
            goto L100
        Led:
            java.nio.ByteBuffer r8 = r9.acquireGrayByteBuffer()     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r8 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r8)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r9 = com.huawei.hms.hmsscankit.b.a     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.feature.dynamic.IObjectWrapper r10 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L103
            com.huawei.hms.ml.scan.HmsScan[] r8 = r9.detectWithByteBuffer(r2, r8, r10)     // Catch: android.os.RemoteException -> L103
            goto Leb
        L100:
            if (r10 == 0) goto L106
            return r10
        L103:
            com.huawei.hms.scankit.p.o4.b(r3, r4)
        L106:
            return r0
    }
}
