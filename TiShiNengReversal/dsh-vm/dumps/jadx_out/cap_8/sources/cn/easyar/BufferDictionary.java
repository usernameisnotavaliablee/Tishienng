package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C4DA20F89")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BufferDictionary extends cn.easyar.RefBase {
    public BufferDictionary() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected BufferDictionary(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C913A4CB9")
    public native void clear();

    @cn.easyar.MethodId("CBEEB20FB")
    public native boolean contains(java.lang.String r1);

    @cn.easyar.MethodId("C6C35493A")
    public native int count();

    @cn.easyar.MethodId("C7E5608AB")
    public native boolean remove(java.lang.String r1);

    @cn.easyar.MethodId("C6EE0EB49")
    public native void set(java.lang.String r1, cn.easyar.Buffer r2);

    @cn.easyar.MethodId("CF861531D")
    public native cn.easyar.Buffer tryGet(java.lang.String r1);
}
