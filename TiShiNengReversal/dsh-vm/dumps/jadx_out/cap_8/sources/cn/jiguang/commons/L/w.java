package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class w {
    public w() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.Intent a(android.content.Context r2, android.content.BroadcastReceiver r3, android.content.IntentFilter r4, java.lang.String r5, android.os.Handler r6, boolean r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            if (r0 < r1) goto L18
            if (r7 == 0) goto L12
            r7 = 2
            goto L13
        L12:
            r7 = 4
        L13:
            android.content.Intent r2 = cn.jiguang.av.h0.a(r2, r3, r4, r5, r6, r7)
            return r2
        L18:
            android.content.Intent r2 = r2.registerReceiver(r3, r4, r5, r6)
            return r2
    }

    public static android.content.Intent a(android.content.Context r2, android.content.BroadcastReceiver r3, android.content.IntentFilter r4, boolean r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            if (r0 < r1) goto L18
            if (r5 == 0) goto L12
            r5 = 2
            goto L13
        L12:
            r5 = 4
        L13:
            android.content.Intent r2 = cn.jiguang.commons.L.j1.a(r2, r3, r4, r5)
            return r2
        L18:
            android.content.Intent r2 = r2.registerReceiver(r3, r4)
            return r2
    }
}
