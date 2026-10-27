package xyz.adscope.common.v2.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScopeCrashHandlerManager extends xyz.adscope.common.v2.singleton.IAbstractManager<xyz.adscope.common.v2.crash.IScopeCrashHandler> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.crash.ScopeCrashHandlerManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.crash.ScopeCrashHandlerManager instance;

        static {
                xyz.adscope.common.v2.crash.ScopeCrashHandlerManager r0 = new xyz.adscope.common.v2.crash.ScopeCrashHandlerManager
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.crash.ScopeCrashHandlerManager.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.crash.ScopeCrashHandlerManager access$100() {
                xyz.adscope.common.v2.crash.ScopeCrashHandlerManager r0 = xyz.adscope.common.v2.crash.ScopeCrashHandlerManager.InstanceHolder.instance
                return r0
        }
    }

    private ScopeCrashHandlerManager() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.crash.ScopeCrashHandlerManager r0 = xyz.adscope.common.v2.crash.ScopeCrashHandlerManager.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ScopeCrashHandlerManager(xyz.adscope.common.v2.crash.ScopeCrashHandlerManager.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.crash.ScopeCrashHandlerManager getInstance() {
            xyz.adscope.common.v2.crash.ScopeCrashHandlerManager r0 = xyz.adscope.common.v2.crash.ScopeCrashHandlerManager.InstanceHolder.access$100()
            return r0
    }

    @Override // xyz.adscope.common.v2.singleton.IAbstractManager
    protected /* bridge */ /* synthetic */ xyz.adscope.common.v2.crash.IScopeCrashHandler createNewImpl(android.content.Context r1) {
            r0 = this;
            xyz.adscope.common.v2.crash.IScopeCrashHandler r1 = r0.createNewImpl2(r1)
            return r1
    }

    @Override // xyz.adscope.common.v2.singleton.IAbstractManager
    /* renamed from: createNewImpl, reason: avoid collision after fix types in other method */
    protected xyz.adscope.common.v2.crash.IScopeCrashHandler createNewImpl2(android.content.Context r2) {
            r1 = this;
            xyz.adscope.common.v2.crash.ScopeCrashHandler r0 = new xyz.adscope.common.v2.crash.ScopeCrashHandler
            r0.<init>(r2)
            return r0
    }
}
