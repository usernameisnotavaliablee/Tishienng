package com.bytedance.msdk.api.activity;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTDelegateActivity extends android.app.Activity {
    private android.content.Intent j;



    public static class j implements java.lang.Runnable {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }
    }

    static {
            r0 = 20107(0x4e8b, float:2.8176E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public TTDelegateActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r2 = 0
            r1.alpha = r2
            r0.setAttributes(r1)
            return
    }

    private void j(int r11, int[] r12) {
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L64
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            r5 = 3
            r6 = 1
            if (r11 == r6) goto L27
            if (r11 == r5) goto L1a
            goto L4a
        L1a:
            r0.add(r4)     // Catch: java.lang.Exception -> L60
            r0.add(r3)     // Catch: java.lang.Exception -> L60
            r0.add(r2)     // Catch: java.lang.Exception -> L60
            r0.add(r1)     // Catch: java.lang.Exception -> L60
            goto L4a
        L27:
            if (r12 == 0) goto L4a
            int r11 = r12.length     // Catch: java.lang.Exception -> L60
            if (r11 <= 0) goto L4a
            int r11 = r12.length     // Catch: java.lang.Exception -> L60
            r7 = 0
        L2e:
            if (r7 >= r11) goto L4a
            r8 = r12[r7]     // Catch: java.lang.Exception -> L60
            if (r8 != r6) goto L3b
            r0.add(r4)     // Catch: java.lang.Exception -> L60
            r0.add(r3)     // Catch: java.lang.Exception -> L60
            goto L47
        L3b:
            r9 = 2
            if (r8 != r9) goto L42
            r0.add(r2)     // Catch: java.lang.Exception -> L60
            goto L47
        L42:
            if (r8 != r5) goto L47
            r0.add(r1)     // Catch: java.lang.Exception -> L60
        L47:
            int r7 = r7 + 1
            goto L2e
        L4a:
            int r11 = r0.size()     // Catch: java.lang.Exception -> L60
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Exception -> L60
            r0.toArray(r11)     // Catch: java.lang.Exception -> L60
            com.bytedance.msdk.core.vl.up r12 = com.bytedance.msdk.core.vl.up.j()     // Catch: java.lang.Exception -> L60
            com.bytedance.msdk.api.activity.TTDelegateActivity$2 r0 = new com.bytedance.msdk.api.activity.TTDelegateActivity$2     // Catch: java.lang.Exception -> L60
            r0.<init>(r10)     // Catch: java.lang.Exception -> L60
            r12.j(r10, r11, r0)     // Catch: java.lang.Exception -> L60
            return
        L60:
            r10.finish()
            return
        L64:
            java.lang.String r11 = "TTMediationSDK"
            java.lang.String r12 = "已经有Read phone state权限"
            com.bytedance.msdk.j.up.cw.j(r11, r12)
            r10.finish()
            return
    }

    private void j(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2e
            if (r4 == 0) goto L2e
            int r0 = r4.length
            if (r0 > 0) goto Lc
            goto L2e
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L23
            com.bytedance.msdk.core.vl.up r0 = com.bytedance.msdk.core.vl.up.j()     // Catch: java.lang.Exception -> L1f
            com.bytedance.msdk.api.activity.TTDelegateActivity$1 r1 = new com.bytedance.msdk.api.activity.TTDelegateActivity$1     // Catch: java.lang.Exception -> L1f
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L1f
            r0.j(r2, r4, r1)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r2.finish()
            return
        L23:
            java.lang.String r3 = "TTMediationSDK"
            java.lang.String r4 = "已经有权限"
            com.bytedance.msdk.j.up.cw.j(r3, r4)
            r2.finish()
            return
        L2e:
            r2.finish()
            return
    }

    private void xt() {
            r3 = this;
            android.content.Intent r0 = r3.j     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "type"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L3b
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L16
            r3.finish()     // Catch: java.lang.Exception -> L3b
            return
        L16:
            r1 = 0
            r3.j(r0, r1)     // Catch: java.lang.Exception -> L3b
            return
        L1b:
            android.content.Intent r0 = r3.j     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "permission_id_key"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch: java.lang.Exception -> L3b
            android.content.Intent r1 = r3.j     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = "permission_content_key"
            java.lang.String[] r1 = r1.getStringArrayExtra(r2)     // Catch: java.lang.Exception -> L3b
            r3.j(r0, r1)     // Catch: java.lang.Exception -> L3b
            return
        L2f:
            android.content.Intent r1 = r3.j     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = "permissions"
            int[] r1 = r1.getIntArrayExtra(r2)     // Catch: java.lang.Exception -> L3b
            r3.j(r0, r1)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            r3.finish()
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 != 0) goto Lc
            com.bytedance.msdk.core.xt.j(r1)
        Lc:
            r1.setIntent(r2)     // Catch: java.lang.Throwable -> L11
            r1.j = r2     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3);

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto Lc
            r1.xt()
        Lc:
            return
    }
}
