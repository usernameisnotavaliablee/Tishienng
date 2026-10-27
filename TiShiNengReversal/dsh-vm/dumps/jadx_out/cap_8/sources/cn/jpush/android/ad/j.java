package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r8, android.content.BroadcastReceiver r9, android.content.IntentFilter r10, java.lang.String r11, android.os.Handler r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            android.content.Context r2 = r8.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r7 = 2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            cn.jiguang.av.h0.a(r2, r3, r4, r5, r6, r7)
            return
        L17:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.content.Context r8 = r8.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
            r8.registerReceiver(r3, r4, r5, r6)
            return
    }
}
