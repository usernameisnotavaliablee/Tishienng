package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class a extends android.content.BroadcastReceiver {
    a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            if (r5 == 0) goto L86
            if (r6 != 0) goto L6
            goto L86
        L6:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = "shouldUpdateId, notifyFlag : "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            org.repackage.com.meizu.flyme.openidsdk.b.a(r2)
            r2 = 1
            if (r0 != r2) goto L2f
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L46
        L2d:
            r1 = 1
            goto L46
        L2f:
            r3 = 2
            if (r0 != r3) goto L43
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L46
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L46
        L43:
            if (r0 != 0) goto L46
            goto L2d
        L46:
            if (r1 != 0) goto L49
            goto L86
        L49:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            org.repackage.com.meizu.flyme.openidsdk.b r6 = org.repackage.com.meizu.flyme.openidsdk.b.a()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5e
            org.repackage.com.meizu.flyme.openidsdk.OpenId r5 = r6.b
            goto L80
        L5e:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L69
            org.repackage.com.meizu.flyme.openidsdk.OpenId r5 = r6.d
            goto L80
        L69:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L74
            org.repackage.com.meizu.flyme.openidsdk.OpenId r5 = r6.c
            goto L80
        L74:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L7f
            org.repackage.com.meizu.flyme.openidsdk.OpenId r5 = r6.a
            goto L80
        L7f:
            r5 = 0
        L80:
            if (r5 != 0) goto L83
            goto L86
        L83:
            r5.b()
        L86:
            return
    }
}
