package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SupportInfo {
    java.lang.String a;
    java.lang.Boolean b;

    SupportInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    void a(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.b = r1
            return
    }

    boolean a() {
            r1 = this;
            java.lang.Boolean r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    boolean a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = r1.a
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }

    void b(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    boolean b() {
            r1 = this;
            java.lang.Boolean r0 = r1.b
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
