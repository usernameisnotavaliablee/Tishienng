package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C1AA4CB0B")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Image extends cn.easyar.RefBase {
    protected Image(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public Image(cn.easyar.Buffer r1, int r2, int r3, int r4) {
            r0 = this;
            long r1 = _ctor(r1, r2, r3, r4)
            r3 = 0
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor(cn.easyar.Buffer r0, int r1, int r2, int r3);

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.Image create(cn.easyar.Buffer r0, int r1, int r2, int r3, int r4, int r5);

    @cn.easyar.MethodId("CD0CA8C2A")
    public native cn.easyar.Buffer buffer();

    @cn.easyar.MethodId("CE904C9CC")
    public native int format();

    @cn.easyar.MethodId("C39E0F5EF")
    public native int height();

    @cn.easyar.MethodId("C0D92355A")
    public native int pixelHeight();

    @cn.easyar.MethodId("C0FA49014")
    public native int pixelWidth();

    @cn.easyar.MethodId("CDEC0F004")
    public native int width();
}
