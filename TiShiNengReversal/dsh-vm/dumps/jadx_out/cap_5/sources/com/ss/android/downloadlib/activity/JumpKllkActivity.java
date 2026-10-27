package com.ss.android.downloadlib.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class JumpKllkActivity extends com.ss.android.downloadlib.activity.TTDelegateActivity {
    public JumpKllkActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity
    protected void d() {
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            android.content.Intent r1 = r8.getIntent()
            if (r1 != 0) goto L17
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r1 = "handleIntent is null"
            r0.c(r1)
            com.ss.android.socialbase.appdownloader.b.u(r8)
            return
        L17:
            java.lang.String r1 = "p"
            java.lang.String r3 = r0.getStringExtra(r1)
            java.lang.String r1 = "id"
            r4 = 0
            long r1 = r0.getLongExtra(r1, r4)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L2f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
        L2f:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r5 = "getPackage or id is null"
            r4.c(r5)
            com.ss.android.socialbase.appdownloader.b.u(r8)
        L3b:
            java.lang.String r4 = "dl"
            r5 = 0
            boolean r4 = r0.getBooleanExtra(r4, r5)
            java.lang.String r6 = "bk"
            java.lang.String r6 = r0.getStringExtra(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r7 = 1
            r0 = r0 ^ r7
            r0 = r0 & r4
            if (r0 == 0) goto L5b
            r7 = 1
            r4 = r1
            r2 = r8
            com.ss.android.downloadlib.a.m.v(r2, r3, r4, r6, r7)
            com.ss.android.socialbase.appdownloader.b.u(r8)
            return
        L5b:
            r0 = r1
            r2 = r8
            org.json.JSONObject r4 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r6 = "ab"
            int r4 = r4.optInt(r6, r5)
            if (r4 != r7) goto L6a
            r5 = 1
        L6a:
            com.ss.android.downloadlib.a.m.w(r8, r3, r0, r5)
            if (r4 == r7) goto L72
            com.ss.android.socialbase.appdownloader.b.u(r8)
        L72:
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r0 = this;
            super.onPause()
            com.ss.android.socialbase.appdownloader.b.u(r0)
            return
    }
}
