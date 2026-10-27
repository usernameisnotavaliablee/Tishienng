package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C21E49EB2")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Log {
    public Log() {
            r0 = this;
            r0.<init>()
            return
    }

    @cn.easyar.MethodId("C62278C32")
    public static native void resetLogFunc();

    @cn.easyar.MethodId("CD5C6203B")
    public static native void setLogFunc(cn.easyar.FunctorOfVoidFromLogLevelAndString r0);

    @cn.easyar.MethodId("C060C1415")
    public static native void setLogFuncWithScheduler(cn.easyar.CallbackScheduler r0, cn.easyar.FunctorOfVoidFromLogLevelAndString r1);
}
