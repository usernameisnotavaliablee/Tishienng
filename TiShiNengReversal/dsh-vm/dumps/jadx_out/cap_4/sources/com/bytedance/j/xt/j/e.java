package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a(android.content.Context r1, int r2) {
            android.app.ActivityManager$ProcessErrorStateInfo r1 = com.bytedance.j.xt.tl.f.d(r1, r2)
            if (r1 == 0) goto L13
            int r2 = android.os.Process.myPid()
            int r0 = r1.pid
            if (r2 != r0) goto L13
            java.lang.String r1 = com.bytedance.j.xt.j.f.a(r1)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static org.json.JSONObject b(boolean r3) throws org.json.JSONException {
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "thread_number"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "mainStackFromTrace"
            java.lang.String r3 = com.bytedance.j.xt.tl.o.c(r3)
            r0.put(r1, r3)
            return r0
    }
}
