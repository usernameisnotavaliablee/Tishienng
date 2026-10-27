package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C0F54C27E")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ObjectTarget extends cn.easyar.Target {
    public ObjectTarget() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected ObjectTarget(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C0F2ECB5F")
    public static native cn.easyar.ObjectTarget createFromObjectFile(java.lang.String r0, int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, float r5);

    @cn.easyar.MethodId("C179143BD")
    public static native cn.easyar.ObjectTarget createFromParameters(cn.easyar.ObjectTargetParameters r0);

    @cn.easyar.MethodId("CC679F44F")
    public native java.util.ArrayList<cn.easyar.o0> boundingBox();

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("CEA3BD73E")
    public native java.lang.String meta();

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("C82A3537F")
    public native java.lang.String name();

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("C08EB3025")
    public native int runtimeID();

    @cn.easyar.MethodId("CF469802A")
    public native float scale();

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("C9AF85922")
    public native void setMeta(java.lang.String r1);

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("C3E1A767C")
    public native void setName(java.lang.String r1);

    @cn.easyar.MethodId("C859CD11A")
    public native boolean setScale(float r1);

    @Override // cn.easyar.Target
    @cn.easyar.MethodId("C17B788A7")
    public native java.lang.String uid();
}
