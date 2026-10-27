package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ScanKitActivity extends android.app.Activity {
    private static final int REQUEST_SETTING_DETAILS = 1;
    private static final java.lang.String TAG = "ScanKitActivity";
    static android.app.AlertDialog alertDialog;
    static com.huawei.hms.hmsscankit.a mDialog;
    private boolean errorReport;
    private boolean hasCameraPermission;
    private int lastRotation;
    private android.view.OrientationEventListener mOrientationListener;
    private com.huawei.hms.hmsscankit.RemoteView remoteView;
    private boolean showGuide;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$1, reason: invalid class name */
    class AnonymousClass1 implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass1(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$2, reason: invalid class name */
    class AnonymousClass2 implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass2(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.huawei.hms.hmsscankit.ScanKitActivity r1 = r0.this$0
                com.huawei.hms.hmsscankit.ScanKitActivity.access$000(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$3, reason: invalid class name */
    class AnonymousClass3 implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass3(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$4, reason: invalid class name */
    class AnonymousClass4 implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass4(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.huawei.hms.hmsscankit.ScanKitActivity r1 = r0.this$0
                com.huawei.hms.hmsscankit.ScanKitActivity.access$000(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$5, reason: invalid class name */
    class AnonymousClass5 implements com.huawei.hms.hmsscankit.OnResultCallback {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass5(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.hmsscankit.OnResultCallback
        public void onResult(com.huawei.hms.ml.scan.HmsScan[] r4) {
                r3 = this;
                if (r4 == 0) goto L2e
                int r0 = r4.length
                if (r0 <= 0) goto L2e
                r0 = 0
                r1 = r4[r0]
                if (r1 == 0) goto L2e
                java.lang.String r1 = r1.originalValue
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L2e
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = "SCAN_RESULT_CODE"
                r1.putExtra(r2, r0)
                r4 = r4[r0]
                java.lang.String r0 = "SCAN_RESULT"
                r1.putExtra(r0, r4)
                com.huawei.hms.hmsscankit.ScanKitActivity r4 = r3.this$0
                r0 = -1
                r4.setResult(r0, r1)
                com.huawei.hms.hmsscankit.ScanKitActivity r4 = r3.this$0
                r4.finish()
            L2e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.hmsscankit.ScanKitActivity$6, reason: invalid class name */
    class AnonymousClass6 implements com.huawei.hms.hmsscankit.OnErrorCallback {
        final /* synthetic */ com.huawei.hms.hmsscankit.ScanKitActivity this$0;

        AnonymousClass6(com.huawei.hms.hmsscankit.ScanKitActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.hmsscankit.OnErrorCallback
        public void onError(int r3) {
                r2 = this;
                com.huawei.hms.hmsscankit.ScanKitActivity r0 = r2.this$0
                com.huawei.hms.hmsscankit.ScanKitActivity.access$100(r0)
                com.huawei.hms.hmsscankit.ScanKitActivity r0 = r2.this$0
                boolean r0 = com.huawei.hms.hmsscankit.ScanKitActivity.access$100(r0)
                if (r0 == 0) goto L22
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "SCAN_RESULT_CODE"
                r0.putExtra(r1, r3)
                com.huawei.hms.hmsscankit.ScanKitActivity r3 = r2.this$0
                r1 = -1
                r3.setResult(r1, r0)
                com.huawei.hms.hmsscankit.ScanKitActivity r3 = r2.this$0
                r3.finish()
            L22:
                return
        }
    }


    static {
            r0 = 34443(0x868b, float:4.8265E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ScanKitActivity() {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.lastRotation = r0
            r0 = 0
            r1.errorReport = r0
            r1.showGuide = r0
            return
    }

    static /* synthetic */ void access$000(com.huawei.hms.hmsscankit.ScanKitActivity r0) {
            r0.gotoSetting()
            return
    }

    static /* synthetic */ boolean access$100(com.huawei.hms.hmsscankit.ScanKitActivity r0) {
            boolean r0 = r0.errorReport
            return r0
    }

    static /* synthetic */ int access$200(com.huawei.hms.hmsscankit.ScanKitActivity r0) {
            int r0 = r0.lastRotation
            return r0
    }

    static /* synthetic */ int access$202(com.huawei.hms.hmsscankit.ScanKitActivity r0, int r1) {
            r0.lastRotation = r1
            return r1
    }

    private void cameraPermissionChange() {
            r1 = this;
            com.huawei.hms.hmsscankit.a r0 = com.huawei.hms.hmsscankit.ScanKitActivity.mDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            android.app.AlertDialog r0 = com.huawei.hms.hmsscankit.ScanKitActivity.alertDialog
            if (r0 == 0) goto L16
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L16
            android.app.AlertDialog r0 = com.huawei.hms.hmsscankit.ScanKitActivity.alertDialog
            r0.dismiss()
        L16:
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L1d
            return
        L1d:
            r0 = -1
            r1.setResult(r0)
            r1.finish()
            return
    }

    private void gotoSetting() {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r2, r1, r3)
            java.lang.String r2 = r5.getPackageName()
            java.lang.String r3 = "ScanKitActivity"
            java.lang.String r4 = "getPackageName "
            com.huawei.hms.scankit.p.o4.a(r3, r4, r2)
            r0.setData(r1)
            r1 = 1
            r5.startActivityForResult(r0, r1)
            return
    }

    private void setActivityUseNotchScreen(android.app.Activity r4) {
            r3 = this;
            if (r4 == 0) goto L1b
            android.view.Window r0 = r4.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L14
            r1 = 1
            com.huawei.hms.hmsscankit.h.a(r0, r1)
        L14:
            android.view.Window r4 = r4.getWindow()
            r4.setAttributes(r0)
        L1b:
            return
    }

    private void startOrientationChangeListener() {
            r1 = this;
            com.huawei.hms.hmsscankit.ScanKitActivity$7 r0 = new com.huawei.hms.hmsscankit.ScanKitActivity$7
            r0.<init>(r1, r1)
            r1.mOrientationListener = r0
            r0.enable()
            return
    }

    @Override // android.app.Activity
    public void finish() {
            r1 = this;
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onStop()
            r0 = 1
            com.huawei.hms.scankit.p.w7.c = r0
            super.finish()
            return
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onActivityResult(r2, r3, r4)
            r3 = 1
            if (r2 != r3) goto Le
            r1.cameraPermissionChange()
        Le:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onDestroy()
            r0 = 1
            com.huawei.hms.scankit.p.w7.c = r0
            android.view.OrientationEventListener r0 = r1.mOrientationListener
            if (r0 == 0) goto L12
            r0.disable()
        L12:
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r1 = this;
            super.onPause()
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onPause()
            return
    }

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onResume()
            r0 = 0
            com.huawei.hms.scankit.p.w7.c = r0
            boolean r0 = r1.hasCameraPermission
            if (r0 != 0) goto L18
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r1)
            if (r0 == 0) goto L18
            r1.cameraPermissionChange()
        L18:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onStart()
            r0 = 0
            com.huawei.hms.scankit.p.w7.c = r0
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r1 = this;
            super.onStop()
            boolean r0 = com.huawei.hms.scankit.p.w7.c
            if (r0 != 0) goto Lf
            com.huawei.hms.hmsscankit.RemoteView r0 = r1.remoteView
            r0.onStop()
            r0 = 1
            com.huawei.hms.scankit.p.w7.c = r0
        Lf:
            return
    }
}
