package com.bytedance.msdk.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class r {
    private static android.widget.Toast j;

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"ShowToast"})
    private static android.widget.Toast j(android.content.Context r2) {
            if (r2 != 0) goto L5
            android.widget.Toast r2 = com.bytedance.msdk.api.r.j
            return r2
        L5:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = ""
            r1 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            com.bytedance.msdk.api.r.j = r2
            return r2
    }

    public static void j(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            j(r1, r2, r0)
            return
    }

    public static void j(android.content.Context r0, java.lang.String r1, int r2) {
            android.widget.Toast r0 = j(r0)
            if (r0 == 0) goto L14
            r0.setDuration(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
            r0.show()
            return
        L14:
            java.lang.String r0 = "toast msg: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TToast"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            return
    }
}
