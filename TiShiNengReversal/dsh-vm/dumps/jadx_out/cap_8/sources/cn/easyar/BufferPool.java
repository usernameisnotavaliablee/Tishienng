package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C8F6FC2EA")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BufferPool extends cn.easyar.RefBase {
    public BufferPool(int r2, int r3) {
            r1 = this;
            long r2 = _ctor(r2, r3)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    protected BufferPool(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor(int r0, int r1);

    @cn.easyar.MethodId("C13D754BE")
    public native int block_size();

    @cn.easyar.MethodId("CEC21B3B9")
    public native int capacity();

    @cn.easyar.MethodId("CCCDCBE84")
    public native int size();

    @cn.easyar.MethodId("C0AD04ED7")
    public native cn.easyar.Buffer tryAcquire();
}
