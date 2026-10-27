package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ExcessActivity extends com.acse.ottn.a0 {
    static {
            r0 = 9579(0x256b, float:1.3423E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ExcessActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String a(android.content.Context r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            int r3 = android.os.Process.myPid()
            if (r2 != r3) goto L14
            java.lang.String r5 = r1.processName
            return r5
        L2b:
            return r0
    }

    @Override // com.acse.ottn.a0
    public native void onCreate(android.os.Bundle r1);
}
