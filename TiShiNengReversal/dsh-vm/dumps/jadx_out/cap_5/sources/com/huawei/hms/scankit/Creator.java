package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class Creator extends com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub {
    private static final java.lang.String TAG = "Creator";
    private com.huawei.hms.scankit.f iRemoteDecoderDelegate;
    private com.huawei.hms.scankit.g iRemoteHmsDecoderDelegate;
    private com.huawei.hms.scankit.e iRemoteViewDelegate;

    public Creator() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.iRemoteViewDelegate = r0
            r1.iRemoteDecoderDelegate = r0
            r1.iRemoteHmsDecoderDelegate = r0
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate newRemoteDecoderDelegate() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "Creator"
            java.lang.String r1 = "newRemoteDecoderDelegate()"
            com.huawei.hms.scankit.p.o4.d(r0, r1)
            com.huawei.hms.scankit.f r0 = com.huawei.hms.scankit.f.a()
            r2.iRemoteDecoderDelegate = r0
            return r0
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "Creator"
            java.lang.String r1 = "newRemoteHmsDecoderDelegate()"
            com.huawei.hms.scankit.p.o4.d(r0, r1)
            com.huawei.hms.scankit.g r0 = com.huawei.hms.scankit.g.a()
            r2.iRemoteHmsDecoderDelegate = r0
            return r0
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public com.huawei.hms.hmsscankit.api.IRemoteViewDelegate newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper r14, com.huawei.hms.feature.dynamic.IObjectWrapper r15) throws android.os.RemoteException {
            r13 = this;
            java.lang.String r0 = "Creator"
            r1 = 0
            if (r14 != 0) goto Ld
            java.lang.String r14 = "ScankitRemoteS"
            java.lang.String r15 = "Context is null"
            com.huawei.hms.scankit.p.o4.b(r14, r15)
            return r1
        Ld:
            java.lang.Object r14 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r14)
            r2 = 1
            r3 = 0
            if (r15 == 0) goto La0
            java.lang.Object r4 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r15)
            boolean r5 = r4 instanceof android.os.Bundle
            if (r5 == 0) goto L97
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r1 = "CustomedFlag"
            boolean r1 = r4.getBoolean(r1, r3)
            java.lang.String r5 = "FormatValue"
            int r5 = r4.getInt(r5, r3)
            java.lang.String r6 = "RectValue"
            android.os.Parcelable r6 = r4.getParcelable(r6)
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r15)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r8 = "TransType"
            int r7 = r7.getInt(r8, r3)
            com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE = r7
            r8 = 2
            if (r7 < r8) goto L44
            r7 = 1
            goto L45
        L44:
            r7 = 0
        L45:
            if (r7 == 0) goto L4b
            int r5 = com.huawei.hms.scankit.p.w7.b(r5)
        L4b:
            java.lang.String r8 = "return_bitmap"
            boolean r8 = r4.getBoolean(r8, r3)
            java.lang.String r9 = "localui"
            boolean r9 = r4.getBoolean(r9, r3)
            java.lang.String r10 = "ScanViewTypeFlag"
            int r10 = r4.getInt(r10, r3)
            java.lang.String r11 = "ScanCameraPermission"
            boolean r11 = r4.getBoolean(r11, r2)
            java.lang.String r12 = "ScanGuide"
            boolean r3 = r4.getBoolean(r12, r3)
            if (r9 == 0) goto L8d
            boolean r4 = r14 instanceof android.content.Context
            if (r4 == 0) goto L8d
            r4 = r14
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.IllegalAccessException -> L76 java.lang.reflect.InvocationTargetException -> L7c java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L88
            com.huawei.hms.hmsscankit.g.b(r4)     // Catch: java.lang.IllegalAccessException -> L76 java.lang.reflect.InvocationTargetException -> L7c java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L88
            goto L8d
        L76:
            java.lang.String r4 = "IllegalAccessException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
            goto L8d
        L7c:
            java.lang.String r4 = "InvocationTargetException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
            goto L8d
        L82:
            java.lang.String r4 = "NoSuchMethodException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
            goto L8d
        L88:
            java.lang.String r4 = "ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.a(r0, r4)
        L8d:
            r12 = r7
            r7 = r15
            r15 = r10
            r10 = r8
            r8 = r12
            r12 = r3
            r3 = r1
            r1 = r6
            r6 = r5
            goto Laa
        L97:
            r7 = r15
            r15 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            goto Laa
        La0:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            com.huawei.hms.feature.dynamic.IObjectWrapper r15 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r15)
            goto L97
        Laa:
            if (r3 == 0) goto Lc0
            boolean r15 = r14 instanceof android.content.Context
            if (r15 == 0) goto Lde
            com.huawei.hms.scankit.e r4 = new com.huawei.hms.scankit.e
            r5 = r14
            android.content.Context r5 = (android.content.Context) r5
            r11 = r9 ^ 1
            r9 = r8
            r8 = r7
            r7 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.iRemoteViewDelegate = r4
            goto Lde
        Lc0:
            boolean r0 = r14 instanceof android.content.Context
            if (r0 == 0) goto Lde
            if (r9 == 0) goto Ld3
            com.huawei.hms.scankit.h r4 = new com.huawei.hms.scankit.h
            r5 = r14
            android.content.Context r5 = (android.content.Context) r5
            r9 = 0
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.iRemoteViewDelegate = r4
            goto Lde
        Ld3:
            com.huawei.hms.scankit.i r4 = new com.huawei.hms.scankit.i
            r5 = r14
            android.content.Context r5 = (android.content.Context) r5
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            r13.iRemoteViewDelegate = r4
        Lde:
            com.huawei.hms.scankit.e r14 = r13.iRemoteViewDelegate
            return r14
    }
}
