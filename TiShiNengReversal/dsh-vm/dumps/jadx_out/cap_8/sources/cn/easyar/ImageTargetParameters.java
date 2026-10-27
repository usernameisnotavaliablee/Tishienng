package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C9C38E31F")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageTargetParameters extends cn.easyar.RefBase {
    public ImageTargetParameters() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected ImageTargetParameters(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C6105D6CC")
    public native cn.easyar.Image image();

    @cn.easyar.MethodId("CEA3BD73E")
    public native java.lang.String meta();

    @cn.easyar.MethodId("C82A3537F")
    public native java.lang.String name();

    @cn.easyar.MethodId("CF469802A")
    public native float scale();

    @cn.easyar.MethodId("C3BE10C43")
    public native void setImage(cn.easyar.Image r1);

    @cn.easyar.MethodId("C9AF85922")
    public native void setMeta(java.lang.String r1);

    @cn.easyar.MethodId("C3E1A767C")
    public native void setName(java.lang.String r1);

    @cn.easyar.MethodId("C859CD11A")
    public native void setScale(float r1);

    @cn.easyar.MethodId("C83B06FAE")
    public native void setUid(java.lang.String r1);

    @cn.easyar.MethodId("C17B788A7")
    public native java.lang.String uid();
}
