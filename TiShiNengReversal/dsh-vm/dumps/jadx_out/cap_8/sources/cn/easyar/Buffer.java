package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CE44193FD")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Buffer extends cn.easyar.RefBase {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.easyar.FunctorOfVoid {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // cn.easyar.FunctorOfVoid
        public void invoke() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.easyar.FunctorOfVoid {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // cn.easyar.FunctorOfVoid
        public void invoke() {
                r0 = this;
                return
        }
    }

    protected Buffer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.Buffer create(int r0);

    public static cn.easyar.Buffer i(java.nio.Buffer r1) {
            cn.easyar.Buffer$b r0 = new cn.easyar.Buffer$b
            r0.<init>()
            cn.easyar.Buffer r1 = wrapBuffer(r1, r0)
            return r1
    }

    public static cn.easyar.Buffer k(byte[] r3) {
            int r0 = r3.length
            cn.easyar.Buffer$a r1 = new cn.easyar.Buffer$a
            r1.<init>()
            r2 = 0
            cn.easyar.Buffer r3 = wrapByteArray(r3, r2, r0, r2, r1)
            return r3
    }

    @cn.easyar.MethodId("C7961F5BD")
    public static native void memoryCopy(long r0, long r2, int r4);

    @cn.easyar.MethodId("CF0A28992")
    public static native cn.easyar.Buffer wrap(long r0, int r2, cn.easyar.FunctorOfVoid r3);

    @cn.easyar.MethodId("C5C615131")
    public static native cn.easyar.Buffer wrapBuffer(java.nio.Buffer r0, cn.easyar.FunctorOfVoid r1);

    @cn.easyar.MethodId("CC78A1A1F")
    public static native cn.easyar.Buffer wrapByteArray(byte[] r0, int r1, int r2, boolean r3, cn.easyar.FunctorOfVoid r4);

    @cn.easyar.MethodId("CD3E58C33")
    public native void copyFromByteArray(byte[] r1, int r2, int r3, int r4);

    @cn.easyar.MethodId("C7BBBC55D")
    public native void copyToByteArray(int r1, byte[] r2, int r3, int r4);

    @cn.easyar.MethodId("C3A6EB079")
    public native long data();

    public void g(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.copyFromByteArray(r3, r0, r0, r1)
            return
    }

    public void h(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.size()
            r2.copyToByteArray(r0, r3, r0, r1)
            return
    }

    @cn.easyar.MethodId("C2DF962D3")
    public native cn.easyar.Buffer partition(int r1, int r2);

    @cn.easyar.MethodId("CCCDCBE84")
    public native int size();

    @cn.easyar.MethodId("C95576C7A")
    public native boolean tryCopyFrom(long r1, int r3, int r4, int r5);

    @cn.easyar.MethodId("C8ADE585B")
    public native boolean tryCopyTo(int r1, long r2, int r4, int r5);
}
