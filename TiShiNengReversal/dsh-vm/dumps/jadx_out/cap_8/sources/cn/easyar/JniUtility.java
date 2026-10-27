package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CE46D9FB1")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JniUtility {
    public JniUtility() {
            r0 = this;
            r0.<init>()
            return
    }

    @cn.easyar.MethodId("CE5537884")
    public static native void deleteJniGlobalPointer(long r0);

    @cn.easyar.MethodId("C271CED7C")
    public static native long getDirectBufferAddress(long r0);

    @cn.easyar.MethodId("CB725F798")
    public static native long newJniGlobalPointer(java.lang.Object r0);

    @cn.easyar.MethodId("C5C615131")
    public static native cn.easyar.Buffer wrapBuffer(long r0, cn.easyar.FunctorOfVoid r2);

    @cn.easyar.MethodId("CC78A1A1F")
    public static native cn.easyar.Buffer wrapByteArray(long r0, boolean r2, cn.easyar.FunctorOfVoid r3);
}
