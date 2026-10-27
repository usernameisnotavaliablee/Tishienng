package com.huawei.hms.framework.common.hianalytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SceneContentObserver extends android.database.ContentObserver {
    public SceneContentObserver(android.os.Handler r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r1) {
            r0 = this;
            r0.onChangeForMp()
            return
    }

    public native void onChangeForMp();
}
