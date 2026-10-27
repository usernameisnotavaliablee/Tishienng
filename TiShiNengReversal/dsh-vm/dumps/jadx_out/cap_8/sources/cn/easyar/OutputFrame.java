package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CDA57866C")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OutputFrame extends cn.easyar.RefBase {
    protected OutputFrame(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public OutputFrame(cn.easyar.InputFrame r2, java.util.ArrayList<cn.easyar.o> r3) {
            r1 = this;
            long r2 = _ctor(r2, r3)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor(cn.easyar.InputFrame r0, java.util.ArrayList<cn.easyar.o> r1);

    @cn.easyar.MethodId("C1BC04B52")
    public native int index();

    @cn.easyar.MethodId("C2B2479BA")
    public native cn.easyar.InputFrame inputFrame();

    @cn.easyar.MethodId("CC099142B")
    public native java.util.ArrayList<cn.easyar.o> results();
}
