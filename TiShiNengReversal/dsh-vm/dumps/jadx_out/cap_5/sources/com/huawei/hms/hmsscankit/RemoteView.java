package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RemoteView extends android.widget.FrameLayout {
    private static final int MAX_BITMAP_SIZE = 52428800;
    public static final int REQUEST_CODE_PHOTO = 4371;
    private static final java.lang.String TAG = "ScanKitRemoteView";
    private static boolean flagForGallery = false;
    private static boolean isOnStop = true;
    private android.content.Context mContext;
    private boolean mContinuouslyScan;
    private com.huawei.hms.hmsscankit.OnErrorCallback mOnErrorCallback;
    private com.huawei.hms.hmsscankit.RemoteView.a mRemoteHelper;
    private boolean mReturnedBitmap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        android.app.Activity mContext;
        boolean mContinuouslyScan;
        com.huawei.hms.ml.scan.HmsScanAnalyzerOptions mFormat;
        boolean mIsCustomed;
        android.graphics.Rect mRect;
        boolean mReturnedBitmap;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mIsCustomed = r0
                r1.mContinuouslyScan = r0
                r0 = 0
                r1.mReturnedBitmap = r0
                return
        }

        public com.huawei.hms.hmsscankit.RemoteView build() {
                r5 = this;
                com.huawei.hms.hmsscankit.RemoteView r0 = new com.huawei.hms.hmsscankit.RemoteView
                android.app.Activity r1 = r5.mContext
                boolean r2 = r5.mIsCustomed
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r3 = r5.mFormat
                if (r3 != 0) goto Lc
                r3 = 0
                goto Le
            Lc:
                int r3 = r3.mode
            Le:
                android.graphics.Rect r4 = r5.mRect
                r0.<init>(r1, r2, r3, r4)
                boolean r1 = r5.mContinuouslyScan
                com.huawei.hms.hmsscankit.RemoteView r0 = r0.setContinuouslyScan(r1)
                boolean r1 = r5.mReturnedBitmap
                com.huawei.hms.hmsscankit.RemoteView r0 = r0.enableReturnBitmap(r1)
                return r0
        }

        public com.huawei.hms.hmsscankit.RemoteView.Builder enableReturnBitmap() {
                r1 = this;
                r0 = 1
                r1.mReturnedBitmap = r0
                return r1
        }

        public com.huawei.hms.hmsscankit.RemoteView.Builder setBoundingBox(android.graphics.Rect r1) {
                r0 = this;
                r0.mRect = r1
                return r0
        }

        public com.huawei.hms.hmsscankit.RemoteView.Builder setContext(android.app.Activity r1) {
                r0 = this;
                r0.mContext = r1
                return r0
        }

        public com.huawei.hms.hmsscankit.RemoteView.Builder setContinuouslyScan(boolean r1) {
                r0 = this;
                r0.mContinuouslyScan = r1
                return r0
        }

        public com.huawei.hms.hmsscankit.RemoteView.Builder setFormat(int r2, int... r3) {
                r1 = this;
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
                r0.<init>()
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r0.setHmsScanTypes(r2, r3)
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r2.create()
                r1.mFormat = r2
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.huawei.hms.feature.dynamic.DeferredLifecycleHelper<com.huawei.hms.hmsscankit.RemoteView.b> {
        private android.view.ViewGroup a;
        public android.app.Activity b;
        private com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<com.huawei.hms.hmsscankit.RemoteView.b> c;
        private com.huawei.hms.hmsscankit.api.IRemoteViewDelegate d;
        private com.huawei.hms.hmsscankit.api.IOnResultCallback e;
        private boolean f;
        private boolean g;
        private int h;
        private com.huawei.hms.hmsscankit.api.IOnLightCallback i;
        private android.graphics.Rect j;
        private android.os.Bundle k;
        private boolean l;
        private boolean m;
        private int n;
        private boolean o;
        private boolean p;
        final /* synthetic */ com.huawei.hms.hmsscankit.RemoteView q;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.huawei.hms.hmsscankit.RemoteView$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0001a implements android.view.View.OnClickListener {
            final /* synthetic */ com.huawei.hms.hmsscankit.RemoteView.a a;

            ViewOnClickListenerC0001a(com.huawei.hms.hmsscankit.RemoteView.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.huawei.hms.hmsscankit.RemoteView$a r2 = r1.a
                    android.app.Activity r0 = r2.b
                    if (r0 == 0) goto Lb
                    com.huawei.hms.hmsscankit.RemoteView r2 = r2.q
                    com.huawei.hms.hmsscankit.RemoteView.access$1200(r2, r0)
                Lb:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ com.huawei.hms.hmsscankit.RemoteView.a a;

            b(com.huawei.hms.hmsscankit.RemoteView.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.huawei.hms.hmsscankit.RemoteView$a r2 = r1.a
                    android.app.Activity r0 = r2.b
                    if (r0 == 0) goto Lb
                    com.huawei.hms.hmsscankit.RemoteView r2 = r2.q
                    com.huawei.hms.hmsscankit.RemoteView.access$1200(r2, r0)
                Lb:
                    return
            }
        }

        a(com.huawei.hms.hmsscankit.RemoteView r1, android.app.Activity r2, android.view.ViewGroup r3, boolean r4, int r5, android.graphics.Rect r6) {
                r0 = this;
                r0.q = r1
                r0.<init>()
                r1 = 0
                r0.e = r1
                r0.a = r3
                r0.b = r2
                r0.f = r4
                r0.h = r5
                r0.j = r6
                return
        }

        a(com.huawei.hms.hmsscankit.RemoteView r1, android.app.Activity r2, android.view.ViewGroup r3, boolean r4, int r5, android.graphics.Rect r6, int r7) {
                r0 = this;
                r0.q = r1
                r0.<init>()
                r1 = 0
                r0.e = r1
                r0.a = r3
                r0.b = r2
                r0.f = r4
                r0.h = r5
                r0.j = r6
                r0.n = r7
                return
        }

        a(com.huawei.hms.hmsscankit.RemoteView r1, android.app.Activity r2, android.view.ViewGroup r3, boolean r4, int r5, android.graphics.Rect r6, int r7, boolean r8, boolean r9) {
                r0 = this;
                r0.q = r1
                r0.<init>()
                r1 = 0
                r0.e = r1
                r0.a = r3
                r0.b = r2
                r0.f = r4
                r0.h = r5
                r0.j = r6
                r0.n = r7
                r0.o = r8
                r0.p = r9
                return
        }

        private void a(int r3, int r4, android.content.Intent r5) {
                r2 = this;
                java.lang.String r0 = "ScanKitRemoteView"
                r1 = -1
                if (r4 != r1) goto L7f
                if (r5 == 0) goto L7f
                r4 = 4371(0x1113, float:6.125E-42)
                if (r3 != r4) goto L7f
                com.huawei.hms.hmsscankit.RemoteView r3 = r2.q     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                android.content.Context r3 = com.huawei.hms.hmsscankit.RemoteView.access$1300(r3)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                android.graphics.Bitmap r3 = com.huawei.hms.scankit.p.w7.a(r3, r5)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                if (r3 == 0) goto L41
                int r4 = r3.getWidth()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                int r5 = r3.getHeight()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                int r4 = r4 * r5
                r5 = 52428800(0x3200000, float:4.7019774E-37)
                if (r4 <= r5) goto L26
                goto L41
            L26:
                com.huawei.hms.hmsscankit.RemoteView r4 = r2.q     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                android.content.Context r4 = com.huawei.hms.hmsscankit.RemoteView.access$1300(r4)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r5 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                r5.<init>()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                r1 = 1
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r5 = r5.setPhotoMode(r1)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r5 = r5.create()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                int r1 = r2.h     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                com.huawei.hms.ml.scan.HmsScan[] r3 = com.huawei.hms.hmsscankit.f.a(r4, r3, r5, r1)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                goto L60
            L41:
                if (r3 == 0) goto L5d
                java.lang.String r4 = "ScanUtil"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                r5.<init>()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                java.lang.String r1 = "input image is too large:"
                r5.append(r1)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                int r3 = r3.getWidth()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                r5.append(r3)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                com.huawei.hms.scankit.p.o4.e(r4, r3)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
            L5d:
                r3 = 0
                com.huawei.hms.ml.scan.HmsScan[] r3 = new com.huawei.hms.ml.scan.HmsScan[r3]     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
            L60:
                com.huawei.hms.hmsscankit.api.IOnResultCallback r4 = r2.e     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                if (r4 == 0) goto L7f
                r4.onResult(r3)     // Catch: java.lang.Error -> L68 java.lang.Exception -> L6e android.os.RemoteException -> L74 java.lang.IllegalStateException -> L7a
                return
            L68:
                java.lang.String r3 = "Exception in error"
                com.huawei.hms.scankit.p.o4.b(r0, r3)
                goto L7f
            L6e:
                java.lang.String r3 = "Exception in remoteview"
                com.huawei.hms.scankit.p.o4.b(r0, r3)
                goto L7f
            L74:
                java.lang.String r3 = "RemoteException in remoteview"
                com.huawei.hms.scankit.p.o4.b(r0, r3)
                goto L7f
            L7a:
                java.lang.String r3 = "IllegalStateException in remoteview"
                com.huawei.hms.scankit.p.o4.b(r0, r3)
            L7f:
                return
        }

        private void a(android.os.Bundle r1) {
                r0 = this;
                r0.k = r1
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                r0.d()
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, int r1, int r2, android.content.Intent r3) {
                r0.a(r1, r2, r3)
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, android.os.Bundle r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, com.huawei.hms.hmsscankit.api.IOnErrorCallback r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, com.huawei.hms.hmsscankit.api.IOnLightCallback r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, com.huawei.hms.hmsscankit.api.IOnResultCallback r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(com.huawei.hms.hmsscankit.RemoteView.a r0, boolean r1) {
                r0.a(r1)
                return
        }

        private void a(com.huawei.hms.hmsscankit.api.IOnErrorCallback r2) {
                r1 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r1.d
                if (r0 == 0) goto Lf
                r0.setOnErrorCallback(r2)     // Catch: android.os.RemoteException -> L8
                return
            L8:
                java.lang.String r2 = "exception"
                java.lang.String r0 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r2, r0)
            Lf:
                return
        }

        private void a(com.huawei.hms.hmsscankit.api.IOnLightCallback r2) {
                r1 = this;
                r1.i = r2
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r1.d
                if (r0 == 0) goto L11
                r0.setOnLightVisbleCallBack(r2)     // Catch: android.os.RemoteException -> La
                return
            La:
                java.lang.String r2 = "exception"
                java.lang.String r0 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r2, r0)
            L11:
                return
        }

        private void a(com.huawei.hms.hmsscankit.api.IOnResultCallback r2) {
                r1 = this;
                r1.e = r2
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r1.d
                if (r0 == 0) goto L11
                r0.setOnResultCallback(r2)     // Catch: android.os.RemoteException -> La
                return
            La:
                java.lang.String r2 = "exception"
                java.lang.String r0 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r2, r0)
            L11:
                return
        }

        private void a(boolean r1) {
                r0 = this;
                r0.g = r1
                return
        }

        private void b() {
                r2 = this;
                android.app.Activity r0 = r2.b
                r1 = 0
                if (r0 == 0) goto L7
                r2.b = r1
            L7:
                android.view.ViewGroup r0 = r2.a
                if (r0 == 0) goto Ld
                r2.a = r1
            Ld:
                return
        }

        static /* synthetic */ boolean b(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                boolean r0 = r0.c()
                return r0
        }

        static /* synthetic */ void c(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                r0.b()
                return
        }

        private boolean c() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.d
                if (r0 == 0) goto L10
                boolean r0 = r0.getLightStatus()     // Catch: android.os.RemoteException -> L9
                return r0
            L9:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            L10:
                r0 = 0
                return r0
        }

        private void d() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.d
                if (r0 == 0) goto Lf
                r0.pauseContinuouslyScan()     // Catch: android.os.RemoteException -> L8
                return
            L8:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            Lf:
                return
        }

        static /* synthetic */ boolean d(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                boolean r0 = r0.g()
                return r0
        }

        private void e() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.d
                if (r0 == 0) goto Lf
                r0.resumeContinuouslyScan()     // Catch: android.os.RemoteException -> L8
                return
            L8:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            Lf:
                return
        }

        static /* synthetic */ boolean e(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                boolean r0 = r0.f()
                return r0
        }

        static /* synthetic */ void f(com.huawei.hms.hmsscankit.RemoteView.a r0) {
                r0.e()
                return
        }

        private boolean f() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.d
                if (r0 == 0) goto L10
                r0.turnOffLight()     // Catch: android.os.RemoteException -> L9
                r0 = 1
                return r0
            L9:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            L10:
                r0 = 0
                return r0
        }

        private boolean g() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.d
                if (r0 == 0) goto L10
                r0.turnOnLight()     // Catch: android.os.RemoteException -> L9
                r0 = 1
                return r0
            L9:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            L10:
                r0 = 0
                return r0
        }

        public void b(boolean r1) {
                r0 = this;
                r0.l = r1
                return
        }

        public void c(boolean r1) {
                r0 = this;
                r0.m = r1
                return
        }

        public void createDelegate(com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<com.huawei.hms.hmsscankit.RemoteView.b> r5) {
                r4 = this;
                java.lang.String r0 = "RemoteException"
                java.lang.String r1 = "exception"
                r4.c = r5
                if (r5 == 0) goto Le9
                com.huawei.hms.feature.dynamic.LifecycleDelegate r5 = r4.getDelegate()
                if (r5 == 0) goto L10
                goto Le9
            L10:
                r5 = 0
                r4.d = r5
                android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> La3
                r5.<init>()     // Catch: android.os.RemoteException -> La3
                boolean r2 = r4.f     // Catch: android.os.RemoteException -> La3
                if (r2 != 0) goto L2c
                int r3 = r4.h     // Catch: android.os.RemoteException -> La3
                if (r3 != 0) goto L2c
                android.graphics.Rect r3 = r4.j     // Catch: android.os.RemoteException -> La3
                if (r3 != 0) goto L2c
                java.lang.String r2 = "ScanKitRemoteView"
                java.lang.String r3 = "!mCustomed && mFormatValue == 0 && mRect == null"
                com.huawei.hms.scankit.p.o4.d(r2, r3)     // Catch: android.os.RemoteException -> La3
                goto L41
            L2c:
                java.lang.String r3 = "CustomedFlag"
                r5.putBoolean(r3, r2)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "FormatValue"
                int r3 = r4.h     // Catch: android.os.RemoteException -> La3
                r5.putInt(r2, r3)     // Catch: android.os.RemoteException -> La3
                android.graphics.Rect r2 = r4.j     // Catch: android.os.RemoteException -> La3
                if (r2 == 0) goto L41
                java.lang.String r3 = "RectValue"
                r5.putParcelable(r3, r2)     // Catch: android.os.RemoteException -> La3
            L41:
                boolean r2 = r4.l     // Catch: android.os.RemoteException -> La3
                if (r2 == 0) goto L4a
                java.lang.String r3 = "ScanOffSceenFlag"
                r5.putBoolean(r3, r2)     // Catch: android.os.RemoteException -> La3
            L4a:
                boolean r2 = r4.g     // Catch: android.os.RemoteException -> La3
                if (r2 == 0) goto L58
                java.lang.String r3 = "DeepLinkJumpFlag"
                r5.putBoolean(r3, r2)     // Catch: android.os.RemoteException -> La3
                android.os.Bundle r2 = r4.k     // Catch: android.os.RemoteException -> La3
                r5.putAll(r2)     // Catch: android.os.RemoteException -> La3
            L58:
                java.lang.String r2 = "TransType"
                r3 = 3
                r5.putInt(r2, r3)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "return_bitmap"
                boolean r3 = r4.m     // Catch: android.os.RemoteException -> La3
                r5.putBoolean(r2, r3)     // Catch: android.os.RemoteException -> La3
                android.app.Activity r2 = r4.b     // Catch: android.os.RemoteException -> La3
                android.os.Bundle r2 = com.huawei.hms.scankit.p.y3.a(r2)     // Catch: android.os.RemoteException -> La3
                r5.putAll(r2)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "localui"
                r3 = 1
                r5.putBoolean(r2, r3)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "ScanViewTypeFlag"
                int r3 = r4.n     // Catch: android.os.RemoteException -> La3
                r5.putInt(r2, r3)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "ScanCameraPermission"
                boolean r3 = r4.o     // Catch: android.os.RemoteException -> La3
                r5.putBoolean(r2, r3)     // Catch: android.os.RemoteException -> La3
                java.lang.String r2 = "ScanGuide"
                boolean r3 = r4.p     // Catch: android.os.RemoteException -> La3
                r5.putBoolean(r2, r3)     // Catch: android.os.RemoteException -> La3
                android.app.Activity r2 = r4.b     // Catch: android.os.RemoteException -> La3
                com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.g.d(r2)     // Catch: android.os.RemoteException -> La3
                if (r2 != 0) goto L92
                goto Le9
            L92:
                android.app.Activity r3 = r4.b     // Catch: android.os.RemoteException -> La3
                com.huawei.hms.feature.dynamic.IObjectWrapper r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> La3
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> La3
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r5 = r2.newRemoteViewDelegate(r3, r5)     // Catch: android.os.RemoteException -> La3
                r4.d = r5     // Catch: android.os.RemoteException -> La3
                goto La6
            La3:
                com.huawei.hms.scankit.p.o4.b(r1, r0)
            La6:
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r5 = r4.d
                if (r5 != 0) goto Lab
                goto Le9
            Lab:
                com.huawei.hms.hmsscankit.api.IOnResultCallback r2 = r4.e     // Catch: android.os.RemoteException -> Ld8
                if (r2 == 0) goto Lc0
                r5.setOnResultCallback(r2)     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.hmsscankit.RemoteView$a$a r5 = new com.huawei.hms.hmsscankit.RemoteView$a$a     // Catch: android.os.RemoteException -> Ld8
                r5.<init>(r4)     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = r4.d     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> Ld8
                r2.setOnClickListener(r5)     // Catch: android.os.RemoteException -> Ld8
            Lc0:
                com.huawei.hms.hmsscankit.RemoteView$a$b r5 = new com.huawei.hms.hmsscankit.RemoteView$a$b     // Catch: android.os.RemoteException -> Ld8
                r5.<init>(r4)     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = r4.d     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> Ld8
                r2.setOnClickListener(r5)     // Catch: android.os.RemoteException -> Ld8
                com.huawei.hms.hmsscankit.api.IOnLightCallback r5 = r4.i     // Catch: android.os.RemoteException -> Ld8
                if (r5 == 0) goto Ldb
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = r4.d     // Catch: android.os.RemoteException -> Ld8
                r2.setOnLightVisbleCallBack(r5)     // Catch: android.os.RemoteException -> Ld8
                goto Ldb
            Ld8:
                com.huawei.hms.scankit.p.o4.b(r1, r0)
            Ldb:
                com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<com.huawei.hms.hmsscankit.RemoteView$b> r5 = r4.c
                com.huawei.hms.hmsscankit.RemoteView$b r0 = new com.huawei.hms.hmsscankit.RemoteView$b
                android.view.ViewGroup r1 = r4.a
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = r4.d
                r0.<init>(r1, r2)
                r5.onDelegateCreated(r0)
            Le9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements com.huawei.hms.feature.dynamic.LifecycleDelegate {
        private android.view.ViewGroup a;
        private android.view.View b;
        private com.huawei.hms.hmsscankit.api.IRemoteViewDelegate c;

        b(android.view.ViewGroup r1, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.c = r2
                return
        }

        public void onCreate(android.os.Bundle r2) {
                r1 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r1.c     // Catch: android.os.RemoteException -> L20
                r0.onCreate(r2)     // Catch: android.os.RemoteException -> L20
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = r1.c     // Catch: android.os.RemoteException -> L20
                com.huawei.hms.feature.dynamic.IObjectWrapper r2 = r2.getView()     // Catch: android.os.RemoteException -> L20
                java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r2)     // Catch: android.os.RemoteException -> L20
                android.view.View r2 = (android.view.View) r2     // Catch: android.os.RemoteException -> L20
                r1.b = r2     // Catch: android.os.RemoteException -> L20
                android.view.ViewGroup r2 = r1.a     // Catch: android.os.RemoteException -> L20
                r2.removeAllViews()     // Catch: android.os.RemoteException -> L20
                android.view.ViewGroup r2 = r1.a     // Catch: android.os.RemoteException -> L20
                android.view.View r0 = r1.b     // Catch: android.os.RemoteException -> L20
                r2.addView(r0)     // Catch: android.os.RemoteException -> L20
                return
            L20:
                java.lang.String r2 = "exception"
                java.lang.String r0 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r2, r0)
                return
        }

        public android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
                r0 = this;
                android.view.View r1 = new android.view.View
                r2 = 0
                r1.<init>(r2)
                return r1
        }

        public void onDestroy() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L6
                r0.onDestroy()     // Catch: android.os.RemoteException -> L6
                return
            L6:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
                return
        }

        public void onDestroyView() {
                r0 = this;
                return
        }

        public void onInflate(android.app.Activity r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onLowMemory() {
                r0 = this;
                return
        }

        public void onPause() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L6
                r0.onPause()     // Catch: android.os.RemoteException -> L6
                return
            L6:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
                return
        }

        public void onResume() {
                r2 = this;
                boolean r0 = com.huawei.hms.hmsscankit.RemoteView.access$1400()     // Catch: android.os.RemoteException -> L1e
                if (r0 != 0) goto L18
                boolean r0 = com.huawei.hms.hmsscankit.RemoteView.access$1500()     // Catch: android.os.RemoteException -> L1e
                if (r0 == 0) goto L12
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L1e
                r0.onStart()     // Catch: android.os.RemoteException -> L1e
                return
            L12:
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L1e
                r0.onResume()     // Catch: android.os.RemoteException -> L1e
                return
            L18:
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L1e
                r0.onResume()     // Catch: android.os.RemoteException -> L1e
                return
            L1e:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
                return
        }

        public void onSaveInstanceState(android.os.Bundle r1) {
                r0 = this;
                return
        }

        public void onStart() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L6
                r0.onStart()     // Catch: android.os.RemoteException -> L6
                return
            L6:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
                return
        }

        public void onStop() {
                r2 = this;
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = r2.c     // Catch: android.os.RemoteException -> L6
                r0.onStop()     // Catch: android.os.RemoteException -> L6
                return
            L6:
                java.lang.String r0 = "exception"
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
                return
        }
    }

    static {
            return
    }

    RemoteView(android.app.Activity r9, boolean r10, int r11, android.graphics.Rect r12) {
            r8 = this;
            r8.<init>(r9)
            r0 = 1
            r8.mContinuouslyScan = r0
            r0 = 0
            r8.mReturnedBitmap = r0
            r0 = 0
            r8.mOnErrorCallback = r0
            r8.mContext = r9
            com.huawei.hms.hmsscankit.RemoteView$a r1 = new com.huawei.hms.hmsscankit.RemoteView$a
            r4 = r8
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2.mRemoteHelper = r1
            return
    }

    RemoteView(android.app.Activity r10, boolean r11, int r12, android.graphics.Rect r13, int r14) {
            r9 = this;
            r9.<init>(r10)
            r0 = 1
            r9.mContinuouslyScan = r0
            r0 = 0
            r9.mReturnedBitmap = r0
            r0 = 0
            r9.mOnErrorCallback = r0
            r9.mContext = r10
            com.huawei.hms.hmsscankit.RemoteView$a r1 = new com.huawei.hms.hmsscankit.RemoteView$a
            r4 = r9
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2.mRemoteHelper = r1
            return
    }

    RemoteView(android.app.Activity r11, boolean r12, int r13, android.graphics.Rect r14, int r15, boolean r16, boolean r17) {
            r10 = this;
            r10.<init>(r11)
            r0 = 1
            r10.mContinuouslyScan = r0
            r0 = 0
            r10.mReturnedBitmap = r0
            r0 = 0
            r10.mOnErrorCallback = r0
            r10.mContext = r11
            com.huawei.hms.hmsscankit.RemoteView$a r0 = new com.huawei.hms.hmsscankit.RemoteView$a
            r3 = r10
            r1 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mRemoteHelper = r0
            return
    }

    RemoteView(android.app.Activity r9, boolean r10, int r11, android.graphics.Rect r12, boolean r13) {
            r8 = this;
            r8.<init>(r9)
            r0 = 1
            r8.mContinuouslyScan = r0
            r0 = 0
            r8.mReturnedBitmap = r0
            r0 = 0
            r8.mOnErrorCallback = r0
            r8.mContext = r9
            com.huawei.hms.hmsscankit.RemoteView$a r1 = new com.huawei.hms.hmsscankit.RemoteView$a
            r4 = r8
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2.mRemoteHelper = r1
            r1.b(r13)
            return
    }

    RemoteView(android.app.Activity r9, boolean r10, android.os.Bundle r11) {
            r8 = this;
            r8.<init>(r9)
            r0 = 1
            r8.mContinuouslyScan = r0
            r0 = 0
            r8.mReturnedBitmap = r0
            r0 = 0
            r8.mOnErrorCallback = r0
            r8.mContext = r9
            com.huawei.hms.hmsscankit.RemoteView$a r1 = new com.huawei.hms.hmsscankit.RemoteView$a
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r8
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2.mRemoteHelper = r1
            com.huawei.hms.hmsscankit.RemoteView.a.a(r1, r10)
            com.huawei.hms.hmsscankit.RemoteView$a r9 = r2.mRemoteHelper
            com.huawei.hms.hmsscankit.RemoteView.a.a(r9, r11)
            return
    }

    static /* synthetic */ void access$1200(com.huawei.hms.hmsscankit.RemoteView r0, android.app.Activity r1) {
            r0.startPhotoCode(r1)
            return
    }

    static /* synthetic */ android.content.Context access$1300(com.huawei.hms.hmsscankit.RemoteView r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ boolean access$1400() {
            boolean r0 = com.huawei.hms.hmsscankit.RemoteView.isOnStop
            return r0
    }

    static /* synthetic */ boolean access$1500() {
            boolean r0 = com.huawei.hms.hmsscankit.RemoteView.flagForGallery
            return r0
    }

    private boolean checkPhotoPermission(android.app.Activity r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L1e
            boolean r0 = com.huawei.hms.scankit.p.w7.b(r5)
            if (r0 != 0) goto L1d
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            int r5 = r5.checkPermission(r3, r0, r1)
            if (r5 != 0) goto L35
        L1d:
            return r2
        L1e:
            boolean r0 = com.huawei.hms.scankit.p.w7.b(r5)
            if (r0 != 0) goto L37
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            int r5 = r5.checkPermission(r3, r0, r1)
            if (r5 != 0) goto L35
            goto L37
        L35:
            r5 = 0
            return r5
        L37:
            return r2
    }

    private void requestPhotoPermission(android.app.Activity r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 4371(0x1113, float:6.125E-42)
            if (r0 < r1) goto L12
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.bytedance.msdk.core.vl.a.a(r4, r0, r2)
            return
        L12:
            r1 = 23
            if (r0 < r1) goto L1f
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.bytedance.msdk.core.vl.a.a(r4, r0, r2)
        L1f:
            return
    }

    private void startActivityForGallery(android.app.Activity r7) {
            r6 = this;
            java.lang.String r0 = "com.huawei.photos"
            java.lang.String r1 = "ScanKitRemoteView"
            java.lang.String r2 = "com.android.gallery3d"
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = "android.intent.action.PICK"
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L56
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L56
            boolean r4 = com.huawei.hms.scankit.p.w7.g(r7)     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L48
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L56
            r4.<init>()     // Catch: java.lang.Exception -> L56
            android.content.pm.ResolveInfo r4 = com.huawei.hms.scankit.p.w7.a(r4, r2, r7)     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L2f
            boolean r4 = com.huawei.hms.scankit.p.w7.a(r2, r7)     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L2f
            java.lang.String r0 = "Start Gallery:com.android.gallery3d"
            com.huawei.hms.scankit.p.o4.d(r1, r0)     // Catch: java.lang.Exception -> L56
            r3.setPackage(r2)     // Catch: java.lang.Exception -> L56
            goto L48
        L2f:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L56
            r2.<init>()     // Catch: java.lang.Exception -> L56
            android.content.pm.ResolveInfo r2 = com.huawei.hms.scankit.p.w7.a(r2, r0, r7)     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L48
            boolean r2 = com.huawei.hms.scankit.p.w7.a(r0, r7)     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L48
            r3.setPackage(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = "Start Gallery:com.huawei.photos"
            com.huawei.hms.scankit.p.o4.d(r1, r0)     // Catch: java.lang.Exception -> L56
        L48:
            java.lang.String r0 = "image/*"
            r3.setDataAndType(r5, r0)     // Catch: java.lang.Exception -> L56
            r0 = 1
            com.huawei.hms.hmsscankit.RemoteView.flagForGallery = r0     // Catch: java.lang.Exception -> L56
            r0 = 4371(0x1113, float:6.125E-42)
            r7.startActivityForResult(r3, r0)     // Catch: java.lang.Exception -> L56
            return
        L56:
            java.lang.String r7 = "startPhotoCode Exception"
            com.huawei.hms.scankit.p.o4.b(r1, r7)
            return
    }

    private void startPhotoCode(android.app.Activity r3) {
            r2 = this;
            boolean r0 = r2.checkPhotoPermission(r3)
            if (r0 == 0) goto La
            r2.startActivityForGallery(r3)
            return
        La:
            java.lang.String r0 = "no photo permission"
            java.lang.String r1 = "ScanKitRemoteView"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            com.huawei.hms.hmsscankit.OnErrorCallback r0 = r2.mOnErrorCallback
            if (r0 != 0) goto L19
            r2.requestPhotoPermission(r3)
            return
        L19:
            java.lang.String r3 = "no photo permission, report error2"
            com.huawei.hms.scankit.p.o4.b(r1, r3)
            com.huawei.hms.hmsscankit.OnErrorCallback r3 = r2.mOnErrorCallback
            r0 = 2
            r3.onError(r0)
            return
    }

    com.huawei.hms.hmsscankit.RemoteView enableReturnBitmap(boolean r2) {
            r1 = this;
            r1.mReturnedBitmap = r2
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            r0.c(r2)
            return r1
    }

    public boolean getLightStatus() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L9
            boolean r0 = com.huawei.hms.hmsscankit.RemoteView.a.b(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L7
            com.huawei.hms.hmsscankit.RemoteView.a.a(r0, r2, r3, r4)
        L7:
            return
    }

    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1b
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L1b
            android.content.Context r0 = r2.mContext
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r1, r1)
        L1b:
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r2.mRemoteHelper
            r0.onCreate(r3)
            return
    }

    public final void onDestroy() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto Lf
            r0.onDestroy()
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            com.huawei.hms.hmsscankit.RemoteView.a.c(r0)
            r0 = 0
            r1.mRemoteHelper = r0
        Lf:
            return
    }

    public final void onPause() {
            r2 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r2.mRemoteHelper
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r2.mRemoteHelper
            if (r0 == 0) goto L12
            boolean r1 = com.huawei.hms.hmsscankit.RemoteView.flagForGallery
            if (r1 == 0) goto L12
            r0.onStop()
        L12:
            r0 = 0
            com.huawei.hms.hmsscankit.RemoteView.isOnStop = r0
            return
    }

    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3, android.app.Activity r4) {
            r0 = this;
            r2 = 4371(0x1113, float:6.125E-42)
            if (r1 != r2) goto L10
            int r1 = r3.length
            r2 = 1
            if (r1 != r2) goto L10
            r1 = 0
            r1 = r3[r1]
            if (r1 != 0) goto L10
            r0.startPhotoCode(r4)
        L10:
            return
    }

    public final void onResume() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L7
            r0.onResume()
        L7:
            r0 = 0
            com.huawei.hms.hmsscankit.RemoteView.flagForGallery = r0
            return
    }

    public final void onStart() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L7
            r0.onStart()
        L7:
            r0 = 0
            com.huawei.hms.hmsscankit.RemoteView.flagForGallery = r0
            return
    }

    public final void onStop() {
            r2 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r2.mRemoteHelper
            if (r0 == 0) goto Lb
            boolean r1 = com.huawei.hms.hmsscankit.RemoteView.flagForGallery
            if (r1 != 0) goto Lb
            r0.onStop()
        Lb:
            r0 = 1
            com.huawei.hms.hmsscankit.RemoteView.isOnStop = r0
            return
    }

    public void pauseContinuouslyScan() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L7
            com.huawei.hms.hmsscankit.RemoteView.a.a(r0)
        L7:
            return
    }

    public void resumeContinuouslyScan() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L7
            com.huawei.hms.hmsscankit.RemoteView.a.f(r0)
        L7:
            return
    }

    public void selectPictureFromLocalFile() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.app.Activity r0 = (android.app.Activity) r0
            r1.startPhotoCode(r0)
            return
    }

    com.huawei.hms.hmsscankit.RemoteView setContinuouslyScan(boolean r1) {
            r0 = this;
            r0.mContinuouslyScan = r1
            return r0
    }

    public void setOnErrorCallback(com.huawei.hms.hmsscankit.OnErrorCallback r3) {
            r2 = this;
            r2.mOnErrorCallback = r3
            com.huawei.hms.hmsscankit.RemoteView$a r3 = r2.mRemoteHelper
            if (r3 == 0) goto L10
            com.huawei.hms.hmsscankit.c r0 = new com.huawei.hms.hmsscankit.c
            com.huawei.hms.hmsscankit.OnErrorCallback r1 = r2.mOnErrorCallback
            r0.<init>(r1)
            com.huawei.hms.hmsscankit.RemoteView.a.a(r3, r0)
        L10:
            return
    }

    public void setOnLightVisibleCallback(com.huawei.hms.hmsscankit.OnLightVisibleCallBack r3) {
            r2 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r2.mRemoteHelper
            if (r0 == 0) goto Lc
            com.huawei.hms.hmsscankit.d r1 = new com.huawei.hms.hmsscankit.d
            r1.<init>(r3)
            com.huawei.hms.hmsscankit.RemoteView.a.a(r0, r1)
        Lc:
            return
    }

    public void setOnResultCallback(com.huawei.hms.hmsscankit.OnResultCallback r4) {
            r3 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r3.mRemoteHelper
            if (r0 == 0) goto Le
            com.huawei.hms.hmsscankit.e r1 = new com.huawei.hms.hmsscankit.e
            boolean r2 = r3.mContinuouslyScan
            r1.<init>(r4, r2)
            com.huawei.hms.hmsscankit.RemoteView.a.a(r0, r1)
        Le:
            return
    }

    public boolean switchLight() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            if (r0 == 0) goto L18
            boolean r0 = r1.getLightStatus()
            if (r0 != 0) goto L11
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            boolean r0 = com.huawei.hms.hmsscankit.RemoteView.a.d(r0)
            return r0
        L11:
            com.huawei.hms.hmsscankit.RemoteView$a r0 = r1.mRemoteHelper
            boolean r0 = com.huawei.hms.hmsscankit.RemoteView.a.e(r0)
            return r0
        L18:
            r0 = 0
            return r0
    }
}
