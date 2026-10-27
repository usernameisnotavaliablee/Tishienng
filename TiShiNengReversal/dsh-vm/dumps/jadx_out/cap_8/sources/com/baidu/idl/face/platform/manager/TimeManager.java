package com.baidu.idl.face.platform.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TimeManager {
    private static com.baidu.idl.face.platform.manager.TimeManager instance;
    private int mActiveAnimTime;

    static {
            return
    }

    private TimeManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.baidu.idl.face.platform.manager.TimeManager getInstance() {
            com.baidu.idl.face.platform.manager.TimeManager r0 = com.baidu.idl.face.platform.manager.TimeManager.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.baidu.idl.face.platform.manager.TimeManager> r0 = com.baidu.idl.face.platform.manager.TimeManager.class
            monitor-enter(r0)
            com.baidu.idl.face.platform.manager.TimeManager r1 = com.baidu.idl.face.platform.manager.TimeManager.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.baidu.idl.face.platform.manager.TimeManager r1 = new com.baidu.idl.face.platform.manager.TimeManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.baidu.idl.face.platform.manager.TimeManager.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.baidu.idl.face.platform.manager.TimeManager r0 = com.baidu.idl.face.platform.manager.TimeManager.instance
            return r0
    }

    public int getActiveAnimTime() {
            r1 = this;
            int r0 = r1.mActiveAnimTime
            return r0
    }

    public void setActiveAnimTime(int r1) {
            r0 = this;
            r0.mActiveAnimTime = r1
            return
    }
}
