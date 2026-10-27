package com.ss.android.j.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements v2.n {
    private v2.t a;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public void j(@androidx.annotation.NonNull android.app.Activity r2, int r3, @androidx.annotation.NonNull java.lang.String[] r4, @androidx.annotation.NonNull int[] r5) {
            r1 = this;
            int r2 = r5.length
            if (r2 <= 0) goto L18
            v2.t r2 = r1.a
            if (r2 == 0) goto L18
            r3 = 0
            r5 = r5[r3]
            r0 = -1
            if (r5 != r0) goto L13
            r3 = r4[r3]
            r2.j(r3)
            return
        L13:
            if (r5 != 0) goto L18
            r2.j()
        L18:
            return
    }

    public void j(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull java.lang.String[] r4, v2.t r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            r2.a = r5
            r5 = 1
            com.bytedance.msdk.core.vl.a.a(r3, r4, r5)
            return
        Ld:
            if (r5 == 0) goto L12
            r5.j()
        L12:
            return
    }

    public boolean j(@androidx.annotation.Nullable android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L15
            if (r5 == 0) goto L15
            int r1 = android.os.Process.myPid()
            int r2 = android.os.Process.myUid()
            int r4 = r4.checkPermission(r5, r1, r2)
            if (r4 != 0) goto L15
            r4 = 1
            return r4
        L15:
            return r0
    }
}
