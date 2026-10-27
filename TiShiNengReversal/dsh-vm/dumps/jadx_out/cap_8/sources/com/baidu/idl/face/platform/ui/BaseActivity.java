package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BaseActivity extends android.app.Activity {
    public BaseActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r1 = 99
            r0.requestPermissions(r1)
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            r2 = 0
        L4:
            int r0 = r3.length
            if (r2 >= r0) goto Lc
            r0 = r4[r2]
            int r2 = r2 + 1
            goto L4
        Lc:
            return
    }

    public void requestPermissions(int r6) {
            r5 = this;
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r2 = "android.permission.CAMERA"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4a
            r4 = 23
            if (r3 < r4) goto L4a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            int r4 = com.baidu.idl.face.platform.ui.a.a(r5, r2)     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L1a
            r3.add(r2)     // Catch: java.lang.Exception -> L4a
        L1a:
            int r2 = com.baidu.idl.face.platform.ui.a.a(r5, r1)     // Catch: java.lang.Exception -> L4a
            if (r2 == 0) goto L23
            r3.add(r1)     // Catch: java.lang.Exception -> L4a
        L23:
            int r1 = com.baidu.idl.face.platform.ui.a.a(r5, r0)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L2c
            r3.add(r0)     // Catch: java.lang.Exception -> L4a
        L2c:
            int r0 = r3.size()     // Catch: java.lang.Exception -> L4a
            r1 = 1
            if (r0 < r1) goto L4a
            int r0 = r3.size()     // Catch: java.lang.Exception -> L4a
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L4a
            r2 = 0
        L3a:
            if (r2 >= r0) goto L47
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4a
            r1[r2] = r4     // Catch: java.lang.Exception -> L4a
            int r2 = r2 + 1
            goto L3a
        L47:
            com.baidu.idl.face.platform.ui.b.a(r5, r1, r6)     // Catch: java.lang.Exception -> L4a
        L4a:
            return
    }

    public void showCustomToast(java.lang.String r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getLayoutInflater()
            int r1 = com.baidu.idl.face.platform.ui.R.layout.setting_toast_layout
            int r2 = com.baidu.idl.face.platform.ui.R.id.toast_layout
            android.view.View r2 = r3.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.baidu.idl.face.platform.ui.R.id.toast_txt
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r4)
            android.widget.Toast r4 = new android.widget.Toast
            r4.<init>(r3)
            r1 = 0
            r4.setDuration(r1)
            r2 = 17
            r4.setGravity(r2, r1, r1)
            r4.setView(r0)
            r4.show()
            return
    }
}
