package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RecordNative {
    private static final java.lang.String TAG = "easyar.RecordNative";
    private int height;
    private long id;
    private int width;

    RecordNative(android.view.Surface r3, int r4, int r5, int r6) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.id = r0
            r0 = 0
            r2.width = r0
            r2.height = r0
            boolean r3 = r2.nativeInit(r3, r4, r5, r6)
            if (r3 == 0) goto L13
            return
        L13:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "RecordNative init failed"
            r3.<init>(r4)
            throw r3
    }

    private native boolean nativeInit(android.view.Surface r1, int r2, int r3, int r4);

    private native void nativeRelease();

    private native void nativeUpdateRecord(int r1, int r2, int r3, long r4);

    private native void nativeUpdateRecord(int r1, long r2);

    public native int nativeHeight();

    public native int nativeWidth();

    public void release() {
            r0 = this;
            r0.nativeRelease()
            return
    }

    public void updateRecord(int r1, int r2, int r3, long r4) throws java.lang.Exception {
            r0 = this;
            r0.nativeUpdateRecord(r1, r2, r3, r4)
            return
    }

    public void updateRecord(int r1, long r2) throws java.lang.Exception {
            r0 = this;
            r0.nativeUpdateRecord(r1, r2)
            return
    }
}
